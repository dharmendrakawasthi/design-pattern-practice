package com.techendear.proxy;

public class ExecuterProxy implements DataBaseExecuter{

	boolean ifAdmin;
	DataBaseExecuterImpl executerImpl;
	
	
	
	public ExecuterProxy(String user, String password) {
		if(user=="Admin" && password == "Admin") {
			ifAdmin = true;
			executerImpl = new DataBaseExecuterImpl();
		}
	}



	public void executeDatabase(String query) throws Exception {
		if(ifAdmin) {
			executerImpl.executeDatabase(query);
		}else {
			if(query.equals("DELETE")) {
				throw new Exception("Delete Not Allowed");
			}
		}
		
	}

}
