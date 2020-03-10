package com.techendear.proxy;

public class MainClass {

	public static void main(String[] args) throws Exception {
	
//		DataBaseExecuter nonAdmin = new ExecuterProxy("NoAdmin", "Admin");
//		nonAdmin.executeDatabase("DELETE");
		
		DataBaseExecuter admin = new ExecuterProxy("Admin", "Admin");
		admin.executeDatabase("DELETE");
	}
}
