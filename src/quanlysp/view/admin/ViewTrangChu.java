package view.admin;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.imageio.ImageIO;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.LayoutStyle;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;

import controlller.Manager;

public class ViewTrangChu extends JFrame {
	private JButton bntSua_SanPham;
	private JButton btnAnDi_ChucVu;
	private JButton btnDoiChucVu_ChucVu;
	private JButton btnDoiHinh_SanPham;
	private JButton btnReset_ChucVu;
	private JButton btnReset_HoaDon;
	private JButton btnReset_KhachHang;
	private JButton btnReset_NhanVien;
	private JButton btnReset_SanPham;
	private JButton btnSua_ChucVu;
	private JButton btnSua_HoaDon;
	private JButton btnSua_KhachHang;
	private JButton btnSua_NhanVien;
	private JButton btnThem_ChucVu;
	private JButton btnThem_HoaDon;
	private JButton btnThem_KhachHang;
	private JButton btnThem_NhanVien;
	private JButton btnThem_SanPham;
	private JButton btnXoaNeuRong_ChucVu;
	private JButton btnXoa_HoaDon;
	private JButton btnXoa_KhachHang;
	private JButton btnXoa_NhanVien;
	private JButton btnXoa_SanPham;
	private ButtonGroup buttonGroup1;
	private ButtonGroup buttonGroup4;
	private JComboBox<String> cbbChucVu_NhanVien;
	private JComboBox<String> cbbDoiChucVu_ChucVu;
	private JComboBox<String> cbbHangSanXuat_SanPham;
	private JComboBox<String> cbbKhachHang_HoaDon;
	private JComboBox<String> cbbMaLoaiSanPham_SanPham;
	private JComboBox<String> cbbNam;
	private JComboBox<String> cbbNamSinh_NhanVien;
	private JComboBox<String> cbbNamVaoLam_NhanVien;
	private JComboBox<String> cbbNgay;
	private JComboBox<String> cbbNgaySinh_NhanVien;
	private JComboBox<String> cbbNgayVaoLam_NhanVien;
	private JComboBox<String> cbbNhanVien_HoaDon;
	private JComboBox<String> cbbSanPhamCTPN_PhieuNhap;
	private JComboBox<String> cbbSanPham_ChiTietHoaDon;
	private JComboBox<String> cbbThang;
	private JComboBox<String> cbbThangSinh_NhanVien;
	private JComboBox<String> cbbThangVaoLam_NhanVien;
	private JLabel jLabel11;
	private JLabel jLabel12;
	private JLabel jLabel15;
	private JLabel jLabel25;
	private JLabel jLabel26;
	private JLabel jLabel27;
	private JLabel jLabel28;
	private JLabel jLabel3;
	private JLabel jLabel31;
	private JLabel jLabel33;
	private JLabel jLabel34;
	private JLabel jLabel35;
	private JLabel jLabel36;
	private JLabel jLabel40;
	private JLabel jLabel45;
	private JLabel jLabel46;
	private JLabel jLabel47;
	private JLabel jLabel51;
	private JLabel jLabel52;
	private JLabel jLabel56;
	private JLabel jLabel85;
	private JLabel labelItemSell;
	private JPanel jPanel1;
	private JPanel jPanel14;
	private JPanel jPanel15;
	private JPanel jPanel16;
	private JPanel jPanel20;
	private JPanel jPanel21;
	private JPanel jPanel3;
	private JPanel jPanel4;
	private JPanel jPanelChucVu;
	private JPanel jPanelDangXuat;
	private JPanel jPanelDoiTac;
	private JPanel jPanelHoaDon;
	private JPanel jPanelMe;
	private JPanel jPanelNhanVien;
	private JPanel jPanelSanPham;
	private JPanel jPanel_KhachHang;
	private JScrollPane jScrollPane1;
	private JScrollPane jScrollPane10;
	private JScrollPane jScrollPane12;
	private JScrollPane jScrollPane13;
	private JScrollPane jScrollPane16;
	private JScrollPane jScrollPane19;
	private JScrollPane jScrollPane2;
	private JScrollPane jScrollPane24;
	private JScrollPane jScrollPane25;
	private JScrollPane jScrollPane6;
	private JScrollPane jScrollPane8;
	private JTabbedPane jTabbedPaneHoaDon;
	private JTabbedPane jTabbedPaneNhanVien;
	private JTabbedPane jTabbedPaneQuanLySanPham;
	private JTable jTable1;
	private JLabel labelHinhAnh;
	private JLabel lblAbout;
	private JLabel lblDiaChi_KhachHang;
	private JLabel lblDiaChi_NhanVien;
	private JLabel lblGiaBan;
	private JLabel lblGiaNhap_SanPham;
	private JLabel lblGioiTinh_KhachHang;
	private JLabel lblLoiMaKhachHang_KhachHang4;
	private JLabel lblLoiMaKhachHang_KhachHang5;
	private JLabel lblMaCTPM;
	private JLabel lblMaHoaDon;
	private JLabel lblMaHoaDon_HoaDon;
	private JLabel lblMaKhachHang_KhachHang;
	private JLabel lblMaNhanVien_NhanVien;
	private JLabel lblMaSanPham_SanPham;
	public JLabel lblNgayLap;
	private JLabel lblNgaySinh_KhachHang;
	private JLabel lblSDT_KhachHang;
	private JLabel lblSDT_NhanVien;
	private JLabel lblSoLuong_CTPM;
	private JLabel lblTenKhachHang_KhachHang;
	private JLabel lblTenNhanVien_NhanVien;
	private JLabel lblTenSanPham_SanPham;
	private JLabel lblTonKho_SanPham;
	private JLabel lblTongTien_HoaDon;
	private JRadioButton rbtnNam_KhachHang;
	private JRadioButton rbtnNam_NhanVien;
	private JRadioButton rbtnNu_KhachHang;
	private JRadioButton rbtnNu_NhanVien;
	private JTable tblCTHoaDon_ChiTietHoaDon;
	private JTable tblChucVu_ChucVu;
	public JTable tblHoaDon_HoaDon;
	private JTable tblKhachHang_KhachHang;
	private JTable tblLoaiSanPham_LoaiSanPham;
	private JTable tblNhanVien_ChucVu;
	private JTable tblNhanVien_NhanVien;
	private JTable tblPhieuNhap_PhieuNhap;
	private JTable tblSanPham;
	private JTabbedPane tbljpanel;
	private JTextArea txtChuThichCTPN_PhieuNhap;
	private JTextArea txtChuThich_ChucVu;
	private JTextArea txtChuThich_NhanVien;
	private JTextArea txtChuThich_SanPham;
	private JTextField txtDiaChi_KhachHang;
	private JTextField txtDiaChi_NhanVien;
	private JTextArea txtGhiChu_ChiTietHoaDon;
	private JTextArea txtGhiChu_HoaDon;
	private JTextPane txtGhiChu_KhachHang;
	private JTextField txtGiaBan_SanPham;
	private JTextField txtGiaNhap_SanPham;
	private JTextField txtTimKiem_SanPham;
	private JTextField txtMaCTH_ChiTietHoaDon;
	private JTextField txtMaCTPN_PhieuNhap;
	private JTextField txtMaChucVu_ChucVu;
	private JTextField txtMaHoaDon_ChiTietHoaDon;
	private JTextField txtMaKhachHang_KhachHang;
	private JTextField txtMaNhanVien_NhanVien;
	private JTextField txtMaPhieuMua_HoaDon;
	private JTextField txtMaPhieuNhap_CTPN;
	private JTextField txtMaPhieuNhap_PhieuNhap;
	private JTextField txtMaSanPham_SanPham;
	public JTextField txtNgayLapHoaDon_HoaDon;
	private JTextField txtSDT_KhachHang;
	private JTextField txtSoDT_NhanVien;
	private JTextField txtSoLuongCTPN_PhieuNhap;
	private JTextField txtSoLuong_ChiTietHoaDon;
	private JTextField txtTenChucVu_ChucVu;
	private JTextField txtTenKhachHang_KhachHang;
	private JTextField txtTenNhanVien_NhanVien;
	private JTextField txtTenSanPham_SanPham;
	private JTextField txtTonKho_SanPham;
	private JTextField txtTongTienCTPN_PhieuNhap;
	private JTextField txtTongTien_ChiTietHoaDon;
	private ButtonGroup buttonGroup2;

	int tam = 0;
	ImageIcon icon;
	String imageLocation = "/com/quanlysp/images/hoadon.png";
	String imageName;
	Calendar cal = Calendar.getInstance();

	int day = cal.get(Calendar.DAY_OF_MONTH);
	int month = cal.get(Calendar.MONTH) + 1;
	int year = cal.get(Calendar.YEAR);

	Date dt = cal.getTime();
	// Dinh dang lai hien thi thong tin ngay gio ra man hinh
	SimpleDateFormat fm = new SimpleDateFormat("dd-MM-yyyy");

	public ViewTrangChu() {
		setIconImage(Toolkit.getDefaultToolkit()
				.getImage("src/images/shop.jpg"));
		initComponents();
		initComponentsAnhXa();



		labelHinhAnh.setIcon(icon);
		labelHinhAnh.setSize(50, 50);
		if (ViewDangNhap.quyen == 2) {
			ThongBao("đây là thông báo Quyền", "hề hề", 1);
			jPanelDoiTac.disable();
		}
		System.out.println(fm.format(dt));

	}

	private void initComponents() {
		buttonGroup2 = new ButtonGroup();
		buttonGroup1 = new ButtonGroup();
		buttonGroup4 = new ButtonGroup();
		jPanel1 = new JPanel();
		tbljpanel = new JTabbedPane();
		jTabbedPaneHoaDon = new JTabbedPane();
		jPanelHoaDon = new JPanel();
		jScrollPane10 = new JScrollPane();
		tblHoaDon_HoaDon = new JTable();
		tblCTHoaDon_ChiTietHoaDon = new JTable();
		jLabel34 = new JLabel();
		jPanel14 = new JPanel();
		jLabel33 = new JLabel();
		lblMaHoaDon_HoaDon = new JLabel();
		lblTongTien_HoaDon = new JLabel();
		jLabel31 = new JLabel();
		cbbKhachHang_HoaDon = new JComboBox<>();
		cbbNhanVien_HoaDon = new JComboBox<>();
		txtMaPhieuMua_HoaDon = new JTextField();
		jScrollPane16 = new JScrollPane();
		txtGhiChu_HoaDon = new JTextArea();
		btnThem_HoaDon = new JButton();
		btnXoa_HoaDon = new JButton();
		btnSua_HoaDon = new JButton();
		btnReset_HoaDon = new JButton();
		lblNgayLap = new JLabel();
		txtNgayLapHoaDon_HoaDon = new JTextField();
		jLabel35 = new JLabel();
		jLabel36 = new JLabel();
		lblMaCTPM = new JLabel();
		lblSoLuong_CTPM = new JLabel();
		lblMaHoaDon = new JLabel();
		jLabel40 = new JLabel();
		txtTongTien_ChiTietHoaDon = new JTextField();
		cbbSanPham_ChiTietHoaDon = new JComboBox<>();
		txtMaCTH_ChiTietHoaDon = new JTextField();
		txtGhiChu_ChiTietHoaDon = new JTextArea();
		txtMaHoaDon_ChiTietHoaDon = new JTextField();
		txtSoLuong_ChiTietHoaDon = new JTextField();
		jTabbedPaneQuanLySanPham = new JTabbedPane();
		jPanelSanPham = new JPanel();
		jPanel3 = new JPanel();
		jPanel4 = new JPanel();
		lblTenSanPham_SanPham = new JLabel();
		lblMaSanPham_SanPham = new JLabel();
		jLabel3 = new JLabel();
		cbbMaLoaiSanPham_SanPham = new JComboBox<>();
		txtGiaNhap_SanPham = new JTextField();
		lblGiaNhap_SanPham = new JLabel();
		txtGiaBan_SanPham = new JTextField();
		lblGiaBan = new JLabel();
		txtTenSanPham_SanPham = new JTextField();
		txtMaSanPham_SanPham = new JTextField();
		labelItemSell = new JLabel();
		cbbHangSanXuat_SanPham = new JComboBox<>();
		lblTonKho_SanPham = new JLabel();
		jLabel11 = new JLabel();
		jScrollPane2 = new JScrollPane();
		txtChuThich_SanPham = new JTextArea();
		jLabel12 = new JLabel();
		btnThem_SanPham = new JButton();
		bntSua_SanPham = new JButton();
		btnXoa_SanPham = new JButton();
		btnReset_SanPham = new JButton();
		txtTonKho_SanPham = new JTextField();
		jScrollPane1 = new JScrollPane();
		tblSanPham = new JTable();
		labelHinhAnh = new JLabel();
		btnDoiHinh_SanPham = new JButton();

		tblLoaiSanPham_LoaiSanPham = new JTable();
		txtMaPhieuNhap_PhieuNhap = new JTextField();
		txtSoLuongCTPN_PhieuNhap = new JTextField();
		cbbSanPhamCTPN_PhieuNhap = new JComboBox<>();
		txtMaCTPN_PhieuNhap = new JTextField();

		txtChuThichCTPN_PhieuNhap = new JTextArea();

		txtTongTienCTPN_PhieuNhap = new JTextField();
		txtMaPhieuNhap_CTPN = new JTextField();
		jPanel_KhachHang = new JPanel();
		jScrollPane24 = new JScrollPane();
		tblKhachHang_KhachHang = new JTable();
		jLabel56 = new JLabel();
		lblMaKhachHang_KhachHang = new JLabel();
		lblTenKhachHang_KhachHang = new JLabel();
		txtMaKhachHang_KhachHang = new JTextField();
		txtTenKhachHang_KhachHang = new JTextField();
		rbtnNam_KhachHang = new JRadioButton();
		rbtnNu_KhachHang = new JRadioButton();
		lblNgaySinh_KhachHang = new JLabel();
		lblGioiTinh_KhachHang = new JLabel();
		lblDiaChi_KhachHang = new JLabel();
		txtDiaChi_KhachHang = new JTextField();
		lblSDT_KhachHang = new JLabel();
		txtSDT_KhachHang = new JTextField();
		jLabel85 = new JLabel();
		jScrollPane25 = new JScrollPane();
		btnThem_KhachHang = new JButton();
		btnSua_KhachHang = new JButton();
		btnXoa_KhachHang = new JButton();
		btnReset_KhachHang = new JButton();
		cbbNgay = new JComboBox<>();
		cbbThang = new JComboBox<>();
		cbbNam = new JComboBox<>();
		lblLoiMaKhachHang_KhachHang4 = new JLabel();
		lblLoiMaKhachHang_KhachHang5 = new JLabel();
		jTabbedPaneNhanVien = new JTabbedPane();
		jPanelNhanVien = new JPanel();
		jScrollPane6 = new JScrollPane();
		tblNhanVien_NhanVien = new JTable();
		jPanel15 = new JPanel();
		jPanel16 = new JPanel();
		lblTenNhanVien_NhanVien = new JLabel();
		lblMaNhanVien_NhanVien = new JLabel();
		jLabel45 = new JLabel();
		jLabel46 = new JLabel();
		jLabel47 = new JLabel();
		txtTenNhanVien_NhanVien = new JTextField();
		txtMaNhanVien_NhanVien = new JTextField();
		rbtnNam_NhanVien = new JRadioButton();
		rbtnNu_NhanVien = new JRadioButton();
		cbbNgaySinh_NhanVien = new JComboBox<>();
		cbbThangSinh_NhanVien = new JComboBox<>();
		cbbNamSinh_NhanVien = new JComboBox<>();
		cbbNgayVaoLam_NhanVien = new JComboBox<>();
		cbbNamVaoLam_NhanVien = new JComboBox<>();
		cbbThangVaoLam_NhanVien = new JComboBox<>();
		lblDiaChi_NhanVien = new JLabel();
		lblSDT_NhanVien = new JLabel();
		jScrollPane8 = new JScrollPane();
		txtChuThich_NhanVien = new JTextArea();
		jLabel51 = new JLabel();
		jLabel52 = new JLabel();
		btnThem_NhanVien = new JButton();
		btnSua_NhanVien = new JButton();
		btnXoa_NhanVien = new JButton();
		btnReset_NhanVien = new JButton();
		txtDiaChi_NhanVien = new JTextField();
		txtSoDT_NhanVien = new JTextField();
		cbbChucVu_NhanVien = new JComboBox<>();
		jPanelChucVu = new JPanel();
		jScrollPane12 = new JScrollPane();
		tblChucVu_ChucVu = new JTable();
		jPanel20 = new JPanel();
		jLabel25 = new JLabel();
		jLabel26 = new JLabel();
		txtTenChucVu_ChucVu = new JTextField();
		jLabel27 = new JLabel();
		jScrollPane13 = new JScrollPane();
		txtChuThich_ChucVu = new JTextArea();
		btnThem_ChucVu = new JButton();
		btnSua_ChucVu = new JButton();
		btnReset_ChucVu = new JButton();
		txtMaChucVu_ChucVu = new JTextField();
		jPanel21 = new JPanel();
		jLabel28 = new JLabel();
		btnXoaNeuRong_ChucVu = new JButton();
		btnAnDi_ChucVu = new JButton();
		btnDoiChucVu_ChucVu = new JButton();
		cbbDoiChucVu_ChucVu = new JComboBox<>();
		tblNhanVien_ChucVu = new JTable();
		jScrollPane19 = new JScrollPane();
		jTable1 = new JTable();
		jPanelDangXuat = new JPanel();
		jPanelMe = new JPanel();
		lblAbout = new JLabel();
		jLabel15 = new JLabel();

	}

