package controlller;

import model.bo.LoginBO;
import view.admin.ViewDangNhap;

public class LoginController {
	private LoginBO loginBO;
	private ViewDangNhap loginView;
	
	public LoginController() {
		super();
		this.loginBO = new LoginBO();
	}
	public LoginBO getLoginBO() {
		return loginBO;
	}
	public void setLoginBO(LoginBO loginBO) {
		this.loginBO = loginBO;
	}
	public boolean checkLogin(String username, String password) {
		return loginBO.checkLogin(username, password);
	}
}
