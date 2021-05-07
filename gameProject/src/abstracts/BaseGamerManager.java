package abstracts;

import entities.Gamer;

public abstract class BaseGamerManager implements GamerService{
	
	@Override
	public void save(Gamer gamer) {
		System.out.println("Veri tabanina kaydedildi. " + gamer.getGamerName() + " " + gamer.getGamerLastName());
	}
}
