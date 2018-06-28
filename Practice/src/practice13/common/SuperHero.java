package practice13.common;

public class SuperHero extends Hero {
	public SuperHero() {
		super();
	}


	private Item equipment;

	public int attack() {
		return super.attack()+equipment.getAdditionalDamage();
	}

	public void setEquipment(Item equipment) {
		this.equipment = equipment;
	}

	public Item getEquipment() {
		return this.equipment;
	}

}
