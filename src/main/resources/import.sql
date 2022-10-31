INSERT INTO clientes (nombre, apellido, email, create_at) VALUES ('Joel', 'Flores', 'gerson.dlarosa@gmail.com', '2022-10-01');

INSERT INTO clientes (nombre, apellido, email, create_at) VALUES ('Atenas', 'Santana', 'atenas@gmail.com', '2022-10-02');

INSERT INTO clientes (nombre, apellido, email, create_at) VALUES ('Obet', 'Cervantes', 'obet@gmail.com', '2022-10-03');

INSERT INTO clientes (nombre, apellido, email, create_at) VALUES ('Victor', 'De la rosa', 'victor@gmail.com', '2022-10-04');

INSERT INTO clientes (nombre, apellido, email, create_at) VALUES ('Jonathan', 'Flores', 'jonathan@gmail.com', '2022-10-05');

INSERT INTO clientes (nombre, apellido, email, create_at) VALUES ('Ivan', 'De La Rosa', 'ivan@gmail.com', '2022-10-06');

INSERT INTO clientes (nombre, apellido, email, create_at) VALUES ('Jose', 'Flores', 'jose@gmail.com', '2022-10-07');

INSERT INTO clientes (nombre, apellido, email, create_at) VALUES ('Erik', 'De La Rosa', 'erick@gmail.com', '2022-10-08');

INSERT INTO clientes (nombre, apellido, email, create_at) VALUES ('Camlo', 'Vigotes', 'vigotes@gmail.com', '2022-10-05');

INSERT INTO clientes (nombre, apellido, email, create_at) VALUES ('Miguel', 'Del Monte', 'delmonte@gmail.com', '2022-10-06');


INSERT INTO `usuarios` (username, password, enabled, nombre, apellido, email) VALUES ('edwin','$2a$10$m5MANtz0lEKP1zgw3nqcdugNQoVqlfdxqATLsLsNhRnAgVlvUqahK',1,'edwin','mendoza','emendoza@gmail.com');
INSERT INTO `usuarios` (username, password, enabled, nombre, apellido, email) VALUES ('admin','$2a$10$S6W5evieSHYlmuts4evwb.Lx7m5/esXbtX9zw1YhSEiy.QlGJK.Zm',1,'victor','minchan','vminchan@gmail.com');


INSERT INTO `roles` (nombre) VALUES ('ROLE_USER');
INSERT INTO `roles` (nombre) VALUES ('ROLE_ADMIN');

INSERT INTO `usuarios_roles` (usuario_id, role_id) VALUES (1, 1);
INSERT INTO `usuarios_roles` (usuario_id, role_id) VALUES (2, 2);
INSERT INTO `usuarios_roles` (usuario_id, role_id) VALUES (2, 1);


/*tabla productos */

INSERT INTO productos (nombre, precio, create_at) VALUES('Atun', 4, NOW());
INSERT INTO productos (nombre, precio, create_at) VALUES('Leche', 5, NOW());
INSERT INTO productos (nombre, precio, create_at) VALUES('Aceite', 11, NOW());
INSERT INTO productos (nombre, precio, create_at) VALUES('Arroz', 3, NOW());
INSERT INTO productos (nombre, precio, create_at) VALUES('Azucar', 4, NOW());
INSERT INTO productos (nombre, precio, create_at) VALUES('Galleta Soda', 1, NOW());
INSERT INTO productos (nombre, precio, create_at) VALUES('Frugos', 3, NOW());

INSERT INTO facturas (descripcion, observacion, cliente_id, create_at) VALUES('Abarrotes en general', null, 1, NOW());

INSERT INTO facturas_items (cantidad, factura_id, producto_id) VALUES(1, 1, 1);
INSERT INTO facturas_items (cantidad, factura_id, producto_id) VALUES(2, 1, 4);
INSERT INTO facturas_items (cantidad, factura_id, producto_id) VALUES(1, 1, 5);
INSERT INTO facturas_items (cantidad, factura_id, producto_id) VALUES(1, 1, 7);

INSERT INTO facturas (descripcion, observacion, cliente_id, create_at) VALUES('Factura productos', 'Alguna nota importante!', 1, NOW());
INSERT INTO facturas_items (cantidad, factura_id, producto_id) VALUES(3, 2, 6);


