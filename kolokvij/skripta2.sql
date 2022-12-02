drop database if exists baza2;
create database baza2;
use baza2;

create table decko(
   sifra int not null primary key auto_increment,
   indeferntno bit,
   vesta varchar(34),
   asocijalno bit not null
);

create table decko_zarucnica(
    sifra int not null primary key auto_increment,
    decko int not null,
    zarucnica int not null
);

create table zarucnica(
    sifra int not null primary key auto_increment,
    narukvica int,
    bojakose varchar(37) not null,
    novcica decimal (15,9),
    lipa decimal(15,8) not null,
    indeferntno bit not null
);

create table cura(
    sifra int not null primary key auto_increment,
    haljina varchar(38) not null,
    drugiputa datetime not null,
    suknja varchar(38),
    narukvica int,
    introvertno bit,
    majica varchar(40) not null,
    decko int
);

create table prijatelj(
    sifra int not null primary key auto_increment,
    modelnaocala varchar(37),
    treciputa datetime not null,
    ekstrovertno bit not null,
    prviputa datetime,
    svekar int not null
);

create table svekar(
    sifra int not null primary key auto_increment,
    stilfrizura varchar(48),
    ogrlica int not null,
    asocijalno bit not null
);

create table neprijatelj(
    sifra int not null primary key auto_increment,
    majica varchar(32),
    haljina varchar(43) not null,
    lipa decimal(16,8),
    modelnaocala varchar(49) not null,
    kuna decimal(12,6) not null,
    jmbag char(11),
    cura int
);

create table brat(
    sifra int not null primary key auto_increment,
    suknja varchar(47),
    ogrlica int not null,
    asocijalno bit not null,
    neprijatelj int not null
);

alter table prijatelj add foreign key (svekar) references svekar(sifra);
alter table decko_zarucnica add foreign key (decko) references decko(sifra);
alter table decko_zarucnica add foreign key (zarucnica) references zarucnica(sifra);
alter table cura add foreign key (decko) references decko(sifra);
alter table neprijatelj add foreign key (cura) references cura(sifra);
alter table brat add foreign key (neprijatelj) references neprijatelj(sifra);

insert into decko(asocijalno)
values (1),(0),(0) ;

insert into neprijatelj (haljina,modelnaocala,kuna)
values ('zelena','gucci',1499.99),
('plava','ray ban',2199.99),
('smedja','pilot',600)
;

insert into cura (haljina,drugiputa,majica)
values ('crna','2022-02-02','smedja'),
('zuta','2022-03-03','plava'),
('crvena','2022-04-04','smedja');

insert into zarucnica (bojakose,lipa,indeferntno)
values('crna',50,1),('plava',34,0),('smedja',70,0);

insert into decko_zarucnica  (decko,zarucnica)
values (1,2),(2,1),(5,6);

select * from cura;
select * from neprijatelj;
select * from decko_zarucnica;
select * from zarucnica;
select * from decko;


