DROP TABLE IF EXISTS DOCTORES;
DROP TABLE IF EXISTS CONSULTORIOS;
DROP TABLE IF EXISTS CITAS;
 
CREATE TABLE DOCTORES (
  doctor_id INT AUTO_INCREMENT PRIMARY KEY,
  nombre VARCHAR(250),
  apellido_paterno VARCHAR(250),
  apellido_materno VARCHAR(250),
  especialidad VARCHAR(250)
);


CREATE TABLE CONSULTORIOS (
  consultorio_id INT AUTO_INCREMENT PRIMARY KEY,
  piso INT,
  consultorio INT
);


CREATE TABLE CITAS(
  id INT AUTO_INCREMENT  PRIMARY KEY,
  consultorio_id INT,
  doctor_id INT,
  nombre_paciente VARCHAR(250),
  fecha_consulta DATE,
  hora_consulta VARCHAR(5),
  estado_consulta VARCHAR(250)
);