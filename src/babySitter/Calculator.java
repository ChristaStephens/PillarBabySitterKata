package babySitter;



import org.junit.Test;



public class Calculator {

	

	private Object[] startTime;
	int[] validStartTime = {5, 6, 7, 8, 9, 10, 11};

	@Test
     public void isStartTimeAfter5pm() {
          MellieWageCalulator workTime = new MellieWageCalulator(startTime);
          assertArrayEquals(5, workTime.calculateHoursWorked());
}

	private void assertArrayEquals(int time, Object[] calculateHoursWorked) {
		// TODO Auto-generated method stub
		
		
	}


}
