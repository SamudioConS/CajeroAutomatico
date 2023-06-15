create database bdatm;
USE bdatm;
CREATE TABLE atm (
    NumCuenta int not null AUTO_INCREMENT,
    Nombre VARCHAR(50) not null,
    Apellido VARCHAR(50) not null,
    Dinero DOUBLE not null,
    Edad VARCHAR(3) not null,
    Direccion_Residencia VARCHAR(100),
    NIP VARCHAR(50) not null,
    PRIMARY KEY (NumCuenta)
);