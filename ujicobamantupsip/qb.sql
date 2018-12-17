-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 17, 2018 at 02:36 PM
-- Server version: 10.1.36-MariaDB
-- PHP Version: 7.2.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `qb`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `username` varchar(15) DEFAULT NULL,
  `password` varchar(15) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`username`, `password`) VALUES
('chris', 'chris123');

-- --------------------------------------------------------

--
-- Table structure for table `bill`
--

CREATE TABLE `bill` (
  `bno` int(15) NOT NULL,
  `cname` varchar(15) DEFAULT NULL,
  `amt` int(15) DEFAULT NULL,
  `pdate` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `bill`
--

INSERT INTO `bill` (`bno`, `cname`, `amt`, `pdate`) VALUES
(1, 'asd', 123, '2018-12-05'),
(2, 'asdfgh', 246, '2018-12-05'),
(3, 'asdf', 123, '2018-12-05');

-- --------------------------------------------------------

--
-- Table structure for table `cash`
--

CREATE TABLE `cash` (
  `id` int(15) NOT NULL,
  `name` varchar(15) DEFAULT NULL,
  `mno` varchar(15) DEFAULT NULL,
  `address` varchar(15) DEFAULT NULL,
  `email` varchar(15) DEFAULT NULL,
  `password` varchar(15) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `cash`
--

INSERT INTO `cash` (`id`, `name`, `mno`, `address`, `email`, `password`) VALUES
(1, 'yasintar', '0819000', 'surabaya', 'email@gmail.com', '12345');

-- --------------------------------------------------------

--
-- Table structure for table `stock`
--

CREATE TABLE `stock` (
  `id` int(15) NOT NULL,
  `pname` varchar(15) DEFAULT NULL,
  `available` int(15) DEFAULT NULL,
  `mrp` int(15) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `stock`
--

INSERT INTO `stock` (`id`, `pname`, `available`, `mrp`) VALUES
(1, 'boyki', 13, 123),
(2, 'biskuat', 10, 100);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `bill`
--
ALTER TABLE `bill`
  ADD PRIMARY KEY (`bno`);

--
-- Indexes for table `cash`
--
ALTER TABLE `cash`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `stock`
--
ALTER TABLE `stock`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `cash`
--
ALTER TABLE `cash`
  MODIFY `id` int(15) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
