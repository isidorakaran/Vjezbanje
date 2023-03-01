drop database if exists azil_za_pse;
create database azil_za_pse;
use azil_za_pse;

create table pas(
    sifra int not null primary key auto_increment,
    mjesavina varchar(30),
    ime varchar(30),
    dob int,
    kilaza float
);

create table  pas_transakcija(
    sifra int not null primary key auto_increment,
    pas int,
    transakcija int
    
);

create table transakcija(
    sifra int not null primary key auto_increment,
    datum datetime,
    opis varchar(50),
    napomena varchar(50),
    osoba int,
    vrsta_transakcije int
);

create table osoba(
  sifra int not null primary key auto_increment,
  ime varchar(50),
  prezime varchar(50),
  email varchar(50),
  broj_telefona varchar(50)

);

create table  vrsta_transakcije(
    sifra int not null primary key auto_increment,
    naziv varchar(50)
    
);

alter table pas_transakcija add foreign key (pas) references pas(sifra);
alter table pas_transakcija add foreign key(transakcija) references transakcija(sifra);
alter table transakcija add foreign key(vrsta_transakcije) references vrsta_transakcije(sifra);
alter table transakcija add foreign key(osoba) references osoba(sifra);