package testngDemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertWithMSZ_Demo {
	@Test
	public void createContact()
	{
		String act="Hello";
		String exp="Hello";
		Assert.assertEquals(act, exp,"Actual contact didnot matched with expected contact");
		System.out.println("valid contact");
	}
	@Test
	public void createProduct()
	{
		String act="Hello";
		String exp="hello";
		Assert.assertEquals(act, exp,"Actual Product didnot matched with expected Product");//stops further execution
		System.out.println("valid product");
	}
	
	@Test
	public void createInvoice()
	{
		String act="Hello";
		String exp="llo";
		Assert.assertTrue(act.contains(exp),"Actual Invoice didnot matched with expected Invoice");
		System.out.println("valid invoice");
	}
	
	@Test
	public void createQuote()
	{
		String act="Hello";
		String exp="Ho";
		Assert.assertTrue(act.contains(exp),"Actual Quote didnot matched with expected Quote");//stops further execution
		System.out.println("valid quote");
	}
}
