#CREATE DATABASE bd_mdb_tienda;

USE bd_mdb_tienda;

CREATE TABLE usuarios(
cedula_usuario  BIGINT(20) NOT NULL PRIMARY KEY,
email_usuario VARCHAR(255) NOT NULL,
nombre_usuario VARCHAR(255) NOT NULL,
password VARCHAR(255) NOT NULL,
usuario VARCHAR(255) NOT NULL
);

CREATE TABLE clientes(
cedula_cliente  BIGINT(20) NOT NULL PRIMARY KEY,
direccion_cliente VARCHAR(255),
email_cliente VARCHAR(255) NOT NULL,
nombre_cliente VARCHAR(255) NOT NULL,
telefono_cliente VARCHAR(255)
);

CREATE TABLE proveedores(
nit_proveedor  BIGINT(20) NOT NULL PRIMARY KEY,
ciudad_proveedor  VARCHAR(255),
direccion_proveedor  VARCHAR(255),
nombre_proveedor VARCHAR(255),
telefono_proveedor VARCHAR(255)
);

CREATE TABLE ventas(
codigo_venta  BIGINT(20) NOT NULL PRIMARY KEY,
cedula_cliente  BIGINT(20) NOT NULL,
cedula_usuario  BIGINT(20) NOT NULL,
iva_venta DOUBLE,
total_venta DOUBLE,
valor_venta DOUBLE,
FOREIGN KEY(cedula_cliente) REFERENCES clientes(cedula_cliente),
FOREIGN KEY(cedula_usuario) REFERENCES usuarios(cedula_usuario)
);

CREATE TABLE productos(
codigo_producto  BIGINT(20) NOT NULL PRIMARY KEY,
iva_compra DOUBLE,
nit_proveedor  BIGINT(20) NOT NULL,
nombre_producto VARCHAR(255),
precio_compra DOUBLE,
precio_venta DOUBLE,
FOREIGN KEY(nit_proveedor) REFERENCES proveedores(nit_proveedor)
);

CREATE TABLE detalle_ventas(
codigo_detalle_venta  BIGINT(20) NOT NULL PRIMARY KEY,
cantidad_producto INT(11),
codigo_producto  BIGINT(20) NOT NULL,
codigo_venta  BIGINT(20) NOT NULL,
valor_total DOUBLE,
valor_venta DOUBLE,
valor_iva DOUBLE,
FOREIGN KEY(codigo_producto) REFERENCES productos(codigo_producto),
FOREIGN KEY(codigo_venta) REFERENCES ventas(codigo_venta)
);
