INSERT INTO clientes (nombre, apellido, email, create_at) VALUES ('Joel', 'Flores', 'gerson.dlarosa@gmail.com', '2020-01-01');

INSERT INTO clientes (nombre, apellido, email, create_at) VALUES ('Atenas', 'Santana', 'atenas@gmail.com', '2020-01-02');

INSERT INTO clientes (nombre, apellido, email, create_at) VALUES ('Obet', 'Cervantes', 'obet@gmail.com', '2020-01-03');

INSERT INTO clientes (nombre, apellido, email, create_at) VALUES ('Victor', 'De la rosa', 'victor@gmail.com', '2020-01-04');

INSERT INTO clientes (nombre, apellido, email, create_at) VALUES ('Jonathan', 'Flores', 'jonathan@gmail.com', '2020-01-05');

INSERT INTO clientes (nombre, apellido, email, create_at) VALUES ('Ivan', 'De La Rosa', 'ivan@gmail.com', '2020-01-06');

INSERT INTO clientes (nombre, apellido, email, create_at) VALUES ('Jose', 'Flores', 'jose@gmail.com', '2020-01-07');

INSERT INTO clientes (nombre, apellido, email, create_at) VALUES ('Erik', 'De La Rosa', 'erick@gmail.com', '2020-01-08');

INSERT INTO clientes (nombre, apellido, email, create_at) VALUES ('Camlo', 'Vigotes', 'vigotes@gmail.com', '2020-07-05');

INSERT INTO clientes (nombre, apellido, email, create_at) VALUES ('Miguel', 'Del Monte', 'delmonte@gmail.com', '2020-01-06');

INSERT INTO clientes (nombre, apellido, email, create_at) VALUES ('July', 'Rios', 'julyr@gmail.com', '2020-04-07');

INSERT INTO clientes (nombre, apellido, email, create_at) VALUES ('Frank', 'Segovia', 'segovia@gmail.com', '2020-03-08');

INSERT INTO clientes (nombre, apellido, email, create_at) VALUES ('Yaritza', 'Castillo', 'ana@gmail.com', '2020-04-12');

INSERT INTO clientes (nombre, apellido, email, create_at) VALUES ('Pancho', 'Cueva', 'cueva@gmail.com', '2020-03-20');

INSERT INTO clientes (nombre, apellido, email, create_at) VALUES ('Vanesa', 'Collazos', 'collazos@gmail.com', '2020-04-10');

INSERT INTO clientes (nombre, apellido, email, create_at) VALUES ('Gilvert', 'Gonsales', 'gonsales@gmail.com', '2020-03-11');

INSERT INTO clientes (nombre, apellido, email, create_at) VALUES ('Omar', 'Lazo', 'lazo@gmail.com', '2020-04-17');

INSERT INTO clientes (nombre, apellido, email, create_at) VALUES ('Chavelita', 'delazo', 'delazo@gmail.com', '2020-03-18');

INSERT INTO clientes (nombre, apellido, email, create_at) VALUES ('Jacky', 'Carranza', 'jacky@gmail.com', '2020-04-25');

INSERT INTO clientes (nombre, apellido, email, create_at) VALUES ('Jesus', 'Carranza', 'jesusc@gmail.com', '2020-03-26');

INSERT INTO `usuarios` (username, password, enabled, nombre, apellido, email) VALUES ('edwin','$2a$10$m5MANtz0lEKP1zgw3nqcdugNQoVqlfdxqATLsLsNhRnAgVlvUqahK',1,'edwin','mendoza','emendoza@gmail.com');
INSERT INTO `usuarios` (username, password, enabled, nombre, apellido, email) VALUES ('admin','$2a$10$S6W5evieSHYlmuts4evwb.Lx7m5/esXbtX9zw1YhSEiy.QlGJK.Zm',1,'victor','minchan','vminchan@gmail.com');


INSERT INTO `roles` (nombre) VALUES ('ROLE_USER');
INSERT INTO `roles` (nombre) VALUES ('ROLE_ADMIN');

INSERT INTO `usuarios_roles` (usuario_id, role_id) VALUES (1, 1);
INSERT INTO `usuarios_roles` (usuario_id, role_id) VALUES (2, 2);
INSERT INTO `usuarios_roles` (usuario_id, role_id) VALUES (2, 1);


/*tabla productos */
/**
INSERT INTO productos (nombre, precio, create_at) VALUES('Panasonic Pantalla LCD', 2500, NOW());
INSERT INTO productos (nombre, precio, create_at) VALUES('Sony Camara Digital DSC-W320B', 1230, NOW());
INSERT INTO productos (nombre, precio, create_at) VALUES('Apple Ipod Shufffle', 5000, NOW());
INSERT INTO productos (nombre, precio, create_at) VALUES('Sony Notebook Z110', 3700, NOW());
INSERT INTO productos (nombre, precio, create_at) VALUES('Hewlett Packard Multifuncional F2280', 3300, NOW());
INSERT INTO productos (nombre, precio, create_at) VALUES('Bianchi Bicicleta Aro 26', 800, NOW());
INSERT INTO productos (nombre, precio, create_at) VALUES('Mica Comoda 5 Cajones', 300, NOW());

INSERT INTO facturas (descripcion, observacion, cliente_id, create_at) VALUES('Equipos de oficina', null, 1, NOW());

INSERT INTO facturas_items (cantidad, factura_id, producto_id) VALUES(1, 1, 1);
INSERT INTO facturas_items (cantidad, factura_id, producto_id) VALUES(2, 1, 4);
INSERT INTO facturas_items (cantidad, factura_id, producto_id) VALUES(1, 1, 5);
INSERT INTO facturas_items (cantidad, factura_id, producto_id) VALUES(1, 1, 7);

INSERT INTO facturas (descripcion, observacion, cliente_id, create_at) VALUES('Factura Bicicleta', 'Alguna nota importante!', 1, NOW());
INSERT INTO facturas_items (cantidad, factura_id, producto_id) VALUES(3, 2, 6);

**/
