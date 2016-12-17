package r;

public class Robot {
	
	//tekuwaya kordinata x
	private double x = 0;

	//tekuwaya kordinata y
	private double y = 0;
	
	//tekuwiy kurs v radusax
	protected double course = 0;
	
	// konstraktor prisvavivaet
	public Robot(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	//peredvijenie na distanciyu
	public void forward(int distance) {
		// obrawenie k polyu object x
        x = x + distance * Math.cos(course / 180 * Math.PI);
        // obrawenie kpolyu objext y
        y = y + distance * Math.sin(course / 180 * Math.PI); 
	
	}
	
	//pechat koordinat robota
	public void printCoordinates() {
		System.out.println("JOPA1");
		System.out.println(x + "," + y);

	}
    
	public double getX() {
		return x;
	}
	
	public double getY() {
	    return y;
    }
    public double getCourse(double course) {
    	return course;
    }
    
    public void setCourse(double course) {
    	this.course = course;
    	System.out.println("JOPA2"); 
	}
    {
     System.out.println("JOPA3");
    }
    } 
