create table usuarios (
                          id int primary key auto_increment,
                          nombre varchar(50) not null,
                          password varchar(50) not null
);

create table productos (
                           sku varchar(20) primary key,
                           ean varchar(20) not null,
                           nombre varchar(50) not null,
                           descripcion varchar(255) not null,
                           precio numeric(10, 2) not null,
                           stock int not null,
                           constraint min_stock check ( stock >= 0 ),
                           constraint min_precio_prod check ( precio >= 0 )
);

create table servicios (
                           cod_interno varchar(20) primary key,
                           ean varchar(20) not null,
                           nombre varchar(50) not null,
                           descripcion varchar(255) not null,
                           precio numeric(10, 2) not null,
                           duracion int,
                           constraint min_precio_serv check ( precio >= 0 )
)