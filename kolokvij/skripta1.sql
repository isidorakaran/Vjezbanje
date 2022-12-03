drop database if exists baza1;
create database baza1;
use baza1;

create table sestra(
    sifra int not null primary key auto_increment,
    introvertno bit,
    haljina varchar (31) not null,
    maraka decimal (16,6),
    hlace varchar (46) not null,
    narukvica int not null
);

create table zena(
    sifra int not null primary key auto_increment,
    treciputa datetime,
    hlace varchar(46),
    kratkamajica varchar(31) not null,
    jmbag char(11) not null,
    bojaociju varchar(39) not null,
    haljina varchar(44),
    sestra int not null
);

create table muskarac(
    sifra int not null primary key auto_increment,
    bojaociju varchar(50) not null,
    hlace varchar(30),
    modelnaocala varchar(43),
    maraka decimal(14,5) not null,
    zena int not null
);

create table mladic(
    sifra int not null primary key auto_increment,
    suknja varchar(50) not null,
    kuna decimal(16,8) not null,
    drugiputa datetime,
    asocijalno bit,
    ekstrovertno bit not null,
    dukserica varchar(48) not null,
    muskarac int
);

create table svekar(
    sifra int not null primary key auto_increment,
    bojaociju varchar(40) not null,
    prstena int,
    dukserica varchar(41),
    lipa decimal(13,8),
    eura decimal(12,7),
    majica varchar(35)
);

create table sestra_svekar(
    sifra int not null primary key auto_increment,
    sestra int not null,
    svekar int not null
);

create table punac(
    sifra int not null primary key auto_increment,
    ogrlica int,
    gustoca decimal(14,9),
    hlace varchar(41) not null
);

create table cura(
    sifra int not null primary key auto_increment,
    novcica decimal(16,5) not null,
    gustoca decimal(18,6) not null,
    lipa decimal(13,10),
    ogrlica int not null,
    bojakose varchar(38),
    suknja varchar(36),
    punac int
);

alter table zena add foreign key (sestra) references sestra(sifra);
alter table muskarac add foreign key (zena) references zena(sifra);
alter table mladic add foreign key (muskarac) references muskarac(sifra);
alter table cura add foreign key (punac) references punac(sifra);
alter table sestra_svekar add foreign key (sestra) references sestra(sifra);
alter table sestra_svekar add foreign key (svekar) references svekar(sifra);

insert into sestra(haljina,hlace,narukvica)
values ('plava','teksas',1),
 ('crna','teksas',2),
 ('crvena','teksas',3);

insert into muskarac (bojaociju,maraka,zena)
values ('zelena',15.5,1),
('plava',50.5,2),
('smedja',21.5,3)
;

insert into zena (kratkamajica,jmbag,bojaociju,sestra)
values ('crna',23456789123,'smedja',1),
('zuta',67856789123,'plava',2),
('crvena',54326789123,'smedja',1);

insert into sestra_svekar (sestra,svekar)
values(2,2),
(1,1),
(3,3);

insert into svekar (bojaociju)
values('smedja');

select * from muskarac;
select * from zena;
select * from sestra_svekar;

update cura 
set gustoca=15.77;

delete from mladic 
where kuna > 15.78;

select kratkamajica
from zena 
where hlace like '%ana%';

select f.dukserica ,a.asocijalno ,b.hlace 
from mladic a
inner join muskarac b on a.muskarac =b.sifra 
inner join zena c on b.zena =c.sifra 
inner join sestra d on c.sestra= d.sifra 
inner join sestra_svekar e on d.sifra = e.sestra 
inner join svekar f on e.svekar =f.sifra 
where c.hlace like 'a%' and d.haljina like '%ba%'
order by b.hlace desc ;

select a.haljina ,a.maraka 
from sestra a
left join sestra_svekar b on a.sifra =b.sestra 
where b.sestra is null;
