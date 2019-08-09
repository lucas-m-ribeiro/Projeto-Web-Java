create database estoque if not exist;

create table usuario(
	nome varchar(100),
	senha varchar(50));
	
create table produto(
	codigo_produto int(11) primary key auto_increment,
	descricao_produto varchar(100),
	quantidade_produto int (100) not null,
	preco_produto double(15,2));
		
create table compra(
	id_compra int(10) not null auto_increment,
	produto_id int (10) not null,
	quantidade_compra int(10) not null,
	primary key (id_compra),
	FOREIGN KEY(produto_id) references produto(codigo_produto) on delete cascade
);

select p.descricao_produto,c.quantidade_compra,p.preco_produto from produto p join compra c on p.codigo_produto=c.produto_id;




select * from produto p join compra c on p.codigo_produto = c.id_compra;



select p.quantidade_produto, preco_produto from produto p join compra c on p.codigo_produto = c.id_compra;