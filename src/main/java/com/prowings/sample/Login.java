package com.prowings.sample;

public class Login {
	
	public boolean loginUser(String userName, String password)
	{
		System.out.println("loginUser() started!!");
		//some logic
		System.out.println(">>> Uname : "+userName);
		System.out.println(">>> PWD : "+password);
		
		
		if(isValidUserName(userName) && isValidPassword(password))
			System.out.println("Login success!!!");
		else
			throw new RuntimeException("Invalid Username or Password!!");
		System.out.println("loginUser() ended!!");
		
		return true;
	}
	
	public boolean isValidUserName(String userName)
	{
		if(userName != null && userName.matches("^[a-zA-Z0-9]{5,15}$"))
			return true;
		else
			return false;
	}

	public boolean isValidPassword(String password)
	{
        if(password != null && password.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%^&+=!]).{8,}$"))
        	return true;
        else
        	return false;

	}
	
	public String reverseString(String word)
	{
		StringBuilder sb = new StringBuilder(word);
		sb.reverse();
		return new String(sb);
	}

}
