package view.user;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ThongTinMatHang extends JFrame {

	private JPanel contentPane;
	private JTextField tf_ma_sp;
	private JLabel lb_tensp;
	private JTextField tf_ten_sp;
	private JTextField tf_gia_sp;
	private JLabel lb_gia;
	private JLabel lb_ton_kho;
	private JTextField tf_so_luong_muon_mua;
	private JLabel lb_so_luong_muon_mua;
	private JLabel lb_thanh_tien;
	private JTextField tf_thanh_tien;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ThongTinMatHang frame = new ThongTinMatHang();
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
	public ThongTinMatHang() {
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
		
		JLabel lb_ma_sp = new JLabel("Mã Sản Phẩm");
		lb_ma_sp.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		tf_ma_sp = new JTextField();
		tf_ma_sp.setColumns(10);
		
		lb_tensp = new JLabel("Tên Sản Phẩm");
		lb_tensp.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		tf_ten_sp = new JTextField();
		tf_ten_sp.setColumns(10);
		
		tf_gia_sp = new JTextField();
		tf_gia_sp.setEnabled(false);
		tf_gia_sp.setEditable(false);
		tf_gia_sp.setColumns(10);
		
		lb_gia = new JLabel("Giá");
		lb_gia.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		lb_ton_kho = new JLabel("còn 0 sản phẩm");
		lb_ton_kho.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lb_ton_kho.setForeground(Color.RED);
		
		tf_so_luong_muon_mua = new JTextField();
		tf_so_luong_muon_mua.setColumns(10);
		
		lb_so_luong_muon_mua = new JLabel("Số Lượng Muốn Mua");
		lb_so_luong_muon_mua.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		lb_thanh_tien = new JLabel("Thành Tiền");
		lb_thanh_tien.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		tf_thanh_tien = new JTextField();
		tf_thanh_tien.setEnabled(false);
		tf_thanh_tien.setEditable(false);
		tf_thanh_tien.setColumns(10);
		
		JButton btn_mua = new JButton("Mua");
		btn_mua.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btn_mua.setBackground(new Color(0, 255, 255));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(53)
							.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
								.addComponent(lb_ma_sp)
								.addComponent(lb_tensp)
								.addGroup(Alignment.LEADING, gl_panel.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lb_so_luong_muon_mua, GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE))
								.addComponent(lb_gia, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addComponent(lb_thanh_tien)))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(tf_thanh_tien, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE)
						.addComponent(tf_gia_sp, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(tf_so_luong_muon_mua, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(lb_ton_kho, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE))
						.addComponent(tf_ten_sp, GroupLayout.PREFERRED_SIZE, 194, GroupLayout.PREFERRED_SIZE)
						.addComponent(tf_ma_sp, GroupLayout.PREFERRED_SIZE, 194, GroupLayout.PREFERRED_SIZE)
						.addComponent(btn_mua, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(47)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lb_ma_sp, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
						.addComponent(tf_ma_sp, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(40)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lb_tensp)
						.addComponent(tf_ten_sp, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(12)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(tf_gia_sp, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lb_gia, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(tf_so_luong_muon_mua, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lb_ton_kho)
						.addComponent(lb_so_luong_muon_mua))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(tf_thanh_tien, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lb_thanh_tien))
					.addGap(41)
					.addComponent(btn_mua)
					.addContainerGap(82, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
	}
}
