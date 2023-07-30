SELECT * FROM sistema.cidade;

insert into Cidade(cidade, uf)
values("Cianorte","Pr");

select * from cidade order by cidade;

SELECT MAX(id_cidade) + 1 FROM Cidade;