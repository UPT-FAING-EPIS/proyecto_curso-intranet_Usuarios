-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Versión del servidor:         10.4.28-MariaDB - mariadb.org binary distribution
-- SO del servidor:              Win64
-- HeidiSQL Versión:             12.4.0.6659
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


-- Volcando estructura de base de datos para bd_usuarios
CREATE DATABASE IF NOT EXISTS `bd_usuarios` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci */;
USE `bd_usuarios`;

-- Volcando estructura para tabla bd_usuarios.ent_alumno
CREATE TABLE IF NOT EXISTS `ent_alumno` (
  `dnialumno` bigint(20) NOT NULL AUTO_INCREMENT,
  `apealumno` varchar(255) DEFAULT NULL,
  `correoalumno` varchar(255) DEFAULT NULL,
  `diralumno` varchar(255) DEFAULT NULL,
  `nomalumno` varchar(255) DEFAULT NULL,
  `telefonoalumno` int(11) DEFAULT NULL,
  PRIMARY KEY (`dnialumno`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- Volcando datos para la tabla bd_usuarios.ent_alumno: ~0 rows (aproximadamente)

-- Volcando estructura para tabla bd_usuarios.tbalumnos
CREATE TABLE IF NOT EXISTS `tbalumnos` (
  `dnialumno` int(8) NOT NULL,
  `nomalumno` varchar(100) DEFAULT NULL,
  `apealumno` varchar(100) DEFAULT NULL,
  `diralumno` varchar(100) DEFAULT NULL,
  `telefonoalumno` int(9) DEFAULT NULL,
  `correoalumno` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`dnialumno`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- Volcando datos para la tabla bd_usuarios.tbalumnos: ~4 rows (aproximadamente)
INSERT INTO `tbalumnos` (`dnialumno`, `nomalumno`, `apealumno`, `diralumno`, `telefonoalumno`, `correoalumno`) VALUES
	(71092341, 'Rosa', 'Miranda Villanueva', 'Av. Gregorio Albarracin Lanchipa Mz F Lt 15', 986234125, NULL),
	(71345543, 'Juan', 'Guzman Martinez', 'Asoc. Los ediles Mz A Lt 30', 952341786, NULL),
	(71349066, 'Ana', 'Chipana Mendoza', 'Av. San Martin Mz 20 Lt 23', 952834123, NULL),
	(71635321, 'Roberto', 'Gomez Bolaños', 'Asoc. Los guerreros de arica Mz B Lt 14', 952782132, NULL);

-- Volcando estructura para tabla bd_usuarios.tbdocente
CREATE TABLE IF NOT EXISTS `tbdocente` (
  `dnidocente` int(8) NOT NULL,
  `nomdocente` varchar(100) DEFAULT NULL,
  `apedocente` varchar(100) DEFAULT NULL,
  `dirdocente` varchar(100) DEFAULT NULL,
  `telefonodocente` int(9) DEFAULT NULL,
  `fk_idrol` int(11) DEFAULT NULL,
  `correodocente` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`dnidocente`),
  KEY `fk_idrol` (`fk_idrol`),
  CONSTRAINT `FK_tbdocente_tbrol_docente` FOREIGN KEY (`fk_idrol`) REFERENCES `tbrol_docente` (`idrol`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- Volcando datos para la tabla bd_usuarios.tbdocente: ~3 rows (aproximadamente)
INSERT INTO `tbdocente` (`dnidocente`, `nomdocente`, `apedocente`, `dirdocente`, `telefonodocente`, `fk_idrol`, `correodocente`) VALUES
	(12625478, 'Miguel', 'Viveros Blanco', 'Asoc. Los mafiosos de la calle Mz A Lt 21', 972312312, 2, NULL),
	(16234231, 'Luis', 'Quispe Mendoza', 'Av. Pocollay Mz 17 Lt 10', 982315431, 1, NULL),
	(72631234, 'Karolina', 'Mamani Villalobos', 'Av. Alto de la Alianza', 932461356, 3, NULL);

-- Volcando estructura para tabla bd_usuarios.tbrol_docente
CREATE TABLE IF NOT EXISTS `tbrol_docente` (
  `idrol` int(11) NOT NULL,
  `nomrol` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`idrol`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- Volcando datos para la tabla bd_usuarios.tbrol_docente: ~2 rows (aproximadamente)
INSERT INTO `tbrol_docente` (`idrol`, `nomrol`) VALUES
	(1, 'Docente'),
	(2, 'Director'),
	(3, 'SubDirector');

-- Volcando estructura para tabla bd_usuarios.tbusuario_alumno
CREATE TABLE IF NOT EXISTS `tbusuario_alumno` (
  `idusuario` int(11) NOT NULL,
  `fk_dnialumno` int(8) DEFAULT NULL,
  `contraalumno` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`idusuario`),
  KEY `fk_dnialumno` (`fk_dnialumno`),
  CONSTRAINT `FK__tbalumnos` FOREIGN KEY (`fk_dnialumno`) REFERENCES `tbalumnos` (`dnialumno`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- Volcando datos para la tabla bd_usuarios.tbusuario_alumno: ~4 rows (aproximadamente)
INSERT INTO `tbusuario_alumno` (`idusuario`, `fk_dnialumno`, `contraalumno`) VALUES
	(1, 71349066, '123'),
	(2, 71345543, '542'),
	(3, 71635321, '764'),
	(4, 71092341, '923');

-- Volcando estructura para tabla bd_usuarios.tbusuario_docente
CREATE TABLE IF NOT EXISTS `tbusuario_docente` (
  `idusuariodoc` int(11) NOT NULL,
  `fk_dnidocente` int(8) DEFAULT NULL,
  `contradocente` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`idusuariodoc`),
  KEY `fk_dnidocente` (`fk_dnidocente`),
  CONSTRAINT `FK__tbdocente` FOREIGN KEY (`fk_dnidocente`) REFERENCES `tbdocente` (`dnidocente`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- Volcando datos para la tabla bd_usuarios.tbusuario_docente: ~2 rows (aproximadamente)
INSERT INTO `tbusuario_docente` (`idusuariodoc`, `fk_dnidocente`, `contradocente`) VALUES
	(1, 72631234, '198'),
	(2, 16234231, 'luis123'),
	(3, 12625478, 'miguel12');

/*!40103 SET TIME_ZONE=IFNULL(@OLD_TIME_ZONE, 'system') */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
