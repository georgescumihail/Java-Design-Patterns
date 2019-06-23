package decorator;

public abstract class AbstractCharacterDecorator implements ICharacter {

	protected ICharacter baseCharacter;

	public AbstractCharacterDecorator(ICharacter character) {
		
		this.baseCharacter = character;
	}
	
}
