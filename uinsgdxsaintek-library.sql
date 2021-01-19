-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 19 Jan 2021 pada 13.54
-- Versi server: 10.4.17-MariaDB
-- Versi PHP: 8.0.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `uinsgdxsaintek-library`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `buku`
--
CREATE DATABASE IF NOT EXISTS `uinsgdxsaintek-library` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `uinsgdxsaintek-library`;

CREATE TABLE `buku` (
  `IDBuku` varchar(30) NOT NULL,
  `NamaBuku` varchar(30) NOT NULL,
  `Penulis` varchar(30) NOT NULL,
  `KelompokJurusan` varchar(30) NOT NULL,
  `KelompokSemester` varchar(30) NOT NULL,
  `Ketersediaan` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `buku`
--

INSERT INTO `buku` (`IDBuku`, `NamaBuku`, `Penulis`, `KelompokJurusan`, `KelompokSemester`, `Ketersediaan`) VALUES
('1te2020-1', 'Elektronika Dasar 1', 'Yohandri, M.Si.,Ph.D.', 'Teknik Elektro', '1-TE', 'NO'),
('1te2020-2', 'Dasar Listrik & Elektronika', 'Ratih Listiyarini, S.T.', 'Teknik Elektro', '1-TE', 'YES'),
('1te2020-3', 'Elektronika Dasar Untuk Pemula', 'Ade Setiawan', 'Teknik Elektro', '1-TE', 'YES'),
('2te2020-1', 'Elektronika 2', 'Sutrisno', 'Teknik Elektro', '2-TE', 'YES'),
('3te2020-3', 'Rangkaian Listrik', 'Koko Joni, S.T.,M.Eng.', 'Teknik Elektro', '3-TE', 'YES'),
('3te2020-2', 'Rangkaian Listrik', 'Mohamad Ramdhani', 'Teknik Elektro', '3-TE', 'YES'),
('4te2020-1', 'Teknik Digital', 'Ir. Wijaya Widjanarka N.', 'Teknik Elektro', '4-TE', 'YES'),
('4te2020-2', 'Jaringan Telekomunikasi', 'Uke Kurniawan Usman', 'Teknik Elektro', '4-TE', 'NO'),
('4te2020-3', 'Sinyal dan Sistem Linear', 'Robert A. Gabel', 'Teknik Elektro', '4-TE', 'NO'),
('5te2021-1', 'Sistem Mikroprocessor', 'I Wayan Sutaya, S.T.,M.T.', 'Teknik Elektro', '5-TE', 'YES'),
('5te2020-2', 'Sistem Komuniksi Indonesia', 'Nurudin', 'Teknik Elektro', '5-TE', 'YES'),
('5te2021-3', 'Jaringan Komputer', 'Suleman', 'Teknik Elektro', '5-TE', 'YES'),
('6te2021-1', 'Pemrosesan Sinyal Digital', 'RH Siianipar', 'Teknik Elektro', '6-TE', 'YES'),
('6te2020-2', 'Sistem Kendali', 'Marwan Effendi', 'Teknik Elektro', '6-TE', 'YES'),
('6te2021-3', 'Sistem Instrumentasi & Kontrol', 'W. Botton', 'Teknik Elektro', '6-TE', 'YES'),
('6te2021-4', 'Sistem Tenaga Listrik', 'Sutrisno', 'Teknik Elektro', '6-TE', 'YES'),
('6te2021-5', 'Sistem Multimedia', 'M. Suyanto', 'Teknik Elektro', '6-TE', 'YES'),
('8te2021-1', 'Panduan Tugas Akhir', 'Marwah', 'Teknik Elektro', '8-TE', 'YES'),
('1ti2020-1', 'Pengantar Teknologi Informasi', 'Edi Sasongko', 'Teknik Informatika', '1-TI', 'YES'),
('2ti2021-1', 'Arsitektur Komputer', 'William Stalling', 'Teknik Informatika', '2-TI', 'YES');

-- --------------------------------------------------------

--
-- Struktur dari tabel `mahasiswa`
--

CREATE TABLE `mahasiswa` (
  `NIM` varchar(50) NOT NULL,
  `Nama` varchar(50) NOT NULL,
  `KelompokJurusann` varchar(50) NOT NULL,
  `KelompokSemesterr` varchar(50) NOT NULL,
  `Alamat` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `mahasiswa`
--

INSERT INTO `mahasiswa` (`NIM`, `Nama`, `KelompokJurusann`, `KelompokSemesterr`, `Alamat`) VALUES
('1177070067', 'M Luthfi Faturahman', 'Teknik Elektro', '7-TE', 'Bandung'),
('1197070005', 'Agil Algifari Rizki', 'Teknik Elektro', '3-TE', 'Bumiayu'),
('1197070010', 'Aldi Anugrah', 'Teknik Elektro', '3-TE', 'Cimahi'),
('1197070037', 'Iba Nur Alamsyah', 'Teknik Elektro', '3-TE', 'Majalengka'),
('1197070042', 'Kurnia Sandi', 'Teknik Elektro', '3-TE', 'Banten'),
('1197070047', 'Moch Fiqri Fadillah', 'Teknik Elektro', '3-TE', 'Bandung'),
('1197070053', 'M Rafly Riza', 'Teknik Elektro', '3-TE', 'Palangkaraya'),
('1197070057', 'M Thoha Firdaus', 'Teknik Elektro', '3-TE', 'Purwakarta'),
('1197070059', 'NUR ROKHMAN', 'Teknik Elektro', '3-TE', 'Cirebon'),
('1197070060', 'RM Rifki fauzan', 'Teknik Elektro', '3-TE', 'Bandung'),
('1197070062', 'Raka Dhijan Ananda', 'Teknik Elektro', '3-TE', 'Bandung'),
('1197070067', 'Rizki Noperli', 'Teknik Elektro', '3-TE', 'Cimahi'),
('197070063', 'Rangga Resistianto', 'Teknik Elektro', '3-TE', 'Bandung'),
('197070079', 'Zaki Prawira', 'Teknik Elektro', '3-TE', 'Sukabumi');

-- --------------------------------------------------------

--
-- Struktur dari tabel `peminjaman`
--

CREATE TABLE `peminjaman` (
  `NIM` varchar(50) NOT NULL,
  `Nama` varchar(50) NOT NULL,
  `IDBuku` varchar(50) NOT NULL,
  `NamaBuku` varchar(50) NOT NULL,
  `Penulis` varchar(50) NOT NULL,
  `Alamat` text NOT NULL,
  `WaktuPeminjaman` varchar(50) NOT NULL,
  `KelompokJurusann` varchar(50) NOT NULL,
  `KelompokSemesterr` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `peminjaman`
--

INSERT INTO `peminjaman` (`NIM`, `Nama`, `IDBuku`, `NamaBuku`, `Penulis`, `Alamat`, `WaktuPeminjaman`, `KelompokJurusann`, `KelompokSemesterr`) VALUES
('1197070047', 'Moch Fiqri Fadillah', '4te2020-3', 'Sinyal dan Sistem Linear', 'Robert A. Gabel', 'Bandung', '18-01-2021', 'Teknik Elektro', '3-TE'),
('1197070057', 'M Thoha Firdaus', '4te2020-2', 'Jaringan Telekomunikasi', 'Uke Kurniawan Usman', 'Purwakarta', '18-01-2021', 'Teknik Elektro', '3-TE');

-- --------------------------------------------------------

--
-- Struktur dari tabel `pengembalian`
--

CREATE TABLE `pengembalian` (
  `NIM` varchar(50) NOT NULL,
  `Nama` varchar(50) NOT NULL,
  `IDBuku` varchar(50) NOT NULL,
  `NamaBuku` varchar(50) NOT NULL,
  `Penulis` varchar(50) NOT NULL,
  `WaktuPeminjaman` varchar(50) NOT NULL,
  `WaktuPengembalian` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `pengembalian`
--

INSERT INTO `pengembalian` (`NIM`, `Nama`, `IDBuku`, `NamaBuku`, `Penulis`, `WaktuPeminjaman`, `WaktuPengembalian`) VALUES
('1197070059', 'NUR ROKHMAN', '3te2020-2', 'Rangkaian Listrik', 'Mohamad Ramdhani', '18-01-2021', '18-01-2021'),
('1197070060', 'RM Rifki fauzan', '3te2020-3', 'Rangkaian Listrik', 'Koko Joni, S.T.,M.Eng.', '18-01-2021', '18-01-2021'),
('1197070005', 'Agil Algifari Rizki', '4te2020-1', 'Teknik Digital', 'Ir. Wijaya Widjanarka N.', '18-01-2021', '18-01-2021');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `mahasiswa`
--
ALTER TABLE `mahasiswa`
  ADD PRIMARY KEY (`NIM`);

--
-- Indeks untuk tabel `peminjaman`
--
ALTER TABLE `peminjaman`
  ADD UNIQUE KEY `NIM` (`NIM`),
  ADD KEY `SStream` (`KelompokJurusann`,`KelompokSemesterr`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
