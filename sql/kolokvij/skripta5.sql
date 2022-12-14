drop database if exists baza5;
create database baza5;
use baza5;

create table mladic(
   sifra int not null primary key auto_increment,
   kratkamajica varchar(48) not null,
   haljina varchar(30) not null,
   asocijalno bit,
   zarucnik int
);

create table zarucnik(
    sifra int not null primary key auto_increment,
    jmbag char(11),
    lipa decimal(12,8),
    indiferentno bit not null
);

create table punac(
    sifra int not null primary key auto_increment,
    dukserica varchar(33),
    prviputa datetime not null,
    majica varchar(36),
    svekar int not null
);

create table svekar(
    sifra int not null primary key auto_increment,
    bojakose varchar(33),
    majica varchar(31),
    carape varchar(31) not null,
    haljina varchar(43),
    narukvica int,
    eura decimal(14,5) not  null
);

create table svekar_cura(
    sifra int not null primary key auto_increment,
    svekar int not null,
    cura int not null
);

create table cura(
    sifra int not null primary key auto_increment,
    carape varchar(41) not null,
    maraka decimal(17,10) not null,
    asocijalno bit,
    vesta varchar(47) not null
);

create table punica(
    sifra int not null primary key auto_increment,
    hlace varchar(43) not null,
    nausnica int not null,
    ogrlica int,
    vesta varchar(48) not null,
    modelnaocala varchar(31) not null,
    treciputa datetime not null,
    punac int not null
);

create table ostavljena(
    sifra int not null primary key auto_increment,
    majica varchar(33),
    ogrlica int not null,
    carape varchar(44),
    stilfrizura varchar(42),
    punica int not null
);

alter table ostavljena add foreign key (punica) references punica(sifra);
alter table punica add foreign key (punac) references punac(sifra);
alter table punac add foreign key (svekar) references svekar(sifra);
alter table svekar_cura add foreign key (svekar) references svekar(sifra);
alter table svekar_cura add foreign key (cura) references cura(sifra);
alter table mladic add foreign key (zarucnik) references zarucnik(sifra);

insert into ostavljena  (ogrlica,punica)
values (1,1),
(2,2),
(6,6);

insert into punica (hlace,nausnica,vesta,modelnaocala,treciputa,punac)
values ('teksas',13,'plava','gucci','2022-03-03',1),
('crne',3,'crna','prada','2022-04-04',2),
('plave',5,'smedja','ray ban','2022-05-05',3) ;

insert into punac (prviputa,svekar)
values ('2022-06-06',1),
('2022-07-07',2),
('2022-08-08',6);

insert into svekar (carape,eura)
values ('crne',1.99),
('zute',2.99),
('crvene',3.99);

insert into svekar_cura  (svekar,cura)
values (4,4),(2,2),(3,3);

insert into cura (carape,maraka,vesta)
values('crne',1.99,'crna'),
('zelene',2.99,'zelena'),
('zute',3.99,'zuta');



select * from cura;
select * from svekar;

update mladic 
set haljina='Osijek';

delete from ostavljena 
where ogrlica =17;

select majica
from punac 
where prviputa is null;

select f.asocijalno , a.stilfrizura , b.nausnica 
from ostavljena a
inner join punica b on a.punica =b.sifra 
inner join punac c on b.punac =c.sifra 
inner join svekar d on c.svekar =d.sifra 
inner join svekar_cura e on d.sifra =e.svekar 
inner join cura f on e.cura =f.sifra 
where c.prviputa is not null and d.majica like '%ba%'
order by 3 desc;

select a.majica ,a.carape 
from svekar a
left join svekar_cura b on a.sifra =b.svekar 
where b.sifra is null;