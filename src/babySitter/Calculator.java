package babySitter;



import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;



public class Calculator {

	@Test
	//list for start and end times
     public void isStartTimeAfter5pm() {
		 
	     List<Integer> shiftStart = Arrays.asList(5, 6, 7);
	        
	      //testing that time starts at five for actual
	        assertThat(shiftStart.contains(5));
}
	@Test
	public void whenIsBedTime() {
		List<Integer> bedTime = Arrays.asList(8, 9, 10, 11, 12);
		assertThat(bedTime.contains(8));
	}

	private void assertThat(boolean contains) {
		// TODO Auto-generated method stub
		
	}


}
