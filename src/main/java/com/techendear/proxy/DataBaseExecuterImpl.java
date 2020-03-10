package com.techendear.proxy;

public class DataBaseExecuterImpl implements DataBaseExecuter{

	public void executeDatabase(String query) throws Exception {
		System.out.println("Going to execute" + query);
	}
}
