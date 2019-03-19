import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;
import Interest_Rate.Interest_Rate;

class InterestTest {
	Interest_Rate i=new Interest_Rate();
	@Test
	void simple_interest_test() {
		assertEquals("Error at Simple Interest",137.99999999999997,i.simple_interest(1500,2,4.6),0.0);
		assertEquals("Error at Simple Interest",7.2,i.simple_interest(15,12,4),0.0);
		assertEquals("Error at Simple Interest",1368.0,i.simple_interest(12000,3.8,3),0.0);
	}
	@Test
	void compound_interest_test() {
		assertEquals("Error at Compound Interest",1641.1740000000002,i.compound_interest(1500,2,4.6),0.0);
		assertEquals("Error at Compound Interest",24.015483278515223,i.compound_interest(15,12,4),0.0);
		assertEquals("Error at Compound Interest",16679.01984,i.compound_interest(15000,3,3.6),0.0);
	}	
}
