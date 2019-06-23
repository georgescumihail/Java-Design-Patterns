package flyweight;

import java.util.ArrayList;

public class TestFlyweight {

	public static void main(String[] args) {
		
		ArrayList<IGraphicSprite> gameSprites = new ArrayList<>();
		
		for (int i = 0; i < 5; i++) {
			
			gameSprites.add(Factory2DSprite.getSprite("Grass"));
		}
		
		for (int i = 0; i < 3; i++) {
					
			gameSprites.add(Factory2DSprite.getSprite("Bush"));
		}
		
		
		//displaying the same sprites at different coordinates
		int x = 5;
		int y = 20;
		
		for(IGraphicSprite s : gameSprites) {
			
			s.display(x, y);
			x+=3;
			y+=1;
		}
	}

}
