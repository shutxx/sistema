SELECT * FROM funcionario;

insert into funcionario(nome_funcionario, cpf, telefone, email, id_cidade, rua, numero, bairro, cep, salario, cargo)
values("allan", "073.899.479-00", "(44)99812-5151", "allan@gmail.com", 1, "Belo horizonte","170", "zona 2", "8720-7022", 1500.00, "T.I");

SELECT MAX(id_funcionario) + 1 FROM Funcionario;








