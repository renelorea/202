-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 28-05-2025 a las 22:01:29
-- Versión del servidor: 10.4.32-MariaDB
-- Versión de PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `joyeria_2`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `categorias`
--

CREATE TABLE `categorias` (
  `id` int(11) NOT NULL,
  `nombre` varchar(50) DEFAULT NULL,
  `crear` datetime DEFAULT NULL,
  `actualizar` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `categorias`
--

INSERT INTO `categorias` (`id`, `nombre`, `crear`, `actualizar`) VALUES
(1, 'papitas', '2025-05-28 12:13:27', '2025-05-28 12:13:27');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `clientes`
--

CREATE TABLE `clientes` (
  `id` int(11) NOT NULL,
  `nombre_completo` varchar(80) DEFAULT NULL,
  `direccion` varchar(100) DEFAULT NULL,
  `telefono` varchar(10) DEFAULT NULL,
  `correo` varchar(100) DEFAULT NULL,
  `crear` datetime DEFAULT NULL,
  `actualizar` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `compras`
--

CREATE TABLE `compras` (
  `id` int(11) NOT NULL,
  `total` double DEFAULT NULL,
  `crear` datetime DEFAULT NULL,
  `proveedor_id` int(11) DEFAULT NULL,
  `empleado_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detalles_de_compra`
--

CREATE TABLE `detalles_de_compra` (
  `id` int(11) NOT NULL,
  `precio_compra` double DEFAULT NULL,
  `monto_compra` int(11) DEFAULT NULL,
  `subtotal_compra` double DEFAULT NULL,
  `compra_id` int(11) DEFAULT NULL,
  `producto_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detalles_venta`
--

CREATE TABLE `detalles_venta` (
  `id` int(11) NOT NULL,
  `cantidad_venta` int(11) DEFAULT NULL,
  `precio_venta` double DEFAULT NULL,
  `subtotal_venta` double DEFAULT NULL,
  `producto_id` int(11) DEFAULT NULL,
  `venta_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `empleados`
--

CREATE TABLE `empleados` (
  `id` int(11) NOT NULL,
  `nombre` varchar(50) DEFAULT NULL,
  `nombre_usuario` varchar(50) DEFAULT NULL,
  `direccion` varchar(100) DEFAULT NULL,
  `telefono` varchar(10) DEFAULT NULL,
  `correo` varchar(100) DEFAULT NULL,
  `contrasena` varchar(50) DEFAULT NULL,
  `rol` varchar(50) DEFAULT NULL,
  `crear` datetime DEFAULT NULL,
  `actualizar` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `empleados`
--

INSERT INTO `empleados` (`id`, `nombre`, `nombre_usuario`, `direccion`, `telefono`, `correo`, `contrasena`, `rol`, `crear`, `actualizar`) VALUES
(1, 'prueba', 'mari', 'calle 13', '124536986', 'prueba@gmail', '1234', 'ADMINISTRADOR', NULL, '2025-05-20 12:51:30'),
(2, 'bavsbn', 'jb', 'hfhg', '2424552455', 'snfbsbwvs', NULL, 'ADMINISTRADOR', '2025-05-28 12:51:21', '2025-05-28 12:51:21'),
(5, 'samnbbdnm', 'vv', 'abnsvbdnm', '232313215', 'asjdbhjbdah', '12345', 'ADMINISTRADOR', '2025-05-28 13:47:47', '2025-05-28 13:47:47'),
(6, 'jajksghj', 'bb', 'jkgegjgde', '5345345675', 'jgshjgdjha', '1234', 'ADMINISTRADOR', '2025-05-28 13:08:06', '2025-05-28 13:08:06'),
(23, 'nose', 'no', 'calle 23', '231354', 'nose@gmail', '12345', 'ADMINISTRADOR', '2025-05-20 13:15:03', '2025-05-20 13:15:03');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `productos`
--

CREATE TABLE `productos` (
  `id` int(11) NOT NULL,
  `codigo` int(11) DEFAULT NULL,
  `nombre` varchar(60) DEFAULT NULL,
  `descripcion` varchar(100) DEFAULT NULL,
  `precio_unidad` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `suplimers`
--

CREATE TABLE `suplimers` (
  `id` int(11) NOT NULL,
  `name` varchar(50) DEFAULT NULL,
  `description` varchar(50) DEFAULT NULL,
  `telephone` varchar(10) DEFAULT NULL,
  `address` varchar(150) DEFAULT NULL,
  `email` varchar(250) DEFAULT NULL,
  `city` varchar(100) DEFAULT NULL,
  `crear` datetime DEFAULT NULL,
  `actualizar` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `suplimers`
--

INSERT INTO `suplimers` (`id`, `name`, `description`, `telephone`, `address`, `email`, `city`, `crear`, `actualizar`) VALUES
(1, 'qnmbhjnevd', 'coca', '2123351', 'sajkbkdb', 'correo@', 'CDMX', NULL, NULL),
(2, 'ashdkn', ' asddfsf', '2113551', 'sajvdvd', 'asbvdbnand', 'CDMX', NULL, NULL),
(3, 'coca', 'el de la coca', '1213165', 'calle', 'coca@gmail', 'CDMX', NULL, NULL);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ventas`
--

CREATE TABLE `ventas` (
  `id` int(11) NOT NULL,
  `fecha_compra` datetime DEFAULT NULL,
  `total` double DEFAULT NULL,
  `clientes_id` int(11) DEFAULT NULL,
  `empleado_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `categorias`
--
ALTER TABLE `categorias`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `clientes`
--
ALTER TABLE `clientes`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `compras`
--
ALTER TABLE `compras`
  ADD PRIMARY KEY (`id`),
  ADD KEY `proveedor_id` (`proveedor_id`),
  ADD KEY `empleado_id` (`empleado_id`);

--
-- Indices de la tabla `detalles_de_compra`
--
ALTER TABLE `detalles_de_compra`
  ADD PRIMARY KEY (`id`),
  ADD KEY `compra_id` (`compra_id`),
  ADD KEY `producto_id` (`producto_id`);

--
-- Indices de la tabla `detalles_venta`
--
ALTER TABLE `detalles_venta`
  ADD PRIMARY KEY (`id`),
  ADD KEY `producto_id` (`producto_id`),
  ADD KEY `venta_id` (`venta_id`);

--
-- Indices de la tabla `empleados`
--
ALTER TABLE `empleados`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `productos`
--
ALTER TABLE `productos`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `suplimers`
--
ALTER TABLE `suplimers`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `ventas`
--
ALTER TABLE `ventas`
  ADD PRIMARY KEY (`id`),
  ADD KEY `clientes_id` (`clientes_id`),
  ADD KEY `empleado_id` (`empleado_id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `categorias`
--
ALTER TABLE `categorias`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `empleados`
--
ALTER TABLE `empleados`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=24;

--
-- AUTO_INCREMENT de la tabla `suplimers`
--
ALTER TABLE `suplimers`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `compras`
--
ALTER TABLE `compras`
  ADD CONSTRAINT `compras_ibfk_1` FOREIGN KEY (`proveedor_id`) REFERENCES `suplimers` (`id`),
  ADD CONSTRAINT `compras_ibfk_2` FOREIGN KEY (`empleado_id`) REFERENCES `empleados` (`id`);

--
-- Filtros para la tabla `detalles_de_compra`
--
ALTER TABLE `detalles_de_compra`
  ADD CONSTRAINT `detalles_de_compra_ibfk_1` FOREIGN KEY (`compra_id`) REFERENCES `compras` (`id`),
  ADD CONSTRAINT `detalles_de_compra_ibfk_2` FOREIGN KEY (`producto_id`) REFERENCES `productos` (`id`);

--
-- Filtros para la tabla `detalles_venta`
--
ALTER TABLE `detalles_venta`
  ADD CONSTRAINT `detalles_venta_ibfk_1` FOREIGN KEY (`producto_id`) REFERENCES `productos` (`id`),
  ADD CONSTRAINT `detalles_venta_ibfk_2` FOREIGN KEY (`venta_id`) REFERENCES `ventas` (`id`);

--
-- Filtros para la tabla `ventas`
--
ALTER TABLE `ventas`
  ADD CONSTRAINT `ventas_ibfk_1` FOREIGN KEY (`clientes_id`) REFERENCES `clientes` (`id`),
  ADD CONSTRAINT `ventas_ibfk_2` FOREIGN KEY (`empleado_id`) REFERENCES `empleados` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
