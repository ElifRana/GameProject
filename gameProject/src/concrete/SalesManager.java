package concrete;

import abstracts.SalesService;
import entities.Campaign;
import entities.Game;
import entities.Gamer;

public class SalesManager implements SalesService {

	@Override
	public void buy(Gamer gamer, Game game) {
		System.out.println(gamer.getGamerName() + " " + gamer.getGamerLastName() + " " + game.getGameName()
				+ " adlý oyununu satýn aldýnýz.");

	}

	@Override
	public void campaignBuy(Gamer gamer, Game game, Campaign campaign) {
		System.out.println(gamer.getGamerName() + " " + gamer.getGamerLastName() + " " + game.getGameName()
				+ " adlý oyununu " + campaign.getCampaignName() + "'yla " 
				+ (game.getPrice() - ((game.getPrice() * campaign.getDiscount()) / 100)) + " tl ile satýn aldý.");

	}

	@Override
	public void restitute(Game game) {
		System.out.println(game.getGameName() + " oyununu iade ettiniz.");

	}

}
