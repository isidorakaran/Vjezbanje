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