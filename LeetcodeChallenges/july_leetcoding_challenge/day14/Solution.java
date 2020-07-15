package july_leetcoding_challenge.day14;

public class Solution {
	public double angleClock(int hour, int minutes) {
		if (hour <= 0 || hour > 12 || minutes < 0 || minutes > 59) return 0;
        if (hour == 12) {
        	double angle = (minutes * 6) - (minutes * 0.5);
            if (angle < 0) angle = -angle;
            if (angle > 180) angle = 360 - angle;
        	return angle;
        } else {
        	double angle = (minutes * 6) - (hour * 30) - (minutes * 0.5);
            if (angle < 0) angle = -angle;
            if (angle > 180) angle = 360 - angle;
        	return angle;
        }
    }
}
