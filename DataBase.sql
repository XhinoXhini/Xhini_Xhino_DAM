create table AGENCIAS(
id_Agencia INT,
Nombre_Agencia VARCHAR(20),
Pais_Agencia VARCHAR(20),
Fecha_Fundacion VARCHAR(20),
Autor_Examen VARCHAR(150) not null, 

constraint PK_AGENCIAS primary key (id_Agencia),
);

create table SATELITES(
id_Satelite INT,
Nombre_Satelite VARCHAR(20),
Orbita VARCHAR(20),
Peso INT,
Coste INT, 
Activo VARCHAR(2),
Fecha_Lanzamiento VARCHAR(20),
id_Agencia INT,
Autor_Examen VARCHAR(150) not null, 


constraint PK_SATELITE primary key (id_Satelite),
constraint FK_SATELITE foreign key (id_Agencia) references AGENCIAS
);

create table DETALLE_SATELITES(
id_DetalleSatelite INT,
Velocidad_Max INT,
Combustible INT,
Vida_Util INT,
Temperatura_Max INT, 
id_Satelite INT,
Autor_Examen VARCHAR(150) not null, 


constraint PK_DETALLE_SATELITE primary key (id_DetalleSatelite),
constraint FK_DETALLE_SATELITE unique (id_Satelite)  
);

INSERT INTO AGENCIAS VALUES (1,'Hollywood','España','12/03/1998','Xhino_Xhini_DAM2');
INSERT INTO AGENCIAS VALUES (2,'Peñarol','España','10/11/2005','Xhino_Xhini_DAM2');
INSERT INTO AGENCIAS VALUES (3,'Hulkal','Alemania','01/05/2001','Xhino_Xhini_DAM2');
INSERT INTO AGENCIAS VALUES (4,'Astro','Suecia','11/03/2008','Xhino_Xhini_DAM2');
INSERT INTO AGENCIAS VALUES (5,'Calcio','Italia','11/05/1998','Xhino_Xhini_DAM2');

INSERT INTO SATELITES VALUES (1,'Brad','Luna',10,5000,'No','12/08/2014',1,'Xhino_Xhini_DAM2');
INSERT INTO SATELITES VALUES (2,'Pit','Luna',20,5500,'Si','12/08/2019',3,'Xhino_Xhini_DAM2');
INSERT INTO SATELITES VALUES (3,'Cosco','Luna',5,2000,'No','12/08/2010',4,'Xhino_Xhini_DAM2');
INSERT INTO SATELITES VALUES (4,'Furia','Luna',40,15000,'Si','12/08/2024',1,'Xhino_Xhini_DAM2');
INSERT INTO SATELITES VALUES (5,'Pepe','Luna',8,3500,'No','12/08/2009',5,'Xhino_Xhini_DAM2');

INSERT INTO DETALLE_SATELITES VALUES (1,500,5000,10,5000,1,'Xhino_Xhini_DAM2');
INSERT INTO DETALLE_SATELITES VALUES (2,550,5200,9,4000,2,'Xhino_Xhini_DAM2');
INSERT INTO DETALLE_SATELITES VALUES (3,700,5800,15,6000,3,'Xhino_Xhini_DAM2');
INSERT INTO DETALLE_SATELITES VALUES (4,520,5900,22,5400,4,'Xhino_Xhini_DAM2');
INSERT INTO DETALLE_SATELITES VALUES (5,502,5050,11,5100,5,'Xhino_Xhini_DAM2');



