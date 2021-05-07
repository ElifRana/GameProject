package abstracts;

import entities.Gamer;

public interface GamerService{
	
	public void save(Gamer gamer);
	
	public void add(Gamer gamer);
	public void update(Gamer gamer);
	public void delete(Gamer gamer);
}
