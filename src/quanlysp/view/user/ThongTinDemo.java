package view.user;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class ThongTinDemo extends JFrame {

	private JPanel contentPane;
	private JLabel lb_title_tensp;
	private JLabel lb_title_gia;
	private JLabel lb_ton_kho;
	private JTextField tf_so_luong_muon_mua;
	private JLabel lb_title_so_luong_muon_mua;
	private JLabel lb_title_thanh_tien;
	private JLabel lb_ten_sp;
	private JLabel lb_gia_sp;
	private JLabel label_thanh_tien;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ThongTinDemo frame = new ThongTinDemo();
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
	public ThongTinDemo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 434, 430);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 250, 250));
		panel.setForeground(new Color(255, 250, 250));
		contentPane.add(panel, BorderLayout.NORTH);
		
		lb_title_tensp = new JLabel("Tên Sản Phẩm");
		lb_title_tensp.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		lb_title_gia = new JLabel("Giá");
		lb_title_gia.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		lb_ton_kho = new JLabel("còn 0 sản phẩm");
		lb_ton_kho.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lb_ton_kho.setForeground(Color.RED);
		
		tf_so_luong_muon_mua = new JTextField();
		tf_so_luong_muon_mua.setColumns(10);
		
		lb_title_so_luong_muon_mua = new JLabel("Số Lượng Muốn Mua");
		lb_title_so_luong_muon_mua.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		lb_title_thanh_tien = new JLabel("Thành Tiền");
		lb_title_thanh_tien.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		JButton btn_mua_sp = new JButton("Mua");
		btn_mua_sp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btn_mua_sp.setBackground(new Color(0, 255, 255));
		
		lb_ten_sp = new JLabel("Bún Bò");
		
		lb_gia_sp = new JLabel("500000vnd");
		
		label_thanh_tien = new JLabel("500000vnd");
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addComponent(lb_title_thanh_tien))
						.addGroup(Alignment.LEADING, gl_panel.createSequentialGroup()
							.addGap(33)
							.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
								.addComponent(lb_title_gia, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
								.addComponent(lb_title_tensp)
								.addComponent(lb_title_so_luong_muon_mua, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
					.addGap(38)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(btn_mua_sp, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)
						.addGroup(Alignment.TRAILING, gl_panel.createParallelGroup(Alignment.LEADING)
							.addComponent(lb_ten_sp, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
							.addGroup(gl_panel.createSequentialGroup()
								.addComponent(tf_so_luong_muon_mua, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
								.addGap(58)
								.addComponent(lb_ton_kho, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE)))
						.addComponent(lb_gia_sp)
						.addComponent(label_thanh_tien, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(59)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lb_title_tensp)
						.addComponent(lb_ten_sp, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lb_title_gia, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
						.addComponent(lb_gia_sp))
					.addGap(27)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lb_title_so_luong_muon_mua)
						.addComponent(tf_so_luong_muon_mua, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lb_ton_kho))
					.addGap(47)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lb_title_thanh_tien)
						.addComponent(label_thanh_tien))
					.addGap(38)
					.addComponent(btn_mua_sp)
					.addContainerGap(94, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
	}
}
