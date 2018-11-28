package view.user;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;

public class HoaDon extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HoaDon frame = new HoaDon("Bánh Sữa", "10", "500000");
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
	public HoaDon(String nameItem, String countItem,String totalMoney) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 305, 426);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		
		JPanel panel_tieu_de_hoa_don = new JPanel();
		panel_tieu_de_hoa_don.setBackground(new Color(0, 153, 153));
		
		JPanel panel_thong_tin_dat_hang = new JPanel();
		panel_thong_tin_dat_hang.setBackground(new Color(224, 255, 255));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(panel_tieu_de_hoa_don, Alignment.LEADING, 0, 0, Short.MAX_VALUE)
						.addComponent(panel_thong_tin_dat_hang, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE))
					.addContainerGap(135, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
					.addComponent(panel_tieu_de_hoa_don, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(panel_thong_tin_dat_hang, GroupLayout.PREFERRED_SIZE, 310, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		
		JLabel lb_title_ten_san_pham = new JLabel("Tên Sản Phẩm");
		
		JLabel lb_title_so_luong_san_pham = new JLabel("Số lượng");
		
		JLabel lb_ten_san_pham = new JLabel(nameItem);
		
		JLabel lb_so_luong_san_pham = new JLabel(countItem + " (vnđ)");
		
		JLabel lb_title_tong_tien = new JLabel("Tổng TIền");
		
		JLabel lb_tong_tien = new JLabel(totalMoney);
		GroupLayout gl_panel_thong_tin_dat_hang = new GroupLayout(panel_thong_tin_dat_hang);
		gl_panel_thong_tin_dat_hang.setHorizontalGroup(
			gl_panel_thong_tin_dat_hang.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_thong_tin_dat_hang.createSequentialGroup()
					.addGroup(gl_panel_thong_tin_dat_hang.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_panel_thong_tin_dat_hang.createSequentialGroup()
							.addGroup(gl_panel_thong_tin_dat_hang.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_thong_tin_dat_hang.createSequentialGroup()
									.addGap(71)
									.addComponent(lb_title_so_luong_san_pham, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel_thong_tin_dat_hang.createSequentialGroup()
									.addGap(48)
									.addComponent(lb_title_ten_san_pham)))
							.addGap(29))
						.addGroup(Alignment.TRAILING, gl_panel_thong_tin_dat_hang.createSequentialGroup()
							.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(lb_title_tong_tien)
							.addGap(41)))
					.addGroup(gl_panel_thong_tin_dat_hang.createParallelGroup(Alignment.LEADING)
						.addComponent(lb_so_luong_san_pham, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE)
						.addComponent(lb_ten_san_pham, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE)
						.addComponent(lb_tong_tien, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(18, Short.MAX_VALUE))
		);
		gl_panel_thong_tin_dat_hang.setVerticalGroup(
			gl_panel_thong_tin_dat_hang.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_thong_tin_dat_hang.createSequentialGroup()
					.addGap(56)
					.addGroup(gl_panel_thong_tin_dat_hang.createParallelGroup(Alignment.BASELINE)
						.addComponent(lb_title_ten_san_pham)
						.addComponent(lb_ten_san_pham))
					.addGap(36)
					.addGroup(gl_panel_thong_tin_dat_hang.createParallelGroup(Alignment.BASELINE)
						.addComponent(lb_title_so_luong_san_pham)
						.addComponent(lb_so_luong_san_pham))
					.addGap(34)
					.addGroup(gl_panel_thong_tin_dat_hang.createParallelGroup(Alignment.BASELINE)
						.addComponent(lb_tong_tien)
						.addComponent(lb_title_tong_tien))
					.addContainerGap(142, Short.MAX_VALUE))
		);
		panel_thong_tin_dat_hang.setLayout(gl_panel_thong_tin_dat_hang);
		
		JLabel lblNewLabel = new JLabel("Chi Tiết Hóa Đơn Mua Hàng");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setForeground(new Color(255, 250, 250));
		lblNewLabel.setBackground(new Color(51, 153, 153));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		GroupLayout gl_panel_tieu_de_hoa_don = new GroupLayout(panel_tieu_de_hoa_don);
		gl_panel_tieu_de_hoa_don.setHorizontalGroup(
			gl_panel_tieu_de_hoa_don.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_tieu_de_hoa_don.createSequentialGroup()
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 290, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(134, Short.MAX_VALUE))
		);
		gl_panel_tieu_de_hoa_don.setVerticalGroup(
			gl_panel_tieu_de_hoa_don.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_tieu_de_hoa_don.createSequentialGroup()
					.addGap(5)
					.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE))
		);
		panel_tieu_de_hoa_don.setLayout(gl_panel_tieu_de_hoa_don);
		panel.setLayout(gl_panel);
	}
}
