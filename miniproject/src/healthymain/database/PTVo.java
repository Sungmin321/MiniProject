package healthymain.database;

public class PTVo {
	private String DATE, Hour, TR_Id, flag;
	
	public PTVo() {
	}
	
	public PTVo(String DATE, String hour, String tr_id, String flag) {
		this.DATE = DATE;
		this.Hour = hour;
		this.TR_Id = tr_id;
		this.flag = flag;
	}

	public String getDATE() {
		return DATE;
	}

	public String getHour() {
		return Hour;
	}

	public String getTR_Id() {
		return TR_Id;
	}

	public String getFlag() {
		return flag;
	}

}