	private void initComponentsAnhXa() {

		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		setTitle("Trang Chính");
		addWindowListener(new java.awt.event.WindowAdapter() {
			public void windowClosed(java.awt.event.WindowEvent evt) {
				formWindowClosed(evt);
			}

			public void windowClosing(java.awt.event.WindowEvent evt) {
				formWindowClosing(evt);
			}

			public void windowOpened(java.awt.event.WindowEvent evt) {
				formWindowOpened(evt);
			}
		});

		// set các icon menu sang bên trái
		tbljpanel.setTabPlacement(JTabbedPane.LEFT);

		jPanelHoaDon.setBackground(new Color(204, 204, 255));
		jPanelHoaDon.setPreferredSize(new java.awt.Dimension(1176, 701));
		jPanelHoaDon.addComponentListener(new java.awt.event.ComponentAdapter() {
			public void componentShown(java.awt.event.ComponentEvent evt) {
				jPanelHoaDonComponentShown(evt);
			}
		});

		tblHoaDon_HoaDon.setModel(new DefaultTableModel(
				new Object[][] { { null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null }, { null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null }, { null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null }, { null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null }, { null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null } },
				new String[] { "STT", "Mã Hóa Đơn", "Khách Hàng", "Nhân Viên", "Ngày Lập HĐ", "Tổng Tiền",
						"Ghi Chú" }) {
			boolean[] canEdit = new boolean[] { false, false, false, false, false, false, true };

			public boolean isCellEditable(int rowIndex, int columnIndex) {
				return canEdit[columnIndex];
			}
		});
		tblHoaDon_HoaDon.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				tblHoaDon_HoaDonMouseClicked(evt);
			}
		});
		jScrollPane10.setViewportView(tblHoaDon_HoaDon);
		if (tblHoaDon_HoaDon.getColumnModel().getColumnCount() > 0) {
			tblHoaDon_HoaDon.getColumnModel().getColumn(0).setMinWidth(30);
			tblHoaDon_HoaDon.getColumnModel().getColumn(0).setPreferredWidth(30);
			tblHoaDon_HoaDon.getColumnModel().getColumn(0).setMaxWidth(30);
		}

		cbbKhachHang_HoaDon
				.setModel(new DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

		cbbNhanVien_HoaDon
				.setModel(new DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
		cbbNhanVien_HoaDon.setActionCommand("");

		txtMaPhieuMua_HoaDon.setEditable(true);

		txtGhiChu_HoaDon.setColumns(20);
		txtGhiChu_HoaDon.setRows(5);
		jScrollPane16.setViewportView(txtGhiChu_HoaDon);

		btnThem_HoaDon.setText("Thêm ");
		btnThem_HoaDon.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnThem_HoaDonActionPerformed(evt);
			}
		});

		btnXoa_HoaDon.setText("Xóa");
		btnXoa_HoaDon.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnXoa_HoaDonActionPerformed(evt);
			}
		});

		btnSua_HoaDon.setText("Sửa");
		btnSua_HoaDon.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnSua_HoaDonActionPerformed(evt);
			}
		});

		btnReset_HoaDon.setText("Reset");
		btnReset_HoaDon.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnReset_HoaDonActionPerformed(evt);
			}
		});
		
		JLabel lblMHan = new JLabel("Mã Hóa Đơn");
		
		JLabel lblNhnVin = new JLabel("Nhân Viên");
		
		lblKhchHng = new JLabel("Khách Hàng");
		
		lblTngTin = new JLabel("Tổng Tiền");
		
		txtTongTien_HoaDon = new JTextField();
		txtTongTien_HoaDon.setColumns(10);

		//
		GroupLayout jPanel14Layout = new GroupLayout(jPanel14);
		jPanel14Layout.setHorizontalGroup(
			jPanel14Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel14Layout.createSequentialGroup()
					.addContainerGap()
					.addGroup(jPanel14Layout.createParallelGroup(Alignment.LEADING)
						.addGroup(jPanel14Layout.createSequentialGroup()
							.addComponent(lblMaHoaDon_HoaDon)
							.addPreferredGap(ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
							.addComponent(lblMHan)
							.addPreferredGap(ComponentPlacement.RELATED))
						.addGroup(jPanel14Layout.createSequentialGroup()
							.addComponent(jLabel31, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
							.addGroup(jPanel14Layout.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblNgayLap)
								.addComponent(lblKhchHng)
								.addComponent(lblNhnVin))
							.addGap(4))
						.addGroup(Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
							.addGroup(jPanel14Layout.createParallelGroup(Alignment.TRAILING)
								.addComponent(btnThem_HoaDon, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)
								.addGroup(jPanel14Layout.createSequentialGroup()
									.addComponent(lblTongTien_HoaDon, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
									.addComponent(lblTngTin)))
							.addPreferredGap(ComponentPlacement.RELATED)))
					.addGroup(jPanel14Layout.createParallelGroup(Alignment.LEADING)
						.addGroup(jPanel14Layout.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(jPanel14Layout.createParallelGroup(Alignment.LEADING)
								.addGroup(jPanel14Layout.createSequentialGroup()
									.addGroup(jPanel14Layout.createParallelGroup(Alignment.LEADING, false)
										.addComponent(txtTongTien_HoaDon)
										.addComponent(cbbKhachHang_HoaDon, Alignment.TRAILING, 0, 142, Short.MAX_VALUE)
										.addComponent(txtNgayLapHoaDon_HoaDon, Alignment.TRAILING)
										.addComponent(cbbNhanVien_HoaDon, Alignment.TRAILING, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(jScrollPane16, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGroup(jPanel14Layout.createSequentialGroup()
									.addComponent(txtMaPhieuMua_HoaDon, GroupLayout.PREFERRED_SIZE, 142, GroupLayout.PREFERRED_SIZE)
									.addGap(63)
									.addComponent(jLabel33, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE))))
						.addGroup(jPanel14Layout.createSequentialGroup()
							.addGap(14)
							.addComponent(btnXoa_HoaDon, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
							.addGap(14)
							.addComponent(btnSua_HoaDon, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(btnReset_HoaDon, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(35, Short.MAX_VALUE))
		);
		jPanel14Layout.setVerticalGroup(
			jPanel14Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel14Layout.createSequentialGroup()
					.addGap(22)
					.addGroup(jPanel14Layout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblMaHoaDon_HoaDon, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtMaPhieuMua_HoaDon, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(jLabel33)
						.addComponent(lblMHan))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(jPanel14Layout.createParallelGroup(Alignment.LEADING)
						.addComponent(jScrollPane16, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)
						.addGroup(jPanel14Layout.createSequentialGroup()
							.addGroup(jPanel14Layout.createParallelGroup(Alignment.BASELINE)
								.addComponent(jLabel31, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
								.addComponent(cbbNhanVien_HoaDon, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNhnVin))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(jPanel14Layout.createParallelGroup(Alignment.BASELINE)
								.addComponent(cbbKhachHang_HoaDon, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblKhchHng, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(jPanel14Layout.createParallelGroup(Alignment.BASELINE)
								.addComponent(txtNgayLapHoaDon_HoaDon, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNgayLap))
							.addGap(18)
							.addGroup(jPanel14Layout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblTongTien_HoaDon, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblTngTin)
								.addComponent(txtTongTien_HoaDon, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(jPanel14Layout.createParallelGroup(Alignment.BASELINE)
								.addComponent(btnXoa_HoaDon)
								.addComponent(btnSua_HoaDon)
								.addComponent(btnReset_HoaDon)
								.addComponent(btnThem_HoaDon))))
					.addContainerGap(143, Short.MAX_VALUE))
		);
		jPanel14.setLayout(jPanel14Layout);

		jLabel35.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		jLabel35.setForeground(new Color(51, 102, 255));
		jLabel35.setText("Bảng Hóa Đơn");
		jLabel36.setText("Ghi Chú");

		lblMaCTPM.setText("Mã CTPM");

		lblSoLuong_CTPM.setText("Số Lượng");

		lblMaHoaDon.setText("Mã Hóa Đơn");

		lblNgayLap.setText("Ngày Lập");
		lblNgayLap.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				lblNgayLapMouseClicked(evt);
			}
		});

		txtNgayLapHoaDon_HoaDon.setEditable(true);

		jLabel40.setText("Sản Phẩm");

		//
		GroupLayout jPanelHoaDonLayout = new GroupLayout(jPanelHoaDon);
		jPanelHoaDonLayout.setHorizontalGroup(
			jPanelHoaDonLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanelHoaDonLayout.createSequentialGroup()
					.addGroup(jPanelHoaDonLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(jPanelHoaDonLayout.createSequentialGroup()
							.addGap(235)
							.addComponent(jLabel35))
						.addGroup(jPanelHoaDonLayout.createSequentialGroup()
							.addGap(209)
							.addComponent(jLabel34))
						.addGroup(jPanelHoaDonLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(jScrollPane10, GroupLayout.PREFERRED_SIZE, 691, GroupLayout.PREFERRED_SIZE)
							.addGap(9)
							.addComponent(jPanel14, GroupLayout.DEFAULT_SIZE, 521, Short.MAX_VALUE)))
					.addContainerGap())
		);
		jPanelHoaDonLayout.setVerticalGroup(
			jPanelHoaDonLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanelHoaDonLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(jLabel35)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(jPanelHoaDonLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(jPanel14, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(jScrollPane10, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 374, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(jLabel34)
					.addGap(166))
		);
		jPanelHoaDon.setLayout(jPanelHoaDonLayout);
		jTabbedPaneHoaDon.addTab("Phiếu Mua Hàng", jPanelHoaDon);

		tbljpanel.addTab("Hóa Dơn", new ImageIcon("src/util/images/hoadon.png"), jTabbedPaneHoaDon); // NOI18N

		//
		jPanelSanPham.setBackground(new Color(204, 204, 255));
		jPanelSanPham.addComponentListener(new java.awt.event.ComponentAdapter() {
			public void componentShown(java.awt.event.ComponentEvent evt) {
				jPanelSanPhamComponentShown(evt);
			}
		});

		jPanel3.setBackground(new Color(204, 204, 255));
		jPanel3.setBorder(BorderFactory.createCompoundBorder());

		jPanel4.setBackground(new Color(204, 204, 255));

		lblTenSanPham_SanPham.setText("Tên Sản PHẩm");

		lblMaSanPham_SanPham.setText("Mã Sản Phẩm");

		jLabel3.setText("Loại Sản Phẩm");

		cbbMaLoaiSanPham_SanPham
				.setModel(new DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
		cbbMaLoaiSanPham_SanPham.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				cbbMaLoaiSanPham_SanPhamActionPerformed(evt);
			}
		});

		lblGiaNhap_SanPham.setText("Giá Nhập");

		lblGiaBan.setText("Giá Bán");

		txtMaSanPham_SanPham.setEditable(true);

		GroupLayout jPanel4Layout = new GroupLayout(jPanel4);
		jPanel4.setLayout(jPanel4Layout);
		jPanel4Layout.setHorizontalGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(jPanel4Layout.createSequentialGroup().addContainerGap()
						.addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addGroup(jPanel4Layout.createSequentialGroup()
										.addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
												.addComponent(lblMaSanPham_SanPham, GroupLayout.PREFERRED_SIZE, 69,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(jLabel3).addComponent(lblGiaNhap_SanPham,
														GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE))
										.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
								.addGroup(jPanel4Layout.createSequentialGroup()
										.addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
												.addComponent(lblTenSanPham_SanPham).addComponent(lblGiaBan))
										.addGap(23, 23, 23)
										.addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
												.addComponent(txtGiaBan_SanPham).addComponent(txtTenSanPham_SanPham)
												.addComponent(txtMaSanPham_SanPham)
												.addComponent(cbbMaLoaiSanPham_SanPham, 0, 232, Short.MAX_VALUE)
												.addComponent(txtGiaNhap_SanPham))))));
		jPanel4Layout
				.setVerticalGroup(
						jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addGroup(jPanel4Layout.createSequentialGroup().addContainerGap()
										.addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
												.addComponent(lblMaSanPham_SanPham)
												.addComponent(txtMaSanPham_SanPham, GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
										.addGap(18, 18, 18)
										.addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
												.addComponent(lblTenSanPham_SanPham)
												.addComponent(txtTenSanPham_SanPham, GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
										.addGap(18, 18, 18)
										.addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
												.addComponent(jLabel3)
												.addComponent(cbbMaLoaiSanPham_SanPham, GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
										.addGap(18, 18, 18)
										.addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
												.addComponent(txtGiaNhap_SanPham, GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addComponent(lblGiaNhap_SanPham))
										.addGap(22, 22, 22)
										.addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
												.addComponent(txtGiaBan_SanPham, GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addComponent(lblGiaBan))
										.addContainerGap(46, Short.MAX_VALUE)));

		// view san pham

		labelItemSell.setText("Hãng Sản Xuất");

		cbbHangSanXuat_SanPham
				.setModel(new DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

		lblTonKho_SanPham.setText("Tồn Kho");

		jLabel11.setText("Món");

		txtChuThich_SanPham.setColumns(20);
		txtChuThich_SanPham.setRows(5);
		jScrollPane2.setViewportView(txtChuThich_SanPham);

		jLabel12.setText("Chú Thích");

		btnThem_SanPham.setText("Thêm");
		btnThem_SanPham.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnThem_SanPhamActionPerformed(evt);
			}
		});

		bntSua_SanPham.setText("Sửa");
		bntSua_SanPham.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				bntSua_SanPhamActionPerformed(evt);
			}
		});

		btnXoa_SanPham.setText("Xóa");
		btnXoa_SanPham.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnXoa_SanPhamActionPerformed(evt);
			}
		});

		btnReset_SanPham.setText("Reset");
		btnReset_SanPham.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnReset_SanPhamActionPerformed(evt);
			}
		});

		GroupLayout jPanel3Layout = new GroupLayout(jPanel3);
		jPanel3.setLayout(jPanel3Layout);
		jPanel3Layout.setHorizontalGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(jPanel3Layout.createSequentialGroup().addGap(23, 23, 23)
						.addComponent(jPanel4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
								.addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
										.addGroup(jPanel3Layout.createSequentialGroup().addComponent(labelItemSell)
												.addGap(28, 28, 28).addComponent(cbbHangSanXuat_SanPham,
														GroupLayout.PREFERRED_SIZE, 169, GroupLayout.PREFERRED_SIZE))
										.addGroup(GroupLayout.Alignment.LEADING,
												jPanel3Layout.createSequentialGroup()
														.addComponent(lblTonKho_SanPham, GroupLayout.PREFERRED_SIZE, 85,
																GroupLayout.PREFERRED_SIZE)
														.addGap(18, 18, 18)
														.addComponent(txtTonKho_SanPham, GroupLayout.PREFERRED_SIZE,
																123, GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
														.addComponent(jLabel11)))
								.addGroup(jPanel3Layout.createSequentialGroup()
										.addComponent(jLabel12, GroupLayout.PREFERRED_SIZE, 66,
												GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED,
												GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(jScrollPane2, GroupLayout.PREFERRED_SIZE, 169,
												GroupLayout.PREFERRED_SIZE)))
						.addGap(3, 3, 3)
						.addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addGroup(jPanel3Layout.createSequentialGroup().addGap(55, 55, 55).addComponent(
										btnThem_SanPham, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE))
								.addGroup(GroupLayout.Alignment.TRAILING, jPanel3Layout
										.createParallelGroup(GroupLayout.Alignment.LEADING, false)
										.addComponent(btnXoa_SanPham, GroupLayout.Alignment.TRAILING,
												GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(bntSua_SanPham, GroupLayout.Alignment.TRAILING,
												GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(btnReset_SanPham, GroupLayout.Alignment.TRAILING,
												GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)))
						.addContainerGap(26, Short.MAX_VALUE)));
		jPanel3Layout.setVerticalGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(jPanel3Layout.createSequentialGroup()
						.addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
								.addComponent(jScrollPane2, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE)
								.addComponent(
										jPanel4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE))
						.addGap(0, 0, Short.MAX_VALUE))
				.addGroup(jPanel3Layout.createSequentialGroup().addContainerGap().addGroup(jPanel3Layout
						.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addComponent(btnThem_SanPham, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
						.addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(labelItemSell).addComponent(cbbHangSanXuat_SanPham,
										GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)))
						.addGap(4, 4, 4)
						.addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(lblTonKho_SanPham).addComponent(jLabel11).addComponent(txtTonKho_SanPham,
										GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(bntSua_SanPham, GroupLayout.PREFERRED_SIZE, 34,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel12))
						.addGap(27, 27, 27)
						.addComponent(btnXoa_SanPham, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
						.addGap(27, 27, 27)
						.addComponent(btnReset_SanPham, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(22, Short.MAX_VALUE)));

		tblSanPham.setModel(new DefaultTableModel(
				new Object[][] { { null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null } },
				new String[] { "STT", "Mã Sản Phẩm ", "Tên Sản Phẩm", "Loại Sản Phẩm", "Giá Nhập", "Giá Bán",
						"Nhà Sản Xuất", "Tồn Kho", "ảnh", "Chú Thích" }) {
			boolean[] canEdit = new boolean[] { true, false, true, true, true, true, true, true, true, true };

			public boolean isCellEditable(int rowIndex, int columnIndex) {
				return canEdit[columnIndex];
			}
		});
		tblSanPham.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				tblSanPhamMouseClicked(evt);
			}
		});
		jScrollPane1.setViewportView(tblSanPham);
		if (tblSanPham.getColumnModel().getColumnCount() > 0) {
			tblSanPham.getColumnModel().getColumn(0).setPreferredWidth(30);
			tblSanPham.getColumnModel().getColumn(0).setMaxWidth(30);
		}

		btnDoiHinh_SanPham.setText("Đổi Hình");
		btnDoiHinh_SanPham.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnDoiHinh_SanPhamActionPerformed(evt);
			}
		});

		btnTimKiemSP = new JButton("Tìm Kiếm");
		btnTimKiemSP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String text = textField_tim_kiem_sp.getText().trim();
