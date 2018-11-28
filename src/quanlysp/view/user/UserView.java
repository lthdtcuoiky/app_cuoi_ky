package view.user;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.SoftBevelBorder;

import controlller.Manager;
import view.admin.ViewDangNhap;

public class UserView extends JFrame {
	private JPanel contentPane;
	private JTabbedPane tabbed_pane_SanPham;
	private GroupLayout gl_panel;
	private JTabbedPane tabbedPane;
	private JPanel panel;
	private JScrollPane scrollPane;
	private JPanel panel_san_pham;
	private JButton btnngXut;
	private JButton btniMtKhu;
	private JLabel lb_ten_nguoi_dung;
	private JLabel lblSt;
	private JLabel lblMtKhu;
	private JButton btnThayiS;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserView frame = new UserView();
					frame.addButton();
					frame.setResizable(false);
					frame.setLocationRelativeTo(null);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public UserView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 50, 1166, 668);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		panel = new JPanel();
		panel.setBackground(new Color(153, 204, 204));
		panel.setForeground(new Color(0, 0, 255));
		contentPane.add(panel, BorderLayout.CENTER);

		tabbedPane = new JTabbedPane(JTabbedPane.LEFT);
		gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(gl_panel.createParallelGroup(Alignment.LEADING).addComponent(tabbedPane,
				GroupLayout.DEFAULT_SIZE, 1140, Short.MAX_VALUE));
		gl_panel.setVerticalGroup(gl_panel.createParallelGroup(Alignment.TRAILING).addComponent(tabbedPane,
				Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 619, Short.MAX_VALUE));
		gl_panel.setHonorsVisibility(false);

		tabbed_pane_SanPham = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.addTab("Sản phẩm", new ImageIcon("src\\quanlysp\\util\\images\\sanpham.png"), tabbed_pane_SanPham,
				null);

		scrollPane = new JScrollPane();
		tabbed_pane_SanPham.addTab("Danh Sách Sản Phẩm", null, scrollPane, null);

		panel_san_pham = new JPanel();
		panel_san_pham.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_san_pham.setForeground(new Color(255, 255, 204));
		panel_san_pham.setBackground(new Color(255, 255, 255));
		scrollPane.setViewportView(panel_san_pham);
		panel_san_pham.setLayout(new GridLayout(10, 4, 10, 10));

//		JButton btnNewButton = new JButton("");
//		btnNewButton.setIcon(new ImageIcon("D:\\image\\Webp.net-resizeimage.jpg"));
//		panel_san_pham.add(btnNewButton);

		JTabbedPane tabbed_pane_tai_khoan = new JTabbedPane(JTabbedPane.TOP);
		tabbed_pane_tai_khoan.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		tabbedPane.addTab("Đăng xuất", new ImageIcon("src\\quanlysp\\util\\images\\thoat.png"), tabbed_pane_tai_khoan,
				null);

		JPanel panel_dang_xuat = new JPanel();
		panel_dang_xuat.setBackground(new Color(245, 245, 245));
		panel_dang_xuat.addComponentListener(new ComponentAdapter() {
			@Override
			public void componentShown(ComponentEvent arg0) {
				dispose();
				ViewDangNhap vdn = new ViewDangNhap();
				vdn.show();
			}
		});
		panel_dang_xuat.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		tabbed_pane_tai_khoan.addTab("Thông tin tài khoản", null, panel_dang_xuat, null);

		btnngXut = new JButton("Đăng Xuất");
		btnngXut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ViewDangNhap vdn = new ViewDangNhap();
				vdn.show();
				dispose();
			}
		});
		btnngXut.setBackground(new Color(100, 149, 237));

		btniMtKhu = new JButton("Đổi Mật Khẩu");
		btniMtKhu.setBackground(new Color(100, 149, 237));

		lb_ten_nguoi_dung = new JLabel("Tên tài khoản");

		lblSt = new JLabel("Số điện thoại");

		lblMtKhu = new JLabel("Mật khẩu");

		btnThayiS = new JButton("Thay đổi số điện thoại");
		btnThayiS.setBackground(new Color(100, 149, 237));
		GroupLayout gl_panel_dang_xuat = new GroupLayout(panel_dang_xuat);
		gl_panel_dang_xuat.setHorizontalGroup(gl_panel_dang_xuat.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_dang_xuat.createSequentialGroup().addGroup(gl_panel_dang_xuat
						.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_dang_xuat.createSequentialGroup().addGap(445).addComponent(btnngXut))
						.addGroup(gl_panel_dang_xuat.createSequentialGroup().addGroup(gl_panel_dang_xuat
								.createParallelGroup(Alignment.LEADING)
								.addGroup(Alignment.TRAILING,
										gl_panel_dang_xuat.createSequentialGroup().addContainerGap(381, Short.MAX_VALUE)
												.addComponent(lblMtKhu, GroupLayout.PREFERRED_SIZE, 62,
														GroupLayout.PREFERRED_SIZE)
												.addGap(75))
								.addGroup(gl_panel_dang_xuat.createSequentialGroup().addGap(362)
										.addGroup(gl_panel_dang_xuat.createParallelGroup(Alignment.LEADING)
												.addComponent(lb_ten_nguoi_dung).addComponent(lblSt))
										.addGap(91)))
								.addGroup(gl_panel_dang_xuat.createParallelGroup(Alignment.LEADING)
										.addComponent(btniMtKhu).addComponent(btnThayiS))))
						.addContainerGap(405, Short.MAX_VALUE)));
		gl_panel_dang_xuat
				.setVerticalGroup(
						gl_panel_dang_xuat.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_panel_dang_xuat.createSequentialGroup()
										.addContainerGap(191, Short.MAX_VALUE).addComponent(lb_ten_nguoi_dung)
										.addGap(18)
										.addGroup(gl_panel_dang_xuat.createParallelGroup(Alignment.BASELINE)
												.addComponent(btniMtKhu, GroupLayout.PREFERRED_SIZE, 19,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(lblMtKhu))
										.addPreferredGap(ComponentPlacement.UNRELATED)
										.addGroup(gl_panel_dang_xuat.createParallelGroup(Alignment.LEADING)
												.addGroup(gl_panel_dang_xuat.createSequentialGroup().addGap(73)
														.addComponent(btnngXut, GroupLayout.PREFERRED_SIZE, 23,
																GroupLayout.PREFERRED_SIZE))
												.addGroup(gl_panel_dang_xuat.createSequentialGroup()
														.addPreferredGap(ComponentPlacement.UNRELATED)
														.addGroup(gl_panel_dang_xuat
																.createParallelGroup(Alignment.BASELINE)
																.addComponent(lblSt).addComponent(btnThayiS))))
										.addGap(233)));
		panel_dang_xuat.setLayout(gl_panel_dang_xuat);
		panel.setLayout(gl_panel);
	}

	public void addButton() {
		String linkImg = null;
		String name = null;
		String price = null;
		String soLuong = null;
		String tonKho = null;
		JPanel panel;
		for (int i = 1; i <= 40; i++) {
			linkImg = "D:\\image\\image" + i + ".jpg";
			String sql = "SELECT * FROM sanpham where sanpham.MaSanPham = " + i;
			ResultSet rs = Manager.connection.excuteQuerySelect(sql);
			try {
				while (rs.next()) {
					name = rs.getString("TenSanPham").trim();
					price = rs.getString("GiaBan").trim();
					soLuong = rs.getString("TonKho").trim();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(sql);
			panel = new Item().getItems(name, price, linkImg, soLuong);
			panel_san_pham.add(panel);
		}
		System.out.println("test");
	}

}
