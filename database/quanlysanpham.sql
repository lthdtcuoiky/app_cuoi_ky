-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Máy chủ: 127.0.0.1
-- Thời gian đã tạo: Th10 28, 2018 lúc 01:13 PM
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
  `MaNhanVien` int(11) DEFAULT NULL,
  `NgayLapHoaDon` date DEFAULT NULL,
  `TongTien` varchar(50) DEFAULT NULL,
  `GhiChu` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  `MaKhachHang` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Đang đổ dữ liệu cho bảng `hoadon`
--

INSERT INTO `hoadon` (`MaHoaDon`, `MaNhanVien`, `NgayLapHoaDon`, `TongTien`, `GhiChu`, `MaKhachHang`) VALUES
(7, NULL, '2018-11-19', '309000000', NULL, NULL),
(13, NULL, '2018-11-18', '47000000', NULL, NULL),
(17, NULL, '2018-11-08', '369000000', NULL, NULL),
(20, NULL, '2018-11-15', '471000000', NULL, NULL),
(21, NULL, NULL, '0', '', NULL),
(22, NULL, NULL, '0', '', NULL),
(23, NULL, '2018-11-20', '0', '', NULL),
(24, NULL, NULL, '0', '', NULL),
(25, NULL, NULL, '0', '', NULL),
(26, NULL, NULL, '0', '', NULL),
(27, NULL, '2018-11-20', '0', '', NULL),
(28, NULL, NULL, '0', '', NULL),
(29, NULL, NULL, '0', '', NULL),
(30, NULL, NULL, '0', '', NULL),
(31, NULL, NULL, '0', '', NULL),
(32, NULL, NULL, '0', '', NULL),
(33, NULL, NULL, '0', '', NULL),
(34, NULL, NULL, '0', '', NULL),
(35, NULL, NULL, '0', '', NULL),
(36, NULL, NULL, '0', '', NULL),
(37, NULL, NULL, '0', '', NULL),
(38, NULL, NULL, '0', '', NULL),
(39, NULL, NULL, '0', '', NULL),
(40, NULL, NULL, '0', '', NULL),
(41, NULL, NULL, '0', '', NULL),
(42, NULL, NULL, '0', '', NULL),
(43, NULL, NULL, '0', '', NULL),
(44, NULL, NULL, '0', '', NULL),
(45, NULL, NULL, '0', 'dsdsd', NULL),
(48, NULL, '2018-11-26', '0', 'dsdsds', 1),
(49, NULL, NULL, '0', '', 1),
(50, NULL, NULL, '0', '', 1),
(51, NULL, NULL, '0', '', 1);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `hoadon_sanpham`
--

