package com.techendear.facade;

public class MainClass {

	public static void main(String[] args) {
		
		String test = "CheckElementPrasent";
		WebExplorerHelperFacade.generateReports("firefox", "html", test);
		WebExplorerHelperFacade.generateReports("firefox", "junit", test);
		WebExplorerHelperFacade.generateReports("chrome", "html", test);
		WebExplorerHelperFacade.generateReports("chrome", "junit", test);
		WebExplorerHelperFacade.generateReports("safari", "junit", test);
	}
}
