create table usuarios (
                          id_usuario int primary key auto_increment,
                          nombre varchar(50) not null,
                          password_usuario varchar(50) not null
);

create index nombre_usuario_idx on usuarios (nombre);

create table productos (
                           id_producto int primary key,
                           codigo_ean varchar(20) not null,
                           nombre varchar(50) not null,
                           descripcion varchar(255) not null,
                           precio numeric(10, 2) not null,
                           stock int not null,
                           constraint min_stock check ( stock >= 0 ),
                           constraint min_precio_prod check ( precio >= 0 )
);

create table servicios (
                           id_servicio int primary key,
                           codigo_ean varchar(20) not null,
                           nombre varchar(50) not null,
                           descripcion varchar(255) not null,
                           precio numeric(10, 2) not null,
                           duracion int,
                           constraint min_precio_serv check ( precio >= 0 )
)