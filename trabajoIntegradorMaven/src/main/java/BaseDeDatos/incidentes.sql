-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 18-11-2023 a las 05:20:09
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `incidentes`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `comercial`
--

CREATE TABLE `comercial` (
  `id_cliente` int(11) NOT NULL,
  `cuit_cliente` int(11) NOT NULL,
  `razon_social` varchar(30) NOT NULL,
  `telefono` int(11) NOT NULL,
  `correo` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `mesa_ayuda`
--

CREATE TABLE `mesa_ayuda` (
  `id_ticket` int(11) NOT NULL,
  `id_cliente` int(11) NOT NULL,
  `fecha_ingreso` date NOT NULL,
  `incidente` enum('SAP','Tango','Windows','MacOS','Linux') NOT NULL,
  `id_tecnico` int(11) NOT NULL,
  `tiempo_resolucion` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `resultado`
--

CREATE TABLE `resultado` (
  `id_tecnico` int(11) NOT NULL,
  `id_ticket` int(11) NOT NULL,
  `consideraciones` varchar(50) NOT NULL,
  `resuelto` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `rrhh`
--

CREATE TABLE `rrhh` (
  `id_tecnico` int(11) NOT NULL,
  `nombre_tecnico` varchar(30) NOT NULL,
  `apellido_tecnico` varchar(30) NOT NULL,
  `dni_tecnico` int(11) NOT NULL,
  `especialidad` enum('SAP','Tango','Windows','MacOS','Linux') NOT NULL,
  `estado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `comercial`
--
ALTER TABLE `comercial`
  ADD PRIMARY KEY (`id_cliente`),
  ADD UNIQUE KEY `cuit_cliente` (`cuit_cliente`);

--
-- Indices de la tabla `mesa_ayuda`
--
ALTER TABLE `mesa_ayuda`
  ADD PRIMARY KEY (`id_ticket`),
  ADD KEY `id_cliente` (`id_cliente`),
  ADD KEY `id_tecnico` (`id_tecnico`);

--
-- Indices de la tabla `resultado`
--
ALTER TABLE `resultado`
  ADD KEY `id_tecnico` (`id_tecnico`),
  ADD KEY `id_ticket` (`id_ticket`);

--
-- Indices de la tabla `rrhh`
--
ALTER TABLE `rrhh`
  ADD PRIMARY KEY (`id_tecnico`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `comercial`
--
ALTER TABLE `comercial`
  MODIFY `id_cliente` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `mesa_ayuda`
--
ALTER TABLE `mesa_ayuda`
  MODIFY `id_ticket` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `rrhh`
--
ALTER TABLE `rrhh`
  MODIFY `id_tecnico` int(11) NOT NULL AUTO_INCREMENT;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `mesa_ayuda`
--
ALTER TABLE `mesa_ayuda`
  ADD CONSTRAINT `mesa_ayuda_ibfk_1` FOREIGN KEY (`id_cliente`) REFERENCES `comercial` (`id_cliente`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `mesa_ayuda_ibfk_2` FOREIGN KEY (`id_tecnico`) REFERENCES `rrhh` (`id_tecnico`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `resultado`
--
ALTER TABLE `resultado`
  ADD CONSTRAINT `resultado_ibfk_1` FOREIGN KEY (`id_tecnico`) REFERENCES `rrhh` (`id_tecnico`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `resultado_ibfk_2` FOREIGN KEY (`id_ticket`) REFERENCES `mesa_ayuda` (`id_ticket`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
