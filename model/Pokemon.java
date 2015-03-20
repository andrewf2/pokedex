package model;


import java.io.Serializable;
import java.util.HashMap;

public class Pokemon implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String name;
	private HashMap<String,Integer> moves = new HashMap<String, Integer>();
	
	public HashMap<String,Integer> getMoves() {
		return moves;
	}
	public int getId(){
		return id;
	}
	public void setMoves(HashMap<String,Integer> moves) {
		this.moves = moves;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}
