USE MI_FAMILIA_CROCHET;
CREATE TABLE empleados (
id int not null auto_increment primary key, 
nombre VARCHAR(50) null,
nombre_usuario VARCHAR(50) null,
direccion VARCHAR(100) null,
telefono VARCHAR(10) null,
correo VARCHAR(100) null,
contraseña VARCHAR(50) null,
rol VARCHAR(50) null,
fecha DATETIME null,
actualizar DATETIME null
);
create table provedores(
id int not null auto_increment primary key,
nombre varchar(50) null,
descrpcion varchar(50) null,
telefono varchar(10) null,
direccion varchar(150) null,
correo varchar(250) null,
ciudad varchar(100) null,
crear datetime null,
actualizar datetime null
);
create table categorias(
id int not null auto_increment primary key,
nombre varchar(50) null,
crear datetime null,
actualizar datetime null
);
CREATE TABLE productos (
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY, 
    codigo INT NULL,
    nombre VARCHAR(60) NULL,
    descripcion VARCHAR(100) NULL,
    precio_unidad DOUBLE NULL,
    cantidad INT NULL,
    crear DATETIME NULL,
    actualizar DATETIME NULL,
    id_categoria INT NULL,
    UNIQUE INDEX codigo_unique (codigo ASC)
);
CREATE TABLE clientesa(
id int not null auto_increment primary key,
nombre_completo varchar(80) null, 
direccion varchar(100) null,
telefono varchar(10) null,
correo varchar(100) null, 
crear datetime null,
actualizar datetime null
);
create table compras(
id int not null auto_increment primary key,
total double null,
crear datetime null, 
provedor_id int null,
empleado_id int null
);
create table detalles_de_compra(
id int not null auto_increment primary key,
precio_compra double null,
monto_compra int null,
subtotal_compra double null,
compra_id int null,
producto_id int null
);
