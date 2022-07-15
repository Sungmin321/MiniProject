package healthymain.database;

public class NotiVo {
	private String ID, DATE, Suggestions;
	
	public NotiVo(String ID,String DATE,String Suggestions) {
		this.ID = ID;
		this.DATE = DATE;
		this.Suggestions = Suggestions;
	}

	public String getID() {
		return ID;
	}

	public String getDATE() {
		return DATE;
	}

	public String getSuggestions() {
		return Suggestions;
	}

}