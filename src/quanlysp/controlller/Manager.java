package controlller;

import util.config.ConnectDB;
import view.admin.ViewDangNhap;
import view.admin.ViewTrangChu;
import view.user.UserView;

public class Manager {
	public static ViewTrangChu homePage = new ViewTrangChu();
	public static UserView userView = new UserView();
	public static ConnectDB connection = new ConnectDB();

	public static void main(String[] args) {
		ViewDangNhap frmDN = new ViewDangNhap();

		frmDN.show();
	}
	// abcd

}