//				String sql = "SELECT * FROM HangSanXuat,sanpham,loaisanpham WHERE HangSanXuat.MaHangSanXuat = sanpham.HangSanXuat AND loaisanpham.MaLoaiSanPham = sanpham.MaLoaiSanPham AND sanpham.TenSanPham  = '"
//						+ text + "'";
				String sql = "SELECT * FROM(SELECT MaSanPham,TenSanPham,TenLoaiSanPham,GiaNhap,GiaBan,TenHangSanXuat,TonKho,Image,ChuThich FROM loaisanpham,(SELECT * FROM sanpham,hangsanxuat WHERE sanpham.HangSanXuat = hangsanxuat.MaHangSanXuat) AS bang1 WHERE bang1.MaLoaiSanPham = loaisanpham.MaLoaiSanPham) AS bang2 WHERE bang2.TenSanPham = '"
						+ text + "'";
				System.out.println("sql là " + sql);
				ResultSet rs = Manager.connection.excuteQuerySelect(sql);
				int c = 0;
				Object[] obj = new Object[] { "STT", "Mã Sản Phẩm", "Tên sản phẩm", "Loại sản phẩm", "Giá nhập",
						"Giá bán", "Hãng sản Xuất", "Tồn kho", "ảnh", "Chú Thích" };
				DefaultTableModel tableModel = new DefaultTableModel(obj, 0);
				tblSanPham.setModel(tableModel);
				try {
					while (rs.next()) {
						c++;
						Object[] item = new Object[10];
						item[0] = c;
						item[1] = rs.getInt("MaSanPham");
						item[2] = rs.getString("TenSanPham");
						item[3] = rs.getString("TenLoaiSanPham");
						item[4] = rs.getInt("GiaNhap");
						item[5] = rs.getInt("GiaBan");
						item[6] = rs.getString("TenHangSanXuat");
						item[7] = rs.getInt("TonKho");
						item[8] = rs.getString("Image");
						item[9] = rs.getString("ChuThich");
						tableModel.addRow(item);
					}
				} catch (SQLException ex) {
					System.out.println("lỗi");
					ex.printStackTrace();
				}
			}
		});

		textField_tim_kiem_sp = new JTextField();

		textField_tim_kiem_sp.setColumns(10);

		JLabel label_tk_sp = new JLabel("Tên Sản Phẩm");
		txtTimKiem_SanPham = new JTextField();
		
				txtTimKiem_SanPham.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent evt) {
						txtImg_SanPhamActionPerformed(evt);
					}
				});

		GroupLayout jPanelSanPhamLayout = new GroupLayout(jPanelSanPham);
		jPanelSanPhamLayout.setHorizontalGroup(
			jPanelSanPhamLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanelSanPhamLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(jPanelSanPhamLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 879, GroupLayout.PREFERRED_SIZE)
						.addGroup(jPanelSanPhamLayout.createSequentialGroup()
							.addComponent(label_tk_sp)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_tim_kiem_sp, GroupLayout.PREFERRED_SIZE, 223, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnTimKiemSP)))
					.addGroup(jPanelSanPhamLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(jPanelSanPhamLayout.createSequentialGroup()
							.addGap(28)
							.addGroup(jPanelSanPhamLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(jPanelSanPhamLayout.createSequentialGroup()
									.addComponent(txtTimKiem_SanPham, GroupLayout.PREFERRED_SIZE, 265, GroupLayout.PREFERRED_SIZE)
									.addContainerGap())
								.addComponent(labelHinhAnh, GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)))
						.addGroup(jPanelSanPhamLayout.createSequentialGroup()
							.addGap(104)
							.addComponent(btnDoiHinh_SanPham, GroupLayout.PREFERRED_SIZE, 136, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())))
				.addGroup(jPanelSanPhamLayout.createSequentialGroup()
					.addComponent(jPanel3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(432))
		);
		jPanelSanPhamLayout.setVerticalGroup(
			jPanelSanPhamLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(jPanelSanPhamLayout.createSequentialGroup()
					.addGroup(jPanelSanPhamLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(jPanelSanPhamLayout.createSequentialGroup()
							.addGap(6)
							.addComponent(labelHinhAnh, GroupLayout.PREFERRED_SIZE, 220, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(txtTimKiem_SanPham, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(btnDoiHinh_SanPham))
						.addGroup(jPanelSanPhamLayout.createSequentialGroup()
							.addGap(12)
							.addGroup(jPanelSanPhamLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(label_tk_sp)
								.addComponent(textField_tim_kiem_sp, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnTimKiemSP))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 242, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(jPanel3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
		);
		jPanelSanPham.setLayout(jPanelSanPhamLayout);

		jTabbedPaneQuanLySanPham.addTab("Sản Phẩm", jPanelSanPham);

		// ảnh sản phẩm
		tbljpanel.addTab(" Sản Phẩm", new ImageIcon("src/util/images/sanpham.png"),
				jTabbedPaneQuanLySanPham); // NOI18N

		jPanel_KhachHang.addComponentListener(new java.awt.event.ComponentAdapter() {
			public void componentShown(java.awt.event.ComponentEvent evt) {
				jPanel_KhachHangComponentShown(evt);
			}
		});

		tblKhachHang_KhachHang.setModel(new DefaultTableModel(
				new Object[][] { { null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null } },
				new String[] { "STT", "Mã Khách Hàng", "Tên Khách Hàng", "Ngày Sinh", "Giới Tính", "Dịa Chỉ", "SDT",
						"Loại Khách Hàng", "Ghi Chú" }));
		tblKhachHang_KhachHang.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				tblKhachHang_KhachHangMouseClicked(evt);
			}
		});
		jScrollPane24.setViewportView(tblKhachHang_KhachHang);

		jLabel56.setText("Khách Hàng");

		lblMaKhachHang_KhachHang.setText("Mã KH");

		lblTenKhachHang_KhachHang.setText("Tên KH");

		txtMaKhachHang_KhachHang.setEditable(true);

		txtTenKhachHang_KhachHang.addFocusListener(new java.awt.event.FocusAdapter() {
			public void focusLost(java.awt.event.FocusEvent evt) {
				txtTenKhachHang_KhachHangFocusLost(evt);
			}
		});
		txtTenKhachHang_KhachHang.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				txtTenKhachHang_KhachHangActionPerformed(evt);
			}
		});
		txtTenKhachHang_KhachHang.addKeyListener(new java.awt.event.KeyAdapter() {
			public void keyPressed(java.awt.event.KeyEvent evt) {
				txtTenKhachHang_KhachHangKeyPressed(evt);
			}

			public void keyTyped(java.awt.event.KeyEvent evt) {
				txtTenKhachHang_KhachHangKeyTyped(evt);
			}
		});

		buttonGroup1.add(rbtnNam_KhachHang);
		rbtnNam_KhachHang.setText("Nam");

		buttonGroup1.add(rbtnNu_KhachHang);
		rbtnNu_KhachHang.setText("Nữ");

		lblNgaySinh_KhachHang.setText("Ngày Sinh");

		lblGioiTinh_KhachHang.setText("Giới Tính");

		lblDiaChi_KhachHang.setText("Địa Chỉ");

		txtDiaChi_KhachHang.addFocusListener(new java.awt.event.FocusAdapter() {
			public void focusLost(java.awt.event.FocusEvent evt) {
				txtDiaChi_KhachHangFocusLost(evt);
			}
		});

		lblSDT_KhachHang.setText("SDT");

		txtSDT_KhachHang.addFocusListener(new java.awt.event.FocusAdapter() {
			public void focusLost(java.awt.event.FocusEvent evt) {
				txtSDT_KhachHangFocusLost(evt);
			}
		});

		jLabel85.setText("Ghi Chú");

		btnThem_KhachHang.setText("Thêm");
		btnThem_KhachHang.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				try {
					btnThem_KhachHangActionPerformed(evt);
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		});

		btnSua_KhachHang.setText("Sửa");
		btnSua_KhachHang.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnSua_KhachHangActionPerformed(evt);
			}
		});

		btnXoa_KhachHang.setText("Xóa");
		btnXoa_KhachHang.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnXoa_KhachHangActionPerformed(evt);
			}
		});

		btnReset_KhachHang.setText("Reset");
		btnReset_KhachHang.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnReset_KhachHangActionPerformed(evt);
			}
		});

		cbbThang.addItemListener(new java.awt.event.ItemListener() {
			public void itemStateChanged(java.awt.event.ItemEvent evt) {
				cbbThangItemStateChanged(evt);
			}
		});
		cbbThang.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				cbbThangActionPerformed(evt);
			}
		});

		lblLoiMaKhachHang_KhachHang4.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
		lblLoiMaKhachHang_KhachHang4.setForeground(new Color(255, 0, 51));

		lblLoiMaKhachHang_KhachHang5.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
		lblLoiMaKhachHang_KhachHang5.setForeground(new Color(255, 0, 51));
		txtGhiChu_KhachHang = new JTextPane();

		GroupLayout jPanel_KhachHangLayout = new GroupLayout(jPanel_KhachHang);
		jPanel_KhachHangLayout.setHorizontalGroup(
			jPanel_KhachHangLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel_KhachHangLayout.createSequentialGroup()
					.addGroup(jPanel_KhachHangLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(jPanel_KhachHangLayout.createSequentialGroup()
							.addGap(474)
							.addComponent(jLabel56))
						.addGroup(jPanel_KhachHangLayout.createSequentialGroup()
							.addGap(35)
							.addGroup(jPanel_KhachHangLayout.createParallelGroup(Alignment.TRAILING)
								.addGroup(jPanel_KhachHangLayout.createSequentialGroup()
									.addGroup(jPanel_KhachHangLayout.createParallelGroup(Alignment.TRAILING)
										.addGroup(jPanel_KhachHangLayout.createSequentialGroup()
											.addComponent(lblNgaySinh_KhachHang, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.UNRELATED)
											.addComponent(cbbNgay, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(cbbThang, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(cbbNam, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE))
										.addGroup(jPanel_KhachHangLayout.createSequentialGroup()
											.addGroup(jPanel_KhachHangLayout.createParallelGroup(Alignment.LEADING)
												.addGroup(jPanel_KhachHangLayout.createParallelGroup(Alignment.TRAILING)
													.addComponent(lblMaKhachHang_KhachHang, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
													.addComponent(lblTenKhachHang_KhachHang, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE))
												.addComponent(lblGioiTinh_KhachHang, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE))
											.addGap(18)
											.addGroup(jPanel_KhachHangLayout.createParallelGroup(Alignment.LEADING, false)
												.addGroup(jPanel_KhachHangLayout.createSequentialGroup()
													.addComponent(rbtnNam_KhachHang)
													.addPreferredGap(ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
													.addComponent(rbtnNu_KhachHang, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE))
												.addComponent(txtMaKhachHang_KhachHang)
												.addComponent(txtTenKhachHang_KhachHang))))
									.addGap(30)
									.addGroup(jPanel_KhachHangLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(lblDiaChi_KhachHang, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblSDT_KhachHang)
										.addComponent(jLabel85))
									.addGap(56)
									.addGroup(jPanel_KhachHangLayout.createParallelGroup(Alignment.LEADING)
										.addGroup(jPanel_KhachHangLayout.createSequentialGroup()
											.addComponent(txtGhiChu_KhachHang, GroupLayout.PREFERRED_SIZE, 167, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(jScrollPane25, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
										.addGroup(jPanel_KhachHangLayout.createParallelGroup(Alignment.LEADING, false)
											.addComponent(txtSDT_KhachHang)
											.addComponent(txtDiaChi_KhachHang, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 195, GroupLayout.PREFERRED_SIZE))))
								.addComponent(lblLoiMaKhachHang_KhachHang5, GroupLayout.PREFERRED_SIZE, 195, GroupLayout.PREFERRED_SIZE))
							.addGap(30)
							.addGroup(jPanel_KhachHangLayout.createParallelGroup(Alignment.LEADING, false)
								.addComponent(btnThem_KhachHang, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(btnSua_KhachHang, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(btnXoa_KhachHang, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(btnReset_KhachHang, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)))
						.addGroup(jPanel_KhachHangLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(jScrollPane24, GroupLayout.PREFERRED_SIZE, 1088, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(148, Short.MAX_VALUE))
				.addGroup(jPanel_KhachHangLayout.createSequentialGroup()
					.addGap(145)
					.addComponent(lblLoiMaKhachHang_KhachHang4, GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
					.addGap(833))
		);
		jPanel_KhachHangLayout.setVerticalGroup(
			jPanel_KhachHangLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(jPanel_KhachHangLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(jPanel_KhachHangLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(jPanel_KhachHangLayout.createSequentialGroup()
							.addComponent(jLabel56)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(jScrollPane24, GroupLayout.PREFERRED_SIZE, 303, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addGroup(jPanel_KhachHangLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblMaKhachHang_KhachHang)
								.addComponent(txtMaKhachHang_KhachHang, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblDiaChi_KhachHang)
								.addComponent(txtDiaChi_KhachHang, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnThem_KhachHang))
							.addGroup(jPanel_KhachHangLayout.createParallelGroup(Alignment.TRAILING)
								.addGroup(jPanel_KhachHangLayout.createSequentialGroup()
									.addGap(2)
									.addComponent(lblLoiMaKhachHang_KhachHang5, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addGroup(jPanel_KhachHangLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblSDT_KhachHang)
										.addComponent(txtSDT_KhachHang, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(btnSua_KhachHang))
									.addGroup(jPanel_KhachHangLayout.createParallelGroup(Alignment.LEADING)
										.addGroup(jPanel_KhachHangLayout.createSequentialGroup()
											.addPreferredGap(ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
											.addGroup(jPanel_KhachHangLayout.createParallelGroup(Alignment.TRAILING)
												.addComponent(btnXoa_KhachHang)
												.addComponent(txtGhiChu_KhachHang, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)))
										.addGroup(jPanel_KhachHangLayout.createSequentialGroup()
											.addGap(18)
											.addComponent(jScrollPane25, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE))))
								.addGroup(jPanel_KhachHangLayout.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
									.addGroup(jPanel_KhachHangLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblTenKhachHang_KhachHang)
										.addComponent(txtTenKhachHang_KhachHang, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
									.addGap(26)
									.addGroup(jPanel_KhachHangLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblNgaySinh_KhachHang)
										.addComponent(cbbNgay, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(cbbThang, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(cbbNam, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(jLabel85))
									.addGap(21)))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(jPanel_KhachHangLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(jPanel_KhachHangLayout.createSequentialGroup()
									.addGap(21)
									.addComponent(lblGioiTinh_KhachHang))
								.addGroup(jPanel_KhachHangLayout.createParallelGroup(Alignment.BASELINE)
									.addComponent(rbtnNam_KhachHang)
									.addComponent(rbtnNu_KhachHang))
								.addComponent(btnReset_KhachHang))
							.addGap(32))
						.addGroup(jPanel_KhachHangLayout.createSequentialGroup()
							.addComponent(lblLoiMaKhachHang_KhachHang4, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
							.addGap(22))))
		);
		jPanel_KhachHang.setLayout(jPanel_KhachHangLayout);

		tbljpanel.addTab("Khách Hàng", new ImageIcon("src/util/images/khachHang.png"), jPanel_KhachHang); // NOI18N

		jTabbedPaneNhanVien.addComponentListener(new java.awt.event.ComponentAdapter() {
			public void componentShown(java.awt.event.ComponentEvent evt) {
				jTabbedPaneNhanVienComponentShown(evt);
			}
		});

		jPanelNhanVien.setBackground(new Color(204, 204, 255));
		jPanelNhanVien.setPreferredSize(new java.awt.Dimension(1030, 600));
		jPanelNhanVien.addComponentListener(new java.awt.event.ComponentAdapter() {
			public void componentShown(java.awt.event.ComponentEvent evt) {
				jPanelNhanVienComponentShown(evt);
			}
		});

		tblNhanVien_NhanVien.setModel(new DefaultTableModel(
				new Object[][] { { null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null } },
				new String[] { "STT", "Mã Nhân Viên", "Tên Nhân Viên", "Ngày Sinh ", "Giới Tính", "Ngày Vào Làm",
						"Chức Vụ", "Địa Chỉ", "Số ĐT", "Ghi Chú" }) {
			boolean[] canEdit = new boolean[] { false, false, false, false, false, false, false, false, false, false };

			public boolean isCellEditable(int rowIndex, int columnIndex) {
				return canEdit[columnIndex];
			}
		});
		tblNhanVien_NhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				tblNhanVien_NhanVienMouseClicked(evt);
			}
		});
		jScrollPane6.setViewportView(tblNhanVien_NhanVien);
		if (tblNhanVien_NhanVien.getColumnModel().getColumnCount() > 0) {
			tblNhanVien_NhanVien.getColumnModel().getColumn(0).setResizable(false);
			tblNhanVien_NhanVien.getColumnModel().getColumn(0).setPreferredWidth(30);
		}

		jPanel15.setBackground(new Color(204, 204, 255));
		jPanel15.setBorder(BorderFactory.createCompoundBorder());

		jPanel16.setBackground(new Color(204, 204, 255));

		lblTenNhanVien_NhanVien.setText("Tên Nhân Viên");

		lblMaNhanVien_NhanVien.setText("Mã Nhân Viên");

		jLabel45.setText("Ngày Sinh");

		jLabel46.setText("Giới Tính");

		jLabel47.setText("Ngày Vào Làm");

		//  cho ng dùng sửa mã nv
		txtMaNhanVien_NhanVien.setEditable(true);

		buttonGroup1.add(rbtnNam_NhanVien);
		rbtnNam_NhanVien.setText("Nam");
		rbtnNam_NhanVien.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				rbtnNam_NhanVienActionPerformed(evt);
			}
		});

		buttonGroup1.add(rbtnNu_NhanVien);
		rbtnNu_NhanVien.setText("Nữ");

		cbbThangSinh_NhanVien.addItemListener(new java.awt.event.ItemListener() {
			public void itemStateChanged(java.awt.event.ItemEvent evt) {
				cbbThangSinh_NhanVienItemStateChanged(evt);
			}
		});

		cbbThangVaoLam_NhanVien.addItemListener(new java.awt.event.ItemListener() {
			public void itemStateChanged(java.awt.event.ItemEvent evt) {
				cbbThangVaoLam_NhanVienItemStateChanged(evt);
			}
		});

		GroupLayout jPanel16Layout = new GroupLayout(jPanel16);
		jPanel16.setLayout(jPanel16Layout);
		jPanel16Layout.setHorizontalGroup(jPanel16Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(jPanel16Layout.createSequentialGroup().addContainerGap()
						.addGroup(jPanel16Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addComponent(lblMaNhanVien_NhanVien, GroupLayout.PREFERRED_SIZE, 69,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel45)
								.addComponent(jLabel46, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel47).addComponent(lblTenNhanVien_NhanVien))
						.addGap(23, 23, 23)
						.addGroup(jPanel16Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addGroup(jPanel16Layout.createSequentialGroup()
										.addComponent(cbbNgayVaoLam_NhanVien, GroupLayout.PREFERRED_SIZE, 53,
												GroupLayout.PREFERRED_SIZE)
										.addGap(18, 18, 18)
										.addComponent(cbbThangVaoLam_NhanVien, GroupLayout.PREFERRED_SIZE, 66,
												GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(cbbNamVaoLam_NhanVien, GroupLayout.PREFERRED_SIZE, 71,
												GroupLayout.PREFERRED_SIZE)
										.addContainerGap(20, Short.MAX_VALUE))
								.addGroup(jPanel16Layout.createSequentialGroup().addGroup(jPanel16Layout
										.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
										.addComponent(txtTenNhanVien_NhanVien, GroupLayout.Alignment.LEADING)
										.addComponent(txtMaNhanVien_NhanVien, GroupLayout.Alignment.LEADING)
										.addGroup(jPanel16Layout.createSequentialGroup().addGroup(jPanel16Layout
												.createParallelGroup(GroupLayout.Alignment.LEADING)
												.addGroup(jPanel16Layout.createSequentialGroup()
														.addComponent(cbbNgaySinh_NhanVien, GroupLayout.PREFERRED_SIZE,
																52, GroupLayout.PREFERRED_SIZE)
														.addGap(18, 18, 18)
														.addComponent(cbbThangSinh_NhanVien, GroupLayout.PREFERRED_SIZE,
																66, GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED,
																GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
												.addGroup(GroupLayout.Alignment.TRAILING, jPanel16Layout
														.createSequentialGroup()
														.addComponent(rbtnNam_NhanVien, GroupLayout.PREFERRED_SIZE, 66,
																GroupLayout.PREFERRED_SIZE)
														.addGap(76, 76, 76)))
												.addGroup(jPanel16Layout
														.createParallelGroup(GroupLayout.Alignment.LEADING)
														.addComponent(rbtnNu_NhanVien, GroupLayout.PREFERRED_SIZE, 71,
																GroupLayout.PREFERRED_SIZE)
														.addComponent(cbbNamSinh_NhanVien, GroupLayout.PREFERRED_SIZE,
																75, GroupLayout.PREFERRED_SIZE))))
										.addGap(0, 0, Short.MAX_VALUE)))));
		jPanel16Layout
				.setVerticalGroup(
						jPanel16Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addGroup(jPanel16Layout.createSequentialGroup().addContainerGap()
										.addGroup(jPanel16Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
												.addComponent(lblMaNhanVien_NhanVien)
												.addComponent(txtMaNhanVien_NhanVien, GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
										.addGap(18, 18, 18)
										.addGroup(jPanel16Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
												.addComponent(lblTenNhanVien_NhanVien)
												.addComponent(txtTenNhanVien_NhanVien, GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
										.addGap(15, 15, 15)
										.addGroup(jPanel16Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
												.addComponent(jLabel45)
												.addGroup(jPanel16Layout
														.createParallelGroup(GroupLayout.Alignment.BASELINE)
														.addComponent(cbbNgaySinh_NhanVien, GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
														.addComponent(cbbThangSinh_NhanVien, GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
														.addComponent(cbbNamSinh_NhanVien, GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
										.addGap(18, 18, 18)
										.addGroup(jPanel16Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
												.addComponent(jLabel46)
												.addGroup(jPanel16Layout
														.createParallelGroup(GroupLayout.Alignment.BASELINE)
														.addComponent(rbtnNam_NhanVien).addComponent(rbtnNu_NhanVien)))
										.addGap(25, 25, 25)
										.addGroup(jPanel16Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel47)
												.addComponent(cbbNgayVaoLam_NhanVien, GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addComponent(cbbNamVaoLam_NhanVien, GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addComponent(cbbThangVaoLam_NhanVien, GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
										.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		lblDiaChi_NhanVien.setText("Địa Chỉ");

		lblSDT_NhanVien.setText("Số ĐT");

		txtChuThich_NhanVien.setColumns(20);
		txtChuThich_NhanVien.setRows(5);
		jScrollPane8.setViewportView(txtChuThich_NhanVien);

		jLabel51.setText("Chú Thích");

		jLabel52.setText("Chức Vụ");

		btnThem_NhanVien.setText("Thêm");
		btnThem_NhanVien.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnThem_NhanVienActionPerformed(evt);
			}
		});

		btnSua_NhanVien.setText("Sửa");
		btnSua_NhanVien.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnSua_NhanVienActionPerformed(evt);
			}
		});

		btnXoa_NhanVien.setText("Xóa");
		btnXoa_NhanVien.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnXoa_NhanVienActionPerformed(evt);
			}
		});
		btnReset_NhanVien.setText("Reset");
		btnReset_NhanVien.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnReset_NhanVienActionPerformed(evt);
			}
		});

		txtDiaChi_NhanVien.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				txtDiaChi_NhanVienActionPerformed(evt);
			}
		});

		txtSoDT_NhanVien.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				txtSoDT_NhanVienActionPerformed(evt);
			}
		});

		cbbChucVu_NhanVien
				.setModel(new DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

		GroupLayout jPanel15Layout = new GroupLayout(jPanel15);
		jPanel15Layout.setHorizontalGroup(
			jPanel15Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel15Layout.createSequentialGroup()
					.addContainerGap()
					.addComponent(jPanel16, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
					.addGroup(jPanel15Layout.createParallelGroup(Alignment.LEADING)
						.addGroup(jPanel15Layout.createParallelGroup(Alignment.TRAILING)
							.addGroup(jPanel15Layout.createSequentialGroup()
								.addGroup(jPanel15Layout.createParallelGroup(Alignment.LEADING)
									.addComponent(lblDiaChi_NhanVien)
									.addComponent(jLabel52, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE))
								.addGap(22))
							.addGroup(jPanel15Layout.createSequentialGroup()
								.addComponent(lblSDT_NhanVien, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.UNRELATED)))
						.addComponent(jLabel51, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE))
					.addGap(10)
					.addGroup(jPanel15Layout.createParallelGroup(Alignment.LEADING, false)
						.addComponent(txtDiaChi_NhanVien)
						.addComponent(txtSoDT_NhanVien)
						.addComponent(cbbChucVu_NhanVien, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(jScrollPane8, GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE))
					.addGap(56)
					.addGroup(jPanel15Layout.createParallelGroup(Alignment.TRAILING)
						.addComponent(btnThem_NhanVien, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)
						.addGroup(jPanel15Layout.createParallelGroup(Alignment.LEADING, false)
							.addComponent(btnXoa_NhanVien, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(btnReset_NhanVien, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE))
						.addComponent(btnSua_NhanVien, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE))
					.addGap(502))
		);
		jPanel15Layout.setVerticalGroup(
			jPanel15Layout.createParallelGroup(Alignment.TRAILING)
				.addComponent(jPanel16, GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
				.addGroup(jPanel15Layout.createSequentialGroup()
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGroup(jPanel15Layout.createParallelGroup(Alignment.LEADING)
						.addComponent(btnThem_NhanVien, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
						.addGroup(jPanel15Layout.createParallelGroup(Alignment.TRAILING)
							.addComponent(cbbChucVu_NhanVien, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(jLabel52)))
					.addGroup(jPanel15Layout.createParallelGroup(Alignment.LEADING)
						.addGroup(jPanel15Layout.createSequentialGroup()
							.addGroup(jPanel15Layout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblDiaChi_NhanVien)
								.addComponent(txtDiaChi_NhanVien, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(jPanel15Layout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblSDT_NhanVien)
								.addComponent(txtSoDT_NhanVien, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addGroup(jPanel15Layout.createSequentialGroup()
							.addGap(18)
							.addComponent(btnSua_NhanVien, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)))
					.addGap(18)
					.addGroup(jPanel15Layout.createParallelGroup(Alignment.LEADING, false)
						.addGroup(jPanel15Layout.createSequentialGroup()
							.addComponent(btnXoa_NhanVien, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(btnReset_NhanVien, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
						.addComponent(jLabel51)
						.addComponent(jScrollPane8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		jPanel15.setLayout(jPanel15Layout);

		GroupLayout jPanelNhanVienLayout = new GroupLayout(jPanelNhanVien);
		jPanelNhanVien.setLayout(jPanelNhanVienLayout);
		jPanelNhanVienLayout.setHorizontalGroup(jPanelNhanVienLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(jPanelNhanVienLayout.createSequentialGroup().addContainerGap()
						.addGroup(jPanelNhanVienLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addComponent(jScrollPane6, GroupLayout.PREFERRED_SIZE, 1091,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(jPanel15, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE))
						.addContainerGap(71, Short.MAX_VALUE)));
		jPanelNhanVienLayout.setVerticalGroup(jPanelNhanVienLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(jPanelNhanVienLayout.createSequentialGroup().addContainerGap()
						.addComponent(jScrollPane6, GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE)
						.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
						.addComponent(jPanel15, GroupLayout.PREFERRED_SIZE, 229, GroupLayout.PREFERRED_SIZE)
						.addContainerGap()));

		jTabbedPaneNhanVien.addTab("Nhân Viên", jPanelNhanVien);

		jPanelChucVu.setBackground(new Color(204, 204, 255));
		jPanelChucVu.setPreferredSize(new java.awt.Dimension(1030, 600));
		jPanelChucVu.addComponentListener(new java.awt.event.ComponentAdapter() {
			public void componentShown(java.awt.event.ComponentEvent evt) {
				jPanelChucVuComponentShown(evt);
			}
		});

		tblChucVu_ChucVu.setModel(new DefaultTableModel(
				new Object[][] { { null, null, null, null }, { null, null, null, null }, { null, null, null, null },
						{ null, null, null, null }, { null, null, null, null }, { null, null, null, null },
						{ null, null, null, null }, { null, null, null, null }, { null, null, null, null },
						{ null, null, null, null }, { null, null, null, null }, { null, null, null, null } },
				new String[] { "STT", "Mã Chức Vụ", "Tên Chức Vụ", "Ghi Chú" }) {
			boolean[] canEdit = new boolean[] { false, false, true, true };

			public boolean isCellEditable(int rowIndex, int columnIndex) {
				return canEdit[columnIndex];
			}
		});
		tblChucVu_ChucVu.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				tblChucVu_ChucVuMouseClicked(evt);
			}
		});
		jScrollPane12.setViewportView(tblChucVu_ChucVu);
		if (tblChucVu_ChucVu.getColumnModel().getColumnCount() > 0) {
			tblChucVu_ChucVu.getColumnModel().getColumn(0).setMinWidth(30);
			tblChucVu_ChucVu.getColumnModel().getColumn(0).setPreferredWidth(30);
			tblChucVu_ChucVu.getColumnModel().getColumn(0).setMaxWidth(30);
			tblChucVu_ChucVu.getColumnModel().getColumn(1).setMinWidth(90);
			tblChucVu_ChucVu.getColumnModel().getColumn(1).setPreferredWidth(90);
			tblChucVu_ChucVu.getColumnModel().getColumn(1).setMaxWidth(90);
		}

		jPanel20.setBackground(new Color(204, 204, 255));

		jLabel25.setText("Mã Chức Vụ");

		jLabel26.setText("Tên Chức Vụ");

		jLabel27.setText("Ghi Chú");

		txtChuThich_ChucVu.setColumns(20);
		txtChuThich_ChucVu.setRows(5);
		jScrollPane13.setViewportView(txtChuThich_ChucVu);

		btnThem_ChucVu.setText("Thêm");
		btnThem_ChucVu.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnThem_ChucVuActionPerformed(evt);
			}
		});

		btnSua_ChucVu.setText("Sửa");
		btnSua_ChucVu.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnSua_ChucVuActionPerformed(evt);
			}
		});

		btnReset_ChucVu.setText("Reset");
		btnReset_ChucVu.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnReset_ChucVuActionPerformed(evt);
			}
		});

		txtMaChucVu_ChucVu.setEditable(false);
		txtMaChucVu_ChucVu.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				txtMaChucVu_ChucVuActionPerformed(evt);
			}
		});

		GroupLayout jPanel20Layout = new GroupLayout(jPanel20);
		jPanel20.setLayout(jPanel20Layout);
		jPanel20Layout.setHorizontalGroup(jPanel20Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(jPanel20Layout.createSequentialGroup().addContainerGap().addGroup(jPanel20Layout
						.createParallelGroup(GroupLayout.Alignment.LEADING, false)
						.addGroup(jPanel20Layout.createSequentialGroup()
								.addGroup(jPanel20Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
										.addComponent(jLabel25).addComponent(jLabel26).addComponent(jLabel27))
								.addGap(66, 66, 66)
								.addGroup(
										jPanel20Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
												.addComponent(jScrollPane13).addComponent(txtTenChucVu_ChucVu)
												.addComponent(txtMaChucVu_ChucVu)))
						.addGroup(jPanel20Layout.createSequentialGroup()
								.addComponent(btnThem_ChucVu, GroupLayout.PREFERRED_SIZE, 70,
										GroupLayout.PREFERRED_SIZE)
								.addGap(37, 37, 37)
								.addComponent(btnSua_ChucVu, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)
								.addComponent(btnReset_ChucVu, GroupLayout.PREFERRED_SIZE, 75,
										GroupLayout.PREFERRED_SIZE)))
						.addContainerGap(62, Short.MAX_VALUE)));
		jPanel20Layout.setVerticalGroup(jPanel20Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(jPanel20Layout.createSequentialGroup().addContainerGap()
						.addGroup(jPanel20Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel25).addComponent(txtMaChucVu_ChucVu, GroupLayout.PREFERRED_SIZE,
										GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGap(22, 22, 22)
						.addGroup(jPanel20Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel26).addComponent(txtTenChucVu_ChucVu, GroupLayout.PREFERRED_SIZE,
										GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGap(33, 33, 33)
						.addGroup(jPanel20Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addComponent(jLabel27).addComponent(jScrollPane13, GroupLayout.PREFERRED_SIZE, 118,
										GroupLayout.PREFERRED_SIZE))
						.addGap(18, 18, 18)
						.addGroup(jPanel20Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addGroup(jPanel20Layout.createSequentialGroup().addGap(0, 0, Short.MAX_VALUE)
										.addComponent(btnThem_ChucVu))
								.addGroup(jPanel20Layout.createSequentialGroup()
										.addGroup(jPanel20Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
												.addComponent(btnReset_ChucVu).addComponent(btnSua_ChucVu))
										.addGap(0, 0, Short.MAX_VALUE)))
						.addContainerGap()));

		jPanel21.setBackground(new Color(204, 204, 255));

		jLabel28.setText("Lư ý khi xóa có thể gây ra lỗi khi xóa phải nhân viên nằm trong Hóa Đơn và Phiếu Nhập");

		btnXoaNeuRong_ChucVu.setText("Xóa Nếu Rỗng");
		btnXoaNeuRong_ChucVu.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnXoaNeuRong_ChucVuActionPerformed(evt);
			}
		});

		btnAnDi_ChucVu.setText("ẩn Đi");

		btnDoiChucVu_ChucVu.setText("Đổi Mã Chức Vụ Khác");

		cbbDoiChucVu_ChucVu
				.setModel(new DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

		GroupLayout jPanel21Layout = new GroupLayout(jPanel21);
		jPanel21.setLayout(jPanel21Layout);
		jPanel21Layout.setHorizontalGroup(jPanel21Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(jPanel21Layout.createSequentialGroup()
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGroup(jPanel21Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addGroup(GroupLayout.Alignment.TRAILING,
										jPanel21Layout.createSequentialGroup().addComponent(jLabel28).addContainerGap())
								.addGroup(GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
										.addGap(25, 25, 25)
										.addGroup(jPanel21Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
												.addGroup(jPanel21Layout.createSequentialGroup()
														.addComponent(btnDoiChucVu_ChucVu, GroupLayout.PREFERRED_SIZE,
																141, GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED,
																GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
														.addComponent(cbbDoiChucVu_ChucVu, GroupLayout.PREFERRED_SIZE,
																141, GroupLayout.PREFERRED_SIZE))
												.addGroup(jPanel21Layout.createSequentialGroup()
														.addComponent(btnXoaNeuRong_ChucVu, GroupLayout.PREFERRED_SIZE,
																141, GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED,
																GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
														.addComponent(btnAnDi_ChucVu, GroupLayout.PREFERRED_SIZE, 141,
																GroupLayout.PREFERRED_SIZE)))
										.addGap(71, 71, 71)))));
		jPanel21Layout.setVerticalGroup(jPanel21Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(jPanel21Layout.createSequentialGroup()
						.addComponent(jLabel28, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
						.addGap(18, 18, 18)
						.addGroup(jPanel21Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(btnDoiChucVu_ChucVu, GroupLayout.PREFERRED_SIZE, 38,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(cbbDoiChucVu_ChucVu, GroupLayout.PREFERRED_SIZE, 38,
										GroupLayout.PREFERRED_SIZE))
						.addGap(60, 60, 60)
						.addGroup(jPanel21Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(btnXoaNeuRong_ChucVu, GroupLayout.PREFERRED_SIZE, 31,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(btnAnDi_ChucVu))
						.addContainerGap(14, Short.MAX_VALUE)));

		tbljpanel.addTab("Nhân Viên", new ImageIcon("src/util/images/nhanvien.png"), jTabbedPaneNhanVien); // NOI18N

		//
		jTable1.setModel(
				new DefaultTableModel(
						new Object[][] { { null, null, null, null }, { null, null, null, null },
								{ null, null, null, null }, { null, null, null, null } },
						new String[] { "Title 1", "Title 2", "Title 3", "Title 4" }));
		jScrollPane19.setViewportView(jTable1);

		jPanelDangXuat.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jPanelDangXuatMouseClicked(evt);
			}
		});
		jPanelDangXuat.addComponentListener(new java.awt.event.ComponentAdapter() {
			public void componentShown(java.awt.event.ComponentEvent evt) {
				jPanelDangXuatComponentShown(evt);
			}
		});

		GroupLayout jPanelDangXuatLayout = new GroupLayout(jPanelDangXuat);
		jPanelDangXuat.setLayout(jPanelDangXuatLayout);
		jPanelDangXuatLayout.setHorizontalGroup(jPanelDangXuatLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGap(0, 1181, Short.MAX_VALUE));
		jPanelDangXuatLayout.setVerticalGroup(jPanelDangXuatLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGap(0, 584, Short.MAX_VALUE));

		tbljpanel.addTab("đăng Xuất", new ImageIcon("src/util/images/thoat.png"), jPanelDangXuat); // NOI18N

		jPanelMe.addComponentListener(new java.awt.event.ComponentAdapter() {
			public void componentShown(java.awt.event.ComponentEvent evt) {
				jPanelMeComponentShown(evt);
			}
		});

		jLabel15.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
		jLabel15.setForeground(new Color(0, 0, 0));
		jLabel15.setText("Liên Hệ Tư Vấn Sản Phẩm: teamwork.lthdt@gmail.com");

		GroupLayout jPanelMeLayout = new GroupLayout(jPanelMe);
		jPanelMeLayout
				.setHorizontalGroup(jPanelMeLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(jPanelMeLayout.createSequentialGroup().addContainerGap(358, Short.MAX_VALUE)
								.addGroup(jPanelMeLayout.createParallelGroup(Alignment.LEADING)
										.addGroup(Alignment.TRAILING,
												jPanelMeLayout.createSequentialGroup()
														.addComponent(lblAbout, GroupLayout.PREFERRED_SIZE, 747,
																GroupLayout.PREFERRED_SIZE)
														.addGap(141))
										.addGroup(Alignment.TRAILING,
												jPanelMeLayout.createSequentialGroup().addComponent(jLabel15,
														GroupLayout.PREFERRED_SIZE, 740, GroupLayout.PREFERRED_SIZE)
														.addGap(50)))));
		jPanelMeLayout.setVerticalGroup(jPanelMeLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(jPanelMeLayout.createSequentialGroup().addContainerGap()
						.addComponent(jLabel15, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE).addGap(7)
						.addComponent(lblAbout, GroupLayout.DEFAULT_SIZE, 506, Short.MAX_VALUE).addContainerGap()));
		jPanelMe.setLayout(jPanelMeLayout);

		tbljpanel.addTab("About Me", new ImageIcon("src/util/images/me.png"), jPanelMe); // NOI18N

		GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(
				GroupLayout.Alignment.TRAILING,
				jPanel1Layout.createSequentialGroup().addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(tbljpanel, GroupLayout.PREFERRED_SIZE, 1327, GroupLayout.PREFERRED_SIZE)
						.addContainerGap()));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addContainerGap()
						.addComponent(tbljpanel, GroupLayout.PREFERRED_SIZE, 589, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		GroupLayout layout = new GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addContainerGap()
						.addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(jPanel1,
				GroupLayout.PREFERRED_SIZE, 605, Short.MAX_VALUE));

		pack();
		setLocationRelativeTo(null);
	}// </editor-fold>//GEN-END:initComponents

	private void formWindowClosed(java.awt.event.WindowEvent evt) {// GEN-FIRST:event_formWindowClosed

	}// GEN-LAST:event_formWindowClosed

	private void formWindowClosing(java.awt.event.WindowEvent evt) {// GEN-FIRST:event_formWindowClosing
		ViewDangNhap frmDN = new ViewDangNhap();
		frmDN.show();
		this.dispose();
	}// GEN-LAST:event_formWindowClosing

	private void btnXoa_LoaiSanPhamActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnXoa_LoaiSanPhamActionPerformed

	}// GEN-LAST:event_btnXoa_LoaiSanPhamActionPerformed

	private void txtImg_SanPhamActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtImg_SanPhamActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_txtImg_SanPhamActionPerformed

	private void btnDoiHinh_SanPhamActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnDoiHinh_SanPhamActionPerformed
		final JFileChooser fc = new JFileChooser();

		if (evt.getSource() == btnDoiHinh_SanPham) {
			int returnVal = fc.showOpenDialog(this);
			if (returnVal == JFileChooser.APPROVE_OPTION) {
				File file = fc.getSelectedFile();
				String imagePath = file.getPath();
				setLabelImage(imagePath);
				txtTimKiem_SanPham.setText(imagePath);
			} else {

			}
		}

	}// GEN-LAST:event_btnDoiHinh_SanPhamActionPerformed

	private void cbbMaLoaiSanPham_SanPhamActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_cbbMaLoaiSanPham_SanPhamActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_cbbMaLoaiSanPham_SanPhamActionPerformed

	private void txtMaChucVu_ChucVuActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtMaChucVu_ChucVuActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_txtMaChucVu_ChucVuActionPerformed

	private void btnReset_ChucVuActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnReset_ChucVuActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_btnReset_ChucVuActionPerformed

	private void txtSoDT_NhanVienActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtSoDT_NhanVienActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_txtSoDT_NhanVienActionPerformed

	private void txtDiaChi_NhanVienActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtDiaChi_NhanVienActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_txtDiaChi_NhanVienActionPerformed

	private void jPanelDangXuatMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jPanelDangXuatMouseClicked

	}// GEN-LAST:event_jPanelDangXuatMouseClicked

	private void jPanelDangXuatComponentShown(java.awt.event.ComponentEvent evt) {// GEN-FIRST:event_jPanelDangXuatComponentShown
		ViewDangNhap frmdn = new ViewDangNhap();
		frmdn.show();
		this.dispose();
	}// GEN-LAST:event_jPanelDangXuatComponentShown

	private void jPanelNhanVienComponentShown(java.awt.event.ComponentEvent evt) {// GEN-FIRST:event_jPanelNhanVienComponentShown

	}// GEN-LAST:event_jPanelNhanVienComponentShown

	private void jPanelSanPhamComponentShown(java.awt.event.ComponentEvent evt) {// GEN-FIRST:event_jPanelSanPhamComponentShown
		LayDuLieuSanPham();
		cbbMaLoaiSanPham_SanPham.setModel(LayDuLieucbb("LoaiSanPham", "TenLoaiSanPham", "MaLoaiSanPham"));
		cbbHangSanXuat_SanPham.setModel(LayDuLieucbb("HangSanXuat", "TenHangSanXuat", "MaHangSanXuat"));
	}// GEN-LAST:event_jPanelSanPhamComponentShown

	// Nhận sự kiện khi thêm sửa thông tin sản phẩm
	private void tblSanPhamMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_tblSanPhamMouseClicked

		int viTriDongVuaBam = tblSanPham.getSelectedRow();

		setSelectedCombobox(tblSanPham.getValueAt(viTriDongVuaBam, 3).toString(), cbbMaLoaiSanPham_SanPham);
		setSelectedCombobox(tblSanPham.getValueAt(viTriDongVuaBam, 6).toString(), cbbHangSanXuat_SanPham);
		txtMaSanPham_SanPham.setText(tblSanPham.getValueAt(viTriDongVuaBam, 1).toString());
		txtTenSanPham_SanPham.setText(tblSanPham.getValueAt(viTriDongVuaBam, 2).toString());
		txtGiaNhap_SanPham.setText(tblSanPham.getValueAt(viTriDongVuaBam, 4).toString());
		txtGiaBan_SanPham.setText(tblSanPham.getValueAt(viTriDongVuaBam, 5).toString());
		txtTonKho_SanPham.setText(tblSanPham.getValueAt(viTriDongVuaBam, 7).toString());
		txtChuThich_SanPham.setText(tblSanPham.getValueAt(viTriDongVuaBam, 9).toString());
		try {
			if (!tblSanPham.getValueAt(viTriDongVuaBam, 8).toString().equals("")) {
				txtTimKiem_SanPham.setText(tblSanPham.getValueAt(viTriDongVuaBam, 8).toString());
				setLabelImage(txtTimKiem_SanPham.getText());
			}

		} catch (Exception e) {
			txtTimKiem_SanPham.setText("");
		}

	}// GEN-LAST:event_tblSanPhamMouseClicked

	// Thực thi truy vấn khi ấn nút btn Thêm
	private void btnThem_SanPhamActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnThem_SanPhamActionPerformed
		String TenSanPham, MaLoaiSanPham, GiaNhap, GiaBan, HangSanXuat, TonKho, TrangThai, Image, ChuThich;
		TenSanPham = txtTenSanPham_SanPham.getText();
		MaLoaiSanPham = GetCbbSelected(cbbMaLoaiSanPham_SanPham);
		GiaNhap = txtGiaNhap_SanPham.getText();
		GiaBan = txtGiaBan_SanPham.getText();
		HangSanXuat = GetCbbSelected(cbbHangSanXuat_SanPham);
		TonKho = txtTonKho_SanPham.getText();

		ChuThich = txtChuThich_SanPham.getText();
		Image = txtTimKiem_SanPham.getText();
//
//        String cautruyvan = "insert into sanpham "
//                + "values(N'" + TenSanPham + "' ,"  + HangSanXuat + ",'" + GiaNhap + "', '" + GiaBan + "', "
//                + TonKho + ", '" + Image + "', N" + ChuThich + "'," + MaLoaiSanPham +")";
//
		String cautruyvan = "INSERT INTO sanpham(TenSanPham, HangSanXuat, GiaNhap, GiaBan, TonKho, Image, ChuThich, MaLoaiSanPham) "
				+ "VALUES (N'" + TenSanPham + "', " + HangSanXuat + ",'" + GiaNhap + "', '" + GiaBan + "'," + TonKho
				+ ", '" + Image + "', N'" + ChuThich + "', " + MaLoaiSanPham + ")";
		System.out.println(cautruyvan);
		boolean kiemtra = KiemTraNhanSanPham(0);
		if (kiemtra) {
			Manager.connection.excuteQueryUpdate(cautruyvan);
			System.out.println("Đã Thêm Thành Công");
		} else {
			System.out.println("Thất Bại");
		}
		LayDuLieuSanPham();
	}// GEN-LAST:event_btnThem_SanPhamActionPerformed

	// btn sửa ch
	private void bntSua_SanPhamActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_bntSua_SanPhamActionPerformed
		String MaSanPham, TenSanPham, MaLoaiSanPham, GiaNhap, GiaBan, HangSanXuat, TonKho, Image, ChuThich;
		MaSanPham = txtMaSanPham_SanPham.getText();
		TenSanPham = txtTenSanPham_SanPham.getText();
		MaLoaiSanPham = GetCbbSelected(cbbMaLoaiSanPham_SanPham);
		GiaNhap = txtGiaNhap_SanPham.getText();
		GiaBan = txtGiaBan_SanPham.getText();
		HangSanXuat = GetCbbSelected(cbbHangSanXuat_SanPham);
		TonKho = txtTonKho_SanPham.getText();

		Image = txtTimKiem_SanPham.getText();

		ChuThich = txtChuThich_SanPham.getText();
		String cautruyvan = "update  SanPham set " + "TenSanPham =" + "N'" + TenSanPham + "',MaLoaiSanPham="
				+ MaLoaiSanPham + ",HangSanXuat=" + HangSanXuat + ",GiaNhap=" + GiaNhap + ",GiaBan=" + GiaBan
				+ ",TonKho=" + TonKho + ",Image='" + Image + "',ChuThich =N'" + ChuThich + "' where MaSanPham="
				+ MaSanPham;
		System.out.println(cautruyvan);
		boolean kiemtra = KiemTraNhanSanPham(1);
		if (kiemtra) {
			Manager.connection.excuteQueryUpdate(cautruyvan);
			System.out.println("Đã Sửa Thành Công Sản Phẩm");
		} else {
			System.out.println("Thất Bại");
		}
		LayDuLieuSanPham();
	}// GEN-LAST:event_bntSua_SanPhamActionPerformed

	private void btnReset_SanPhamActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnReset_SanPhamActionPerformed
		ResSanPham();
	}// GEN-LAST:event_btnReset_SanPhamActionPerformed

	public void ResSanPham() {
		txtMaSanPham_SanPham.setText("");
		txtTenSanPham_SanPham.setText("");
		txtGiaNhap_SanPham.setText("");
		txtGiaBan_SanPham.setText("");
		txtTonKho_SanPham.setText("");
		txtChuThich_SanPham.setText("");
		cbbMaLoaiSanPham_SanPham.setSelectedIndex(0);
		cbbHangSanXuat_SanPham.setSelectedIndex(0);
	}

	public void reset_chitiethoadon() {
		txtMaCTH_ChiTietHoaDon.setText("");
		txtMaHoaDon_ChiTietHoaDon.setText("");
		txtSoLuong_ChiTietHoaDon.setText("");
		txtTongTien_ChiTietHoaDon.setText("");
		txtGhiChu_ChiTietHoaDon.setText("");
		cbbSanPham_ChiTietHoaDon.setSelectedIndex(0);
	}

	private void jPanel_KhachHangComponentShown(java.awt.event.ComponentEvent evt) {// GEN-FIRST:event_jPanel_KhachHangComponentShown
		rbtnNam_KhachHang.setSelected(true);
		LayDuLieuKhachHang();
		for (int i = 1; i < 32; i++) {
			cbbNgay.addItem(String.valueOf(i));
		}
		for (int i = 1; i < 13; i++) {
			cbbThang.addItem(String.valueOf(i));
		}
		for (int i = year; i > 1950; i--) {
			cbbNam.addItem(String.valueOf(i));
		}
	}// GEN-LAST:event_jPanel_KhachHangComponentShown

	private void btnThem_NhanVienActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnThem_NhanVienActionPerformed
		String MaNhanVien, TenNhanVien, NgaySinh, GioiTinh, NgayVaoLam, ChucVu, DiaChi, SoDT, GhiChu;
		MaNhanVien = txtMaNhanVien_NhanVien.getText();
		if (rbtnNam_NhanVien.isSelected()) {
			GioiTinh = "Nam";
		} else {
			GioiTinh = "Nữ";
		}
		ChucVu = GetCbbSelected(cbbChucVu_NhanVien);
		TenNhanVien = txtTenNhanVien_NhanVien.getText();
		String ngay, thang, nam;
		ngay = cbbNgaySinh_NhanVien.getSelectedItem().toString();
		thang = cbbThangSinh_NhanVien.getSelectedItem().toString();
		nam = cbbNamSinh_NhanVien.getSelectedItem().toString();
		NgaySinh = nam + "-" + thang + "-" + ngay;
		String ngayv, thangv, namv;
		ngayv = cbbNgayVaoLam_NhanVien.getSelectedItem().toString();
		thangv = cbbThangVaoLam_NhanVien.getSelectedItem().toString();
		namv = cbbNamVaoLam_NhanVien.getSelectedItem().toString();
		NgayVaoLam = namv + "-" + thangv + "-" + ngayv;
		DiaChi = txtDiaChi_NhanVien.getText();
		SoDT = txtSoDT_NhanVien.getText();
		GhiChu = txtChuThich_NhanVien.getText();
		String cautruyvan = "insert into NhanVien values(" + MaNhanVien +",N'" + TenNhanVien + "','" + NgaySinh + "',N'" + GioiTinh
				+ "','" + NgayVaoLam + "'," + ChucVu + ",N'" + DiaChi + "',N'" + SoDT + "',N'" + GhiChu + "')";

		boolean kiemtra = KiemTraNhapNhanVien(0);
		if (kiemtra) {
			Manager.connection.excuteQueryUpdate(cautruyvan);
			System.out.println("Đã Thêm Thành Công");
			System.out.println(cautruyvan);
		} else {
			System.out.println("Thất Bại");
		}
		layDuLieuNhanVien();
	}// GEN-LAST:event_btnThem_NhanVienActionPerformed

	private void tblNhanVien_NhanVienMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_tblNhanVien_NhanVienMouseClicked
		int viTriDongVuaBam = tblNhanVien_NhanVien.getSelectedRow();
		txtMaNhanVien_NhanVien.setText(tblNhanVien_NhanVien.getValueAt(viTriDongVuaBam, 1).toString());
		txtTenNhanVien_NhanVien.setText(tblNhanVien_NhanVien.getValueAt(viTriDongVuaBam, 2).toString());
		txtDiaChi_NhanVien.setText(tblNhanVien_NhanVien.getValueAt(viTriDongVuaBam, 7).toString());
		txtSoDT_NhanVien.setText(tblNhanVien_NhanVien.getValueAt(viTriDongVuaBam, 8).toString());
		txtChuThich_NhanVien.setText(tblNhanVien_NhanVien.getValueAt(viTriDongVuaBam, 9).toString());
		setSelectedCombobox(tblNhanVien_NhanVien.getValueAt(viTriDongVuaBam, 3).toString(), cbbChucVu_NhanVien);
		String gioitinh = tblNhanVien_NhanVien.getValueAt(viTriDongVuaBam, 3).toString();
		if (gioitinh.equals("Nam")) {
			rbtnNam_NhanVien.setSelected(true);
			rbtnNu_NhanVien.setSelected(false);
		} else {
			rbtnNu_NhanVien.setSelected(true);
			rbtnNam_NhanVien.setSelected(false);
		}
		String ngaysinh = tblNhanVien_NhanVien.getValueAt(viTriDongVuaBam, 3).toString();
		System.out.println("" + ngaysinh);
		String strngay, strthang, strnam;
		strngay = ngaysinh.substring(8, 10);
		strthang = ngaysinh.substring(5, 7);
		strnam = ngaysinh.substring(0, 4);
		int ngay, thang, nam;
		ngay = Integer.valueOf(strngay);
		thang = Integer.valueOf(strthang);
		nam = Integer.valueOf(strnam);
		cbbNgaySinh_NhanVien.setSelectedItem(String.valueOf(ngay));
		cbbThangSinh_NhanVien.setSelectedItem(String.valueOf(thang));
		cbbNamSinh_NhanVien.setSelectedItem(String.valueOf(nam));
		String ngayVaoLam = tblNhanVien_NhanVien.getValueAt(viTriDongVuaBam, 5).toString();
		System.out.println("" + ngayVaoLam);
		String strngayv, strthangv, strnamv;
		strngayv = ngayVaoLam.substring(8, 10);
		strthangv = ngayVaoLam.substring(5, 7);
		strnamv = ngayVaoLam.substring(0, 4);
		int ngayv, thangv, namv;
		ngayv = Integer.valueOf(strngayv);
		thangv = Integer.valueOf(strthangv);
		namv = Integer.valueOf(strnamv);
		cbbNgayVaoLam_NhanVien.setSelectedItem(String.valueOf(ngayv));
		cbbThangVaoLam_NhanVien.setSelectedItem(String.valueOf(thangv));
		cbbNamVaoLam_NhanVien.setSelectedItem(String.valueOf(namv));

	}// GEN-LAST:event_tblNhanVien_NhanVienMouseClicked

	private void jPanelMeComponentShown(java.awt.event.ComponentEvent evt) {// GEN-FIRST:event_jPanelMeComponentShown
		BufferedImage img = null;
		try {
			img = ImageIO.read(new File("com/quanlysp/images/gai.jpg"));
			icon = new ImageIcon(img);

			lblAbout.setIcon(icon);
		} catch (IOException e) {

		}
		try {
			playSound("mussic/mussic.wav");
		} catch (Exception e) {
			System.out.println("Lỗi ko file nhac" + e.getMessage());
		}

		ve();
	}// GEN-LAST:event_jPanelMeComponentShown

	public void playSound(String soundName) {
		try {
			AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(soundName).getAbsoluteFile());
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
		} catch (Exception ex) {
			System.out.println("Error with playing sound.");
			ex.printStackTrace();
		}
	}

	private void btnSua_NhanVienActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnSua_NhanVienActionPerformed
		String MaNhanVien, TenNhanVien, NgaySinh, GioiTinh, NgayVaoLam, ChucVu, DiaChi, SoDT, GhiChu;
		MaNhanVien = txtMaNhanVien_NhanVien.getText();
		if (rbtnNam_NhanVien.isSelected()) {
			GioiTinh = "Nam";
		} else {
			GioiTinh = "Nữ";
		}
		ChucVu = GetCbbSelected(cbbChucVu_NhanVien);
		TenNhanVien = txtTenNhanVien_NhanVien.getText();
		String ngay, thang, nam;
		ngay = cbbNgaySinh_NhanVien.getSelectedItem().toString();
		thang = cbbThangSinh_NhanVien.getSelectedItem().toString();
		nam = cbbNamSinh_NhanVien.getSelectedItem().toString();
		NgaySinh = nam + "-" + thang + "-" + ngay;
		String ngayv, thangv, namv;
		ngayv = cbbNgayVaoLam_NhanVien.getSelectedItem().toString();
		thangv = cbbThangVaoLam_NhanVien.getSelectedItem().toString();
		namv = cbbNamVaoLam_NhanVien.getSelectedItem().toString();
		NgayVaoLam = namv + "-" + thangv + "-" + ngayv;
		DiaChi = txtDiaChi_NhanVien.getText();
		SoDT = txtSoDT_NhanVien.getText();
		GhiChu = txtChuThich_NhanVien.getText();
		String cautruyvan = "update NhanVien set " + "TenNhanVien= N'" + TenNhanVien + "',NgaySinh='" + NgaySinh
				+ "',GioiTinh= N'" + GioiTinh + "',NgayVaoLam='" + NgayVaoLam + "',ChucVu=" + ChucVu + ",DiaChi=N'" + DiaChi
				+ "',SoDT='" + SoDT + "',GhiChu=N'" + GhiChu + "'where MaNhanVien=" + MaNhanVien;
		boolean kiemtra = KiemTraNhapNhanVien(1);
		System.out.println(cautruyvan);
		if (kiemtra) {
			Manager.connection.excuteQueryUpdate(cautruyvan);
			System.out.println("Đã sửa Thành Công");
		} else {
			ThongBao("Không thể sửa Nhân Viên", "lỗi", 2);
		}
		layDuLieuNhanVien();
	}// GEN-LAST:event_btnSua_NhanVienActionPerformed

	private void btnReset_NhanVienActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnReset_NhanVienActionPerformed
		ResNhanVien();

	}// GEN-LAST:event_btnReset_NhanVienActionPerformed

	public void ResNhanVien() {
		txtMaNhanVien_NhanVien.setText("");
		txtTenNhanVien_NhanVien.setText("");
		cbbNgaySinh_NhanVien.setSelectedItem("25");
		cbbThangSinh_NhanVien.setSelectedItem("12");
		cbbNamSinh_NhanVien.setSelectedItem("1996");
		cbbNgayVaoLam_NhanVien.setSelectedItem("25");
		cbbThangVaoLam_NhanVien.setSelectedItem("12");
		cbbNamVaoLam_NhanVien.setSelectedItem("1996");
		txtDiaChi_NhanVien.setText("");
		txtSoDT_NhanVien.setText("");
		txtChuThich_NhanVien.setText("");
		cbbChucVu_NhanVien.setSelectedIndex(0);
		rbtnNam_NhanVien.setSelected(true);
		rbtnNu_NhanVien.setSelected(false);

	}

	private void cbbThangItemStateChanged(java.awt.event.ItemEvent evt) {// GEN-FIRST:event_cbbThangItemStateChanged

		String thang = cbbThang.getSelectedItem().toString();
		DefaultComboBoxModel cbbmodel = new DefaultComboBoxModel();
		String thanght;
		if (tam == 0) {
			thanght = "0";
		} else {
			thanght = cbbNgay.getSelectedItem().toString();
		}
		tam = 1;

		if (thang.equals("4") || thang.equals("6") || thang.equals("9") || thang.equals("11")) {
			cbbNgay.setModel(cbbmodel);
			for (int i = 1; i < 31; i++) {
				cbbNgay.addItem(String.valueOf(i));
			}
			if (Integer.valueOf(thanght) < 31) {
				cbbNgay.setSelectedItem(thanght);
			}
		} else if (thang.equals("1") || thang.equals("3") || thang.equals("5") || thang.equals("7") || thang.equals("8")
				|| thang.equals("12") || thang.equals("10")) {

			cbbNgay.setModel(cbbmodel);
			for (int i = 1; i < 32; i++) {
				cbbNgay.addItem(String.valueOf(i));
			}
			if (Integer.valueOf(thanght) < 32) {
				cbbNgay.setSelectedItem(thanght);
			}
		} else {
			cbbNgay.setModel(cbbmodel);
			for (int i = 1; i < 29; i++) {
				cbbNgay.addItem(String.valueOf(i));
			}
			if (Integer.valueOf(thanght) < 29) {
				cbbNgay.setSelectedItem(thanght);
			}
		}
	}// GEN-LAST:event_cbbThangItemStateChanged

	private void cbbThangActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_cbbThangActionPerformed

	}// GEN-LAST:event_cbbThangActionPerformed

	private void btnThem_KhachHangActionPerformed(java.awt.event.ActionEvent evt) throws SQLException {// GEN-FIRST:event_btnThem_KhachHangActionPerformed
		String MaKhachHang, TenKhachHang, NgaySinh, GioiTinh, DiaChi, SDT,  ChuThich;
		MaKhachHang = txtMaKhachHang_KhachHang.getText();
		TenKhachHang = txtTenKhachHang_KhachHang.getText();
		String ngay, thang, nam;
		ngay = cbbNgay.getSelectedItem().toString();
		thang = cbbThang.getSelectedItem().toString();
		nam = cbbNam.getSelectedItem().toString();
		NgaySinh = nam + "-" + thang + "-" + ngay;
		if (rbtnNam_KhachHang.isSelected()) {
			GioiTinh = "Nam";
		} else {
			GioiTinh = "Nữ";
		}
		DiaChi = txtDiaChi_KhachHang.getText();
		SDT = txtSDT_KhachHang.getText();
		ChuThich = txtGhiChu_KhachHang.getText();

		String cautruyvan = "insert into KhachHang(MaKhachHang, TenKhachHang, GioiTinh, DiaChi, SDT, ChuThich, NgaySinh) values(" + MaKhachHang + ", N'" + TenKhachHang +
				"', N'" +  GioiTinh+ "', N'" + DiaChi + "', N'" + SDT + "', N'" + ChuThich + "','" + NgaySinh+ "')";
		boolean kiemtra = KiemTraNhapKhachHang(0);
		if (kiemtra) {
			String sql = "Select * from khachhang where MaKhachHang = '" + MaKhachHang+"'";
			System.out.println(sql);
			ResultSet xac_nhan = Manager.connection.excuteQuerySelect(sql);
			if (xac_nhan.next()) {
				ThongBao("Mã khách hàng đã tồn tại", "lỗi thêm khách hàng", JOptionPane.ERROR_MESSAGE);

			}
			Manager.connection.excuteQueryUpdate(cautruyvan);
			System.out.println("Đã Thêm Thành Công");
			System.out.println(cautruyvan);
			// xác nhận bằng null khi xác nhận ko tìm thấy hàng nào, ra bảng trống, ngược lại ví dụ tìm thấy hàng nào đó thì nó k phải null vì nó đang select  và tìm thấy cái gì đấy trong bảng, ok

		} else {
			System.out.println("Thêm Thất Bại");
		}
		LayDuLieuKhachHang();

	}// GEN-LAST:event_btnThem_KhachHangActionPerformed

	private void tblKhachHang_KhachHangMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_tblKhachHang_KhachHangMouseClicked
		int viTriDongVuaBam = tblKhachHang_KhachHang.getSelectedRow();

		txtMaKhachHang_KhachHang.setText(tblKhachHang_KhachHang.getValueAt(viTriDongVuaBam, 1).toString());
		txtTenKhachHang_KhachHang.setText(tblKhachHang_KhachHang.getValueAt(viTriDongVuaBam, 2).toString());
		txtDiaChi_KhachHang.setText(tblKhachHang_KhachHang.getValueAt(viTriDongVuaBam, 5).toString());
		txtSDT_KhachHang.setText(tblKhachHang_KhachHang.getValueAt(viTriDongVuaBam, 6).toString());
		txtGhiChu_KhachHang.setText(tblKhachHang_KhachHang.getValueAt(viTriDongVuaBam, 8).toString());
		String gioitinh = tblKhachHang_KhachHang.getValueAt(viTriDongVuaBam, 4).toString();

		if (gioitinh.equals("Nam")) {
			rbtnNam_KhachHang.setSelected(true);
			rbtnNu_KhachHang.setSelected(false);
		} else {
			rbtnNam_KhachHang.setSelected(false);
			rbtnNu_KhachHang.setSelected(true);
		}
		String ngaysinh = tblKhachHang_KhachHang.getValueAt(viTriDongVuaBam, 3).toString();
		System.out.println("" + ngaysinh);
		String strngay, strthang, strnam;
		strngay = ngaysinh.substring(8, 10);
		strthang = ngaysinh.substring(5, 7);
		strnam = ngaysinh.substring(0, 4);
		int ngay, thang, nam;
		ngay = Integer.valueOf(strngay);
		thang = Integer.valueOf(strthang);
		nam = Integer.valueOf(strnam);
		cbbNgay.setSelectedItem(String.valueOf(ngay));
		cbbThang.setSelectedItem(String.valueOf(thang));
		cbbNam.setSelectedItem(String.valueOf(nam));
		lblMaKhachHang_KhachHang.setForeground(Color.black);
		lblTenKhachHang_KhachHang.setForeground(Color.black);
		lblDiaChi_KhachHang.setForeground(Color.black);
		lblSDT_KhachHang.setForeground(Color.black);
	}// GEN-LAST:event_tblKhachHang_KhachHangMouseClicked

	private void btnSua_KhachHangActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnSua_KhachHangActionPerformed
		String MaKhachHang, TenKhachHang, NgaySinh, GioiTinh, DiaChi, SDT,  ChuThich;
		MaKhachHang = txtMaKhachHang_KhachHang.getText();
		TenKhachHang = txtTenKhachHang_KhachHang.getText();
		String ngay, thang, nam;
		ngay = cbbNgay.getSelectedItem().toString();
		thang = cbbThang.getSelectedItem().toString();
		nam = cbbNam.getSelectedItem().toString();
		NgaySinh = nam + "-" + thang + "-" + ngay;
		if (rbtnNam_KhachHang.isSelected()) {
			GioiTinh = "Nam";
		} else {
			GioiTinh = "Nữ";
		}
		DiaChi = txtDiaChi_KhachHang.getText();
		SDT = txtSDT_KhachHang.getText();
		ChuThich = txtGhiChu_KhachHang.getText();
		String cautruyvan = "update  KhachHang set " + "TenKhachHang= N'" + TenKhachHang + "' , NgaySinh='" + NgaySinh
				+ "' ,GioiTinh=N'" + GioiTinh + "',DiaChi=N'" + DiaChi + "',SDT=N'" + SDT + "',ChuThich= N'" + ChuThich
				+ "'where MaKhachHang=" + MaKhachHang;
		System.out.println(cautruyvan);
		boolean kiemtra = KiemTraNhapKhachHang(1);
		if (kiemtra) {
			Manager.connection.excuteQueryUpdate(cautruyvan);
			System.out.println("Đã sủa Thành Công");
		} else {
			System.out.println("Sửa thất bại");
		}
		LayDuLieuKhachHang();
	}// GEN-LAST:event_btnSua_KhachHangActionPerformed

	private void btnReset_KhachHangActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnReset_KhachHangActionPerformed
		ResKhachHang();
	}// GEN-LAST:event_btnReset_KhachHangActionPerformed

	public void ResKhachHang() {
		String MaKhachHang, TenKhachHang, NgaySinh, GioiTinh, DiaChi, SDT, LoaiKhachHang, ChuThich;
		txtMaKhachHang_KhachHang.setText("");
		txtTenKhachHang_KhachHang.setText("");
		cbbNgay.setSelectedIndex(1);
		cbbThang.setSelectedIndex(1);
		cbbNam.setSelectedIndex(20);
		txtDiaChi_KhachHang.setText("");
		txtSDT_KhachHang.setText("");
		txtGhiChu_KhachHang.setText("");
	}

	private void jPanelChucVuComponentShown(java.awt.event.ComponentEvent evt) {// GEN-FIRST:event_jPanelChucVuComponentShown
		layDuLieuChucVu();
	}// GEN-LAST:event_jPanelChucVuComponentShown

	private void tblChucVu_ChucVuMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_tblChucVu_ChucVuMouseClicked
		int viTriDongVuaBam = tblChucVu_ChucVu.getSelectedRow();
		txtMaChucVu_ChucVu.setText(tblChucVu_ChucVu.getValueAt(viTriDongVuaBam, 1).toString());
		txtTenChucVu_ChucVu.setText(tblChucVu_ChucVu.getValueAt(viTriDongVuaBam, 2).toString());
		txtChuThich_ChucVu.setText(tblChucVu_ChucVu.getValueAt(viTriDongVuaBam, 3).toString());
		layDuLieuNhanVienofChucVu(txtMaChucVu_ChucVu.getText());

	}// GEN-LAST:event_tblChucVu_ChucVuMouseClicked

	private void btnThem_ChucVuActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnThem_ChucVuActionPerformed
		String MaChucVu, TenChucVu, DiaChi, GhiChu;
		MaChucVu = txtMaChucVu_ChucVu.getText();
		TenChucVu = txtTenChucVu_ChucVu.getText();
		GhiChu = txtChuThich_ChucVu.getText();
		String cautruyvan = "insert into ChucVu values(" + " N'" + TenChucVu + "', N'" + GhiChu + "')";
		System.out.println(cautruyvan);
		boolean kiemtra = true;
		if (kiemtra) {
			Manager.connection.excuteQueryUpdate(cautruyvan);
			System.out.println("Đã Thêm Thành Công");
		} else {
			ThongBao("Không thể Thêm chức Vụ", "lỗi", 2);
		}
		layDuLieuChucVu();
	}// GEN-LAST:event_btnThem_ChucVuActionPerformed

	private void btnSua_ChucVuActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnSua_ChucVuActionPerformed
		String MaChucVu, TenChucVu, DiaChi, GhiChu;
		MaChucVu = txtMaChucVu_ChucVu.getText();
		TenChucVu = txtTenChucVu_ChucVu.getText();
		GhiChu = txtChuThich_ChucVu.getText();
		String cautruyvan = "update  ChucVu set TenChucVu=" + " N'" + TenChucVu + "',GhiChu= N'" + GhiChu
				+ "'Where MaChucVu=" + MaChucVu;
		System.out.println(cautruyvan);
		boolean kiemtra = true;
		if (kiemtra) {
			Manager.connection.excuteQueryUpdate(cautruyvan);
			System.out.println("Đã Sửa Thành Công");
		} else {
			ThongBao("Không thể Sửa chức Vụ", "lỗi", 2);
		}
		layDuLieuChucVu();
	}// GEN-LAST:event_btnSua_ChucVuActionPerformed

	private void btnXoaNeuRong_ChucVuActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnXoaNeuRong_ChucVuActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_btnXoaNeuRong_ChucVuActionPerformed

	private void cbbThangSinh_NhanVienItemStateChanged(java.awt.event.ItemEvent evt) {// GEN-FIRST:event_cbbThangSinh_NhanVienItemStateChanged
		String thang = cbbThangSinh_NhanVien.getSelectedItem().toString();
		DefaultComboBoxModel cbbmodel = new DefaultComboBoxModel();
		String thanght;
		if (tam == 0) {
			thanght = "0";
		} else {
			thanght = cbbNgaySinh_NhanVien.getSelectedItem().toString();
		}
		tam = 1;

		if (thang.equals("4") || thang.equals("6") || thang.equals("9") || thang.equals("11")) {
			cbbNgaySinh_NhanVien.setModel(cbbmodel);
			for (int i = 1; i < 31; i++) {
				cbbNgaySinh_NhanVien.addItem(String.valueOf(i));
			}
			if (Integer.valueOf(thanght) < 31) {
				cbbNgaySinh_NhanVien.setSelectedItem(thanght);
			}
		} else if (thang.equals("1") || thang.equals("3") || thang.equals("5") || thang.equals("7") || thang.equals("8")
				|| thang.equals("12") || thang.equals("10")) {

			cbbNgaySinh_NhanVien.setModel(cbbmodel);
			for (int i = 1; i < 32; i++) {
				cbbNgaySinh_NhanVien.addItem(String.valueOf(i));
			}
			if (Integer.valueOf(thanght) < 32) {
				cbbNgaySinh_NhanVien.setSelectedItem(thanght);
			}
		} else {
			cbbNgaySinh_NhanVien.setModel(cbbmodel);
			for (int i = 1; i < 29; i++) {
				cbbNgaySinh_NhanVien.addItem(String.valueOf(i));
			}
			if (Integer.valueOf(thanght) < 29) {
				cbbNgaySinh_NhanVien.setSelectedItem(thanght);
			}
		}

	}// GEN-LAST:event_cbbThangSinh_NhanVienItemStateChanged

	private void cbbThangVaoLam_NhanVienItemStateChanged(java.awt.event.ItemEvent evt) {// GEN-FIRST:event_cbbThangVaoLam_NhanVienItemStateChanged
		String thang = cbbThangVaoLam_NhanVien.getSelectedItem().toString();
		DefaultComboBoxModel cbbmodel = new DefaultComboBoxModel();
		String thanght;
		if (tam == 0) {
			thanght = "0";
		} else {
			thanght = cbbNgayVaoLam_NhanVien.getSelectedItem().toString();
		}
		tam = 1;

		if (thang.equals("4") || thang.equals("6") || thang.equals("9") || thang.equals("11")) {
			cbbNgayVaoLam_NhanVien.setModel(cbbmodel);
			for (int i = 1; i < 31; i++) {
				cbbNgayVaoLam_NhanVien.addItem(String.valueOf(i));
			}
			if (Integer.valueOf(thanght) < 31) {
				cbbNgayVaoLam_NhanVien.setSelectedItem(thanght);
			}
		} else if (thang.equals("1") || thang.equals("3") || thang.equals("5") || thang.equals("7") || thang.equals("8")
				|| thang.equals("12") || thang.equals("10")) {

			cbbNgayVaoLam_NhanVien.setModel(cbbmodel);
			for (int i = 1; i < 32; i++) {
				cbbNgayVaoLam_NhanVien.addItem(String.valueOf(i));
			}
			if (Integer.valueOf(thanght) < 32) {
				cbbNgayVaoLam_NhanVien.setSelectedItem(thanght);
			}
		} else {
			cbbNgayVaoLam_NhanVien.setModel(cbbmodel);
			for (int i = 1; i < 29; i++) {
				cbbNgayVaoLam_NhanVien.addItem(String.valueOf(i));
			}
			if (Integer.valueOf(thanght) < 29) {
				cbbNgayVaoLam_NhanVien.setSelectedItem(thanght);
			}
		}

	}// GEN-LAST:event_cbbThangVaoLam_NhanVienItemStateChanged

	private void jTabbedPaneNhanVienComponentShown(java.awt.event.ComponentEvent evt) {// GEN-FIRST:event_jTabbedPaneNhanVienComponentShown
		rbtnNam_NhanVien.setSelected(true);
		layDuLieuNhanVien();
		cbbChucVu_NhanVien.setModel(LayDuLieucbb("ChucVu", "TenChucVu", "MaChucVu"));
		for (int i = 1; i < 32; i++) {
			cbbNgaySinh_NhanVien.addItem(String.valueOf(i));
		}
		for (int i = 1; i < 13; i++) {
			cbbThangSinh_NhanVien.addItem(String.valueOf(i));
		}
		for (int i = 2016; i > 1950; i--) {
			cbbNamSinh_NhanVien.addItem(String.valueOf(i));
		}
		for (int i = 1; i < 32; i++) {
			cbbNgayVaoLam_NhanVien.addItem(String.valueOf(i));
		}
		for (int i = 1; i < 13; i++) {
			cbbThangVaoLam_NhanVien.addItem(String.valueOf(i));
		}
		for (int i = 2016; i > 2000; i--) {
			cbbNamVaoLam_NhanVien.addItem(String.valueOf(i));
		}
	}// GEN-LAST:event_jTabbedPaneNhanVienComponentShown

	private void rbtnNam_NhanVienActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_rbtnNam_NhanVienActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_rbtnNam_NhanVienActionPerformed

	private void btnXoa_SanPhamActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnXoa_SanPhamActionPerformed
		XoaSanPham();
		ThongBao("Đã xóa sản phẩm", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
		LayDuLieuSanPham();
	}// GEN-LAST:event_btnXoa_SanPhamActionPerformed

	public void XoaSanPham() {
		String MaSanPham = txtMaSanPham_SanPham.getText();
		String sql = "delete FROM sanpham where MaSanPham=" + MaSanPham;

		Manager.connection.excuteQueryUpdate(sql);

	}

	private void btnXoa_KhachHangActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnXoa_KhachHangActionPerformed

		String MaKhachHang = txtMaKhachHang_KhachHang.getText();
		String sql = "delete FROM KhachHang where MaKhachHang=" + MaKhachHang;

		Manager.connection.excuteQueryUpdate(sql);
		ThongBao("Đã xóa thành công", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
		LayDuLieuKhachHang();


	}// GEN-LAST:event_btnXoa_KhachHangActionPerformed

	private void btnXoa_NhanVienActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnXoa_NhanVienActionPerformed

		String MaNhanVien = txtMaNhanVien_NhanVien.getText();

		String sql = "delete FROM nhanvien where MaNhanVien=" + MaNhanVien;

		Manager.connection.excuteQueryUpdate(sql);
		ThongBao("Đã xóa thành công", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
		layDuLieuNhanVien();


	}// GEN-LAST:event_btnXoa_NhanVienActionPerformed

	private void txtTenKhachHang_KhachHangActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtTenKhachHang_KhachHangActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_txtTenKhachHang_KhachHangActionPerformed

	private void txtTenKhachHang_KhachHangKeyPressed(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_txtTenKhachHang_KhachHangKeyPressed

	}// GEN-LAST:event_txtTenKhachHang_KhachHangKeyPressed

	private void txtTenKhachHang_KhachHangKeyTyped(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_txtTenKhachHang_KhachHangKeyTyped

	}// GEN-LAST:event_txtTenKhachHang_KhachHangKeyTyped

	private void txtTenKhachHang_KhachHangFocusLost(java.awt.event.FocusEvent evt) {// GEN-FIRST:event_txtTenKhachHang_KhachHangFocusLost
		lblTenKhachHang_KhachHang.setForeground(Color.black);
	}// GEN-LAST:event_txtTenKhachHang_KhachHangFocusLost

	private void txtDiaChi_KhachHangFocusLost(java.awt.event.FocusEvent evt) {// GEN-FIRST:event_txtDiaChi_KhachHangFocusLost
		lblDiaChi_KhachHang.setForeground(Color.black);
	}// GEN-LAST:event_txtDiaChi_KhachHangFocusLost

	private void txtSDT_KhachHangFocusLost(java.awt.event.FocusEvent evt) {// GEN-FIRST:event_txtSDT_KhachHangFocusLost
		lblSDT_KhachHang.setForeground(Color.black);
	}// GEN-LAST:event_txtSDT_KhachHangFocusLost

	private void jPanelHoaDonComponentShown(java.awt.event.ComponentEvent evt) {// GEN-FIRST:event_jPanelHoaDonComponentShown
		LayDuLieuHoaDon();
		cbbNhanVien_HoaDon.setModel(LayDuLieucbb("NhanVien", "TenNhanVien", "MaNhanVien"));
		cbbKhachHang_HoaDon.setModel(LayDuLieucbb("KhachHang", "TenKhachHang", "MaKhachHang"));
		cbbSanPham_ChiTietHoaDon.setModel(LayDuLieucbb("SanPham", "TenSanPham", "MaSanPham"));
		txtNgayLapHoaDon_HoaDon.setText(year + "-" + month + "-" + day);
	}// GEN-LAST:event_jPanelHoaDonComponentShown

	private void lblNgayLapMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_lblNgayLapMouseClicked
		FormNgay frmngaylap = new FormNgay();
		frmngaylap.show();
	}// GEN-LAST:event_lblNgayLapMouseClicked

	private void btnReset_HoaDonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnReset_HoaDonActionPerformed
		cbbKhachHang_HoaDon.setSelectedIndex(1);
		cbbNhanVien_HoaDon.setSelectedIndex(1);
		txtNgayLapHoaDon_HoaDon.setText(year + "-" + month + "-" + day);
		txtTongTien_HoaDon.setText("");
		txtGhiChu_HoaDon.setText("");

	}// GEN-LAST:event_btnReset_HoaDonActionPerformed

	private void btnSua_HoaDonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnSua_HoaDonActionPerformed
		String MaHoaDon, MaKhachHang, MaNhanVien, NgayLapHoaDon, TongTien, ChuThich;
		MaHoaDon = txtMaPhieuMua_HoaDon.getText();
		MaKhachHang = GetCbbSelected(cbbKhachHang_HoaDon);
		MaNhanVien = GetCbbSelected(cbbNhanVien_HoaDon);
		NgayLapHoaDon = txtNgayLapHoaDon_HoaDon.getText();
		TongTien = txtTongTien_HoaDon.getText();
		ChuThich = txtGhiChu_HoaDon.getText();
		String cautruyvan = "update HoaDon set MaKhachHang=" + MaKhachHang + ",TongTien=" + TongTien
				+ ",NgayLapHoaDon='" + NgayLapHoaDon + "',GhiChu=N'" + ChuThich + "' where MaHoaDon=" + MaHoaDon;
		System.out.println(cautruyvan);
		boolean kiemtra = KiemTraNhapHoaDon(1);
		if (kiemtra) {
			Manager.connection.excuteQueryUpdate(cautruyvan);
			System.out.println("Đã Thêm Thành Công");
		} else {
			ThongBao("Không thể ", "Thêm Hóa Đơn", 2);
		}
		LayDuLieuHoaDon();
	}// GEN-LAST:event_btnSua_HoaDonActionPerformed

	private void btnXoa_HoaDonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnXoa_HoaDonActionPerformed
		if (!txtMaPhieuMua_HoaDon.getText().equals("")) {
			String MaHoaDon = txtMaPhieuMua_HoaDon.getText();
			String cautruyvan = "DELETE FROM hoadon WHERE MaHoaDon=" + MaHoaDon;
			// String ctvKiemThu = "select * from HoaDon HoaDon.MaHoaDon=" + MaHoaDon;
			// ResultSet rs1 = Manager.connection.excuteQuerySelect(cautruyvan);
			// System.out.println(ctvKiemThu);

			Manager.connection.excuteQueryUpdate(cautruyvan);
			System.out.println("đã xóa");
			LayDuLieuHoaDon();

		} else {
			ThongBao("bạn chưa chọn hóa đơn để xóa", "xóa bằng niềm tin à!khi không biết xóa cái nào", 2);
		}
	}// GEN-LAST:event_btnXoa_HoaDonActionPerformed

	private void btnThem_HoaDonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnThem_HoaDonActionPerformed
		String MaKhachHang, MaNhanVien, NgayLapHoaDon, TongTien, ChuThich;
		MaKhachHang = GetCbbSelected(cbbKhachHang_HoaDon);
		MaNhanVien = GetCbbSelected(cbbNhanVien_HoaDon);
		NgayLapHoaDon = txtNgayLapHoaDon_HoaDon.getText();
		TongTien = txtTongTien_HoaDon.getText();
		ChuThich = txtGhiChu_HoaDon.getText();
		String cautruyvan = "insert into HoaDon(MaKhachHang,MaNhanVien,TongTien,GhiChu) values(" + MaKhachHang + ","
				+ MaNhanVien + "," + 0 + ",N'" + ChuThich + "')";
		System.out.println(cautruyvan);
		boolean kiemtra = KiemTraNhapHoaDon(0);
		if (kiemtra) {
			Manager.connection.excuteQueryUpdate(cautruyvan);
			System.out.println("Đã Thêm Thành Công");
		} else {
			System.out.println("thất bại");
		}
		LayDuLieuHoaDon();
	}// GEN-LAST:event_btnThem_HoaDonActionPerformed

	private void tblHoaDon_HoaDonMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_tblHoaDon_HoaDonMouseClicked
		int viTriDongVuaBam = tblHoaDon_HoaDon.getSelectedRow();
		txtMaPhieuMua_HoaDon.setText(tblHoaDon_HoaDon.getValueAt(viTriDongVuaBam, 1).toString());
		txtNgayLapHoaDon_HoaDon.setText(tblHoaDon_HoaDon.getValueAt(viTriDongVuaBam, 4).toString());
		txtTongTien_HoaDon.setText(tblHoaDon_HoaDon.getValueAt(viTriDongVuaBam, 5).toString());
		txtGhiChu_HoaDon.setText(tblHoaDon_HoaDon.getValueAt(viTriDongVuaBam, 6).toString());
		setSelectedCombobox(tblHoaDon_HoaDon.getValueAt(viTriDongVuaBam, 3).toString(), cbbNhanVien_HoaDon);
		setSelectedCombobox(tblHoaDon_HoaDon.getValueAt(viTriDongVuaBam, 2).toString(), cbbKhachHang_HoaDon);
		// LayDuLieuChiTietHoaDon(txtMaPhieuMua_HoaDon.getText());
		if (tblCTHoaDon_ChiTietHoaDon.getRowCount() > 0) {
			cbbSanPham_ChiTietHoaDon.setModel(LayDuLieucbb("SanPham", "TenSanPham", "MaSanPham"));
			txtMaCTH_ChiTietHoaDon.setText(tblCTHoaDon_ChiTietHoaDon.getValueAt(0, 1).toString());
			txtMaHoaDon_ChiTietHoaDon.setText(tblCTHoaDon_ChiTietHoaDon.getValueAt(0, 2).toString());
			txtSoLuong_ChiTietHoaDon.setText(tblCTHoaDon_ChiTietHoaDon.getValueAt(0, 4).toString());
			txtTongTien_ChiTietHoaDon.setText(tblCTHoaDon_ChiTietHoaDon.getValueAt(0, 5).toString());
			txtGhiChu_ChiTietHoaDon.setText(tblCTHoaDon_ChiTietHoaDon.getValueAt(0, 6).toString());
			setSelectedCombobox(tblCTHoaDon_ChiTietHoaDon.getValueAt(0, 3).toString(), cbbSanPham_ChiTietHoaDon);
		} else {
			reset_chitiethoadon();
			txtMaHoaDon_ChiTietHoaDon.setText(txtMaPhieuMua_HoaDon.getText());
		}
	}// GEN-LAST:event_tblHoaDon_HoaDonMouseClicked

	private void formWindowOpened(java.awt.event.WindowEvent evt) {// GEN-FIRST:event_formWindowOpened
		if (ViewDangNhap.quyen == 2) {
			System.out.println("phạm hoàng huy");
		}
	}// GEN-LAST:event_formWindowOpened

	public boolean KiemTraNhapKhachHang(int ts) {
		String MaKhachHang, TenKhachHang, Ngaysinh, DiaChi, SDT;
		boolean kiemtra = false;
		MaKhachHang = txtMaKhachHang_KhachHang.getText();
		TenKhachHang = txtTenKhachHang_KhachHang.getText();
		String ngay, thang, nam, ThongBao = "";
		ngay = cbbNgay.getSelectedItem().toString();
		thang = cbbThang.getSelectedItem().toString();
		nam = cbbNam.getSelectedItem().toString();
		Ngaysinh = nam + "-" + thang + "-" + ngay;
		DiaChi = txtDiaChi_KhachHang.getText();
		SDT = txtSDT_KhachHang.getText();
		if (MaKhachHang.equals("") && ts == 1) {
			ThongBao += "bạn chưa chọn khách hàng để lấy  Mã Khách Hàng\n";
			lblMaKhachHang_KhachHang.setForeground(Color.red);
		}
		if (TenKhachHang.equals("")) {
			ThongBao += "bạn chưa Nhập Tên Khách Hàng\n";
			lblTenKhachHang_KhachHang.setForeground(Color.red);
		}
		if (DiaChi.equals("")) {
			lblDiaChi_KhachHang.setForeground(Color.red);
			ThongBao += "bạn chưa Nhập Địa Chỉ\n";
		}
		if (SDT.equals("")) {
			lblSDT_KhachHang.setForeground(Color.red);
			ThongBao += "bạn chưa Nhập Số ĐT \n";
		}
		if (ThongBao.equals("")) {
			kiemtra = true;
			lblDiaChi_KhachHang.setForeground(Color.black);
			lblSDT_KhachHang.setForeground(Color.black);
			lblMaKhachHang_KhachHang.setForeground(Color.black);
			lblTenKhachHang_KhachHang.setForeground(Color.black);
		} else {
			kiemtra = false;
			ThongBao(ThongBao, "lỗi nhập liệu", 2);
		}
		return kiemtra;
	}

	public boolean KiemTraNhapHoaDon(int ts) {
		String MaHoaDon, MaNhanVien, KhachHang, NgayLap, TongTien, ThongBao = "";
		boolean kiemtra = false;
		MaHoaDon = txtMaPhieuMua_HoaDon.getText();
		MaNhanVien = GetCbbSelected(cbbNhanVien_HoaDon);

		KhachHang = GetCbbSelected(cbbKhachHang_HoaDon);
		NgayLap = txtNgayLapHoaDon_HoaDon.getText();
		TongTien = txtTongTien_HoaDon.getText();
		if (MaHoaDon.equals("") && ts == 1) {
			ThongBao += "bạn chưa chọn Hóa Đơn để lấy  Mã Hóa Dơn\n";
			lblMaHoaDon_HoaDon.setForeground(Color.red);
		}
		if (MaNhanVien.equals("")) {
			ThongBao += "bạn chưa Chọn Nhân Viên\n";
		}
		if (KhachHang.equals("")) {
			ThongBao += "bạn chưa Chọn Khách Hàng\n";
		}
		if (NgayLap.equals("")) {
			lblNgayLap.setForeground(Color.red);
			ThongBao += "bạn chưa Nhập Ngày Lập\n";
		}
		if (TongTien.equals("")) {
			txtTongTien_HoaDon.setText("0");
		}
		if (ThongBao.equals("")) {
			kiemtra = true;
			lblDiaChi_KhachHang.setForeground(Color.black);
			lblNgayLap.setForeground(Color.black);
			lblTongTien_HoaDon.setForeground(Color.black);
		} else {
			kiemtra = false;
			ThongBao(ThongBao, "lỗi nhập liệu", 2);
		}
		return kiemtra;
	}

	public boolean KiemTraNhapNhanVien(int ts) {
		String MaNhanVien, TenNhanVien, DiaChi, SDT;
		boolean kiemtra = false;
		MaNhanVien = txtMaNhanVien_NhanVien.getText();
		TenNhanVien = txtTenNhanVien_NhanVien.getText();
		String ThongBao = "";
		DiaChi = txtDiaChi_NhanVien.getText();
		SDT = txtSoDT_NhanVien.getText();
		if (MaNhanVien.equals("") && ts == 1) {
			ThongBao += "bạn chưa chọn khách hàng để lấy  Mã Khách Hàng\n";
			lblMaNhanVien_NhanVien.setForeground(Color.red);
		}
		if (TenNhanVien.equals("")) {
			ThongBao += "bạn chưa Nhập Tên Nhân Viên\n";
			lblTenNhanVien_NhanVien.setForeground(Color.red);
		}
		if (DiaChi.equals("")) {
			lblDiaChi_NhanVien.setForeground(Color.red);
			ThongBao += "bạn chưa Nhập Địa Chỉ\n";
		}
		if (SDT.equals("")) {
			lblSDT_NhanVien.setForeground(Color.red);
			ThongBao += "bạn chưa Nhập Số ĐT \n";
		}
		if (ThongBao.equals("")) {
			kiemtra = true;
			lblMaNhanVien_NhanVien.setForeground(Color.black);
			lblSDT_NhanVien.setForeground(Color.black);
			lblTenNhanVien_NhanVien.setForeground(Color.black);
			lblDiaChi_NhanVien.setForeground(Color.black);
		} else {
			kiemtra = false;
			ThongBao(ThongBao, "lỗi nhập liệu", 2);
		}
		return kiemtra;
	}

	public boolean KiemTraNhanSanPham(int ts) {
		String MaSanPham, TenSanPham, GiaNhap, GiaBan, TonKho;
		boolean kiemtra = false;
		MaSanPham = txtMaSanPham_SanPham.getText();
		TenSanPham = txtTenSanPham_SanPham.getText();
		TonKho = txtTonKho_SanPham.getText().trim();
		String ThongBao = "";
		GiaNhap = txtGiaNhap_SanPham.getText();
		GiaBan = txtGiaBan_SanPham.getText();
		if (MaSanPham.equals("") && ts == 1) {
			ThongBao += "bạn chưa chọn khách hàng để lấy  Mã Khách Hàng\n";
			lblMaSanPham_SanPham.setForeground(Color.red);
		}
		if (TenSanPham.equals("")) {
			ThongBao += "bạn chưa Nhập Tên Sản Phẩm\n";
			lblTenSanPham_SanPham.setForeground(Color.red);
		}
		if (GiaNhap.equals("")) {
			lblGiaNhap_SanPham.setForeground(Color.red);
			ThongBao += "bạn chưa Nhập Giá Bán\n";
		}
		if (GiaBan.equals("")) {
			lblGiaBan.setForeground(Color.red);
			ThongBao += "bạn chưa Nhập Giá Bán \n";
		}
		try {
			int bien = Integer.valueOf(GiaNhap);
		} catch (Exception e) {
			ThongBao += "Giá Nhập Phải là số !\n";
		}
		try {
			int bien = Integer.valueOf(GiaBan);
		} catch (Exception e) {
			ThongBao += "Giá Bán Phải là số !\n";
		}
		try {
			if (Integer.valueOf(GiaNhap) > Integer.valueOf(GiaBan)) {
				lblGiaBan.setForeground(Color.red);
				ThongBao += "Nhập Giá Bán Phải Lớn Hơn Giá Nhập \n";
			}
		} catch (Exception e) {
		}

		if (TonKho.equals("")) {
			lblTonKho_SanPham.setForeground(Color.red);
			ThongBao += "bạn chưa Nhập Tồn Kho \n";
		}
		if (ThongBao.equals("")) {
			kiemtra = true;
			lblTenSanPham_SanPham.setForeground(Color.black);
			lblMaSanPham_SanPham.setForeground(Color.black);
			lblGiaBan.setForeground(Color.black);
			lblTonKho_SanPham.setForeground(Color.black);
			lblGiaNhap_SanPham.setForeground(Color.black);
		} else {
			kiemtra = false;
			ThongBao(ThongBao, "lỗi nhập liệu", 2);
		}
		return kiemtra;
	}

	public int GetGiaSanPham(String MaSP) {
		int Gia = 0;
		String cautruyvan = "select * from sanpham where MaSanPham=" + MaSP;
		ResultSet rs = Manager.connection.excuteQuerySelect(cautruyvan);
		try {
			if (rs.next()) {
				Gia = rs.getInt("Giaban");
			}
		} catch (SQLException ex) {
			System.out.println(ex.toString());
		}
		return Gia;
	}

	public String GetCbbSelected(JComboBox cbb) {
		Object[] obj = cbb.getSelectedObjects();
		displayvalueModel item = (displayvalueModel) obj[0];
		return item.displayvalue.toString();

	}

	public String GetMaSanPham() {
		return txtMaSanPham_SanPham.getText();
	}

	public void ThongBao(String noiDungThongBao, String tieuDeThongBao, int icon) {
		JOptionPane.showMessageDialog(new JFrame(), noiDungThongBao, tieuDeThongBao, icon);
	}

	public void setSelectedCombobox(String cbbselected, JComboBox cbb) {
		for (int i = 0; i < cbb.getItemCount(); i++) {
			Object obj = cbb.getItemAt(i);
			if (obj != null) {
				displayvalueModel m = (displayvalueModel) obj;
				if (cbbselected.trim().equals(m.displayMember)) {
					cbb.setSelectedItem(m);
				}
			}
		}
	}

	public void LayDuLieuHoaDon() {
		String cautruyvan = "";
		cautruyvan = "select MaHoaDon,KhachHang.TenKhachHang as TenKhachHang,NhanVien.TenNhanVien,TongTien,NgayLapHoaDon,HoaDon.GhiChu "
				+ "from hoadon,khachhang,nhanvien where hoadon.MaKhachHang =khachhang.MaKhachHang and hoadon.MaNhanVien=nhanvien.MaNhanVien ";
		ResultSet rs = Manager.connection.excuteQuerySelect(cautruyvan);
		Object[] obj = new Object[] { "STT", "Mã hóa đơn", "Khách Hàng ", "Nhân viên", "Ngày lập hóa dơn", "tổng tiền",
				"Chú Thích" };
		DefaultTableModel tableModel = new DefaultTableModel(obj, 0);
		tblHoaDon_HoaDon.setModel(tableModel);
		int c = 0;
		try {
			while (rs.next()) {
				Object[] item = new Object[7];
				c++;
				item[0] = c;
				item[1] = rs.getInt("MaHoaDon");
				item[2] = rs.getString("TenKhachHang");
				item[3] = rs.getString("TenNhanVien");
				item[4] = rs.getString("NgayLapHoaDon");
				item[5] = rs.getInt("TongTien");
				item[6] = rs.getString("GhiChu");
				tableModel.addRow(item);
			}
		} catch (SQLException ex) {
			System.out.println(ex.toString());
		}
	}

	/*
	 * select
	 * MaSanPham,SanPham.TenSanPham,SanPham.MaLoaiSanPham,GiaNhap,GiaBan,HangsanXuat
	 * .TenHangSanXuat as THSX,TonKho,LoaiSanPham.TenLoaiSanPham as
	 * TenLoaiSanPham,Image,SanPham.ChuThich from SanPham,LoaiSanPham,HangSanXuat
	 * where SanPham.MaLoaiSanPham=LoaiSanPham.MaLoaiSanPham and
	 * SanPham.HangSanXuat=HangSanXuat.MaHangSanXuat and TrangThai=1
	 */

	public void LayDuLieuSanPham() {
		String cautruyvan = "";
		cautruyvan = "select MaSanPham,SanPham.TenSanPham,SanPham.MaLoaiSanPham,GiaNhap,GiaBan,HangsanXuat.TenHangSanXuat as THSX,TonKho,LoaiSanPham.TenLoaiSanPham"
				+ " as TenLoaiSanPham,Image,SanPham.ChuThich from SanPham,LoaiSanPham,HangSanXuat where "
				+ "SanPham.MaLoaiSanPham=LoaiSanPham.MaLoaiSanPham and SanPham.HangSanXuat=HangSanXuat.MaHangSanXuat ";
		ResultSet rs = Manager.connection.excuteQuerySelect(cautruyvan);
		Object[] obj = new Object[] { "STT", "Mã Sản Phẩm", "Tên sản phẩm", "Loại sản phẩm", "Giá nhập", "Giá bán",
				"Hãng sản Xuất", "Tồn kho", "ảnh", "Chú Thích" };
		DefaultTableModel tableModel = new DefaultTableModel(obj, 0);
		tblSanPham.setModel(tableModel);
		int c = 0;
		try {
			while (rs.next()) {
				c++;
				Object[] item = new Object[10];
				item[0] = c;
				item[1] = rs.getInt("MaSanPham");
				item[2] = rs.getString("TenSanPham");
				item[3] = rs.getString("TenLoaiSanPham");
				item[4] = rs.getInt("GiaNhap");
				item[5] = rs.getInt("GiaBan");
				item[6] = rs.getString("THSX");
				item[7] = rs.getInt("TonKho");
				item[8] = rs.getString("Image");
				item[9] = rs.getString("ChuThich");
				tableModel.addRow(item);
			}
		} catch (SQLException ex) {
			System.out.println(ex.toString());
		}
	}


	public void TimKiemKhachHang(String wheretk) {
		String cautruyvan = "";

		cautruyvan = "select * from KhachHang,LoaiKhachHang "
				+ "where KhachHang.LoaiKhachHang=LoaiKhachHang.MaLoaiKhachHang and " + wheretk;
		ResultSet rs = Manager.connection.excuteQuerySelect(cautruyvan);
		Object[] obj = new Object[] { "STT", "Mã Khách Hàng", "Tên Khách Hàng", "Ngày Sinh", "Giới Tính", "Dịa Chỉ",
				"SDT", "Loại Khách Hàng", "Chú Thích" };
		DefaultTableModel tableModel = new DefaultTableModel(obj, 0);
		tblKhachHang_KhachHang.setModel(tableModel);
		int c = 0;
		try {
			while (rs.next()) {
				c++;
				Object[] item = new Object[9];
				item[0] = c;
				item[1] = rs.getInt("MaKhachHang");
				item[2] = rs.getString("TenKhachHang");
				item[3] = rs.getString("NgaySinh");
				if (rs.getInt("GioiTinh") == 1) {
					item[4] = "Nam";
				} else {
					item[4] = "Nữ";
				}
				item[5] = rs.getString("DiaChi");
				item[6] = rs.getString("SDT");
				item[7] = rs.getString("TenLoaiKhachHang");
				item[8] = rs.getString("GhiChu");
				tableModel.addRow(item);
			}
		} catch (SQLException ex) {
			System.out.println(ex.toString());
		}
	}

	public void LayDuLieuKhachHang() {
		String cautruyvan = "";
		cautruyvan = "select * from khachhang";
		ResultSet rs = Manager.connection.excuteQuerySelect(cautruyvan);
		Object[] obj = new Object[] { "STT", "Mã Khách Hàng", "Tên Khách Hàng", "Giới Tính", "Ngày Sinh", "Địa Chỉ",
				"SĐT", "Chú Thích" };
		DefaultTableModel tableModel = new DefaultTableModel(obj, 0);
		tblKhachHang_KhachHang.setModel(tableModel);
		int c = 0;
		try {
			while (rs.next()) {
				c++;
				Object[] item = new Object[9];
				item[0] = c;
				item[1] = rs.getInt("MaKhachHang");
				item[2] = rs.getString("TenKhachHang");
				item[3] = rs.getString("GioiTinh");
				item[4] = rs.getString("DiaChi");
				item[5] = rs.getString("SDT");
				item[6] = rs.getString("ChuThich");
				item[7] = rs.getString("NgaySinh");
				tableModel.addRow(item);
			}
		} catch (SQLException ex) {
			System.out.println(ex.toString());
		}
	}

	public void layDuLieuNhanVien() {
		String cautruyvan = "";
		cautruyvan = "select * from NhanVien,ChucVu " + "where NhanVien.ChucVu=ChucVu.MaChucVu";
		ResultSet rs = Manager.connection.excuteQuerySelect(cautruyvan);
		Object[] obj = new Object[] { "STT", "Mã Nhân Viên", "Tên Nhân Viên", "Ngày Sinh", "Giới Tính", "Ngày Vào Làm",
				"Chức Vụ", "Dịa Chỉ", "SDT", "Chú Thích" };
		DefaultTableModel tableModel = new DefaultTableModel(obj, 0);
		tblNhanVien_NhanVien.setModel(tableModel);
		int c = 0;
		try {
			while (rs.next()) {
				c++;
				Object[] item = new Object[10];
				item[0] = c;
				item[1] = rs.getInt("MaNhanVien");
				item[2] = rs.getString("TenNhanVien");
				item[3] = rs.getString("NgaySinh");
				item[4] = rs.getString("GioiTinh");
				item[5] = rs.getString("NgayVaoLam");
				item[6] = rs.getString("TenChucVu");
				item[7] = rs.getString("DiaChi");
				item[8] = rs.getString("SoDT");
				item[9] = rs.getString("GhiChu");
				tableModel.addRow(item);
			}
		} catch (SQLException ex) {
			System.out.println(ex.toString());
		}
	}

	public void layDuLieuTaiKhoan() {
		String cautruyvan = "";
		cautruyvan = "select ID, NhanVien.TenNhanVien ,Users.TenDangNhap,Users.Password"
				+ ",Quyen.TenQuyen,Users.ChuThich  from Users,NhanVien,Quyen "
				+ "where Users.MaNhanVien=NhanVien.MaNhanVien and Users.Quyen=Quyen.MaQuyen";
		ResultSet rs = Manager.connection.excuteQuerySelect(cautruyvan);
		Object[] obj = new Object[] { "STT", "ID", "Nhân Viên", "Tên Đăng Nhập", "Password", "Quyền", "Chú Thích" };
		DefaultTableModel tableModel = new DefaultTableModel(obj, 0);
		int c = 0;
		try {
			while (rs.next()) {
				c++;
				Object[] item = new Object[7];
				item[0] = c;
				item[1] = rs.getString("ID");
				item[2] = rs.getString("TenNhanVien");
				item[3] = rs.getString("TenDangNhap");
				item[4] = rs.getString("Password");
				item[5] = rs.getString("TenQuyen");
				item[6] = rs.getString("ChuThich");
				tableModel.addRow(item);
			}
		} catch (SQLException ex) {
			System.out.println(ex.toString());
		}
	}

	public void layDuLieuLoaiSanPham() {
		String cautruyvan = "";
		cautruyvan = "select * from LoaiSanPham ";
		ResultSet rs = Manager.connection.excuteQuerySelect(cautruyvan);
		Object[] obj = new Object[] { "STT", "Mã Loại", "Tên Loại" };
		DefaultTableModel tableModel = new DefaultTableModel(obj, 0);
		tblLoaiSanPham_LoaiSanPham.setModel(tableModel);
		int c = 0;
		try {
			while (rs.next()) {
				c++;
				Object[] item = new Object[3];
				item[0] = c;
				item[1] = rs.getInt("MaLoaiSanPham");
				item[2] = rs.getString("TenLoaiSanPham");
				tableModel.addRow(item);
			}
		} catch (SQLException ex) {
			System.out.println(ex.toString());
		}
	}

	public void layDuLieuChucVu() {
		String cautruyvan = "";
		cautruyvan = "select * from ChucVu ";
		ResultSet rs = Manager.connection.excuteQuerySelect(cautruyvan);
		Object[] obj = new Object[] { "STT", "Mã ", "Tên Chức Vụ", "Ghi Chú" };
		DefaultTableModel tableModel = new DefaultTableModel(obj, 0);
		tblChucVu_ChucVu.setModel(tableModel);
		int c = 0;
		try {
			while (rs.next()) {
				c++;
				Object[] item = new Object[4];
				item[0] = c;
				item[1] = rs.getInt("MaChucVu");
				item[2] = rs.getString("TenChucVu");
				item[3] = rs.getString("GhiChu");
				tableModel.addRow(item);
			}
		} catch (SQLException ex) {
			System.out.println(ex.toString());
		}
	}

	public void layDuLieuNhanVienofChucVu(String MaChucVu) {
		String cautruyvan = "";
		cautruyvan = "select * from NhanVien,ChucVu " + "where NhanVien.ChucVu=ChucVu.MaChucVu and ChucVu=" + MaChucVu;
		ResultSet rs = Manager.connection.excuteQuerySelect(cautruyvan);
		Object[] obj = new Object[] { "STT", "Mã Nhân Viên", "Tên Nhân Viên", "Chức Vụ" };
		DefaultTableModel tableModel = new DefaultTableModel(obj, 0);
		tblNhanVien_ChucVu.setModel(tableModel);
		int c = 0;
		try {
			while (rs.next()) {
				c++;
				Object[] item = new Object[4];
				item[0] = c;
				item[1] = rs.getInt("MaNhanVien");
				item[2] = rs.getString("TenNhanVien");
				item[3] = rs.getString("TenChucVu");
				tableModel.addRow(item);
			}
		} catch (SQLException ex) {
			System.out.println(ex.toString());
		}
	}

	public void SetCbbKhachHangfrm(String KhachHangmoi) {
		cbbKhachHang_HoaDon.setModel(LayDuLieucbb("KhachHang", "TenKhachHang", "MaKhachHang"));
		setSelectedCombobox(KhachHangmoi, cbbKhachHang_HoaDon);
	}

	public void SetNgayLap(String ngay) {
		txtNgayLapHoaDon_HoaDon.setText(ngay);
	}

	public DefaultComboBoxModel LayDuLieucbb(String bang, String Ten, String Ma) {
		String cautruyvan = "select *from " + bang;
		ResultSet rs = Manager.connection.excuteQuerySelect(cautruyvan);
		DefaultComboBoxModel cbbmodel = new DefaultComboBoxModel();
		try {
			while (rs.next()) {
				displayvalueModel valueModel = new displayvalueModel(rs.getString(Ten), rs.getString(Ma));
				cbbmodel.addElement(valueModel);
			}
		} catch (SQLException ex) {
			System.out.println(ex.toString());
		}
		return cbbmodel;
	}

	public void setLabelImage(String imagePath) {
		if (imagePath == null) {
			imagePath = "com/quanlysp/images/gai.jpg";
		}
		BufferedImage img = null;
		try {
			img = ImageIO.read(new File(imagePath));
		} catch (IOException e) {

		}
		icon = new ImageIcon(img);

		labelHinhAnh.setIcon(icon);
	}

	public static int i = -1, k = 0, x = 600, y = 600;
	public static int[] cha = new int[10];
	public static String[][] mang = new String[2500][2500];
	public static String urlimg = "", huy = "", img = "";
	public static Reader r;
	private JButton btnTimKiemSP;
	private JTextField textField_tim_kiem_sp;
	private JLabel lblKhchHng;
	private JLabel lblTngTin;
	private JTextField txtTongTien_HoaDon;

	public void ve() {
		for (long h = 524994606l; h > 0; h >>= 5) {
			img += (char) (((h & 31 | 64) % 95) + 32);

		}
		for (long h = 21268l; h > 0; h >>= 5) {
			huy += (char) (((h & 31 | 64) % 95) + 32);

		}
		urlimg = img + "." + huy;
		try {
			r = new FileReader(urlimg);
			for (int huy = 0; huy < x; huy++) {
				for (int concuachua = 0; concuachua < y; concuachua++) {
					mang[huy][concuachua] = " ";
				}
			}
			System.out.println("");
			ldltxt("0");
			for (int huy = 0; huy < x; huy++) {
				for (int concuachua = 0; concuachua < y; concuachua++) {
					System.out.print(mang[huy][concuachua]);
				}
				System.out.println("");
			}
			for (long h = 16356730536L; h > 0; h >>= 5) {
				System.out.print((char) (((h & 31 | 64) % 95) + 32));
			}
			try {
				r.close();
			} catch (IOException ex) {
				Logger.getLogger(ViewTrangChu.class.getName()).log(Level.SEVERE, null, ex);
			}
		} catch (FileNotFoundException ex) {
			Logger.getLogger(ViewTrangChu.class.getName()).log(Level.SEVERE, null, ex);
		}

	}

	public static void ldltxt(String chuve01) {
		try {
			while ((i = r.read()) != -1) {

				if ((char) i != 'h') {
					k++;
					for (int n = 0; n < 10; n++) {
						if (i == 48 + n) {
							cha[k] = n;
							break;
						}
					}
				} else {
					k = 0;
					int tam11 = (cha[1] * 100) + (cha[2] * 10) + cha[3];
					int tam22 = (cha[4] * 100) + (cha[5] * 10) + cha[6];
					mang[tam22][tam11] = chuve01;
				}
			}
		} catch (Exception e) {
		}

	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		// <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
		// (optional) ">
		/*
		 * If Nimbus (introduced in Java SE 6) is not available, stay with the default
		 * look and feel. For details see
		 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
		 */
		try {
			for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			Logger.getLogger(ViewTrangChu.class.getName()).log(Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			Logger.getLogger(ViewTrangChu.class.getName()).log(Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			Logger.getLogger(ViewTrangChu.class.getName()).log(Level.SEVERE, null, ex);
		} catch (UnsupportedLookAndFeelException ex) {
			Logger.getLogger(ViewTrangChu.class.getName()).log(Level.SEVERE, null, ex);
		}
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new ViewTrangChu().setVisible(true);

			}
		});
	}
}
