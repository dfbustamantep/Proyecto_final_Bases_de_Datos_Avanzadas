CREATE TABLE SUCURSAL( 

    id_sucursal INT NOT NULL, 

    id_ciudad INT, 

    nombre VARCHAR(30) NOT NULL        

); 

  

CREATE TABLE CIUDAD_SUCURSAL( 

    id_ciudad INT NOT NULL,     

    nombre_ciudad VARCHAR(30) NOT NULL         

); 

  

CREATE TABLE EMPLEADO(     

    documento int NOT NULL, 

    codigo INT NOT NULL,  

    nombre VARCHAR(30) NOT NULL, 

    fecha_nacimiento DATE NOT NULL, 

    fecha_ingreso DATE NOT NULL, 

    fecha_salida DATE, 

    salario INT NOT NULL, 

    id_sucursal INT, 

    id_cargo INT        

); 

  

CREATE TABLE CARGO( 

    id_cargo INT NOT NULL,     

    nombre_cargo VARCHAR(30) NOT NULL         

); 

  

CREATE TABLE TELEFONO_E( 

    telefono_e VARCHAR(12) NOT NULL,          

    codigo_e INT NOT NULL,     

    documento_e INT NOT NULL          

); 

  

CREATE TABLE CLIENTE(     

    documento INT NOT NULL, 

    nombre VARCHAR(30) NOT NULL, 

    id_ciudad INT, 

    fecha_inicio DATE NOT NULL,         

    id_sucursal INT     

); 

  

CREATE TABLE CIUDAD_CLIENTE( 

    id_ciudad INT NOT NULL,     

    nombre_ciudad VARCHAR(30) NOT NULL          

); 

  

CREATE TABLE TELEFONO_C( 

    telefono_c VARCHAR(12) NOT NULL,          

    documento_c INT NOT NULL         

); 

  

CREATE TABLE VENTA(     

    id_venta INT NOT NULL, 

    fecha_venta DATE NOT NULL, 

    documento_cliente INT, 

    documento_empleado INT,
 
    codigo_empleado INT
   
); 

  

CREATE TABLE AUTOMOTOR( 

    numero_chasis INT NOT NULL, 

    precio INT NOT NULL, 

    placa VARCHAR(7), 

    id_interno REAL, 

    fecha_entrada DATE NOT NULL, 

    fecha_salida DATE, 

    id_venta INT, 

    id_sucursal INT, 

    id_tipo INT, 

    id_linea INT, 

    id_modelo INT, 

    id_marca INT,

    id_color INT 

); 

  

CREATE TABLE COLOR( 

    id_color INT NOT NULL, 

    nombre_color VARCHAR(15) NOT NULL 

); 

 

CREATE TABLE MODELO( 

    id_modelo INT NOT NULL, 

    nombre_modelo VARCHAR(15) NOT NULL 

); 

CREATE TABLE MARCA(
    id_marca INT NOT NULL,
    
    nombre_marca VARCHAR(15) NOT NULL
);
  
CREATE TABLE LINEA( 

    id_linea INT NOT NULL, 

    nombre_linea VARCHAR(15) NOT NULL 

); 

  

CREATE TABLE tipo( 

    id_tipo INT NOT NULL, 

    nombre_tipo VARCHAR(15) NOT NULL 

); 

  

/* 

CONSTRAINTS 

*/ 

 

ALTER TABLE SUCURSAL 

ADD CONSTRAINT sucursal_pk 

PRIMARY KEY (id_sucursal); 

  

ALTER TABLE CIUDAD_SUCURSAL 

ADD CONSTRAINT ciudad_sucursal_pk 

PRIMARY KEY (id_ciudad); 

  

ALTER TABLE EMPLEADO 

ADD CONSTRAINT empleado_pk 

PRIMARY KEY (documento , codigo); 

  

ALTER TABLE CARGO 

ADD CONSTRAINT cargp_pk 

PRIMARY KEY (id_cargo); 

  

ALTER TABLE TELEFONO_E 

ADD CONSTRAINT telefono_e_pk 

PRIMARY KEY (documento_e , telefono_e , codigo_e); 

  

ALTER TABLE CLIENTE 

ADD CONSTRAINT cliente_pk 

PRIMARY KEY (documento); 

  

ALTER TABLE TELEFONO_C 

ADD CONSTRAINT telefono_c_pk 

PRIMARY KEY (documento_c , telefono_c); 

  

