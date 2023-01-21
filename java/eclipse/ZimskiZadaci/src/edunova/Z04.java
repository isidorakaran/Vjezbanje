package edunova;

import javax.swing.JOptionPane;

public class Z04 {
	// Keirati program koji unosi dvije matrice 4x4 te ispisuje njihov zbroj

	public static void main(String[] args) {
		int[][] x = new int[4][4];

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				x[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Unesi brojeve"));
				System.out.print(x[i][j]);
			}
		}
	}

}
