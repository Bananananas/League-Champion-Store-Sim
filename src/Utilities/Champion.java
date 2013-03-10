package Utilities;

import java.util.ArrayList;

public class Champion {

	private String name; 				// Name of the Champion
	private int hp;						// Health
	private int hpscale;				// HP Scaling
	private double hpregen;				// Health Regeneration
	private double hpregenscale;		// HP Regen Scaling
	private double mana;				// Mana
	private double manascale;			// Mana Scaling
	private double manaregen;			// Mana Regeneration
	private double manaregenscale;		// Mana Regen Scaling
	private double ad;					// Attack Damage
	private double adscale;				// AD Scaling
	private double attackspeed;			// Attack Speed
	private double attackspeescale;		// Attack Speed Scaling
	private double arm;					// Armor
	private double armorscale;			// Armor Scaling
	private double mrst;				// Magic Resist
	private double mrstscale;			// Magic Resist Scaling
	private int movespeed;				// Movement speed	
	private double ap;						// Ability Power	
	private int level;					// Level of the Champion	
	private int lifeSteal;				// Lifesteal
	private int spellVamp;				// Spellvamp
	private int cdr;					// Cooldown Reduction
	private int tenacity;				// Tenacity
	private int crit;					// Critical Stike Chance
	private int arp;					// Armor Penetration
	private int mpen;					// Magic Penetration
	private ArrayList<Item> items;		// Champions Items 
		

	/**
	 *No Arg Constructor
	 */
	public Champion(){
		
		name = null;
		hp = 0;
		mana = 0;
		ad = 0;
		ap = 0;
		arm = 0;
		mrst = 0;
		movespeed = 0;
		attackspeed = 0.0;
		hpregen = 0.0;
		manaregen = 0.0;
		level = 18;
		lifeSteal = 0;	
		spellVamp = 0;		
		cdr = 0;			
		tenacity = 0;		
		crit = 0;
		arp = 0;
		mpen = 0;
		items = new ArrayList<Item>();
				
	}
	
	/**
	 * Constructor to create a champion with base values and a default of level 18.
	 */
	public Champion(String name, int hp, int hpscale, double hpregen, double hpregenscale, double mana, double manascale, double manaregen, double manaregenscale, double ad, double adscale, 
			double attackspeed, double attackspeedscale, double arm, double armorscale, double mrst, double mrstscale, int movespeed){
		
		this.name = name; 				
		this.hp = hp;				
		this.hpscale = hpscale;		
		this.hpregen = hpregen;			
		this.hpregenscale = hpregenscale;		
		this.mana = mana;		
		this.manascale = manascale;			
		this.manaregen = manaregen;		
		this.manaregenscale = manaregenscale;		
		this.ad = ad;						
		this.adscale = adscale;				
		this.attackspeed = attackspeed;			
		this.attackspeescale = attackspeedscale;		
		this.arm = arm;					
		this.armorscale = armorscale;		
		this.mrst = mrst;				
		this.mrstscale = mrstscale;			
		this.movespeed = movespeed;			
		ap = 0;							
		level = 18;					
		lifeSteal = 0;				
		spellVamp = 0;				
		cdr = 0;					
		tenacity = 0;				
		crit = 0;					
		arp = 0;				
		mpen = 0;					
		items =  new ArrayList<Item>();		
		
	}	
	
	/**
	 * Getter for the Champions name.
	 * @return hp
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
	 * Getter for the Health Scaling per level
	 * @return hpscale
	 */
	public int getHpScale(){
		return hpscale;
	}
	
	/**
	 * Getter for Mana
	 * @return mana
	 */
	public double getMana(){
		return mana;
	}
		
	/**
	 * Getter for Attack Damage
	 * @return ad
	 */
	public double getAd(){
		return ad;
	}
	
	/**
	 * Getter for Ability Power
	 * @return ap
	 */
	public double getAp(){
		return ap;
	}
	
	/**
	 * Getter for Armor
	 * @return arm
	 */
	public double getArm(){
		return arm;
	}
	
	/**
	 * Getter for Magic Resist
	 * @return mrst
	 */
	public double getMrst(){
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
	public double getAttackspeed(){
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
	 * Getter for Movement Speed
	 * @return movespeed
	 */
	public int getLevel(){
		return level;
	}
	
	/**
	 * Setter for a champions level.
	 * @param level
	 */
	public void setLevel(int level){
		this.level = level;
	}

	/**
	 * Getter for Life Steal.
	 * @return
	 */
	public int getLifeSteal() {
	
		return lifeSteal;
	}

	/**'
	 * Getter for Critical Strike Chance.
	 * @return
	 */
	public int getCrit() {
			
		return crit;
	}

	/**
	 * Getter for Tenacity.
	 * @return
	 */
	public int getTenacity() {
		
		return tenacity;
	}

	/**
	 * Getter for cooldown reduction.
	 * @return
	 */
	public int getCDR() {
		
		return cdr;
	}

	/**
	 * Getter for Spell Vamp.
	 * @return
	 */
	public int getSpellVamp() {
		
		return spellVamp;
	}
	
	/**
	 * Getter for Armor Penetration.
	 * @return arp;
	 */
	public int getArp(){
		return arp;
	}
	
	/**
	 * Getter for HP Regen Scaling per Level
	 * @return
	 */
	public double getHpregenscale() {
		return hpregenscale;
	}

	/**
	 * Getter for Scaling Mana per Level
	 * @return
	 */
	public double getManascale() {
		return manascale;
	}

	/**
	 * Getter for Mana Regen Scaling per Level
	 * @return
	 */
	public double getManaregenscale() {
		return manaregenscale;
	}

	/**
	 * Getter for AD Scaling per Level
	 * @return
	 */
	public double getAdscale() {
		return adscale;
	}

	/**
	 * Getter for Attack Speed scaling per Level
	 * @return
	 */
	public double getAttackspeedscale() {
		return attackspeescale;
	}

	/**
	 * Getter for Armor scaling per Level
	 * @return
	 */
	public double getArmorscale() {
		return armorscale;
	}

	/**
	 * Getter for Magic Resist scaling per level.
	 * @return
	 */
	public double getMrstscale() {
		return mrstscale;
	}
	
	/**
	 * Getter for Magic Penetration.
	 * @return
	 */
	public int getMpen(){
		return mpen;
	}
	
	/**
	 * Getter for the champions array of items;
	 * @return
	 */
	public ArrayList<Item> getItems(){
		return items;
	}
	
	/**
	 * Adds an item to a champions items.
	 * @param item
	 */
	public void addItem(Item item){
			items.add(item);
				
	}
			
}
