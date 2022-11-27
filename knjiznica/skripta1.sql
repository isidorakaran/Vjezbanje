select * from autor;

insert into autor(sifra, ime, prezime, datumrodenja)
values (4, 'Isidora', 'Karan', '1997-09-10');

select * from katalog;

select * from katalog
where naslov like '%smrt%';

delete from katalog 
where naslov like '%smrt%';

SELECT i.aktivan, i.naziv , i.sifra 
FROM katalog k
inner JOIN izdavac i
ON k.izdavac = i.sifra
where i.aktivan = 1;




select * from izdavac i ;

SELECT *
FROM katalog k
inner JOIN mjesto m 
ON k.mjesto = m.sifra 
where m.drzava  = 'Hrvatska';

select * from autor a 
where (ime, prezime) = ('Isidora', 'Karan');

insert into autor (sifra,ime,prezime,datumrodenja)
values (6,'Goran', 'Maras', '1995-03-19');


select * from autor;

delete from autor 
where sifra=0;

delete from autor 
where sifra in (5,6);

update autor
set ime = 'Isidora',prezime = 'Karanic'
where sifra=4;