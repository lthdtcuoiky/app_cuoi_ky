package view.admin;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;

import controlller.Manager;
import model.dao.LoginDAO;

/**
 *
 * @author nguyenvanduy
 */
public class ViewDangKy extends JFrame {
	private static final long serialVersionUID = 1L;

	private JButton btnDangNhap;
	private JButton btnĐangKy;
	private ButtonGroup buttonGroup1;
	private JLabel jLabel1;
	private JLabel jLabel5;
	private JRadioButton jRadioButton1;
	private JLabel lblPassword;
	private JLabel lblRegisterTitle;
	private JLabel lblUserName;
	private JPanel pnlCopyright;
	private JPanel pnlRegisterInfo;
	private JPasswordField txtPassword;
	private JPasswordField txtRetypePasswword;
	private JTextField txtUserName;
	public static int quyen = 0;
	public static String ten = "";

	public ViewDangKy() {
		initComponents();

	}

	private void initComponents() {

		jRadioButton1 = new javax.swing.JRadioButton();
		buttonGroup1 = new javax.swing.ButtonGroup();
		pnlRegisterInfo = new javax.swing.JPanel();
		lblRegisterTitle = new javax.swing.JLabel();
		lblUserName = new javax.swing.JLabel();
		txtUserName = new javax.swing.JTextField();
		lblPassword = new javax.swing.JLabel();
		txtPassword = new javax.swing.JPasswordField();
		btnĐangKy = new javax.swing.JButton();
		btnDangNhap = new javax.swing.JButton();
		jLabel5 = new javax.swing.JLabel();
		txtRetypePasswword = new javax.swing.JPasswordField();
		pnlCopyright = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();

		jRadioButton1.setText("jRadioButton1");

		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
		setResizable(false);
		addWindowListener(new java.awt.event.WindowAdapter() {
			public void windowClosed(java.awt.event.WindowEvent evt) {
				formWindowClosed(evt);
			}

			public void windowClosing(java.awt.event.WindowEvent evt) {
				formWindowClosing(evt);
			}
		});

		pnlRegisterInfo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 51)));

		lblRegisterTitle.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
		lblRegisterTitle.setForeground(new java.awt.Color(255, 51, 0));
		lblRegisterTitle.setText("Tạo Tài Khoản");

		lblUserName.setText("Tên đăng nhập");

		lblPassword.setText("Mật khẩu");

		btnĐangKy.setForeground(new java.awt.Color(255, 153, 51));
		btnĐangKy.setText("Đăng Ký");
		btnĐangKy.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				try {
					btnĐangKyActionPerformed(evt);
				} catch (com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException e) {
					ThongBao("tên tài khoản đã tồn tại", "Lỗi đăng ký", 4);
					e.printStackTrace();
				}
			}
		});

		btnDangNhap.setForeground(new java.awt.Color(255, 153, 51));
		btnDangNhap.setText("Đăng Nhập Ngay");
		btnDangNhap.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnDangNhapNgayActionPerformed(evt);
			}
		});

		jLabel5.setText("Nhập Lại Mật Khẩu");

		javax.swing.GroupLayout pnlRegisterInfoLayout = new javax.swing.GroupLayout(pnlRegisterInfo);
		pnlRegisterInfoLayout.setHorizontalGroup(pnlRegisterInfoLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(pnlRegisterInfoLayout.createSequentialGroup().addGap(48).addGroup(pnlRegisterInfoLayout
						.createParallelGroup(Alignment.LEADING)
						.addGroup(pnlRegisterInfoLayout.createSequentialGroup().addGap(25).addComponent(btnĐangKy)
								.addGap(18).addComponent(btnDangNhap, GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE))
						.addGroup(pnlRegisterInfoLayout.createSequentialGroup()
								.addGroup(pnlRegisterInfoLayout.createParallelGroup(Alignment.TRAILING)
										.addComponent(lblPassword).addComponent(jLabel5).addComponent(lblUserName))
								.addPreferredGap(ComponentPlacement.RELATED)
								.addGroup(pnlRegisterInfoLayout.createParallelGroup(Alignment.TRAILING)
										.addComponent(txtUserName, Alignment.LEADING, 145, 145, 145)
										.addComponent(lblRegisterTitle, Alignment.LEADING)
										.addComponent(txtPassword, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 149,
												Short.MAX_VALUE)
										.addComponent(txtRetypePasswword, GroupLayout.DEFAULT_SIZE, 149,
												Short.MAX_VALUE))))
						.addGap(49)));
		pnlRegisterInfoLayout.setVerticalGroup(pnlRegisterInfoLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(pnlRegisterInfoLayout.createSequentialGroup().addGap(6)
						.addComponent(lblRegisterTitle, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
						.addGap(11)
						.addGroup(pnlRegisterInfoLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(txtUserName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(lblUserName))
						.addGap(18)
						.addGroup(pnlRegisterInfoLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(txtPassword, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(lblPassword))
						.addGap(18)
						.addGroup(pnlRegisterInfoLayout.createParallelGroup(Alignment.BASELINE).addComponent(jLabel5)
								.addComponent(txtRetypePasswword, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE))
						.addGap(36).addGroup(pnlRegisterInfoLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(btnĐangKy).addComponent(btnDangNhap))
						.addGap(107)));
		pnlRegisterInfo.setLayout(pnlRegisterInfoLayout);

		pnlCopyright.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 102)));

		jLabel1.setText(" liên hệ admin để cấp quyền truy cập cao hơn");

		javax.swing.GroupLayout pnlCopyrightLayout = new javax.swing.GroupLayout(pnlCopyright);
		pnlCopyright.setLayout(pnlCopyrightLayout);
		pnlCopyrightLayout.setHorizontalGroup(pnlCopyrightLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCopyrightLayout.createSequentialGroup()
						.addContainerGap(57, Short.MAX_VALUE).addComponent(jLabel1,
								javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(42, 42, 42)));
		pnlCopyrightLayout
				.setVerticalGroup(pnlCopyrightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(pnlCopyrightLayout.createSequentialGroup().addContainerGap()
								.addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				javax.swing.GroupLayout.Alignment.TRAILING,
				layout.createSequentialGroup().addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
								.addComponent(pnlRegisterInfo, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(pnlCopyright, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addContainerGap()));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addContainerGap()
						.addComponent(pnlRegisterInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 245,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(pnlCopyright, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		pack();
		setLocationRelativeTo(null);
	}// </editor-fold>//GEN-END:initComponents

	private void btnĐangKyActionPerformed(java.awt.event.ActionEvent evt) throws com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException {// GEN-FIRST:event_btnĐangKyActionPerformed
		String username, password, nhapLai;
		username = txtUserName.getText();
		password = String.valueOf(txtPassword.getPassword()).trim();
		nhapLai = String.valueOf(txtRetypePasswword.getPassword());
		String cautruyvan = "SELECT * FROM quyen;";
		ResultSet rs = Manager.connection.excuteQuerySelect(cautruyvan);

		boolean kt = true;

		if (username.length() < 6 || username.length() > 15) {
			ThongBao("Tên đăng nhập phải từ 6-15 ký tự", "Thông báo lỗi", JOptionPane.ERROR_MESSAGE);
		} else if (password.length() <= 6 || password.length() > 50) {
			ThongBao("Mật khẩu phải nhập nhiều hơn 6 ký tự và ít hơn 50 ký tự", "Lỗi đăng ký", 2);
		} else if (!KiemTraChuaChuVaSo(password)) {
			ThongBao("Mật khẩu phải bao gồm chữ và số", "Thông báo", 2);
		} else if (!password.equals(nhapLai)) {
			ThongBao("nhập lại mật khẩu không khớp", "Thông báo", 2);
		} else {
			if (kt == true) {
				String query = "insert into users(TenDangNhap, Password,Quyen,ChuThich) values('" + username
						+ "' , '" + password + "', " + 2 + ", 'người dùng')";
				System.out.println(query);
				Manager.connection.excuteQueryUpdate(query);
				System.out.println("Đã Thêm Thành Công");
				ViewDangNhap viewDangNhap = new ViewDangNhap();
				boolean xac_nhan =new LoginDAO().checkLogin(username, password);
				if(xac_nhan == true) {
					ThongBao("Đăng Ký Thành Công", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
					viewDangNhap.show();
					this.dispose();
				}
				else {
					ThongBao("Tài khoản đã tồn tại", "Lỗi Đăng Ký", JOptionPane.ERROR_MESSAGE);
				}
			} else {
				ThongBao("Không thể Thêm tài Khoản", "lỗi", 2);
			}
		}
	}

	private void btnDangNhapNgayActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnDangNhapNgayActionPerformed
		ViewDangNhap viewDangNhap = new ViewDangNhap();
		viewDangNhap.show();
		this.dispose();
	}// GEN-LAST:event_btnDangNhapNgayActionPerformed

	private void formWindowClosed(java.awt.event.WindowEvent evt) {// GEN-FIRST:event_formWindowClosed

	}// GEN-LAST:event_formWindowClosed

	private void formWindowClosing(java.awt.event.WindowEvent evt) {// GEN-FIRST:event_formWindowClosing
		ViewDangNhap frmDN = new ViewDangNhap();
		frmDN.show();
		this.dispose();
	}// GEN-LAST:event_formWindowClosing

	private boolean KiemTra(String tdn, String mk) {
		boolean kq = false;

		String cautruyvan = "select * from Users where username= '" + tdn + "' and Password= '" + mk + "'";
		System.out.println(cautruyvan);
		ResultSet rs = Manager.connection.excuteQuerySelect(cautruyvan);

		try {
			if (rs.next()) {
				kq = true;
				quyen = rs.getInt("quyen");
				ten = rs.getString("username");
				System.out.println(" " + quyen);
			}
		} catch (SQLException ex) {
			System.out.println("lỗi đăng nhập");
		}

		return kq;
	}

	private boolean KiemTraChuaChuVaSo(String chuoi) {
		boolean ketqua = false;
		Pattern p = Pattern.compile("[a-z][0-9]");
		Matcher m = p.matcher(chuoi);
		ketqua = m.find();
		return ketqua;
	}

	public boolean KiemTraEmail(String email) {
		boolean kq = false;
		String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
		Pattern v = Pattern.compile(EMAIL_PATTERN);
		Matcher m = v.matcher(email);
		kq = m.matches();
		return kq;
	}

	private void ThongBao(String noiDungThongBao, String tieuDeThongBao, int icon) {
		JOptionPane.showMessageDialog(new JFrame(), noiDungThongBao, tieuDeThongBao, icon);
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
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			Logger.getLogger(ViewDangKy.class.getName()).log(Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			Logger.getLogger(ViewDangKy.class.getName()).log(Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			Logger.getLogger(ViewDangKy.class.getName()).log(Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			Logger.getLogger(ViewDangKy.class.getName()).log(Level.SEVERE, null, ex);
		}
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new ViewDangKy().setVisible(true);
			}
		});
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	// End of variables declaration//GEN-END:variables

}
