package project;

public class InoutVo {
	private String DATE, WEIGHT, EXERCISING, DRINKING;
	
	public InoutVo() {
	}
	
	public InoutVo(String DATE, String WEIGHT, String EXERCISING, String DINKING) {
		this.DATE = DATE;
		this.WEIGHT = WEIGHT;
		this.EXERCISING = EXERCISING;
		this.DRINKING = DINKING;
	}

	public String getDATE() {
		return DATE;
	}

	public String getWEIGHT() {
		return WEIGHT;
	}

	public String getEXERCISING() {
		return EXERCISING;
	}

	public String getDRINKING() {
		return DRINKING;
	}

}