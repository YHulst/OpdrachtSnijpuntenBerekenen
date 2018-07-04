package demoPackage;

import java.util.concurrent.TimeUnit;

public class Demo2 {
	

	public static void main(String[] args) {
		double x=1000;
		double y = (x-2)*(x-2) - 4;
		double z = -0.5*x + 4;
		
		int count = 0;
		while(vergelijken(z,y)) {
			y = (x-2)*(x-2) - 4;
			z = -0.5*x + 4;
			if (y < z) {
				x *= 1.5;
			} else if (y > z) {
				x = x/2;
			}	
			System.out.println("x: "+x);
			System.out.println("y: "+y);
			System.out.println("z:"+z);
			System.out.println(" ");
			/*try {
				TimeUnit.SECONDS.sleep(3);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
			if (count++ >= 50) {
				System.out.println(" ");
				break;
			}
		}
		
		System.out.println(x);
	}
	
	static boolean vergelijken(double x, double y) {
		System.out.println(Math.abs(x-y));
		if (Math.abs(x-y) <= (1/1_000_000)) return false;
		else return true;		
	}

}
