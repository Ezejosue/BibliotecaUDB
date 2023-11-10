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

-- Insertar registros en la tabla de usuarios
INSERT INTO usuarios (nombre, correo, contrasena, tipo_usuario, mora)
VALUES
    ('Administrador 1', 'admin1@example.com', 'admin123', 'Administrador', 0),
    ('Profesor 1', 'profesor1@example.com', 'prof123', 'Profesor', 0),
    ('Alumno 1', 'alumno1@example.com', 'alum123', 'Alumno', 0);
    
    INSERT INTO generos (nombre) VALUES
    ('Ficción'),
    ('No ficción'),
    ('Ciencia ficción'),
    ('Romance'),
    ('Misterio'),
    ('Fantasía');
    
INSERT INTO editoriales (nombre) VALUES
    ('Editorial A'),
    ('Editorial B'),
    ('Editorial C'),
    ('Editorial D');
    
    INSERT INTO ejemplares (id, titulo, autor, tipo, ubicacion, cantidad, prestados) VALUES
    ('1', 'Libro 1', 'Autor 1', 'Libro', 'Estantería 1', 5, 2),
    ('2', 'Revista 1', 'Autor 2', 'Revista', 'Estantería 2', 10, 0),
    ('3', 'CD 1', 'Artista 1', 'CD', 'Estantería 3', 15, 5),
    ('4', 'Tesis 1', 'Autor 3', 'Tesis', 'Estantería 4', 3, 1);
    
    -- Insertar datos en la tabla de libros
INSERT INTO libros (id_ejemplar, isbn, id_editorial, edicion) VALUES
    ('1', 'ISBN123456', 1, 1),
    ('2', 'ISBN789101', 2, 2);

-- Insertar datos en la tabla de revistas
INSERT INTO revistas (id_ejemplar, issn, numero, volumen) VALUES
    ('2', 'ISSN12345', 3, 1);

-- Insertar datos en la tabla de CDs
INSERT INTO cds (id_ejemplar, duracion, id_genero) VALUES
    ('3', 60, 3);

-- Insertar datos en la tabla de tesis
INSERT INTO tesis (id_ejemplar, universidad, anio) VALUES
    ('4', 'Universidad X', 2020);


-- Insertar datos en la tabla de editoriales
INSERT INTO editoriales (nombre) VALUES
    ('Editorial XYZ'),
    ('Editorial ABC'),
    ('Editorial 123'),
    ('Editorial de Ciencia'),
    ('Editorial Romántica');

-- Insertar datos en la tabla de ejemplares
INSERT INTO ejemplares (id, titulo, autor, tipo, ubicacion, cantidad, prestados) VALUES
    ('1001', 'Cien años de soledad', 'Gabriel García Márquez', 'Libro', 'Estantería A', 10, 3),
    ('1002', 'National Geographic - Enero 2023', 'Varios autores', 'Revista', 'Estantería B', 20, 2),
    ('1003', 'The Dark Side of the Moon', 'Pink Floyd', 'CD', 'Estantería C', 5, 1),
    ('1004', 'Historia de la Antigua Roma', 'Mary Beard', 'Libro', 'Estantería D', 15, 5);

-- Insertar datos en la tabla de libros
INSERT INTO libros (id_ejemplar, isbn, id_editorial, edicion) VALUES
    ('1001', 'ISBN789107', 1, 1),
    ('1004', 'ISBN789108', 2, 2);

-- Insertar datos en la tabla de revistas
INSERT INTO revistas (id_ejemplar, issn, numero, volumen) VALUES
    ('1002', '07474662', 1, 25);

-- Insertar datos en la tabla de CDs
INSERT INTO cds (id_ejemplar, duracion, id_genero) VALUES
    ('1003', 43, 6);

-- Insertar datos en la tabla de tesis
INSERT INTO tesis (id_ejemplar, universidad, anio) VALUES
    ('1004', 'Universidad de Roma', 2018);
