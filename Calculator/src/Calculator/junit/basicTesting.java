import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import Calculator.basic;
import static org.junit.Assert.assertEquals;
class basicTesting {
	
	basic op=new basic();
	@Test
	void addition_test() {
		assertEquals("Wrong Answer at adding",10,op.addition(5,5),0.0);
		assertEquals("Wrong Answer at adding",88.6,op.addition(55.5,33.1),0.0);
		assertEquals("Wrong Answer at adding",122.3,op.addition(89.8,32.5),0.0);
	}
	@Test
	void division_test()
	{
		assertEquals("Wrong Answer check div method",4,op.division(20, 5),0.0);
		assertEquals("Wrong Answer check div method",7.937984496124031,op.division(51.2,6.45),0.0);
		assertEquals("Wrong Answer check div method",3.4,op.division(8.5,2.5),0.0);
	}
	@Test
	void multiplication_test()
	{
		assertEquals("Wrong Answer check mul method",100,op.multiplication(25,4),0.0);
		assertEquals("Wrong Answer check mul method",15.600000000000001,op.multiplication(5.2,3),0.0);
		assertEquals("Wrong Answer check mul method",249920.649,op.multiplication(2595.23, 96.3),0.0);
	}


}
