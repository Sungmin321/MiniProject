package project;

public class PlanVo {
	private String DATE, STIME, ETIME, RUTIN;
	
	public PlanVo() {
	}
	
	public PlanVo(String DATE, String STIME, String ETIME, String RUTIN) {
		this.DATE = DATE;
		this.STIME = STIME;
		this.ETIME = ETIME;
		this.RUTIN = RUTIN;
	}

	public String getDATE() {
		return DATE;
	}

	public String getSTIME() {
		return STIME;
	}

	public String getETIME() {
		return ETIME;
	}

	public String getRUTIN() {
		return RUTIN;
	}

}