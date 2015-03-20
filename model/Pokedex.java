package model;
import java.util.ArrayList;


public class Pokedex {
	private static ArrayList<Pokemon> pokemon = new ArrayList<>();

	public ArrayList<Pokemon> all() {
		return pokemon;
	}

	public static void append(Pokemon newPokemon){
		pokemon.add(newPokemon);
		
		
	}
	public static Pokemon find(int id){
		Pokemon aPokemon = null;
		for(Pokemon target:pokemon){
			if(target.getId() == id){
				aPokemon = target;
			}	
		}
		return aPokemon;
	}
	public static void save(){
		//hibernate code to save to database
	}
	
	public static void sync(){
		//http call to get pokemonm from api
	}
	
	public static void writeToFile(){
		//QCjson code to write to file
	}
	

}
