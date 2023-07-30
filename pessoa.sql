SELECT * FROM sistema.pessoapadrao;

SELECT MAX(id_pessoa) + 1 FROM pessoapadrao;

insert into pessoapadrao(nome_pessoa, cpf, telefone, email, id_cidade, rua, numero, bairro, cep)
values("allan", "073.899.479-00", "(44)99812-5151", "allan@gmail.com", 1, "Belo horizonte","170", "zona 2", "8720-7022");

select * from pessoapadrao order by nome_pessoa;

SELECT id_pessoa AS Id, nome_pessoa AS Nome FROM pessoapadrao ORDER BY nome_pessoa;

SELECT id_pessoa AS Id, nome_pessoa AS Nome FROM pessoapadrao;