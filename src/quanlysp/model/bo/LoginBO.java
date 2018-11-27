package model.bo;

import model.dao.LoginDAO;

public class LoginBO {
	private LoginDAO loginDAO;

	public boolean checkLogin(String username, String password) {
		loginDAO = new LoginDAO();
		return loginDAO.checkLogin(username,password);
	}
}
