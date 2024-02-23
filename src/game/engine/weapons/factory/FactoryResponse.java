package game.engine.weapons.factory;

public class FactoryResponse {
    private Weapon weapon;
    private int remainingResources;
    
    private FactoryResponse(Weapon weapon, int remainingResources) {
    	this.Weapon=weapon;
    	this.remainingResources = remainingResources;
    	
    }
    
}
