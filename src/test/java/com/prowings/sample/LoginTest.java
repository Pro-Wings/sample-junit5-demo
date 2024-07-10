package com.prowings.sample;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
public class LoginTest {
	
	private Login login;
	
	@BeforeAll
	void initAll()
	{
		System.out.println("--- @BeforeAll executed ---");
	}
	
	@BeforeEach
	void init()
	{
		System.out.println("--- @BeforeEach executed ---");
		login = new Login();
	}
	
	@Test
	public void TestValidLogin()
	{
		System.out.println("--- @Test started----");
		
		System.out.println(login.hashCode());
		
		assertTrue(login.loginUser("aaa123", "P@ssword123"));
		
		System.out.println("--- @Test ended----");
	}

	@Test
	public void TestInvalidLogin()
	{
		System.out.println("--- @Test started----");
		System.out.println(login.hashCode());
		
		assertThrows(RuntimeException.class, () -> login.loginUser("aaa", "11122"));
		
		System.out.println("--- @Test ended----");
	}

	
	
}
