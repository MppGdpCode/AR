package client;

import java.io.*;
import java.net.Socket;

import dao.UserDao;
import daoImp.UserDaoImp;

public class main {

	
	
	public static void main(String args[])
	{
		System.out.println(SendToServer.send("login 123 123"));
//		System.out.println(SendToServer.send("register test 1 123456 5 1570000 mail@qq.com"));
//		System.out.println(SendToServer.send("learned 17 3"));
	}  
	
}
