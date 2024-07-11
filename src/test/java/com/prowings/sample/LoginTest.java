package com.prowings.sample;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.platform.commons.util.StringUtils;

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
	@Disabled
//	@RepeatedTest(5)
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

	@Test
	@Timeout(3)
	void someTest() throws InterruptedException {
	    TimeUnit.SECONDS.sleep(5);
	}
	
//	@ParameterizedTest
//	@ValueSource(strings = { "12321", "pop","abc" })
//	void testPalindrome(String word) {
//
//	    assertTrue(word == null ? false : login.reverseString(word).equals(word));
//	}
	
}
