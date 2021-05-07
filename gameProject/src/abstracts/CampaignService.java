package abstracts;

import entities.Campaign;

public interface CampaignService {
	
	public void add(Campaign campaign);
	public void update(Campaign campaign);
	public void delete(Campaign campaign);
}
