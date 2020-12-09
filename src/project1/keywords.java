package project1;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class keywords {
@Test(invocationCount = 4)
public void s1() {
	System.out.println("run test case multiple time");
	
}

@Test(dependsOnMethods = "s1")
public void s2(){
	System.out.println("s2 is depends on s1");
}

@Test(timeOut = 3)public void s3() throws InterruptedException {
	Thread.sleep(2000);
	System.out.println("run in given time");
}

@Test(enabled=false)
public void s4() {System.out.println("shiv");
	
}


@Test(priority=3)
public void s5() {
	Reporter.log("priority",true);
}
}
