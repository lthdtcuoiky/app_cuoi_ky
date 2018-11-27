package view.user;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.border.EmptyBorder;

public class UserView extends JFrame {
	private JPanel contentPane;
	private JTabbedPane tabbed_pane_SanPham;
	private GroupLayout gl_panel;
	private JTabbedPane tabbedPane;
	private JPanel panel;
	private JScrollPane scrollPane;
	private JPanel panel_san_pham;
	private JButton btnNewButton;
	private JButton button_1;
	private JButton button_2;
	private JButton button_3;
	private JButton button_4;
	private JButton button_5;
	private JButton button_6;
	private JButton button_7;
	private JButton button_8;

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
		setBounds(100,50,1166, 668);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);

		tabbedPane = new JTabbedPane(JTabbedPane.LEFT);
		gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(gl_panel.createParallelGroup(Alignment.LEADING).addGroup(Alignment.TRAILING,
				gl_panel.createSequentialGroup().addContainerGap().addComponent(tabbedPane, GroupLayout.DEFAULT_SIZE,
						774, Short.MAX_VALUE)));
		gl_panel.setVerticalGroup(gl_panel.createParallelGroup(Alignment.LEADING).addGroup(Alignment.TRAILING,
				gl_panel.createSequentialGroup().addContainerGap().addComponent(tabbedPane, GroupLayout.DEFAULT_SIZE,
						551, Short.MAX_VALUE)));

		tabbed_pane_SanPham = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.addTab("Sản phẩm", new ImageIcon(
				"src\\quanlysp\\util\\images\\sanpham.png"),
				tabbed_pane_SanPham, null);
		
		scrollPane = new JScrollPane();
		tabbed_pane_SanPham.addTab("Danh Sách Sản Phẩm", null, scrollPane, null);
		
		panel_san_pham = new JPanel();
		scrollPane.setViewportView(panel_san_pham);
		panel_san_pham.setLayout(new GridLayout(3, 3, 10, 10));
		
		btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
		button_3 = new JButton("");
		panel_san_pham.add(button_3);
		
		button_8 = new JButton("");
		panel_san_pham.add(button_8);
		
		button_7 = new JButton("");
		panel_san_pham.add(button_7);
		
		button_6 = new JButton("");
		panel_san_pham.add(button_6);
		
		button_5 = new JButton("");
		panel_san_pham.add(button_5);
		
		button_4 = new JButton("");
		panel_san_pham.add(button_4);
		
		button_2 = new JButton("");
		panel_san_pham.add(button_2);
		
		button_1 = new JButton("");
		panel_san_pham.add(button_1);
		panel_san_pham.add(btnNewButton);

//		JButton btnNewButton = new JButton("");
//		btnNewButton.setIcon(new ImageIcon("D:\\image\\Webp.net-resizeimage.jpg"));
//		panel_san_pham.add(btnNewButton);

		JTabbedPane tabbed_pane_tai_khoan = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.addTab("Tài Khoản", new ImageIcon(
				"src\\quanlysp\\util\\images\\thoat.png"),
				tabbed_pane_tai_khoan, null);

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
		JButton button = null;
		for (int i = 1; i <= 2; i++) {
			button = new JButton();
			String location = "D:\\image\\image"+i+".jpg";
			button.setIcon(new ImageIcon(location));
			panel_san_pham.add(button);
		}
	}
}
