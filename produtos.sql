SELECT id_produto AS Id, nome_produto AS Nome, descricao AS Descricao, marca AS Marca, preco AS Preco FROM produto;

SELECT MAX(id_produto) + 1 FROM produto;

insert into produto(nome_produto, descricao, marca, preco)
values("Note 8", "O Redmi Note 8 é um smartphone Android de bom nível, ótimo para fotos, que pode satisfazer até o mais exigente dos usuários. Tem uma enorme tela Touchscreen de 6.3 polegadas com uma resolução de 2340x1080 pixel. Sobre as características deste Redmi Note 8 na verdade não falta nada.", "Redmi", 1700.5);

insert into produto(nome_produto, descricao, marca, preco)
values(?, ?, ?, ?);

SELECT 
    *
FROM
    produto
WHERE
    id_produto like "3%"
	AND nome_produto LIKE 'n%'
	AND marca LIKE '%';
    
   
