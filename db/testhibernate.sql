-- phpMyAdmin SQL Dump
-- version 4.1.6
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 25-11-2015 a las 18:00:37
-- Versión del servidor: 5.6.16
-- Versión de PHP: 5.5.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `testhibernate`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `user`
--

CREATE TABLE IF NOT EXISTS `user` (
  `USER_ID` int(5) NOT NULL AUTO_INCREMENT,
  `USERNAME` varchar(20) NOT NULL,
  `CREATED_BY` varchar(20) NOT NULL,
  `CREATED_DATE` date NOT NULL,
  PRIMARY KEY (`USER_ID`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=9 ;

--
-- Volcado de datos para la tabla `user`
--

INSERT INTO `user` (`USER_ID`, `USERNAME`, `CREATED_BY`, `CREATED_DATE`) VALUES
(1, 'Camunda', 'Martin', '2015-11-10'),
(2, 'Cris', 'Cristina', '2015-11-09'),
(3, 'Sofi', 'App', '2015-11-11'),
(5, 'Sofi', 'App', '2015-11-11'),
(7, 'Sofi', 'App', '2015-11-11'),
(8, 'Sofi', 'App', '2015-11-11');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
