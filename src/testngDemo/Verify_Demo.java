package testngDemo;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Verify_Demo {

	@Test
	public void createContact()
	{
		SoftAssert sa=new SoftAssert();
		//case1
		String act1="Hello";
		String exp1="Hello";
		sa.assertEquals(act1, exp1);
		System.out.println("Jay Mata Di 1");
		
		//case2
		String act2="Hello";
		String exp2="hello";
		sa.assertEquals(act2, exp2);
		System.out.println("Jay Mata Di 2");
		
		//case3
		String act3="Hello";
		String exp3="llo";
		sa.assertTrue(act3.contains(exp3));
		System.out.println("Jay Mata Di 3");
		
		//case4
		String act4="Hello";
		String exp4="Ho";
		sa.assertTrue(act4.contains(exp4));
		System.out.println("Jay Mata Di 4");
		
		sa.assertAll();
	}
}