ALTER TABLE VENTA 

ADD CONSTRAINT venta_pk 

PRIMARY KEY (id_venta); 

  

ALTER TABLE CIUDAD_CLIENTE 

ADD CONSTRAINT ciudad_cliente_pk 

PRIMARY KEY (id_ciudad); 

  

ALTER TABLE AUTOMOTOR 

ADD CONSTRAINT automotor_pk 

PRIMARY KEY (numero_chasis); 

  

ALTER TABLE MODELO 

ADD CONSTRAINT modelo_pk 

PRIMARY KEY (id_modelo); 

  

ALTER TABLE LINEA 

ADD CONSTRAINT linea_pk 

PRIMARY KEY (id_linea); 

  

ALTER TABLE TIPO 

ADD CONSTRAINT tipo_pk 

PRIMARY KEY (id_tipo); 


ALTER TABLE MARCA 

ADD CONSTRAINT marca_pk 

PRIMARY KEY (id_marca); 

  

ALTER TABLE COLOR 

ADD CONSTRAINT color_pk 

PRIMARY KEY (id_color); 

  

/* 

FOREIGN KEYS 

*/ 

  

ALTER TABLE TELEFONO_E 

ADD CONSTRAINT fk_telefono_e__empleado 

FOREIGN KEY (documento_e , codigo_e) REFERENCES EMPLEADO (documento , codigo); 

  

ALTER TABLE EMPLEADO 

ADD CONSTRAINT fk_empleado__cargo 

FOREIGN KEY (id_cargo) REFERENCES CARGO (id_cargo); 

  

ALTER TABLE EMPLEADO 

ADD CONSTRAINT fk_empleado__sucursal 

FOREIGN KEY (id_sucursal) REFERENCES SUCURSAL (id_sucursal); 

  

ALTER TABLE SUCURSAL 

ADD CONSTRAINT fk_sucursal__ciudad_sucursal 

FOREIGN KEY (id_ciudad) REFERENCES CIUDAD_SUCURSAL (id_ciudad); 

  

ALTER TABLE CLIENTE 

ADD CONSTRAINT fk_cliente__ciudad_cliente 

FOREIGN KEY (id_ciudad) REFERENCES CIUDAD_CLIENTE (id_ciudad); 

  

ALTER TABLE CLIENTE 

ADD CONSTRAINT fk_cliente__id_sucursal 

FOREIGN KEY (id_sucursal) REFERENCES SUCURSAL (id_sucursal); 

  

ALTER TABLE VENTA 

ADD CONSTRAINT fk_venta__cliente 

FOREIGN KEY (documento_cliente) REFERENCES CLIENTE (documento); 

  

ALTER TABLE VENTA 

ADD CONSTRAINT fk_venta__empleado 

FOREIGN KEY (documento_empleado , codigo_empleado) REFERENCES EMPLEADO (documento , codigo); 

  

ALTER TABLE TELEFONO_C 

ADD CONSTRAINT fk_telefono_c__cliente 

FOREIGN KEY (documento_c) REFERENCES CLIENTE (documento); 

  

ALTER TABLE AUTOMOTOR 

ADD CONSTRAINT fk_automotor__venta 

FOREIGN KEY (id_venta) REFERENCES VENTA (id_venta); 

  

ALTER TABLE AUTOMOTOR 

ADD CONSTRAINT fk_automotor__sucursal 

FOREIGN KEY (id_sucursal) REFERENCES SUCURSAL (id_sucursal); 

  

ALTER TABLE AUTOMOTOR 

ADD CONSTRAINT fk_automotor__tipo 

FOREIGN KEY (id_tipo) REFERENCES TIPO (id_tipo); 

  

ALTER TABLE AUTOMOTOR 

ADD CONSTRAINT fk_automotor__linea 

FOREIGN KEY (id_linea) REFERENCES LINEA (id_linea); 

  

ALTER TABLE AUTOMOTOR 

ADD CONSTRAINT fk_automotor__modelo 

FOREIGN KEY (id_modelo) REFERENCES MODELO (id_modelo); 



ALTER TABLE AUTOMOTOR 

ADD CONSTRAINT fk_automotor__marca

FOREIGN KEY (id_marca) REFERENCES MARCA (id_marca); 

  

ALTER TABLE AUTOMOTOR 

ADD CONSTRAINT fk_automotor__color 

FOREIGN KEY (id_color) REFERENCES COLOR (id_color); 