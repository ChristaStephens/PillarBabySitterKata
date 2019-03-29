package babySitter;



import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;



public class Calculator {

	@Test
	//list for start and end times
     public void isStartTimeAfter5pm() {
		 List<Integer> actual = Arrays.asList(5, 6, 7);
	        List<Integer> expected = Arrays.asList(5, 6, 7);
	        
	      //1. Test equal.
	        assertThat(actual, is(expected));
}


}
