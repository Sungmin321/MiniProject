package healthymain.database;

public class CustomerVo {
	private String name, Ptcount;

	public CustomerVo() {
		// TODO �ڵ� ������ ������ ����
	}

	public CustomerVo(String name, String Ptcount) {
		this.name = name;
		this.Ptcount = Ptcount;
	}

	public String getName() {
		return name;
	}

	public String getPtcount() {
		return Ptcount;
	}

}