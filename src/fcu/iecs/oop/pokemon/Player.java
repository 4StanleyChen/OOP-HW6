package fcu.iecs.oop.pokemon;

public class Player {
	
	private String playerName;
	private Pokemon[] pokemons;
	private int level=1;
	
	Player(String pl){
		playerName = pl;
	}
	
	//Getter
	public String getPlayername(){
		return playerName;
	}
	public Pokemon getpokemons(int i){
		return pokemons[i];
	}
	public int getLevel(){
		return level;
	}
	
	//Setter
	public void setPlayername(String pl){
		playerName = pl;
	}
	public void setPokemons(Pokemon[] po){
		pokemons = po;
	}
	public void setLevel(int le){
		level = le;
	}
	
}
