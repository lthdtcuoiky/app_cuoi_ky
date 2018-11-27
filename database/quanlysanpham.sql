-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Máy chủ: 127.0.0.1
-- Thời gian đã tạo: Th10 25, 2018 lúc 04:16 AM
-- Phiên bản máy phục vụ: 10.1.36-MariaDB
-- Phiên bản PHP: 7.2.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Cơ sở dữ liệu: `quanlysanpham`
--

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `chucvu`
--

CREATE TABLE `chucvu` (
  `STT` int(11) DEFAULT NULL,
  `TenChucVu` varchar(100) CHARACTER SET utf8 DEFAULT NULL,
  `MaChucVu` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Đang đổ dữ liệu cho bảng `chucvu`
--

INSERT INTO `chucvu` (`STT`, `TenChucVu`, `MaChucVu`) VALUES
(0, NULL, 0),
(1, 'Giám Đốc', 1),
(2, 'Nhân Viên', 2),
(3, 'Bảo Vệ', 3);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `hangsanxuat`
--

CREATE TABLE `hangsanxuat` (
  `MaHangSanXuat` int(11) NOT NULL,
  `TenHangSanXuat` varchar(50) CHARACTER SET utf8 NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Đang đổ dữ liệu cho bảng `hangsanxuat`
--

INSERT INTO `hangsanxuat` (`MaHangSanXuat`, `TenHangSanXuat`) VALUES
(1, 'Hạ Long Canfoco'),
(2, 'Royal Foods'),
(3, 'Minh Trung'),
(4, 'Antesco'),
(5, 'Bảo Long Havi'),
(6, 'Vissan'),
(7, 'Tuyền Ký'),
(8, 'Seaspimex');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `hoadon`
--

CREATE TABLE `hoadon` (
  `MaHoaDon` int(11) NOT NULL,
  `MaKhachHang` int(11) DEFAULT NULL,
  `MaNhanVien` int(11) NOT NULL,
  `NgayLapHoaDon` date DEFAULT NULL,
  `TongTien` varchar(50) DEFAULT NULL,
  `GhiChu` varchar(255) CHARACTER SET utf8 DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Đang đổ dữ liệu cho bảng `hoadon`
--

INSERT INTO `hoadon` (`MaHoaDon`, `MaKhachHang`, `MaNhanVien`, `NgayLapHoaDon`, `TongTien`, `GhiChu`) VALUES
(7, 6, 11, '2018-11-19', '309000000', NULL),
(13, 11, 6, '2018-11-18', '47000000', NULL),
(17, 12, 11, '2018-11-08', '369000000', NULL),
(20, 14, 11, '2018-11-15', '471000000', NULL),
(21, 6, 1, NULL, '0', ''),
(22, 11, 1, NULL, '0', ''),
(23, 11, 1, '2018-11-20', '0', ''),
(24, 6, 1, NULL, '0', ''),
(25, 6, 1, NULL, '0', ''),
(26, 6, 1, NULL, '0', ''),
(27, 11, 1, '2018-11-20', '0', ''),
(28, 6, 1, NULL, '0', ''),
(29, 6, 1, NULL, '0', ''),
(30, 6, 1, NULL, '0', ''),
(31, 6, 1, NULL, '0', ''),
(32, 6, 1, NULL, '0', ''),
(33, 6, 1, NULL, '0', ''),
(34, 6, 1, NULL, '0', ''),
(35, 6, 1, NULL, '0', ''),
(36, 11, 1, NULL, '0', ''),
(37, 11, 1, NULL, '0', ''),
(38, 11, 1, NULL, '0', ''),
(39, 11, 1, NULL, '0', ''),
(40, 11, 1, NULL, '0', ''),
(41, 11, 1, NULL, '0', ''),
(42, 6, 1, NULL, '0', '');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `khachhang`
--

CREATE TABLE `khachhang` (
  `STT` int(11) DEFAULT NULL,
  `MaKhachHang` int(11) NOT NULL,
  `TenKhachHang` varchar(40) CHARACTER SET utf8 DEFAULT NULL,
  `GioiTinh` varchar(10) CHARACTER SET utf8 DEFAULT NULL,
  `DiaChi` varchar(100) CHARACTER SET utf8 DEFAULT NULL,
  `SDT` varchar(16) DEFAULT NULL,
  `ChuThich` varchar(200) CHARACTER SET utf8 DEFAULT NULL,
  `NgaySinh` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Đang đổ dữ liệu cho bảng `khachhang`
--

INSERT INTO `khachhang` (`STT`, `MaKhachHang`, `TenKhachHang`, `GioiTinh`, `DiaChi`, `SDT`, `ChuThich`, `NgaySinh`) VALUES
(1, 6, 'Hoàng Văn Nam', 'Nam', 'Hà Nội', '0909898964', 'Null', '1998-11-05');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `loaisanpham`
--

CREATE TABLE `loaisanpham` (
  `MaLoaiSanPham` int(11) NOT NULL,
  `TenLoaiSanPham` varchar(50) CHARACTER SET utf8 DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Đang đổ dữ liệu cho bảng `loaisanpham`
--

INSERT INTO `loaisanpham` (`MaLoaiSanPham`, `TenLoaiSanPham`) VALUES
(1, 'Đồ nướng'),
(2, 'Đồ luộc'),
(3, 'Đồ chiên'),
(4, 'Đồ nương'),
(5, 'Đồ chiên'),
(9, 'Đồ tái');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `nhanvien`
--

CREATE TABLE `nhanvien` (
  `MaNhanVien` int(11) NOT NULL,
  `TenNhanVien` varchar(50) CHARACTER SET utf8 DEFAULT NULL,
  `NgaySinh` date DEFAULT NULL,
  `GioiTinh` bit(1) DEFAULT NULL,
  `NgayVaoLam` date DEFAULT NULL,
  `ChucVu` int(11) DEFAULT NULL,
  `DiaChi` varchar(50) CHARACTER SET utf8 DEFAULT NULL,
  `SoDT` varchar(11) DEFAULT NULL,
  `GhiChu` varchar(255) CHARACTER SET utf8 DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Đang đổ dữ liệu cho bảng `nhanvien`
--

INSERT INTO `nhanvien` (`MaNhanVien`, `TenNhanVien`, `NgaySinh`, `GioiTinh`, `NgayVaoLam`, `ChucVu`, `DiaChi`, `SoDT`, `GhiChu`) VALUES
(1, 'Hoang Tuấn Anh', '1996-12-25', b'0', '2016-01-01', 1, '51-102 Nguyễn Đồng', '01628225158', NULL),
(2, 'Phạm Văn Toàn', '1997-01-02', b'0', '2018-11-13', 2, 'Hà Nội', '09878338172', NULL),
(3, 'Hoàng Tuấn Anh', '1999-10-09', b'0', '2018-11-21', 1, 'Hà Nội', '01628225158', 'Là người vui tính , hòa đồng');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `nhaphanphoi`
--

CREATE TABLE `nhaphanphoi` (
  `MaNhaPhanPhoi` int(11) NOT NULL,
  `TenNhaPhanPhoi` varchar(50) CHARACTER SET utf8 DEFAULT NULL,
  `DiaChi` varchar(50) CHARACTER SET utf8 DEFAULT NULL,
  `SDT` varchar(11) DEFAULT NULL,
  `Email` varchar(100) DEFAULT NULL,
  `ChuThich` text
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Đang đổ dữ liệu cho bảng `nhaphanphoi`
--

INSERT INTO `nhaphanphoi` (`MaNhaPhanPhoi`, `TenNhaPhanPhoi`, `DiaChi`, `SDT`, `Email`, `ChuThich`) VALUES
(1, 'FPT Trading', 'Hồ Chí Minh', '098674322', 'motcucgach77@gmail.com', NULL),
(2, 'docomo', 'Việt Nam', '0987848891', 'docomo@gmail.com', NULL);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `phieunhap`
--

CREATE TABLE `phieunhap` (
  `MaPhieuNhap` int(11) NOT NULL,
  `MaNhanVien` int(11) NOT NULL,
  `MaNhaPhanPhoi` int(11) DEFAULT NULL,
  `TongTien` varchar(100) DEFAULT NULL,
  `NgayNhap` date DEFAULT NULL,
  `ChuThich` varchar(255) CHARACTER SET utf8 DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Đang đổ dữ liệu cho bảng `phieunhap`
--

INSERT INTO `phieunhap` (`MaPhieuNhap`, `MaNhanVien`, `MaNhaPhanPhoi`, `TongTien`, `NgayNhap`, `ChuThich`) VALUES
(1, 11, 2, '10000000', '2017-06-03', NULL),
(2, 11, 2, '19000000', '2018-11-07', NULL);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `quyen`
--

CREATE TABLE `quyen` (
  `MaQuyen` int(11) NOT NULL,
  `TenQuyen` varchar(50) CHARACTER SET utf8 DEFAULT NULL,
  `ChuThich` varchar(255) CHARACTER SET utf8 DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Đang đổ dữ liệu cho bảng `quyen`
--

INSERT INTO `quyen` (`MaQuyen`, `TenQuyen`, `ChuThich`) VALUES
(1, 'Quản Trị Viên', NULL),
(2, 'Kế Toán', NULL),
(3, 'Thu Ngân', NULL),
(4, 'Bảo Vệ', NULL),
(5, 'New', NULL),
(6, 'Giám Đốc', NULL);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `sanpham`
--

CREATE TABLE `sanpham` (
  `MaSanPham` int(11) NOT NULL,
  `TenSanPham` varchar(50) CHARACTER SET utf8 DEFAULT NULL,
  `LoaiSanPham` int(11) DEFAULT NULL,
  `HangSanXuat` int(11) DEFAULT NULL,
  `GiaNhap` varchar(100) DEFAULT NULL,
  `GiaBan` varchar(100) DEFAULT NULL,
  `TonKho` int(11) DEFAULT NULL,
  `TrangThai` bit(1) DEFAULT NULL,
  `Image` varchar(150) DEFAULT NULL,
  `ChuThich` varchar(255) CHARACTER SET utf8 DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Đang đổ dữ liệu cho bảng `sanpham`
--

INSERT INTO `sanpham` (`MaSanPham`, `TenSanPham`, `LoaiSanPham`, `HangSanXuat`, `GiaNhap`, `GiaBan`, `TonKho`, `TrangThai`, `Image`, `ChuThich`) VALUES
(1, 'sony', 2, 4, '7456000', '7688800', 34, b'0', '/hinhsanpham/apple.png', NULL),
(3, 'htc 10', 2, 3, '18000000', '19700000', 19, b'0', '/hinhsanpham/.apple', NULL);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `users`
--

CREATE TABLE `users` (
  `ID` int(11) NOT NULL,
  `MaNhanVien` int(11) DEFAULT NULL,
  `TenDangNhap` varchar(50) DEFAULT NULL,
  `Password` varchar(50) DEFAULT NULL,
  `Quyen` int(11) DEFAULT NULL,
  `ChuThich` varchar(255) CHARACTER SET utf8 DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Đang đổ dữ liệu cho bảng `users`
--

INSERT INTO `users` (`ID`, `MaNhanVien`, `TenDangNhap`, `Password`, `Quyen`, `ChuThich`) VALUES
(1, 1, 'admin', 'admin', 1, 'Nguoi thẩm quyền'),
(2, 3, 'tuananh', '1999', 2, 'Người thẩm quyền');

--
-- Chỉ mục cho các bảng đã đổ
--

--
-- Chỉ mục cho bảng `chucvu`
--
ALTER TABLE `chucvu`
  ADD PRIMARY KEY (`MaChucVu`);

--
-- Chỉ mục cho bảng `hangsanxuat`
--
ALTER TABLE `hangsanxuat`
  ADD PRIMARY KEY (`MaHangSanXuat`);

--
-- Chỉ mục cho bảng `hoadon`
--
ALTER TABLE `hoadon`
  ADD PRIMARY KEY (`MaHoaDon`);

--
-- Chỉ mục cho bảng `khachhang`
--
ALTER TABLE `khachhang`
  ADD PRIMARY KEY (`MaKhachHang`);

--
-- Chỉ mục cho bảng `loaisanpham`
--
ALTER TABLE `loaisanpham`
  ADD PRIMARY KEY (`MaLoaiSanPham`);

--
-- Chỉ mục cho bảng `nhanvien`
--
ALTER TABLE `nhanvien`
  ADD PRIMARY KEY (`MaNhanVien`);

--
-- Chỉ mục cho bảng `nhaphanphoi`
--
ALTER TABLE `nhaphanphoi`
  ADD PRIMARY KEY (`MaNhaPhanPhoi`);

--
-- Chỉ mục cho bảng `phieunhap`
--
ALTER TABLE `phieunhap`
  ADD PRIMARY KEY (`MaPhieuNhap`);

--
-- Chỉ mục cho bảng `quyen`
--
ALTER TABLE `quyen`
  ADD PRIMARY KEY (`MaQuyen`);

--
-- Chỉ mục cho bảng `sanpham`
--
ALTER TABLE `sanpham`
  ADD PRIMARY KEY (`MaSanPham`);

--
-- Chỉ mục cho bảng `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`ID`);

--
-- AUTO_INCREMENT cho các bảng đã đổ
--

--
-- AUTO_INCREMENT cho bảng `hangsanxuat`
--
ALTER TABLE `hangsanxuat`
  MODIFY `MaHangSanXuat` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT cho bảng `hoadon`
--
ALTER TABLE `hoadon`
  MODIFY `MaHoaDon` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=43;

--
-- AUTO_INCREMENT cho bảng `loaisanpham`
--
ALTER TABLE `loaisanpham`
  MODIFY `MaLoaiSanPham` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT cho bảng `nhanvien`
--
ALTER TABLE `nhanvien`
  MODIFY `MaNhanVien` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT cho bảng `nhaphanphoi`
--
ALTER TABLE `nhaphanphoi`
  MODIFY `MaNhaPhanPhoi` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT cho bảng `phieunhap`
--
ALTER TABLE `phieunhap`
  MODIFY `MaPhieuNhap` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT cho bảng `quyen`
--
ALTER TABLE `quyen`
  MODIFY `MaQuyen` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT cho bảng `sanpham`
--
ALTER TABLE `sanpham`
  MODIFY `MaSanPham` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT cho bảng `users`
--
ALTER TABLE `users`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
