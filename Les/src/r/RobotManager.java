package r;

public class RobotManager {

	public static void main(String[] args) {
		//sozdaem object klassa Robot >> teper s parametrami
		RobotExt robot = new RobotExt(0, 0, 0);
		//vpered na 20
		robot.forward(20);
		//napechatat coordinaty
		System.out.println("========1111111111==========");
		robot.printCoordinates();
		/* korrektnyj sposob menyat kurs.
		realizacia vnutri robota NE silno otli4aetsya NO 
		v lyuboj moment smojem sdelat bollee prodvinutuyu 
		versiyu no klass RobotManager daje ne uznaet ob etom 
		*/
		robot.setCourse(90);
		//vpered na 20 
		robot.forward(20);
		//nape4atat koordinaty
		System.out.println("========22222222222==========");
		robot.printCoordinates();
		
		//kurs 45 gradusov
		robot.setCourse(45);
		System.out.println("-------33333333=======");
		robot.printCoordinates();
		
		//nazad 10
		robot.back(10);
		System.out.println("=======otpolz=========");
		//pe4ataem novie koordinaty
		
		robot.printCoordinates();
		System.out.println("=================44444444444======");

	}

}
