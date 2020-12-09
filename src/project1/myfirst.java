package project1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class myfirst {
	@Test
public void s1() {
		System.out.println("my first test case");}
		@AfterClass
		public void  a1() {
			System.out.println("Interview");
		}
		@Test
		public void s2() {
			System.out.println("my second test casse");
		}
		@Test
		public void a() {
			System.out.println("my third test case");
		}
		
		@BeforeMethod
		public void ma () {
			System.out.println("shivanand");
		}
		
		@AfterMethod
		public void s3() {
			System.out.println("rohinkar");
		}
		@BeforeClass
		public void s4() {
			System.out.println("got a job");
		}
		
	}


