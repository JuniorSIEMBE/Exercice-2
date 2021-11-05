package org.sid;

public class Cercle {
	
	private Point centre;
	
	private double rayon;

	public Cercle(Point centre, double rayon) {
		this.centre = centre;
		this.rayon = rayon;
	}
	
	public Cercle(Point centre, Point p) {
		this.centre = centre;
		this.rayon = Math.sqrt(Math.pow((p.getX()-centre.getX()), 2)+Math.pow((p.getY()-centre.getY()), 2));
	}

	public Point getCentre() {
		return centre;
	}

	public void setCentre(Point centre) {
		this.centre = centre;
	}

	public double getRayon() {
		return rayon;
	}

	public void setRayon(double rayon) {
		this.rayon = rayon;
	}
	
	public double perimetre() {
		return (this.rayon*2*Math.PI);
	}
	
	public double surface() {
		return (this.rayon*this.rayon*Math.PI);
	}
	
	public boolean appartient(Point p) {
		double distance = 0;
		distance = Math.sqrt(Math.pow((p.getX()-centre.getX()), 2)+Math.pow((p.getY()-centre.getY()), 2));
		if(distance<this.rayon) {
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "Cercle [centre=" + centre + ", rayon=" + rayon + ", perimetre()=" + perimetre() + ", surface()="
				+ surface() + "]";
	}


	
	
}
