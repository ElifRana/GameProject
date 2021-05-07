package adapters;

import java.rmi.RemoteException;

import abstracts.GamerCheckService;
import entities.Gamer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements GamerCheckService{

	@Override
	public boolean CheckIfRealGamer(Gamer gamer) {
		
		KPSPublicSoap client = new KPSPublicSoapProxy();
		boolean result = false;
		try {
			result = client.TCKimlikNoDogrula(Long.parseLong(gamer.getTcNo()),
					gamer.getGamerName().toUpperCase(),
					gamer.getGamerLastName().toUpperCase(), 
					gamer.getDataOfBirth().getYear());
			
		}catch (NumberFormatException e) {
			e.printStackTrace();
			
		}catch(RemoteException e) {
			e.printStackTrace();
			
		}
		return result;
	}

}
