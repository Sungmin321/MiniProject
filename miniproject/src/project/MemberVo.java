package project;

public class MemberVo {
	private String id;
	private String password;

	public MemberVo() {

	}

	public MemberVo(String id, String password) {
		this.id = id;
		this.password = password;
	}

	public String getId() {
		return id;
	}

	public String getPassword() {
		return password;
	}

	public static MemberVo user = new MemberVo(); // 유저정보

	public static void userInit(MemberVo membervo) {
		user = membervo;
	}
}
