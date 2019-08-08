create database java;

create table usuario(
	nome varchar(100),
	senha varchar(50));
	
create table produto(
	codigo_produto int(11) primary key auto_increment,
	descricao_produto varchar(100),
	quantidade_produto int (100) not null,
	preco_produto double(15,2));
		
create table venda(

	id_venda int(10) not null auto_increment,
	produto_id int (10) not null,
	quantidade_venda int(10) not null,
	primary key (id_venda),
	FOREIGN KEY(produto_id) references produto(codigo_produto)
);