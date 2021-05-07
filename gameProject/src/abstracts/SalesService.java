package abstracts;

import entities.Campaign;
import entities.Game;
import entities.Gamer;

public interface SalesService {
	
	public void buy(Gamer gamer, Game game);
	public void campaignBuy(Gamer gamer, Game game, Campaign campaign);
	public void restitute(Game game);
}
