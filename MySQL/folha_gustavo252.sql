-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 25-Out-2023 às 14:20
-- Versão do servidor: 10.4.28-MariaDB
-- versão do PHP: 8.0.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `folha_gustavo252`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `tb_func`
--

CREATE TABLE `tb_func` (
  `id_func` int(11) NOT NULL,
  `nome_func` varchar(80) NOT NULL,
  `datanasc_func` date NOT NULL,
  `sexo_func` char(1) NOT NULL,
  `salario_func` double(10,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Extraindo dados da tabela `tb_func`
--

INSERT INTO `tb_func` (`id_func`, `nome_func`, `datanasc_func`, `sexo_func`, `salario_func`) VALUES
(1, 'EVANDO JOSÉ VIEIRA', '1980-11-09', 'M', 7500.75),
(2, 'EDÍLSON BITTENCOURT', '1988-04-07', 'M', 2400.40),
(3, 'MARIA FERNANDA', '1998-01-09', 'F', 8080.80),
(4, 'ANA JULIA', '2006-10-16', 'F', 1000.00);

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `tb_func`
--
ALTER TABLE `tb_func`
  ADD PRIMARY KEY (`id_func`);

--
-- AUTO_INCREMENT de tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `tb_func`
--
ALTER TABLE `tb_func`
  MODIFY `id_func` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
