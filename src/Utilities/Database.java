package Utilities;
import java.util.ArrayList;

public class Database {

	private ArrayList<Champion> championList;
	private ArrayList<Item> itemList;
	
	/**
	 * Constructor to create the Champion DataBase that will store all the Champions.
	 */
	public Database (){
		this.championList = new ArrayList<Champion>();
		this.itemList = new ArrayList<Item>();
	}
	
	/**
	 * Getter for the Champion List.
	 * @return championList
	 */
	public ArrayList<Champion> getChampionList(){
		return championList;
	}
	
	/**
	 * Getter for the Item List.
	 * @return itemList
	 */
	public ArrayList<Item> getItemList(){
		return itemList;
	}
	
	/**
	 * Adds a champion to our Database.
	 * @param champ
	 */
	public void add(Champion champ){
		this.championList.add(champ);
	}
	
	/**
	 * Adds an item to our Database.
	 * @param item
	 */
	public void add(Item item){
		this.itemList.add(item);
	}
	
}
