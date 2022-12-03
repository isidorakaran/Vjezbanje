drop database if exists baza3;
create database baza3;
use baza3;

create table punica(
   sifra int not null primary key auto_increment,
   asocijalno bit,
   kratkamajica varchar(44),
   kuna decimal(13,8) not null,
   vesta varchar(32) not null,
   snasa int
);

create table brat(
    sifra int not null primary key auto_increment,
    jmbag char(11),
    ogrlica int not null,
    ekstrovertno bit not null
);

create table prijatelj_brat(
    sifra int not null primary key auto_increment,
    prijatelj int not null,
    brat int not null
);

create table prijatelj(
    sifra int not null primary key auto_increment,
    kuna decimal(16,10),
    haljina varchar(37),
    lipa decimal(13,10),
    dukserica varchar(31),
    indeferntno bit not null
);

create table ostavljena(
    sifra int not null primary key auto_increment,
    kuna decimal(17,5),
    lipa decimal(15,6),
    majica varchar(36),
    modelnaocala varchar(31) not null,
    prijatelj int 
);

create table snasa(
    sifra int not null primary key auto_increment,
    introvertno bit,
    kuna decimal(15,9) not null,
    eura decimal(12,9) not null,
    treciputa datetime,
    ostavljena int not null
);

create table svekar(
    sifra int not null primary key auto_increment,
    novcica decimal(16,8) not null,
    suknja varchar(44) not null,
    bojakose varchar(36),
    prstena int,
    narukvica int not null,
    cura int not null
);

create table cura(
    sifra int not null primary key auto_increment,
    dukserica varchar(49),
    maraka decimal(13,7),
    drugiputa datetime,
    majica varchar(49),
    novcica decimal (15,8),
    ogrlica int not null
);

alter table svekar add foreign key (cura) references cura(sifra);
alter table ostavljena add foreign key (prijatelj) references prijatelj(sifra);
alter table snasa add foreign key (ostavljena) references ostavljena(sifra);
alter table punica add foreign key (snasa) references snasa(sifra);
alter table prijatelj_brat add foreign key (prijatelj) references prijatelj(sifra);
alter table prijatelj_brat add foreign key (brat) references brat(sifra);


insert into punica(kuna,vesta)
values(15.99,'crna'),
(200.99,'plava'),
(499.99,'sarena');

insert into snasa(kuna,eura,ostavljena)
values(25.99,3.2,1),
(225.99,30.1,2),
(699.99,95.5,3);

insert into ostavljena (modelnaocala)
values('gucii'),
('prada'),
('ray ban');

insert into prijatelj(indeferntno)
values(1),
(0),
(1);

insert into prijatelj_brat (prijatelj,brat)
values(1,1),
(2,2),
(3,3);

insert into brat(ogrlica,ekstrovertno)
values(12,1),
(15,0),
(9,0);

select * from snasa;
select * from ostavljena;
select * from prijatelj_brat;
select * from brat;
select * from prijatelj;
