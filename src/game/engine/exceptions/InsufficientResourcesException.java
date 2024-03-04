package game.engine.exceptions;

public class InsufficientResourcesException extends GameActionException {
	private static final String MSG = "Not enough resources, resources provided = ";
	private int resourcesProvided;
	
	public InsufficientResourcesException(int resourcesProvided) {
		super(MSG + resourcesProvided);
		setResourcesProvided(resourcesProvided);
		
	}
	public InsufficientResourcesException(String message, int resourcesProvided){
		super(message);
		setResourcesProvided(resourcesProvided);
	}

	public int getResourcesProvided() {
		return resourcesProvided;
	}

	public void setResourcesProvided(int resourcesProvided) {
		this.resourcesProvided = resourcesProvided;
	}

}
