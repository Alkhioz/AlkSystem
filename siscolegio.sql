-- phpMyAdmin SQL Dump
-- version 4.6.6deb5
-- https://www.phpmyadmin.net/
--
-- Host: localhost:3306
-- Generation Time: Apr 14, 2019 at 06:33 PM
-- Server version: 10.1.29-MariaDB-6ubuntu2
-- PHP Version: 7.2.15-0ubuntu0.18.10.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `siscolegio`
--

-- --------------------------------------------------------

--
-- Table structure for table `actions`
--

CREATE TABLE `actions` (
  `id` int(11) NOT NULL,
  `iduser` int(11) DEFAULT NULL,
  `fecha` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

--
-- Dumping data for table `actions`
--

INSERT INTO `actions` (`id`, `iduser`, `fecha`) VALUES
(1, 1, '2017-12-10 13:56:43');

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `id` int(11) NOT NULL,
  `user` varchar(60) COLLATE utf8mb4_bin NOT NULL,
  `pass` varchar(60) COLLATE utf8mb4_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`id`, `user`, `pass`) VALUES
(1, 'admin', '123456');

-- --------------------------------------------------------

--
-- Table structure for table `alumno`
--

CREATE TABLE `alumno` (
  `Idalumno` int(10) NOT NULL,
  `Apellidos` varchar(50) NOT NULL,
  `Nombres` varchar(50) NOT NULL,
  `Fechanacimiento` varchar(10) NOT NULL,
  `Sexo` varchar(20) NOT NULL,
  `Direccion` varchar(50) NOT NULL,
  `Telefono` varchar(50) NOT NULL,
  `Email` varchar(50) NOT NULL,
  `Password` varchar(50) NOT NULL,
  `Grado` varchar(1) NOT NULL,
  `Seccion` varchar(1) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `alumno`
--

INSERT INTO `alumno` (`Idalumno`, `Apellidos`, `Nombres`, `Fechanacimiento`, `Sexo`, `Direccion`, `Telefono`, `Email`, `Password`, `Grado`, `Seccion`) VALUES
(3, 'Mundaca Manay', 'Jose Hugo', 'Tue May 12', 'Masculino', 'Jose Galvez 1368', '996354121', 'carlos_Ad_6@hotmail.com', '123456', '5', 'F'),
(6, 'Diaz Mendoza', 'Luis Alberto', 'Thu Dec 15', 'Masculino', 'Jose Galvez 1368', '973436105', 'pad2@hotmail.com', 'luisito', '5', 'F'),
(7, 'Avila', 'Erwin', 'Sun Jun 01', 'Masculino', 'San Pablo', '1800123', 'Correo@correo.com', '123', '4', 'D');

-- --------------------------------------------------------

--
-- Table structure for table `curso`
--

CREATE TABLE `curso` (
  `Idcurso` int(10) NOT NULL,
  `Nombrecurso` varchar(50) NOT NULL,
  `Idprofesor` varchar(10) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `curso`
--

INSERT INTO `curso` (`Idcurso`, `Nombrecurso`, `Idprofesor`) VALUES
(1, 'Matematica2', '2'),
(7, 'LIteratura2', '23'),
(11, 'Comunicacion II', '3'),
(9, 'aaaaa', '1'),
(10, 'Estadistica II', '3'),
(12, 'Desarrollo pro de Apps', '4');

-- --------------------------------------------------------

--
-- Table structure for table `notas`
--

CREATE TABLE `notas` (
  `Idnota` int(10) NOT NULL,
  `Idcurso` int(10) NOT NULL,
  `Idalumno` int(10) NOT NULL,
  `Unidad` varchar(20) NOT NULL,
  `Promedio` int(10) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `notas`
--

INSERT INTO `notas` (`Idnota`, `Idcurso`, `Idalumno`, `Unidad`, `Promedio`) VALUES
(3, 2, 3, '1', 17),
(6, 5, 2, '2', 19),
(7, 2, 8, '2', 14),
(20, 1, 6, '1', 5),
(10, 1, 3, '1', 17),
(13, 1, 3, '4', 17),
(14, 1, 3, '1', 20),
(15, 7, 4, '4', 18),
(19, 1, 3, '2', 20),
(17, 2, 3, '1', 17),
(18, 2, 4, '1', 13),
(21, 10, 5, '1', 7),
(22, 1, 5, '1', 20),
(23, 11, 5, '4', 6),
(24, 10, 5, '1', 20),
(25, 11, 6, '3', 15),
(26, 1, 6, '1', 17),
(27, 11, 5, '2', 18),
(28, 11, 6, '3', 9),
(30, 12, 7, '1', 2),
(31, 1, 7, '1', 15);

-- --------------------------------------------------------

--
-- Table structure for table `profesor`
--

CREATE TABLE `profesor` (
  `Idprofesor` int(10) NOT NULL,
  `Apellidos` varchar(50) NOT NULL,
  `Nombres` varchar(50) NOT NULL,
  `Dni` varchar(50) NOT NULL,
  `Direccion` varchar(50) NOT NULL,
  `Telefono` varchar(50) NOT NULL,
  `Email` varchar(50) NOT NULL,
  `Password` varchar(50) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `profesor`
--

INSERT INTO `profesor` (`Idprofesor`, `Apellidos`, `Nombres`, `Dni`, `Direccion`, `Telefono`, `Email`, `Password`) VALUES
(3, 'Torres Fernandez', 'Jenrry', '88456321', 'Los Pinos # 458', '019856321', 'jenrry147@hotmail.com', 'gastelo'),
(2, 'Díaz Perez', 'Jose', '47859632', 'Los Rosales # 1340', '987563214', 'checarlitos', 'checarlitos'),
(4, 'Mendoza', 'Alejandro', '13168886', 'Calle 28', '099888888', 'correo@100real.com', '123');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `actions`
--
ALTER TABLE `actions`
  ADD PRIMARY KEY (`id`),
  ADD KEY `iduser` (`iduser`);

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `alumno`
--
ALTER TABLE `alumno`
  ADD PRIMARY KEY (`Idalumno`);

--
-- Indexes for table `curso`
--
ALTER TABLE `curso`
  ADD PRIMARY KEY (`Idcurso`);

--
-- Indexes for table `notas`
--
ALTER TABLE `notas`
  ADD PRIMARY KEY (`Idnota`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `actions`
--
ALTER TABLE `actions`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT for table `admin`
--
ALTER TABLE `admin`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- Constraints for dumped tables
--

--
-- Constraints for table `actions`
--
ALTER TABLE `actions`
  ADD CONSTRAINT `actions_ibfk_1` FOREIGN KEY (`iduser`) REFERENCES `admin` (`id`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
