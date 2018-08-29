package testcases;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestC {

@Test
public void loginTest(){
	
}
@DataProvider
public Object[][] getData(){
	Object[][]data = new Object[3][3];
	//1st row
	data[0][0]="User1";
	data[0][1]="Pass1";
	data[0][2]="Mozilla";
	//2nd row
	data[1][0] = "User1";
	data[1][1] = "Pass2";
	data[1][2] = "Chrome";
	//3rd row
	data[2][0] = "User1";
	data[2][1] = "Pass2";
	data[2][2] = "IE";
	return data;
}
}
