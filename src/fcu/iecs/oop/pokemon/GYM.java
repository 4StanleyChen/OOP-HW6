package fcu.iecs.oop.pokemon;
import java.util.Random; 

public class GYM{

	public static Player fight(Player p1, Player p2){
		int p1cont=0, p1num=0;
		int p2cont=0, p2num=0;
		PokemonType p1type;
		PokemonType p2type;
		
		
		while(p1cont < 3 && p2cont < 3){
			Random rdp1 = new Random();
			int pnum = rdp1.nextInt(2);
			p1num = pnum;
			
			Random rdp2 = new Random();
			int pnum2 = rdp2.nextInt(2);
			p2num = pnum2;
			p1type = p1.getpokemons(p1num).getType();
			p2type = p2.getpokemons(p2num).getType();
			if(p1type == PokemonType.FIRE && p2type == PokemonType.GRASS){
				p1cont++;
				p2num++;
			}
			else if(p1type == PokemonType.GRASS && p2type == PokemonType.WATER){
				p1cont++;
				p2num++;
			}
			else if(p1type == PokemonType.WATER && p2type == PokemonType.FIRE){
				p1cont++;
				p2num++;
			}
			else if(p1type==p2type){
				if(p1.getpokemons(p1num).getCp() > p2.getpokemons(p2num).getCp()){
					p1cont++;
					p2num++;
				}
				else if(p1.getpokemons(p1num).getCp() < p2.getpokemons(p2num).getCp()){
					p2cont++;
					p1num++;
				}
				else{
					Random rd = new Random();
					int win = rd.nextInt(2)+1;
					if(win==1){
						p1cont++;
						p2num++;
					}
					else{
						p2cont++;
						p1num++;
					}
				}
			}
			else{
				p2cont++;
				p1num++;
			}
		}
		
		//result
		if(p1cont>p2cont){
			p1.setLevel(p1.getLevel()+1);
			System.out.println("Winner is " + p1.getPlayername() + ", and his/her level becomes " + p1.getLevel() + ".");
			return p1;
		}
		else{
			p2.setLevel(p2.getLevel()+1);
			System.out.println("Winner is " + p2.getPlayername() + ", and his/her level becomes " + p2.getLevel() + ".");
			return p2;
		}
		
		
		
		
	}
	
	


}