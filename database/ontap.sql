CREATE TABLE `NhatKyChi` (
  `ID` varchar(10) NOT NULL,
  `Ngay` date DEFAULT NULL,
  `MucChi` double DEFAULT NULL,
  `SoTien` double DEFAULT NULL,
  `GhiChu` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `account`
--

INSERT INTO `NhatKyChi` (`ID`, `Ngay`, `MucChi`, `SoTien`, `GhiChu`) VALUES
('001', '2003-2-2', 190000, 200000, "Tieu gi nhieu vay");

