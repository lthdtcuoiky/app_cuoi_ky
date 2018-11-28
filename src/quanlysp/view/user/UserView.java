package view.user;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;

public class UserView extends JFrame {
	private JPanel contentPane;
	private JTabbedPane tabbed_pane_SanPham;
	private GroupLayout gl_panel;
	private JTabbedPane tabbedPane;
	private JPanel panel;
	private JScrollPane scrollPane;
	private JPanel panel_san_pham;

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
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addComponent(tabbedPane, GroupLayout.DEFAULT_SIZE, 1140, Short.MAX_VALUE)
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addComponent(tabbedPane, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 619, Short.MAX_VALUE)
		);
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
		tabbedPane.addTab("Tài Khoản", new ImageIcon("src\\quanlysp\\util\\images\\thoat.png"), tabbed_pane_tai_khoan,
				null);

		JPanel panel_tai_khoan = new JPanel();
		tabbed_pane_tai_khoan.addTab("Thông tin tài khoản", null, panel_tai_khoan, null);
		GroupLayout gl_panel_tai_khoan = new GroupLayout(panel_tai_khoan);
		gl_panel_tai_khoan.setHorizontalGroup(
				gl_panel_tai_khoan.createParallelGroup(Alignment.LEADING).addGap(0, 623, Short.MAX_VALUE));
		gl_panel_tai_khoan.setVerticalGroup(
				gl_panel_tai_khoan.createParallelGroup(Alignment.LEADING).addGap(0, 507, Short.MAX_VALUE));
		panel_tai_khoan.setLayout(gl_panel_tai_khoan);
		panel.setLayout(gl_panel);
	}

	public void addButton() {
		String linkImg = null;
		String name = null;
		String price = null;
		JPanel panel;
		for (int i = 1; i <= 40; i++) {
			linkImg = "D:\\image\\image" + i + ".jpg";
			name = "Pepsi";
			price = "500.000đ";
			panel = new Item().getItems(name, price, linkImg);
			panel_san_pham.add(panel);
		}
	}
}
