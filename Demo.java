package demoPackage;

import java.util.ArrayList;

public class Demo {
	
	
	
	public static void main(String[] args) {
		int [] kaarten = {9,4,3,7,8,3,7,2};
		ArrayList <Integer> kaartenGesorteerd = new ArrayList();
		
		int x = 1;
		while (kaarten.length != kaartenGesorteerd.size()) {
			for (int kaart : kaarten) {
				if (kaart == x) {
					kaartenGesorteerd.add(kaart);
				}
			}
			x++;
		}
		
		for (int kaart : kaartenGesorteerd) {
			System.out.print(kaart + " ");
		}  
		
		
	}
		 

}
