-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 28-11-2023 a las 19:25:21
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
-- Base de datos: `proyectofinal_hotel`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `categoria`
--

CREATE TABLE `categoria` (
  `idCategoria` int(11) NOT NULL,
  `tipoHabitacion` varchar(100) NOT NULL,
  `tipoCama` varchar(100) NOT NULL,
  `cantCamas` int(11) NOT NULL,
  `precio` double NOT NULL,
  `cantPersonas` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `categoria`
--

INSERT INTO `categoria` (`idCategoria`, `tipoHabitacion`, `tipoCama`, `cantCamas`, `precio`, `cantPersonas`) VALUES
(13, 'EstandarSimple', 'Simples', 1, 1000, 1),
(14, 'Doble', 'Simples', 1, 2000, 2),
(15, 'Triple', 'Simples', 3, 3000, 3),
(16, 'SuiteLujo', 'KingSize', 1, 6000, 2),
(17, 'SuiteLujo', 'Queen', 1, 5500, 2),
(18, 'EstandarSimple', 'Simples', 2, 3000, 4),
(19, 'EstandarSimple', 'Simples', 5, 1000, 5);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `habitacion`
--

CREATE TABLE `habitacion` (
  `idHabitacion` int(11) NOT NULL,
  `idCategoria` int(11) NOT NULL,
  `piso` int(11) NOT NULL,
  `nroHabitacion` bigint(20) NOT NULL,
  `estado` tinyint(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `habitacion`
--

INSERT INTO `habitacion` (`idHabitacion`, `idCategoria`, `piso`, `nroHabitacion`, `estado`) VALUES
(10, 13, 1, 1, 1),
(11, 13, 1, 2, 0),
(12, 13, 1, 3, 1),
(13, 13, 1, 4, 1),
(14, 14, 1, 5, 0),
(15, 14, 1, 6, 0),
(16, 15, 1, 7, 0),
(17, 15, 1, 8, 1),
(18, 17, 1, 9, 1),
(19, 16, 1, 10, 1),
(30, 13, 2, 11, 1),
(31, 13, 2, 12, 1),
(32, 13, 2, 13, 1),
(33, 13, 2, 14, 1),
(34, 14, 2, 15, 1),
(35, 14, 2, 16, 1),
(36, 15, 2, 17, 1),
(37, 15, 2, 18, 1),
(38, 17, 2, 19, 1),
(39, 16, 2, 20, 1),
(40, 13, 3, 21, 1),
(41, 13, 3, 22, 1),
(42, 13, 3, 23, 1),
(43, 13, 3, 24, 1),
(44, 14, 3, 25, 1),
(45, 14, 3, 26, 1),
(46, 15, 3, 27, 1),
(47, 15, 3, 28, 1),
(48, 17, 3, 29, 1),
(49, 16, 3, 30, 1),
(50, 13, 4, 31, 1),
(51, 13, 4, 32, 1),
(52, 13, 4, 33, 1),
(53, 13, 4, 34, 1),
(54, 14, 4, 35, 1),
(55, 14, 4, 36, 1),
(56, 15, 4, 37, 1),
(57, 15, 4, 38, 1),
(58, 17, 4, 39, 1),
(59, 16, 4, 40, 1),
(60, 13, 5, 41, 1),
(61, 13, 5, 42, 1),
(62, 13, 5, 43, 1),
(63, 13, 5, 44, 1),
(64, 14, 5, 45, 1),
(65, 14, 5, 46, 1),
(66, 15, 5, 47, 1),
(67, 15, 5, 48, 1),
(68, 17, 5, 49, 1),
(69, 16, 6, 50, 1),
(70, 13, 6, 51, 1),
(71, 13, 6, 52, 1),
(72, 13, 6, 53, 1),
(73, 13, 6, 54, 1),
(74, 14, 6, 55, 1),
(75, 14, 6, 56, 1),
(76, 15, 6, 57, 1),
(77, 15, 6, 58, 1),
(78, 17, 6, 59, 1),
(79, 16, 7, 60, 1),
(80, 13, 7, 61, 1),
(81, 13, 7, 62, 1),
(82, 13, 7, 63, 1),
(83, 13, 7, 64, 1),
(84, 14, 7, 65, 1),
(85, 14, 7, 66, 1),
(86, 15, 7, 67, 1),
(87, 15, 7, 68, 1),
(88, 17, 7, 69, 1),
(89, 16, 8, 70, 1),
(90, 13, 8, 71, 1),
(91, 13, 8, 72, 1),
(92, 13, 8, 73, 1),
(93, 13, 8, 74, 1),
(94, 14, 8, 75, 1),
(95, 14, 8, 76, 1),
(96, 15, 8, 77, 1),
(97, 15, 8, 78, 1),
(98, 17, 8, 79, 1),
(99, 16, 9, 80, 1),
(100, 13, 10, 81, 1),
(101, 13, 10, 82, 1),
(102, 13, 10, 83, 1),
(103, 13, 10, 84, 1),
(104, 14, 10, 85, 1),
(105, 14, 10, 86, 1),
(106, 15, 10, 87, 1),
(107, 15, 10, 88, 1),
(108, 17, 10, 89, 1),
(109, 16, 10, 90, 1),
(110, 13, 10, 91, 1),
(111, 13, 10, 92, 1),
(112, 13, 10, 93, 1),
(113, 13, 10, 94, 1),
(114, 14, 10, 95, 1),
(115, 14, 10, 96, 1),
(116, 15, 10, 97, 1),
(117, 15, 10, 98, 1),
(118, 17, 10, 99, 1),
(119, 16, 10, 100, 1),
(120, 13, 11, 101, 1),
(121, 13, 11, 102, 1),
(122, 13, 11, 103, 1),
(123, 13, 11, 104, 1),
(124, 14, 11, 105, 1),
(125, 14, 11, 106, 1),
(126, 15, 11, 107, 1),
(127, 15, 11, 108, 1),
(128, 17, 11, 109, 1),
(129, 16, 11, 110, 1),
(130, 13, 12, 111, 1),
(131, 13, 12, 112, 1),
(132, 13, 12, 113, 1),
(133, 13, 12, 114, 1),
(134, 14, 12, 115, 1),
(135, 14, 12, 116, 1),
(136, 15, 12, 117, 1),
(137, 15, 12, 118, 1),
(138, 17, 12, 119, 1),
(139, 16, 12, 120, 1),
(140, 13, 13, 121, 1),
(141, 13, 13, 122, 1),
(142, 13, 13, 123, 1),
(143, 13, 13, 124, 1),
(144, 14, 13, 125, 1),
(191, 14, 13, 126, 1),
(192, 15, 13, 127, 1),
(193, 15, 13, 128, 1),
(194, 17, 13, 129, 1),
(195, 16, 13, 130, 1),
(196, 13, 14, 131, 1),
(197, 13, 14, 132, 1),
(198, 13, 14, 133, 1),
(199, 13, 14, 134, 1),
(200, 14, 14, 135, 1),
(201, 14, 14, 136, 1),
(202, 15, 14, 137, 1),
(203, 15, 14, 138, 1),
(204, 17, 14, 139, 1),
(205, 16, 14, 140, 1),
(206, 13, 15, 141, 1),
(207, 13, 15, 142, 1),
(208, 13, 15, 143, 1),
(209, 13, 15, 144, 1),
(210, 14, 15, 145, 1),
(211, 14, 15, 146, 1),
(212, 15, 15, 147, 1),
(213, 15, 15, 148, 1),
(214, 17, 15, 149, 1),
(215, 16, 15, 150, 1),
(216, 13, 16, 151, 1),
(217, 13, 16, 152, 1),
(218, 13, 16, 153, 1),
(219, 13, 16, 154, 1),
(220, 14, 16, 155, 1),
(221, 14, 16, 156, 1),
(222, 15, 16, 157, 1),
(223, 15, 16, 158, 1),
(224, 17, 16, 159, 1),
(225, 16, 17, 160, 1),
(226, 13, 17, 161, 1),
(227, 13, 17, 162, 1),
(228, 13, 17, 163, 1),
(229, 13, 17, 164, 1),
(230, 14, 17, 165, 1),
(231, 14, 17, 166, 1),
(232, 15, 17, 167, 1),
(233, 15, 17, 168, 1),
(234, 17, 17, 169, 1),
(235, 16, 17, 170, 1),
(236, 13, 18, 171, 1),
(237, 13, 18, 172, 1),
(238, 13, 18, 173, 1),
(239, 13, 18, 174, 1),
(240, 14, 18, 175, 1),
(241, 14, 18, 176, 1),
(242, 15, 18, 177, 1),
(243, 15, 18, 178, 1),
(244, 17, 18, 179, 1),
(245, 16, 19, 180, 1),
(246, 13, 19, 181, 1),
(247, 13, 19, 182, 1),
(248, 13, 19, 183, 1),
(249, 13, 19, 184, 1),
(250, 14, 19, 185, 1),
(251, 14, 19, 186, 1),
(252, 15, 19, 187, 1),
(253, 15, 19, 188, 1),
(254, 17, 19, 189, 1),
(255, 16, 19, 190, 1),
(256, 13, 20, 191, 1),
(257, 13, 20, 192, 1),
(258, 13, 20, 193, 1),
(259, 13, 20, 194, 1),
(260, 14, 20, 195, 1),
(261, 14, 20, 196, 1),
(262, 15, 20, 197, 1),
(263, 15, 20, 198, 1),
(264, 17, 20, 199, 1),
(265, 16, 20, 200, 1),
(272, 14, 40, 300, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `huesped`
--

CREATE TABLE `huesped` (
  `idHuesped` int(11) NOT NULL,
  `dni` int(11) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `apellido` varchar(100) NOT NULL,
  `domicilio` varchar(100) NOT NULL,
  `correo` varchar(100) NOT NULL,
  `celular` int(20) NOT NULL,
  `estado` tinyint(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `huesped`
--

INSERT INTO `huesped` (`idHuesped`, `dni`, `nombre`, `apellido`, `domicilio`, `correo`, `celular`, `estado`) VALUES
(5, 2, 'A', 'AAAA', 'AAAAAAA', 'AAAA@AAA', 8388607, 1),
(6, 1, 'B', 'BBBB', 'BBBBBBB', 'BBBB@BBB', 8388607, 1),
(7, 1234, 'Z', 'ZZZZ', 'ZZZZZZ', 'ZZZZ@ZZZ', 4444444, 1),
(9, 12345678, 'Diego', 'Galindo', 'caba', 'diego@gmail.com', 123454648, 1),
(10, 1234556, 'sdasd', 'payaso', '121321324sdasdas', 'sdadsad', 123456789, 1),
(11, 213441, 'Diego', 'Gsada', 'asdsa', 'sdasdasddsa', 123123, 0),
(17, 98765432, 'Juan', 'Zepato', 'CABA 123', 'juanzepato@gmail.com', 1234567899, 1),
(18, 54646545, 'Sauron', 'Melkor', 'CABA 1234', '23265@gmail.com', 454564654, 1),
(19, 13019724, 'Han', 'Solo', 'Estrella muerte', 'hansolo@starwars.com', 12345678, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `reserva`
--

CREATE TABLE `reserva` (
  `idReserva` int(11) NOT NULL,
  `fechaInicio` date NOT NULL,
  `fechaFin` date NOT NULL,
  `precioTotal` int(11) NOT NULL,
  `dias` int(11) NOT NULL,
  `estado` tinyint(4) NOT NULL,
  `idHuesped` int(11) NOT NULL,
  `idHabitacion` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `reserva`
--

INSERT INTO `reserva` (`idReserva`, `fechaInicio`, `fechaFin`, `precioTotal`, `dias`, `estado`, `idHuesped`, `idHabitacion`) VALUES
(58, '2023-10-01', '2023-10-16', 30000, 15, 1, 9, 15),
(59, '2023-10-01', '2023-10-11', 30000, 10, 1, 5, 16),
(60, '2023-10-01', '2023-10-25', 48000, 24, 1, 19, 14),
(61, '2023-10-07', '2023-10-20', 13000, 13, 1, 19, 11);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `categoria`
--
ALTER TABLE `categoria`
  ADD PRIMARY KEY (`idCategoria`);

--
-- Indices de la tabla `habitacion`
--
ALTER TABLE `habitacion`
  ADD PRIMARY KEY (`idHabitacion`),
  ADD UNIQUE KEY `nroHabitacion` (`nroHabitacion`),
  ADD KEY `idCategoria` (`idCategoria`);

--
-- Indices de la tabla `huesped`
--
ALTER TABLE `huesped`
  ADD PRIMARY KEY (`idHuesped`),
  ADD UNIQUE KEY `dni` (`dni`);

--
-- Indices de la tabla `reserva`
--
ALTER TABLE `reserva`
  ADD PRIMARY KEY (`idReserva`),
  ADD KEY `fk_Huesped` (`idHuesped`),
  ADD KEY `fk_Habitaciones` (`idHabitacion`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `categoria`
--
ALTER TABLE `categoria`
  MODIFY `idCategoria` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=20;

--
-- AUTO_INCREMENT de la tabla `habitacion`
--
ALTER TABLE `habitacion`
  MODIFY `idHabitacion` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=273;

--
-- AUTO_INCREMENT de la tabla `huesped`
--
ALTER TABLE `huesped`
  MODIFY `idHuesped` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=20;

--
-- AUTO_INCREMENT de la tabla `reserva`
--
ALTER TABLE `reserva`
  MODIFY `idReserva` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=62;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `habitacion`
--
ALTER TABLE `habitacion`
  ADD CONSTRAINT `habitacion_ibfk_1` FOREIGN KEY (`idCategoria`) REFERENCES `categoria` (`idCategoria`);

--
-- Filtros para la tabla `reserva`
--
ALTER TABLE `reserva`
  ADD CONSTRAINT `fk_Habitaciones` FOREIGN KEY (`idHabitacion`) REFERENCES `habitacion` (`idHabitacion`),
  ADD CONSTRAINT `fk_Huesped` FOREIGN KEY (`idHuesped`) REFERENCES `huesped` (`idHuesped`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
