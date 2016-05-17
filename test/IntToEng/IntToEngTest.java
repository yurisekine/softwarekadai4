package IntToEng;

import static org.junit.Assert.*;

import org.junit.Test;

public class IntToEngTest {

	/*@Test
	public void test() {
		fail("Not yet implemented");
	}*/

	@Test
	public void test() {
		IntToEng ite = new IntToEng();
		for(int i=0; i<101; i++) { //0~100までのテスト
			System.out.print(i+"  ");
			System.out.println(ite.translateEng(i));
		}
		
	}
}
