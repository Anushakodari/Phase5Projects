package Testing.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AgeTest1 {

	
		@Test
	    public void test1() {
	        AgeValidation agevalid=new AgeValidation();
	        assertEquals("valid age to vote",agevalid.ageValidator(24));
	    }
	    
	    
	    @Test
	    public void test2() {
	        AgeValidation agevalid=new AgeValidation();
	        assertEquals("not valid to vote",agevalid.ageValidator(14));
	    }
}