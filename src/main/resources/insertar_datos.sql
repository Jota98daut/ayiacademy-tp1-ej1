-- Insertar usuarios
INSERT INTO usuarios (nombre, password)
VALUES ('Juan Perez', 'clavejuan'),
       ('Maria Rodriguez', 'clavemaria'),
       ('Carlos Sanchez', 'clavecarlos'),
       ('user', 'user');

-- Insertar productos
INSERT INTO productos (sku, ean, nombre, descripcion, precio, stock)
VALUES (12345, 123456789012, 'Laptop HP', 'Potente laptop para trabajo y entretenimiento', 899.99, 50),
       (67890, 345678901234, 'Smartphone Samsung', 'Teléfono inteligente con cámara de alta resolución', 499.99, 30),
       (23456, 567890123456, 'TV LED 55"', 'Televisor LED de 55 pulgadas con calidad de imagen Full HD', 799.99, 20),
       (78901, 789012345678, 'Auriculares Inalámbricos', 'Auriculares Bluetooth con cancelación de ruido', 129.99, 100),
       (34567, 901234567890, 'Tablet Android', 'Tableta Android con pantalla táctil de 10 pulgadas', 249.99, 40);

-- Insertar servicios
INSERT INTO servicios (cod_interno, ean, nombre, descripcion, precio, duracion)
VALUES (54321, 987654321012, 'Servicio de Reparación', 'Reparación de dispositivos electrónicos', 59.99, 60),
       (09876, 876543210123, 'Asesoramiento Tecnológico', 'Asesoría para la implementación de tecnologías', 79.99, 45),
       (65432, 765432109876, 'Instalación de TV', 'Instalación profesional de televisores', 99.99, 30),
       (21098, 654321098765, 'Soporte Técnico Remoto', 'Asistencia técnica a través de conexión remota', 49.99, 90),
       (87654, 543210987654, 'Clases de Informática', 'Clases personalizadas de informática y tecnología', 69.99, 120);