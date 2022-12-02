create table techshop.usuario (
id_usuario INT NOT NULL AUTO_INCREMENT,
username varchar(20),
password varchar(200),
PRIMARY KEY (id_usuario)
)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_eo_0900_ai_ci;



create table techshop.rol (
id_rol INT NOT NULL AUTO_INCREMENT,
nombre varchar(20),
id_usuario int,
PRIMARY KEY (id_rol),
foreign key fk_rol_usuario (id_usuario) references usuario(id_usuario)
)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_eo_0900_ai_ci;



insert into techshop.usuario (id_usuario, username, password) values (1,'juan','$2a$10$RXtiP.2pc.Gd.BFDdOqbFuIfyzjjuKSUOJmavi3xXJ7IX5ezia6Ee'),
(2,'rebeca','$2a$10$4KYKpQkX37LDEaRLnxkSMuQieMUuIBFyV.vbdj76GD4hpIo/CYojW'),
(3,'pedro','$2a$10$NDYzSD53Dm8n9S99twlY5OI0MtZbv1I8JMR04cAbd0WfLkouadwj2');



insert into techshop.rol (id_rol, nombre, id_usuario) values
(1,'ROLE_ADMIN',1),
(2,'ROLE_VENDEDOR',1),
(3,'ROLE_USER',1),
(4,'ROLE_VENDEDOR',2),
(5,'ROLE_USER',2),
(6,'ROLE_USER',3);