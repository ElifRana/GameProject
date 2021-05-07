import java.util.Date;

import adapters.MernisServiceAdapter;
import concrete.CampaignManager;
import concrete.GameManager;
import concrete.GamerManager;
import concrete.SalesManager;
import entities.Game;
import entities.Gamer;
import entities.Campaign;

public class Main {
	public static void main(String[] args) {
		
		Gamer gamer = new Gamer("43456933096","Elif Rana", "Yýlancý",new Date(2000,04,03));
		Game game1 = new Game(1,"Among Us", 16);
		Game game2 = new Game(2,"Valorant",50);
		Campaign campaign = new Campaign(3,20,"Bahar Sonu Kampanyalarý");
		
		
		GamerManager gamerManager = new GamerManager(new MernisServiceAdapter());
		gamerManager.add(gamer);
		gamerManager.update(gamer);
		gamerManager.delete(gamer);
		System.out.println("---------------------------------");
		
		GameManager gameManager = new GameManager();
		gameManager.add(game2);
		gameManager.add(game1);
		gameManager.update(game2);
		gameManager.delete(game1);
		System.out.println("---------------------------------");
		
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(campaign);
		campaignManager.update(campaign);
		campaignManager.delete(campaign);
		System.out.println("---------------------------------");
		
		SalesManager salesManager = new SalesManager();
		salesManager.buy(gamer, game1);
		salesManager.campaignBuy(gamer, game2, campaign);
		salesManager.restitute(game1);
		System.out.println("---------------------------------");
	}
}
