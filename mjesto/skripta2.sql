select * from mjesto;


select * from mjesto m 
where naziv like '%eb%';

select * from mjesto m 
where zupanija like '%21%';

delete from mjesto 
where zupanija = 21;

update mjesto 
set naziv='GORNJI STUPNIK'
where postanskibroj = 10255;

select * from mjesto m 
where naziv = 'Osijek';

select * from mjesto m 
where zupanija = 14;

select * from mjesto m 
where naziv like '%nt';

select * from mjesto m 
where zupanija !=1;