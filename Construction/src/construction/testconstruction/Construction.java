import static org.junit.Assert.*;

import org.junit.Test;

import construction.construction;

public class Construction {

	
	construction cc=new construction();
	/*User Options
	 * 1.Standard Material.
	 * 2.Above Standard Material.
	 * 3.High Standard Material.
	 * 4.Highly Standard Material With Fully Automated Home.
	 */
	@Test
	public void test() {
		//Test Cases for Standard Materials.
		assertEquals("Wrong Answer",960000,cc.construction(1,800),0.0);
		assertEquals("Wrong Answer",992160,cc.construction(1,826.8),0.0);
		assertEquals("Wrong Answer",511200,cc.construction(1,426),0.0);
		//Test Cases for Above Standard Materials.
		assertEquals("Wrong Answer",1350000,cc.construction(2,900),0.0);
		assertEquals("Wrong Answer",874500,cc.construction(2,583),0.0);
		assertEquals("Wrong Answer",677850,cc.construction(2,451.9),0.0);
		//Test Cases for High Standard Material.
		assertEquals("Wrong Answer",900000,cc.construction(3,500),0.0);
		assertEquals("Wrong Answer",1710450,cc.construction(3,950.25),0.0);
		assertEquals("Wrong Answer",921600,cc.construction(3,512),0.0);
		//Test Cases for Highly Standard Materials with Fully Automated Home.
		assertEquals("Wrong Answer",1250000,cc.construction(4,500),0.0);
		assertEquals("Wrong Answer",625625,cc.construction(4,250.25),0.0);
		assertEquals("Wrong Answer",1072500,cc.construction(4,429),0.0);
		
	}

}