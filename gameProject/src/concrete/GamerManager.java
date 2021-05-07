package concrete;

import abstracts.BaseGamerManager;
import abstracts.GamerCheckService;
import abstracts.GamerService;
import entities.Gamer;

public class GamerManager extends BaseGamerManager implements GamerService {

	private GamerCheckService gamerCheckService;

	
	public GamerManager(GamerCheckService gamerCheckService) {
		super();
		this.gamerCheckService = gamerCheckService;
	}

	public void save(Gamer gamer) {
		if (gamerCheckService.CheckIfRealGamer(gamer)) {
			super.save(gamer);
		} else {
			System.out.println("Not a valid persom");
		}
	}

	@Override
	public void add(Gamer gamer) {
		if (gamerCheckService.CheckIfRealGamer(gamer)) {
			super.save(gamer);
			System.out.println(gamer.getGamerName() + " " + gamer.getGamerLastName() + " adl� oyuncu kay�t oldu.");
		} else {
			System.out.println("Kay�t ba�ar�s�z. Bilgilerinizi kontrol ediniz. ");
		}

	}

	@Override
	public void update(Gamer gamer) {
		System.out.println("Oyuncu bilgileri g�ncellendi. ");

	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println(gamer.getGamerName() + " " + gamer.getGamerLastName() + " adl� oyuncu sistemden silindi.");

	}

}
