package game.engine.weapons;
import game.engine.interfaces.Attacker;
public abstract class Weapon implements Attacker { //Implements 3lshan hwa 2al "A weapon should be able to perform an attack."
	private final int baseDamage;
	public Weapon(int baseDamage) {
		this.baseDamage = baseDamage;
	}

	@Override
	public int getDamage() {
		return this.baseDamage;
	}
	
	

}
