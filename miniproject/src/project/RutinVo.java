package project;

public class RutinVo {
	private String ECname, ECset, ECweight, ECnumber;
	
	public RutinVo() {
	}
	
	public RutinVo(String ECname, String ECset, String ECweight, String ECnumber) {
		this.ECname = ECname;
		this.ECset = ECset;
		this.ECweight = ECweight;
		this.ECnumber = ECnumber;
	}

	public String getECname() {
		return ECname;
	}

	public String getECset() {
		return ECset;
	}

	public String getECweight() {
		return ECweight;
	}

	public String getECnumber() {
		return ECnumber;
	}
	
	
}