CREATE TABLE `hoadon_sanpham` (
  `MaHoaDon` int(11) NOT NULL,
  `MaSanPham` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

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
(1, 1, 'Hoàng Văn Nam', 'Nam', 'Hà Nội', '0909898964', 'Null', '1998-11-05');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `loaisanpham`
--

CREATE TABLE `loaisanpham` (
  `TenLoaiSanPham` varchar(50) CHARACTER SET utf8 DEFAULT NULL,
  `MaLoaiSanPham` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Đang đổ dữ liệu cho bảng `loaisanpham`
--

INSERT INTO `loaisanpham` (`TenLoaiSanPham`, `MaLoaiSanPham`) VALUES
('Đồ nướng', 1),
('Đồ luộc', 2),
('Đồ chiên', 3),
('Đồ nương', 4),
('Đồ chiên', 5),
('Đồ tái', 6);

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
  `MaNhaPhanPhoi` int(11) DEFAULT NULL,
  `TongTien` varchar(100) DEFAULT NULL,
  `NgayNhap` date DEFAULT NULL,
  `ChuThich` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  `MaNhanVien` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Đang đổ dữ liệu cho bảng `phieunhap`
--

INSERT INTO `phieunhap` (`MaPhieuNhap`, `MaNhaPhanPhoi`, `TongTien`, `NgayNhap`, `ChuThich`, `MaNhanVien`) VALUES
(1, 2, '10000000', '2017-06-03', NULL, NULL),
(2, 2, '19000000', '2018-11-07', NULL, NULL);

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
(1, 'admin', 'quản lý'),
(2, 'user', 'người dùng'),
(3, 'admin', 'giám đốc'),
(4, 'admin', 'trưởng quầy');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `sanpham`
--

CREATE TABLE `sanpham` (
  `MaSanPham` int(11) NOT NULL,
  `TenSanPham` varchar(50) CHARACTER SET utf8 DEFAULT NULL,
  `HangSanXuat` int(11) DEFAULT NULL,
  `GiaNhap` varchar(100) DEFAULT NULL,
  `GiaBan` varchar(100) DEFAULT NULL,
  `TonKho` int(11) DEFAULT NULL,
  `TrangThai` bit(1) DEFAULT NULL,
  `Image` varchar(150) DEFAULT NULL,
  `ChuThich` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  `MaLoaiSanPham` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Đang đổ dữ liệu cho bảng `sanpham`
--

INSERT INTO `sanpham` (`MaSanPham`, `TenSanPham`, `HangSanXuat`, `GiaNhap`, `GiaBan`, `TonKho`, `TrangThai`, `Image`, `ChuThich`, `MaLoaiSanPham`) VALUES
(1, 'sony', 4, '7456000', '7688800', 34, b'0', '/hinhsanpham/apple.png', NULL, NULL),
(3, 'htc 10', 3, '18000000', '19700000', 19, b'0', '/hinhsanpham/.apple', NULL, NULL),
(4, 'h', 1, '5', '5', 44, NULL, '', '', 1),
(5, 'h', 1, '5', '5', 44, NULL, '', '', 1),
(6, 'h', 1, '5', '5', 44, NULL, '', '', 1),
(7, '3', 1, '5', '5', 44, NULL, '', '', 1),
(8, '333', 1, '3', '333', 33333, NULL, '', '', 3);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `users`
--

CREATE TABLE `users` (
  `TenDangNhap` varchar(50) NOT NULL,
  `Password` varchar(50) DEFAULT NULL,
  `Quyen` int(11) DEFAULT NULL,
  `ChuThich` varchar(255) CHARACTER SET utf8 DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Đang đổ dữ liệu cho bảng `users`
--

INSERT INTO `users` (`TenDangNhap`, `Password`, `Quyen`, `ChuThich`) VALUES
('admin', 'admin', 1, 'Nguoi thẩm quyền'),
('duynguyen123', 'duynguyen99', 2, 'người dùng'),
('duynguyen1234', 'duynguyen1234', 2, 'người dùng'),
('duynguyen8', 'duynguyen8', 2, 'người dùng'),
('duynguyen991', 'duynguyen99', 2, 'người dùng'),
('ntn599', 'diabloacher9', 2, 'người dùng'),
('vanduy123', 'vanduy123', 2, 'người dùng');

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
  ADD PRIMARY KEY (`MaHoaDon`),
  ADD KEY `fk_khachhang_hoadon` (`MaKhachHang`),
  ADD KEY `fk_hd` (`MaNhanVien`);

--
-- Chỉ mục cho bảng `hoadon_sanpham`
--
ALTER TABLE `hoadon_sanpham`
  ADD PRIMARY KEY (`MaHoaDon`),
  ADD KEY `fk_sanpham` (`MaSanPham`);

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
  ADD PRIMARY KEY (`MaNhanVien`),
  ADD KEY `fk_nhanvien_chucvu` (`ChucVu`);

--
-- Chỉ mục cho bảng `nhaphanphoi`
--
ALTER TABLE `nhaphanphoi`
  ADD PRIMARY KEY (`MaNhaPhanPhoi`);

--
-- Chỉ mục cho bảng `phieunhap`
--
ALTER TABLE `phieunhap`
  ADD PRIMARY KEY (`MaPhieuNhap`),
  ADD KEY `fk_pn` (`MaNhaPhanPhoi`),
  ADD KEY `fk_pn12` (`MaNhanVien`);

--
-- Chỉ mục cho bảng `quyen`
--
ALTER TABLE `quyen`
  ADD PRIMARY KEY (`MaQuyen`);

--
-- Chỉ mục cho bảng `sanpham`
--
ALTER TABLE `sanpham`
  ADD PRIMARY KEY (`MaSanPham`),
  ADD KEY `fk_loaisanpham` (`MaLoaiSanPham`),
  ADD KEY `fk_sp` (`HangSanXuat`);

--
-- Chỉ mục cho bảng `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`TenDangNhap`),
  ADD KEY `fk_quyendangnhap` (`Quyen`);

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
  MODIFY `MaHoaDon` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=52;

--
-- AUTO_INCREMENT cho bảng `khachhang`
--
ALTER TABLE `khachhang`
  MODIFY `MaKhachHang` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT cho bảng `loaisanpham`
--
ALTER TABLE `loaisanpham`
  MODIFY `MaLoaiSanPham` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

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
  MODIFY `MaSanPham` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- Các ràng buộc cho các bảng đã đổ
--

--
-- Các ràng buộc cho bảng `hoadon`
--
ALTER TABLE `hoadon`
  ADD CONSTRAINT `fk_hd` FOREIGN KEY (`MaNhanVien`) REFERENCES `nhanvien` (`MaNhanVien`),
  ADD CONSTRAINT `fk_khachhang_hoadon` FOREIGN KEY (`MaKhachHang`) REFERENCES `khachhang` (`MaKhachHang`);

--
-- Các ràng buộc cho bảng `hoadon_sanpham`
--
ALTER TABLE `hoadon_sanpham`
  ADD CONSTRAINT `fk_hoadon` FOREIGN KEY (`MaHoaDon`) REFERENCES `hoadon` (`MaHoaDon`),
  ADD CONSTRAINT `fk_sanpham` FOREIGN KEY (`MaSanPham`) REFERENCES `sanpham` (`MaSanPham`);

--
-- Các ràng buộc cho bảng `nhanvien`
--
ALTER TABLE `nhanvien`
  ADD CONSTRAINT `fk_nhanvien_chucvu` FOREIGN KEY (`ChucVu`) REFERENCES `chucvu` (`MaChucVu`);

--
-- Các ràng buộc cho bảng `phieunhap`
--
ALTER TABLE `phieunhap`
  ADD CONSTRAINT `fk_pn` FOREIGN KEY (`MaNhaPhanPhoi`) REFERENCES `nhaphanphoi` (`MaNhaPhanPhoi`),
  ADD CONSTRAINT `fk_pn12` FOREIGN KEY (`MaNhanVien`) REFERENCES `nhanvien` (`MaNhanVien`);

--
-- Các ràng buộc cho bảng `sanpham`
--
ALTER TABLE `sanpham`
  ADD CONSTRAINT `fk_loaisanpham` FOREIGN KEY (`MaLoaiSanPham`) REFERENCES `loaisanpham` (`MaLoaiSanPham`),
  ADD CONSTRAINT `fk_sp` FOREIGN KEY (`HangSanXuat`) REFERENCES `hangsanxuat` (`MaHangSanXuat`);

--
-- Các ràng buộc cho bảng `users`
--
ALTER TABLE `users`
  ADD CONSTRAINT `fk_quyendangnhap` FOREIGN KEY (`Quyen`) REFERENCES `quyen` (`MaQuyen`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
