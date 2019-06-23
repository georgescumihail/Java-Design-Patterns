package ro.georgescumihail.designpatterns.facade;

public class PCFacade {

	
	public static void buyPC(int speed, int height, int width, int nrButtons) {
		
		Unit unit = new Unit(speed);
		unit.add();
		
		Screen screen = new Screen(height, width);
		screen.add();
		
		Mouse mouse = new Mouse(nrButtons);
		mouse.add();
	
	}
}
