package org.test;

import org.sid.Cercle;
import org.sid.Point;

public class TestCercle {
	
	public static void main(String[] args) {
		Cercle c1 = new Cercle(new Point(100,100), new Point(200,200));
		Cercle c2 = new Cercle(new Point(130,100), 40);
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		Point p = new Point(120,100);
		if(c1.appartient(p) && c2.appartient(p)) {
			System.out.println(p.toString()+" appartient aux deux cercles");
		}
	}

}
