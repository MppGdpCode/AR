package dao;

import java.sql.Date;
import java.sql.SQLException;

/**
 * 
 * @author mjy
 *
 */
public interface UserDao  {

	/**
	 * ���
	 * @param user_name
	 * @param password
	 * @return �Ƿ�����˺�
	 */
	int login(String user_name,String password);
	
	void register(String user_name,String password,int gender,int age,String tel,String mail) throws Exception;
	
	void learned(int user_name,int pageId) throws Exception;
	
	
}
