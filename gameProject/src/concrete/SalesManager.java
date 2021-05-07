package concrete;

import abstracts.SalesService;
import entities.Campaign;
import entities.Game;
import entities.Gamer;

public class SalesManager implements SalesService {

	@Override
	public void buy(Gamer gamer, Game game) {
		System.out.println(gamer.getGamerName() + " " + gamer.getGamerLastName() + " " + game.getGameName()
				+ " adl� oyununu sat�n ald�n�z.");

	}

	@Override
	public void campaignBuy(Gamer gamer, Game game, Campaign campaign) {
		System.out.println(gamer.getGamerName() + " " + gamer.getGamerLastName() + " " + game.getGameName()
				+ " adl� oyununu " + campaign.getCampaignName() + "'yla " 
				+ (game.getPrice() - ((game.getPrice() * campaign.getDiscount()) / 100)) + " tl ile sat�n ald�.");

	}

	@Override
	public void restitute(Game game) {
		System.out.println(game.getGameName() + " oyununu iade ettiniz.");

	}

}
