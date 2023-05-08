
/*CREAMOS Y USAMOS LA BASE DE DATOS*/
CREATE DATABASE CarritoComprasJSP;

USE CarritoComprasJSP;

/*CREAMOS LA TABLA PRODUCTO Y LE INSERTAMOS DOS DATOS*/
CREATE TABLE producto (
codigoProducto int(11) NOT NULL,
nombre varchar(100) NOT NULL,
precio int(11) NOT NULL,
imagen varchar(20) NOT NULL,
PRIMARY KEY (codigoProducto)
);

DELETE FROM producto WHERE nombre = 'Huawei Mate 20 Lite 4G';


INSERT INTO producto VALUES (1, 'Huawei Mate 20 Lite 4G', 700000, 'huaweimate20l.jpg');
INSERT INTO producto VALUES (1, 'Avvio 2018 Colombia Plus 4G', 432000, 'avvio.jpg');
INSERT INTO producto VALUES (2, 'Huawei P Smart', 640000, 'huaweips.jpg');


/*CREAMOS EL PROCEDIMIENTO QUE PERMITE LISTAR LOS PRODUCTOS EN EL CATALOGO*/
CREATE PROCEDURE listar_producto()
SELECT * FROM producto ORDER BY nombre;

call listar_producto();

/*CREAMOS EL PROCEDIMIENTO QUE NOS PERMITE INSERTAR UN PRODUCTO*/
CREATE PROCEDURE insertar_producto(
INOUT cod int, nom varchar(100), pre int,img varchar(100)
)

BEGIN
SELECT IFNULL (MAX(codigoProducto),0)+1 INTO cod FROM producto;
INSERT INTO producto (codigoProducto, nombre, precio, imagen)
VALUES (cod, nom, pre, img);
END;

/*CREAMOS EL PROCEDIMIENTO QUE NOS PERMITE MOSTRAR EL PRODUCTO AL DAR CLIC EN AÑADIR*/
CREATE PROCEDURE sp_ProductoCod(cod int)
SELECT * FROM producto WHERE codigoProducto = cod ORDER BY nombre;

CALL sp_ProductoCod(1)

/*CREAMOS LA TABLA LOGIN*/
/*EN ESTE CASO MANEJAREMOS NIVELES, NIVEL 1 ES ADMINISTRADOR Y NIVEL 2 ES USUARIO NORMAL*/

CREATE TABLE login(
id int PRIMARY KEY,
usuario varchar(20),
contra varchar(20),
nivel int
);

INSERT INTO login VALUES(1, 'SebastianCastro', '1234', 1);
INSERT INTO login VALUES(2, 'DiegoAchury', '1234', 1);
INSERT INTO login VALUES(3, 'PepitoPerez', '1234', 2);
INSERT INTO login VALUES(4, 'AntonioBanderas', '1234', 2);

SELECT * FROM login;





