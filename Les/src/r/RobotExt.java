package r;
    //dlya nasledovania piwem extends i imya ot kogo
public class RobotExt extends Robot {
	
	//Konstruktor s parametrami
	public RobotExt(double x, double y, double course) {
		// i vyzov konstruktora roditelskogo klasa!
		super(x,y);
		this.course = course;
	}
    public void back(int distance) {
    	forward(-distance);
    	System.out.println("RbotExt JOPA");
    }
}
