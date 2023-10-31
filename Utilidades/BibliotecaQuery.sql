-- Crear la base de datos
CREATE DATABASE IF NOT EXISTS biblioteca;
USE biblioteca;

-- Crear la tabla de usuarios
CREATE TABLE IF NOT EXISTS usuarios (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    correo VARCHAR(100) NOT NULL,
    contrasena VARCHAR(100) NOT NULL,
    tipo_usuario ENUM('Administrador', 'Profesor', 'Alumno') NOT NULL,
    mora DECIMAL(10, 2) DEFAULT 0,
    UNIQUE(correo)
);

-- Crear la tabla de ejemplares
CREATE TABLE IF NOT EXISTS ejemplares (
    id VARCHAR(50) PRIMARY KEY,
    titulo VARCHAR(255) NOT NULL,
    autor VARCHAR(255),
    tipo VARCHAR(50) NOT NULL,
    ubicacion VARCHAR(255) NOT NULL,
    cantidad INT NOT NULL,
    prestados INT DEFAULT 0,
    CHECK (cantidad >= prestados AND prestados >= 0)
);

-- Crear la tabla de géneros
CREATE TABLE IF NOT EXISTS generos (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    UNIQUE(nombre)
);

-- Crear la tabla de editoriales
CREATE TABLE IF NOT EXISTS editoriales (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    UNIQUE(nombre)
);

-- Crear la tabla de libros
CREATE TABLE IF NOT EXISTS libros (
    id_ejemplar VARCHAR(50),
    isbn VARCHAR(13),
    id_editorial INT,
    edicion INT,
    FOREIGN KEY (id_ejemplar) REFERENCES ejemplares(id),
    FOREIGN KEY (id_editorial) REFERENCES editoriales(id)
);

-- Crear la tabla de revistas
CREATE TABLE IF NOT EXISTS revistas (
    id_ejemplar VARCHAR(50),
    issn VARCHAR(9),
    numero INT,
    volumen INT,
    FOREIGN KEY (id_ejemplar) REFERENCES ejemplares(id)
);

-- Crear la tabla de CDs
CREATE TABLE IF NOT EXISTS cds (
    id_ejemplar VARCHAR(50),
    duracion INT, -- Duración en minutos
    id_genero INT,
    FOREIGN KEY (id_ejemplar) REFERENCES ejemplares(id),
    FOREIGN KEY (id_genero) REFERENCES generos(id)
);

-- Crear la tabla de tesis
CREATE TABLE IF NOT EXISTS tesis (
    id_ejemplar VARCHAR(50),
    universidad VARCHAR(100),
    anio INT,
    FOREIGN KEY (id_ejemplar) REFERENCES ejemplares(id)
);

-- Crear la tabla de préstamos
CREATE TABLE IF NOT EXISTS prestamos (
    id INT AUTO_INCREMENT PRIMARY KEY,
    id_usuario INT,
    id_ejemplar VARCHAR(50),
    fecha_prestamo DATE NOT NULL,
    fecha_devolucion DATE,
    FOREIGN KEY (id_usuario) REFERENCES usuarios(id),
    FOREIGN KEY (id_ejemplar) REFERENCES ejemplares(id),
    CHECK (fecha_prestamo <= fecha_devolucion OR fecha_devolucion IS NULL)
);

-- Crear la tabla de configuraciones
CREATE TABLE IF NOT EXISTS configuraciones (
    clave VARCHAR(50) PRIMARY KEY,
    valor VARCHAR(255) NOT NULL
);

-- Insertar configuraciones iniciales
INSERT INTO configuraciones (clave, valor) VALUES ('mora_diaria', '0.50'), ('max_prestamos', '3');
