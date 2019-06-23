package ro.georgescumihail.designpatterns.flyweight;

import java.util.HashMap;

public class Factory2DSprite {

	public static HashMap<String, Graphic2DSpriteFlyweight> spritesStorage = new HashMap<>();
	
	public static Graphic2DSpriteFlyweight getSprite(String name) {
		
		Graphic2DSpriteFlyweight graphicSprite;
		
		if(spritesStorage.containsKey(name)) {
			
			graphicSprite = spritesStorage.get(name);
		}
		
		else {
			
			graphicSprite = new Graphic2DSpriteFlyweight(name);
			spritesStorage.put(name, graphicSprite);
		}
		
		return graphicSprite;
	}
}
