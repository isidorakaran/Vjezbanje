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

select * from autor;

select * from autor a 
where datumrodenja between '1980-01-01' and '1980-12-31';

select * from katalog k ;

select * from katalog k 
where naslov like '%ljubav%';

select * from katalog k 
where naslov like '%ljubav%'
and sifra not in (27840,3031);

select * from izdavac i ;

select * from izdavac i 
where naziv like '%d%o%o%'
and naziv not like '%j%d%';

select * from katalog k ;

delete from katalog 
where naslov like '%ljubav%';