package ro.georgescumihail.designpatterns.flyweight;

public class Graphic2DSpriteFlyweight implements IGraphicSprite {

	private String name;
	
	public Graphic2DSpriteFlyweight(String name) {
;
		this.name = name;
		System.out.println("2D sprite created: " + this.name);
	}

	@Override
	public void display(int x, int y) {
		
		System.out.println("Sprite " + name + " placed at coordinates (" + x + ", " + y + ")" );
		
	}

}
