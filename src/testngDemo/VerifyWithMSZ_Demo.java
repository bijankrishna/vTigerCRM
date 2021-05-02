package testngDemo;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class VerifyWithMSZ_Demo {
	@Test
	public void createContact()
	{
		SoftAssert sa=new SoftAssert();
		//case1
		String act1="Hello";
		String exp1="Hello";
		sa.assertEquals(act1, exp1,"Actual result-1 didnot matched with expected result-1");
		System.out.println("Jay Mata Di 1");
		
		//case2
		String act2="Hello";
		String exp2="hello";
		sa.assertEquals(act2, exp2,"Actual result-2 didnot matched with expected result-2");
		System.out.println("Jay Mata Di 2");
		
		//case3
		String act3="Hello";
		String exp3="llo";
		sa.assertTrue(act3.contains(exp3),"Actual result-3 didnot matched with expected result-3");
		System.out.println("Jay Mata Di 3");
		
		//case4
		String act4="Hello";
		String exp4="Ho";
		sa.assertTrue(act4.contains(exp4),"Actual result-4 didnot matched with expected result-4");
		System.out.println("Jay Mata Di 4");
		
		sa.assertAll();
	}
}
