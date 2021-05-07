package entities;

public class Campaign implements Entity {

	private int id;
	private int discount;
	private String campaignName;

	public Campaign(int id, int discount, String campaignName) {
		super();
		this.id = id;
		this.discount = discount;
		this.campaignName = campaignName;
	
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

	public String getCampaignName() {
		return campaignName;
	}

	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}

}
