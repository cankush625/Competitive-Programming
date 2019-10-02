package angle_of_clock;

public class FindClockHandsAngle {
	public void findClockHandsAngle(float hour, float min) {
		float angle = (min * 6) - ((hour * 30) + ((min / 60) * 30));
		
		if(angle < 0 ) {
			angle = -(angle);
		}
		
		System.out.println(angle);
	}
	
	public static void main(String[] args) {
		FindClockHandsAngle clockHandAngle = new FindClockHandsAngle();
		
		clockHandAngle.findClockHandsAngle(11, 30);
	}
}
