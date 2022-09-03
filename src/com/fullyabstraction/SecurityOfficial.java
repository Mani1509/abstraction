package com.fullyabstraction;

public  class SecurityOfficial implements SecurityApp{

	@Override
	public void securityId(int id) {
		System.out.println("security id is:"+id);
		
	}

	@Override
	public void securityPassword(String password) {
	System.out.println("security password is:"+password);
	System.out.println("security password is:"+password);

	
		
	}
	public static void main(String[] args) {
		SecurityOfficial securityofficial =new SecurityOfficial();
		securityofficial.securityId(1254);
		securityofficial.securityPassword("Tcds@123");
		
	}


		
	}
	
		
	


