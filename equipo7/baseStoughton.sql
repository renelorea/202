create  database sistemas_ventas;
use sistemas_ventas;


show tables;

create table tb_usuario(
idUsuario int(11)auto_increment primary key,
nombre varchar(30)not null,
apellido varchar(30)not null,
usuario varchar(15)not null,
password varchar(15)not null,
telefono varchar(15)not null,
estado int(1)not null
);
alter table tb_usuario add password varchar(15);
insert into tb_usuario (nombre,apellido,usuario,password,telefono,estado) values ('Edison','zambrado','edison','12345','0987654321',1);
select usuario,password from tb_usuario where usuario ="edison" and password="12345";
select *  from tb_usuario;
use sistemas_ventas;


-- crear tabla cliente
create table cliente(
idCliente int(11)auto_increment primary key,
nombre varchar(30)not null,
apellido varchar(30)not null,
cedula varchar(15)not null,
telefono varchar(15)not null,
direccion varchar(100)not null,
estado int(1)not null
);

select * from cliente;


-- craear tabla categoria 
create table categoria(
idCategoria int(11)auto_increment primary key,
descripcion varchar(200)not null,
estado int(1)not null
);
alter table categoria add idCategoria int(11)auto_increment primary key;

select * from categoria;
select descripcion from categoria where descripcion = "";


-- crear tabla producto
create table producto(
idProducto int(11)auto_increment primary key,
nombre varchar(100)not null,
cantidad int(11)not null,
precio double(10,2)not null,
descripcion varchar(200)not null,
porcentajeIva int(2)not null,
idCategoria int(11)not null,
estado int (1) not null
);
select * from producto;
select p.idProducto, p.nombre, p.cantidad,p.precio, p.descripcion, p.porcentajeIva, c.descripcion, p.estado from producto As p, categoria As c  where p.idCategoria = c.idCategoria;

-- crear tabla cabecera de venta
create table cabecera_venta(
idCabeceraVenta int(11)auto_increment primary key,
idCliente int(11)not null,
valorPagar double(10,2)not null,
fechaVenta date not null,
estado int (1) not null
);

-- crear tabla detalle de venta
create table detalle_venta(
idDetalleVenta int(11)auto_increment primary key,
idCabeceraVenta  int(11)not null,
idProducto  int(11)not null,
cantidad int(11)not null,
subtotal double(10,2)not null,
descuento double(10,2)not null,
Iva double(10,2)not null,
totalPagar double(10,2)not null,
estado int (1) not null
);




create user 'monsesilla'@'localhost' identified by 'diegoperdoname';


select user , host from mysql.user;


select now();
create  database sistemas_ventas;
use sistemas_ventas;

show tables;
