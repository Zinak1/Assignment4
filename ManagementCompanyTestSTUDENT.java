/*
 * @author Zeliha Inak
 */
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class ManagementCompanyTestSTUDENT {
	ManagementCompany m ;
	Plot p1, p2, p3;
	
	@Before
	public void setUp() throws Exception {
		//student create a management company
		
		m= new ManagementCompany("Railey", "555555555",6);
		
		//student add three properties, with plots, to mgmt co
		m.addProperty ("Almost Aspen", "Glendale", 4844.00, "Sammy Smith",2,1,2,2);
		m.addProperty ("Ambiance", "Lakewood", 4114, "Tammy Taylor",4,1,2,2);
		m.addProperty ("Bear Creek Lodge", "Peninsula", 4905, "Bubba Burley",6,1,2,2);
	
		
	}

	@After
	public void tearDown() {
		//student set mgmt co to null  
		m=null;
		
	}

	/*@Test
	public void testAddPropertyDefaultPlot() {
		fail("STUDENT test not implemented yet");
		//student should add property with 4 args & default plot (0,0,1,1)
		assertEquals(m.addProperty("Sunsational", "Beckman", 2613, "BillyBob Wilson",2,5,2,2),3,0);
		assertEquals(m.addProperty("Mystic Cove", "Lakepointe", 5327, "Joey BagODonuts",4,5,2,2),-4,0);
		
		//student should add property with 8 args
		//student should add property that exceeds the size of the mgmt co array and can not be added, add property should return -1
		assertEquals(m.addProperty("Too Many Properties", "Lakepointe", 1000,"Joey BagODonuts",6,5,2,2),-4,0);
	}
 
	@Test
	public void testMaxRentProp() {
		//student should test if maxRentProp contains the maximum rent of properties
		
	}*/

	@Test
	public void testTotalRent() {
		//student should test if totalRent returns the total rent of properties
		
	}

 }
