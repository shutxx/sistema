SELECT * FROM sistema.venda;

insert into Venda(id_pessoa, data, id_funcionario)
values(1, '2023-07-15', 1);

SELECT MAX(id_venda) + 1 FROM venda;