package edunova;

import javax.swing.JOptionPane;

public class ObrnutaCiklicna {
	public static void main(String[] args) {

		int m, n;
		int i, j;

		m = Integer.parseInt(JOptionPane.showInputDialog("Upiši broj redova: "));

		n = Integer.parseInt(JOptionPane.showInputDialog("Upiši broj stupaca: "));

		int[][] matrica = new int[m][n];

		int iPocetak = 0;
		int jPocetak = 0;
		int iKraj = m - 1;
		int jKraj = n - 1;

		int vrijednost = 1;

		do {
			if (m * n == 1) {
				break;
			}

			j = jPocetak;
			for (i = iPocetak; i < iKraj; i++) {
				if (vrijednost > m * n) {
					break;
				} else {
					matrica[i][j] = vrijednost;
					vrijednost++;

				}

			}

			i = iKraj;
			for (j = jPocetak; j < jKraj; j++) {
				if (vrijednost > m * n)
					break;
				else {
					matrica[i][j] = vrijednost;
					vrijednost++;

				}
			}

			j = jKraj;

			for (i = iKraj; i > iPocetak; i--) {
				if (vrijednost > m * n)
					break;
				else {
					matrica[i][j] = vrijednost;
					vrijednost++;

				}
			}

			i = iPocetak;
			for (j = jKraj; j > jPocetak; j--) {
				if (vrijednost > m * n)
					break;
				else {
					matrica[i][j] = vrijednost;
					vrijednost++;

				}
			}

			iPocetak++;
			jPocetak++;
			iKraj--;
			jKraj--;
			if (vrijednost == m * n) {
				jKraj++;

			}
			if (vrijednost > m * n)
				break;

		} while (true);

		// Ispis matrice
		for (i = 0; i < m; i++) {
			for (j = 0; j < n; j++) {
				System.out.printf("%4d", matrica[i][j]);
			}
			System.out.println();
		}

	}

}
