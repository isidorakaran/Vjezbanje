select * from autor;

insert into autor(sifra, ime, prezime, datumrodenja)
values (4, 'Isidora', 'Karan', '1997-09-10');

select * from katalog;

select * from katalog
where naslov like '%smrt%';

delete from katalog 
where naslov like '%smrt%';