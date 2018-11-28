-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Máy chủ: 127.0.0.1
-- Thời gian đã tạo: Th10 28, 2018 lúc 05:09 PM
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
-- Cơ sở dữ liệu: `quanlysanpham2`
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
(1, 'StarBucks'),
(2, 'KFC'),
(3, 'SubWay'),
(4, 'McDonald\'s'),
(5, 'PizzaHut'),
(6, 'BurgerKing'),
(7, 'Baskin Robbins'),
(8, 'Dunkin\' Donuts\r\n');

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
(7, 2, '2018-11-19', '30900000', '', 1),
(13, 3, '2018-11-18', '4700000', NULL, 1),
(17, 2, '2017-11-08', '36900000', '', 4),
(20, 1, '2018-11-15', '47100000', NULL, 2),
(21, 2, '2017-12-12', '50999922', NULL, 3),
(22, 2, '2016-10-02', '82837182', NULL, 3),
(23, 1, '2018-11-20', '10000000', '', 2);

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
(1, 1, 'Hoàng Văn Nam', 'Nam', 'Hà Nội', '0909898964', 'Null', '1998-11-05'),
(2, 2, 'Triệu Khánh Huyền', 'Nữ', 'Hà Nội', '9837644444', NULL, '0000-00-00'),
(3, 3, 'Quách Trung Thắng', 'Nam', 'TPHCM', '212332272', NULL, '0000-00-00'),
(4, 4, 'Kiều Thị Hải Anh', 'Nữ', 'Hà Nội', '926868888', NULL, '0000-00-00');

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
('Đồ ăn nhanh', 1),
('Bánh ngọt', 2),
('Snack', 3),
('Cocktail', 4),
('Đồ uống', 5),
('Đồ ăn vặt', 6);

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
(1, 'Hoàng Đức Dương', '1996-12-25', b'0', '2018-01-01', 1, '51-102 Nguyễn Đồng', '01628225158', 'nhân viên mới'),
(2, 'Phạm Văn Toàn', '1997-01-02', b'0', '2018-11-13', 2, 'Hà Nội', '09878338172', NULL),
(3, 'Trương Văn Kiên', '1999-10-09', b'0', '2018-11-21', 1, 'Hà Nội', '01628225158', 'Là người vui tính , hòa đồng');

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
(2, 'FastFoodHN', 'Việt Nam', '0987848891', 'ffhn11@gmail.com', NULL),
(3, 'Drink Sweet', 'VietNam', '0336576656', 'dinkngot123@gmail.com', NULL),
(4, 'KissFood', 'VietNam', '474324318', 'ksd1@gmail.com', NULL),
(5, 'TenTen', 'VietNam', '474222218', 'tenten222@gmail.com', NULL),
(6, 'TeaFoodDr', 'VietNam', '234556666', 'teafooddr@gmail.com', NULL),
(7, 'BookDrinkF', 'VietNam', '987772827', 'bdf0999@gmail.com', NULL);

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
(1, 2, '10000000', '2017-06-03', NULL, 1),
(2, 2, '19000000', '2018-11-07', NULL, 3),
(3, 4, '24500000', '2018-09-10', NULL, 3),
(4, 6, '40000000', '2017-03-29', NULL, 3),
(5, 5, '32200000', '2016-12-02', NULL, 3),
(6, 3, '90000000', '2018-11-05', NULL, 1),
(7, 7, '76200000', '2017-08-06', NULL, 1),
(8, 7, '26600000', '2016-03-01', NULL, 2),
(9, 6, '19800000', '2017-10-10', NULL, 2);

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
(1, 'Frappuccino ', 1, '74560', '100000', 200, b'0', '/hinhsanpham/apple.png', NULL, NULL),
(2, 'Pizza', 5, '50000', '65000', 10000, b'0', '/hinhsanpham/.apple', NULL, NULL),
(3, 'Big Philly Cheesesteak', 3, '120000', '150000', 500, NULL, '', '', 1),
(4, 'Hamburger bò', 4, '35000', '55000', 1000, NULL, '', '', 1),
(5, 'Burger Whopper', 6, '60000', '75000', 2000, NULL, '', '', 1),
(6, 'Bánh Donuts', 8, '37000', '55000', 1500, NULL, '', '', 1),
(7, 'Kem', 7, '20000', '30000', 33333, NULL, '', '', 3),
(8, 'pizza thịt gà', 2, '32000', '56000', 2000, NULL, NULL, NULL, NULL),
(9, 'Bánh mì SubWay', 3, '30000', '56000', 3550, NULL, NULL, NULL, NULL),
(10, 'donut chocolate', 8, '22000', '46000', 7000, NULL, NULL, NULL, NULL);

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
  MODIFY `MaKhachHang` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

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
  MODIFY `MaNhaPhanPhoi` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT cho bảng `phieunhap`
--
ALTER TABLE `phieunhap`
  MODIFY `MaPhieuNhap` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT cho bảng `quyen`
--
ALTER TABLE `quyen`
  MODIFY `MaQuyen` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT cho bảng `sanpham`
--
ALTER TABLE `sanpham`
  MODIFY `MaSanPham` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

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
