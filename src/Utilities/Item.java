
package Utilities;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Item {

	private String name;		// Name
	private int hp;				// Health
	private int mana;			// Mana
	private int ad;				// Attack Damage
	private int ap;				// Ability Power
	private int arm;			// Armor
	private int mrst;			// Magic Resist
	private int movespeed;		// Movement speed
	private int attackspeed;	// Attack speed
	private double hpregen;		// Health Regeneration
	private double manaregen;	// Mana Regeneration
	private int lifeSteal;		// Lifesteal
	private int spellVamp;		// Spellvamp
	private int cdr;			// Cooldown Reduction
	private int tenacity;		// Tenacity
	private int crit;			// Critical Stike Chance
	private int arp;			// Armor Penetration
	private int mpen;			// Magic Penetration
	private JButton item;		// JButton
	
	/**
	 * Default Constructor
	 */
	public Item(){
		
		name = null;
		hp = 0;
		mana = 0;
		ad = 0;
		ap = 0;
		arm = 0;
		mrst = 0;
		movespeed = 0;
		attackspeed = 0;
		hpregen = 0.0;
		manaregen = 0.0;
		lifeSteal = 0;	
		spellVamp = 0;		
		cdr = 0;			
		tenacity = 0;		
		crit = 0;
		arp = 0;
		mpen = 0;
		JButton item = new JButton();
				
	}
	
	/**
	 * Constructor to create an Item with all values and a path to its image.
	 * @param hp
	 * @param mana
	 * @param ad
	 * @param ap
	 * @param arm
	 * @param mrst
	 * @param movespeed
	 * @param attackspeed
	 * @param hpregen
	 * @param manaregen
	 * @param icon
	 */
	public Item(String name, int hp, int mana, int ad, int ap, int arm, int mrst, int movespeed, int attackspeed, double hpregen,
	double manaregen, int lifeSteal, int spellVamp, int cdr, int tenacity, int crit, int arp, int mpen, String icon){
		
		this.name = name;
		this.hp = hp;
		this.mana = mana;
		this.ad = ad;
		this.ap = ap;
		this.arm = arm;
		this.mrst = mrst;
		this.movespeed = movespeed;
		this.attackspeed = attackspeed;
		this.hpregen = hpregen;
		this.manaregen = manaregen;
		this.lifeSteal = lifeSteal;	
		this.spellVamp = spellVamp;		
		this.cdr = cdr;			
		this.tenacity = tenacity;		
		this.crit = crit;	
		this.arp = arp;
		this.mpen = mpen;
		item = new JButton(new ImageIcon(icon));
			
	}
	
	/**
	 * Constructor to create an Item with all values.
	 * @param hp
	 * @param mana
	 * @param ad
	 * @param ap
	 * @param arm
	 * @param mrst
	 * @param movespeed
	 * @param attackspeed
	 * @param hpregen
	 * @param manaregen
	 */
	public Item(String name, int hp, int mana, int ad, int ap, int arm, int mrst, int movespeed, int attackspeed, double hpregen,
	double manaregen, int lifeSteal, int spellVamp, int cdr, int tenacity, int crit, int arp, int mpen){
		
		this.name = name;
		this.hp = hp;
		this.mana = mana;
		this.ad = ad;
		this.ap = ap;
		this.arm = arm;
		this.mrst = mrst;
		this.movespeed = movespeed;
		this.attackspeed = attackspeed;
		this.hpregen = hpregen;
		this.manaregen = manaregen;
		this.lifeSteal = lifeSteal;	
		this.spellVamp = spellVamp;		
		this.cdr = cdr;			
		this.tenacity = tenacity;		
		this.crit = crit;	
		this.arp = arp;
		this.mpen = mpen;
		item = new JButton();
			
	}	
	
	/**
	 * Getter for Name
	 * @return name
	 */
	public String getName(){
		return name;
	}
	
	/**
	 * Getter for Health
	 * @return hp
	 */
	public int getHp(){
		return hp;
	}
	
	/**
	 * Getter for Mana
	 * @return mana
	 */
	public int getMana(){
		return mana;
	}
		
	/**
	 * Getter for Attack Damage
	 * @return ad
	 */
	public int getAd(){
		return ad;
	}
	
	/**
	 * Getter for Ability Power
	 * @return ap
	 */
	public int getAp(){
		return ap;
	}
	
	/**
	 * Getter for Armor
	 * @return arm
	 */
	public int getArm(){
		return arm;
	}
	
	/**
	 * Getter for Magic Resist
	 * @return mrst
	 */
	public int getMrst(){
		return mrst;
	}
	
	/**
	 * Getter for Movement Speed
	 * @return movespeed
	 */
	public int getMovespeed(){
		return movespeed;
	}
	
	/**
	 * Getter for Attack Speed
	 * @return attackspeed
	 */
	public int getAttackspeed(){
		return attackspeed;
	}
	
	/**
	 * Getter for Health Regeneration per 5
	 * @return hpregen
	 */
	public double getHpregen(){
		return hpregen;
	}
	
	/**
	 * Getter for Mana Regeneration
	 * @return manaregen
	 */
	public double getManaregen(){
		return manaregen;
	}
	
	/**
	 * Getter for LifeSteal
	 * @return lifesteal
	 */
	public int getLifeSteal() {
	
		return lifeSteal;
	}

	/**
	 * Getter for crit
	 * @return crit
	 */
	public int getCrit() {
			
		return crit;
	}
	
	/**
	 * Getter for tenacity
	 * @return tenacity
	 */
	public int getTenacity() {
		
		return tenacity;
	}

	/**
	 * Getter for Cooldown Reduction
	 * @return cdr
	 */
	public int getCDR() {
		
		return cdr;
	}

	/**
	 * Getter for Spell Vamp
	 * @return spellVamp
	 */
	public int getSpellVamp() {
		
		return spellVamp;
	}
	
	/**
	 * Getter for Armor Penetration
	 * @return arp
	 */
	public int getArp(){
		return arp;
	}
	
	/**
	 * Getter for Magic Penetration
	 * @return mpen
	 */
	public int getMpen(){
		return mpen;
	}
	
	/**
	 * Getter for the JButton associated with an item.
	 * @return item
	 */
	public JButton getButton(){
		return item;
	}
	
}
