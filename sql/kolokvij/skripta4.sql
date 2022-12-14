drop database if exists baza4;
create database baza4;
use baza4;

create table snasa(
   sifra int not null primary key auto_increment,
   introvertno bit,
   treciputa datetime,
   haljina varchar(44) not null,
   zena int not null
);

create table becar(
    sifra int not null primary key auto_increment,
    novcica decimal(14,8),
    kratkamajica varchar(48) not null,
    bojaociju varchar(36) not null,
    snasa int not null
);

create table prijatelj(
    sifra int not null primary key auto_increment,
    eura decimal(16,9),
    prstena int not null,
    gustoca decimal(16,5),
    jmbag char(11) not null,
    suknja varchar(47) not null,
    becar int not null
);

create table zena(
    sifra int not null primary key auto_increment,
    suknja varchar(39) not null,
    lipa decimal(18,7),
    prstena int not null
);

create table zena_mladic(
    sifra int not null primary key auto_increment,
    zena int not null,
    mladic int not null
);

create table mladic(
    sifra int not null primary key auto_increment,
    kuna decimal(15,9),
    lipa decimal(18,5),
    nausnica int,
    stilfrizura varchar(49),
    vesta varchar(34) not null
);

create table punac(
    sifra int not null primary key auto_increment,
    treciputa datetime,
    majica varchar(46),
    jmbag char(11) not null,
    novcica decimal(18,7) not null,
    maraka decimal(12,6) not null,
    ostavljen int not null
);

create table ostavljen(
    sifra int not null primary key auto_increment,
    modelnaocala varchar(43),
    introvertno bit,
    kuna decimal(14,10)
);

alter table punac add foreign key (ostavljen) references ostavljen(sifra);
alter table zena_mladic add foreign key (zena) references zena(sifra);
alter table zena_mladic add foreign key (mladic) references mladic(sifra);
alter table snasa add foreign key (zena) references zena(sifra);
alter table becar add foreign key (snasa) references snasa(sifra);
alter table prijatelj add foreign key (becar) references becar(sifra);

insert into prijatelj (prstena,jmbag,suknja,becar)
values (12,11111122222,'plava',1),
(3,22222233333,'crvena',2),
(42,33333344444,'sarena',3) ;

insert into becar (kratkamajica,bojaociju,snasa)
values ('zelena','smedja',4),
('plava','plava',5),
('smedja','zelena',6);

insert into snasa (haljina,zena)
values ('crna',1),
('zuta',2),
('crvena',3);

insert into zena  (suknja,prstena)
values ('vunena',4),('platnena',5),('teksas',44);

insert into zena_mladic (zena,mladic)
values(1,1),(2,2),(3,3);

insert into mladic (vesta)
values ('vunena'),('platnena'),('teksas');

select * from mladic;
select * from zena;
select * from zena_mladic;
select * from snasa;
select * from becar;

update punac 
set majica='Osijek';

delete from prijatelj 
where prstena > 17;

select haljina
from snasa 
where treciputa is null;

select f.nausnica ,a.jmbag ,b.kratkamajica 
from prijatelj a
inner join becar b on a.becar =b.sifra 
inner join snasa c on b.snasa =c.sifra 
inner join zena d on c.zena =d.sifra 
inner join zena_mladic e on d.sifra =e.zena 
inner join mladic f on e.mladic =f.sifra 
where c.treciputa is not null and d.lipa !=29
order by 3 desc;

select a.lipa ,a.prstena 
from zena a
left join zena_mladic b on a.sifra =b.zena 
where b.sifra is null;