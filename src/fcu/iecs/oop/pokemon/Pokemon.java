package fcu.iecs.oop.pokemon;

public class Pokemon {
	
	private int cp;
	private final String name;
	private final PokemonType type;
	
	Pokemon(String na, PokemonType ty, int c){
		name = na;
		type = ty;
		cp = c;	
	}
	public String getName(){
		return name;
	}
	public PokemonType getType(){
		return type;
	}
	public int getCp(){
		return cp;
	}
	public void setCp(int c){
		cp = c;
	}
}
