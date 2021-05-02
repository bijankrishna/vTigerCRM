package testngDemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert_Demo {
	@Test
	public void createContact()
	{
		String act="Hello";
		String exp="Hello";
		Assert.assertEquals(act, exp);
		System.out.println("valid contact");
	}
	@Test(enabled = false)
	public void createProduct()
	{
		String act="Hello";
		String exp="hello";
		Assert.assertEquals(act, exp);//stops further execution
		System.out.println("valid product");
	}
	
	@Test
	public void createInvoice()
	{
		String act="Hello";
		String exp="llo";
		Assert.assertTrue(act.contains(exp));
		System.out.println("valid invoice");
	}
	
	@Test
	public void createQuote()
	{
		String act="Hello";
		String exp="Ho";
		Assert.assertTrue(act.contains(exp));//stops further execution
		System.out.println("valid quote");
	}
}
