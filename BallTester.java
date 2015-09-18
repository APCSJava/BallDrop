/**
 * Creates instances of the Ball class and simulates them
 */
public class BallTester {

	public static void main(String[] args) {
		//Sample Test - Drop from 100m, stationary
		Ball b = new Ball(100, 0, -9.8);
		while (b.getHeight()>=0){
			b.simulate(0.01);
			System.out.println("Height: "+b.getHeight()+ " at "+b.getVelocity()+"m/sec");
		}
		
		// Second Test - Fire upwards, from ground, at initial velocity 10m/s
	}
}
