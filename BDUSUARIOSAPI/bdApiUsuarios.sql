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


-- Volcando estructura de base de datos para bd_usuarioss
CREATE DATABASE IF NOT EXISTS `bd_usuarioss` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci */;
USE `bd_usuarioss`;

-- Volcando estructura para tabla bd_usuarioss.tbroles
CREATE TABLE IF NOT EXISTS `tbroles` (
  `idrol` int(11) NOT NULL AUTO_INCREMENT,
  `nomrol` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`idrol`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- Volcando datos para la tabla bd_usuarioss.tbroles: ~2 rows (aproximadamente)
INSERT INTO `tbroles` (`idrol`, `nomrol`) VALUES
	(1, 'Estudiante'),
	(2, 'Docente');

-- Volcando estructura para tabla bd_usuarioss.tbusuarios
CREATE TABLE IF NOT EXISTS `tbusuarios` (
  `dniusu` varchar(8) NOT NULL,
  `contrausu` varchar(50) DEFAULT NULL,
  `estusu` bit(1) DEFAULT NULL,
  PRIMARY KEY (`dniusu`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- Volcando datos para la tabla bd_usuarioss.tbusuarios: ~4 rows (aproximadamente)
INSERT INTO `tbusuarios` (`dniusu`, `contrausu`, `estusu`) VALUES
	('12345678', '123renato', b'1'),
	('71233243', 'ana123', b'1'),
	('71322124', 'pepe', b'0'),
	('87654321', 'jimenez123', b'1');

-- Volcando estructura para tabla bd_usuarioss.tbusuarios_roles
CREATE TABLE IF NOT EXISTS `tbusuarios_roles` (
  `iduserrol` int(11) NOT NULL AUTO_INCREMENT,
  `fk_dniusu` varchar(8) NOT NULL,
  `fk_idrol` int(11) NOT NULL,
  PRIMARY KEY (`iduserrol`),
  KEY `FK_tbusuarios_roles_tbusuarios` (`fk_dniusu`),
  KEY `FK_tbusuarios_roles_tbroles` (`fk_idrol`),
  CONSTRAINT `FK_tbusuarios_roles_tbroles` FOREIGN KEY (`fk_idrol`) REFERENCES `tbroles` (`idrol`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `FK_tbusuarios_roles_tbusuarios` FOREIGN KEY (`fk_dniusu`) REFERENCES `tbusuarios` (`dniusu`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- Volcando datos para la tabla bd_usuarioss.tbusuarios_roles: ~4 rows (aproximadamente)
INSERT INTO `tbusuarios_roles` (`iduserrol`, `fk_dniusu`, `fk_idrol`) VALUES
	(1, '12345678', 1),
	(2, '71322124', 1),
	(3, '71233243', 2),
	(4, '87654321', 1);

/*!40103 SET TIME_ZONE=IFNULL(@OLD_TIME_ZONE, 'system') */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
