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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.LayoutStyle.ComponentPlacement;

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
	private JButton btnChn;
	private JLabel lb_thanh_tien;
	private static int totalMoney;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ThongTinDemo frame = new ThongTinDemo("a", "10", "5");
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
	public ThongTinDemo(String ten_san_pham, String gia_san_pham, String so_luong) {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 434, 430);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 250, 250));
		panel.setForeground(new Color(255, 250, 250));
		contentPane.add(panel, BorderLayout.CENTER);

		lb_title_tensp = new JLabel("Tên Sản Phẩm");
		lb_title_tensp.setFont(new Font("Tahoma", Font.PLAIN, 13));

		lb_title_gia = new JLabel("Giá");
		lb_title_gia.setFont(new Font("Tahoma", Font.PLAIN, 13));

		lb_ton_kho = new JLabel("còn " + so_luong +  " sản phẩm");
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
				JOptionPane.showMessageDialog(new JFrame(), "Đặt mua Thành Công", "Thông báo", 1);
				HoaDon hoaDon = new HoaDon(ten_san_pham, so_luong, totalMoney);
				dispose();
				hoaDon.setVisible(true);
			}
		});
		btn_mua_sp.setBackground(new Color(100, 149, 237));

		lb_ten_sp = new JLabel(ten_san_pham);

		lb_gia_sp = new JLabel(gia_san_pham);
		
		btnChn = new JButton("Chọn");
		btnChn.setBackground(new Color(100, 149, 237));
		btnChn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int total_buy = 0;
				try {
					total_buy = Integer.parseInt(tf_so_luong_muon_mua.getText());
					if(total_buy > Integer.parseInt(so_luong)) {
						JOptionPane.showMessageDialog(new JFrame(), "chỉ còn lại " + so_luong + "sản phẩm, vui lòng nhập một số bé hơn " + so_luong, "Thông báo", 2);
					}else {
					int price = Integer.parseInt(gia_san_pham);
					totalMoney = Math.round(total_buy * price);
					lb_thanh_tien.setText(Integer.toString(totalMoney));
					}
				}catch (Exception e) {
					JOptionPane.showMessageDialog(new JFrame(), "bạn chưa nhập số lượng", "Thông báo", 2);
				}
			}
		});
		
		lb_thanh_tien = new JLabel("");
		lb_thanh_tien.setForeground(new Color(255, 0, 0));
		lb_thanh_tien.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap(87, Short.MAX_VALUE)
							.addComponent(lb_title_thanh_tien))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(33)
							.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
								.addComponent(lb_title_gia, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
								.addComponent(lb_title_tensp)
								.addComponent(lb_title_so_luong_muon_mua, GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE))))
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(38)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(lb_ten_sp, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
								.addGroup(gl_panel.createSequentialGroup()
									.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING, false)
										.addComponent(tf_so_luong_muon_mua, 0, 0, Short.MAX_VALUE)
										.addComponent(btnChn, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
									.addGap(18)
									.addComponent(lb_ton_kho, GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE))
								.addComponent(lb_gia_sp)
								.addComponent(lb_thanh_tien, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE))
							.addContainerGap())
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(25)
							.addComponent(btn_mua_sp, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
							.addGap(156))))
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
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(btnChn)
							.addGap(47)
							.addComponent(btn_mua_sp, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(55)
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(lb_title_thanh_tien)
								.addComponent(lb_thanh_tien))))
					.addContainerGap(116, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
	}
}
