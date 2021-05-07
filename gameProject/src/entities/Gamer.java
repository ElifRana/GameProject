package entities;

import java.util.Date;

public class Gamer implements Entity{
	private String tcNo;
	private String gamerName;
	private String gamerLastName;
	private Date dataOfBirth;
	
	public Gamer(String tcNo, String gamerName, String gamerLastName, Date dataOfBirth) {
		super();
		this.tcNo = tcNo;
		this.gamerName = gamerName;
		this.gamerLastName = gamerLastName;
		this.dataOfBirth = dataOfBirth;
	}

	public String getTcNo() {
		return tcNo;
	}

	public void setTcNo(String tcNo) {
		this.tcNo = tcNo;
	}

	public String getGamerName() {
		return gamerName;
	}

	public void setGamerName(String gamerName) {
		this.gamerName = gamerName;
	}

	public String getGamerLastName() {
		return gamerLastName;
	}

	public void setGamerLastName(String gamerLastName) {
		this.gamerLastName = gamerLastName;
	}

	public Date getDataOfBirth() {
		return dataOfBirth;
	}

	public void setDataOfBirth(Date dataOfBirth) {
		this.dataOfBirth = dataOfBirth;
	}
}
