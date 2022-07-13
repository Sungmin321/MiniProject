package project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class MemberDAO {

	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String user = "c##green";
	String password = "green1234";

	private Connection con;
	private Statement stmt;
	private ResultSet rs;

	public boolean Customer_Login(MemberVo p) {
		try {
			connDB();

			String query = "SELECT * FROM customer_info WHERE ID = '" + p.getId() + "' AND password = '"
					+ p.getPassword() + "' AND customer_position=2";
			System.out.println("SQL : " + query);
			rs = stmt.executeQuery(query);
			rs.last();
			System.out.println("rs.getRow() : " + rs.getRow());

			if (rs.getRow() == 0) {
				System.out.println("0 row selected .....");
				return false;
			} else {
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	public boolean Trainer_Login(MemberVo p) {
		try {
			connDB();

			String query = "SELECT * FROM TRAINER_info WHERE ID = '" + p.getId() + "' AND password = '"
					+ p.getPassword() + "'";
			System.out.println("SQL : " + query);
			rs = stmt.executeQuery(query);
			rs.last(); // 커서를 제일 뒤로
			System.out.println("rs.getRow() : " + rs.getRow());

			if (rs.getRow() == 0) {
				System.out.println("0 row selected .....");
				return false;
			} else {
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	public boolean Master_Login(MemberVo p) {
		try {
			connDB();

			String query = "SELECT * FROM customer_info WHERE ID = '" + p.getId() + "' AND password = '"
					+ p.getPassword() + "' AND customer_position=1";
			System.out.println("SQL : " + query);
			rs = stmt.executeQuery(query);
			rs.last();
			System.out.println("rs.getRow() : " + rs.getRow());

			if (rs.getRow() == 0) {
				System.out.println("0 row selected .....");
				return false;
			} else {
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	public String getname(String id) {
		String name = "";
		try {
			connDB();

			String query = "SELECT name FROM CUSTOMER_INFO WHERE id = '" + id + "'";

			System.out.println("SQL : " + query);

			rs = stmt.executeQuery(query);
			rs.last();// 커서를 제일 뒤로
			System.out.println("re.getRow() : " + rs.getRow());

			if (rs.getRow() == 0) {
				System.out.println("0 row selected .....");
			} else {
				System.out.println(rs.getRow() + " rows selected.....");
				rs.previous();// 커서를 제일 앞으로.
				while (rs.next()) {
					name = rs.getString("name");
				}
				System.out.println(name);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return name;
	}

	public String getTRname(String id) {
		String name = "";
		try {
			connDB();

			String query = "SELECT NAME FROM TRAINER_INFO WHERE id = '" + id + "'";

			System.out.println("SQL : " + query);

			rs = stmt.executeQuery(query);
			rs.last();// 커서를 제일 뒤로
			System.out.println("re.getRow() : " + rs.getRow());

			if (rs.getRow() == 0) {
				System.out.println("0 row selected .....");
			} else {
				System.out.println(rs.getRow() + " rows selected.....");
				rs.previous();// 커서를 제일 앞으로.
				while (rs.next()) {
					name = rs.getString("name");
				}
				System.out.println(name);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return name;
	}

	public String getTRid(String name) {
		String id = "";
		try {
			connDB();

			String query = "SELECT ID FROM TRAINER_INFO WHERE NAME = '" + name + "'";

			System.out.println("SQL : " + query);

			rs = stmt.executeQuery(query);
			rs.last();// 커서를 제일 뒤로
			System.out.println("re.getRow() : " + rs.getRow());

			if (rs.getRow() == 0) {
				System.out.println("0 row selected .....");
			} else {
				System.out.println(rs.getRow() + " rows selected.....");
				rs.previous();// 커서를 제일 앞으로.
				while (rs.next()) {
					id = rs.getString("ID");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return id;
	}
	
	public String getid(String name) {
		String id = "";
		try {
			connDB();
			
			String query = "SELECT ID FROM CUSTOMER_INFO WHERE NAME = '" + name + "'";
			
			System.out.println("SQL : " + query);
			
			rs = stmt.executeQuery(query);
			rs.last();// 커서를 제일 뒤로
			System.out.println("re.getRow() : " + rs.getRow());
			
			if (rs.getRow() == 0) {
				System.out.println("0 row selected .....");
			} else {
				System.out.println(rs.getRow() + " rows selected.....");
				rs.previous();// 커서를 제일 앞으로.
				while (rs.next()) {
					id = rs.getString("ID");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return id;
	}

	public String getPT_number(String id) {
		String ptn = "";
		try {
			connDB();

			String query = "SELECT PT_NUMBER FROM CUSTOMER_INFO WHERE id = '" + id + "'";

			System.out.println("SQL : " + query);

			rs = stmt.executeQuery(query);
			rs.last();// 커서를 제일 뒤로
			System.out.println("re.getRow() : " + rs.getRow());

			if (rs.getRow() == 0) {
				System.out.println("0 row selected .....");
			} else {
				System.out.println(rs.getRow() + " rows selected.....");
				rs.previous();// 커서를 제일 앞으로.
				while (rs.next()) {
					ptn = rs.getString("PT_NUMBER");
				}
				System.out.println(ptn);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ptn;
	}

	public String getPT_number_name(String name) {
		String ptn = "";
		try {
			connDB();

			String query = "SELECT PT_NUMBER FROM CUSTOMER_INFO WHERE NAME = '" + name + "'";

			System.out.println("SQL : " + query);

			rs = stmt.executeQuery(query);
			rs.last();// 커서를 제일 뒤로
			System.out.println("re.getRow() : " + rs.getRow());

			if (rs.getRow() == 0) {
				System.out.println("0 row selected .....");
			} else {
				System.out.println(rs.getRow() + " rows selected.....");
				rs.previous();// 커서를 제일 앞으로.
				while (rs.next()) {
					ptn = rs.getString("PT_NUMBER");
				}
				System.out.println(ptn);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ptn;
	}

	public boolean plan_recode_test(String id) {
		try {
			connDB();
			String query = "SELECT * FROM PLAN WHERE ID='" + id + "' AND TO_CHAR(SYSDATE, 'YYYY-MM-DD') = PALN_DATE";

			System.out.println("SQL : " + query);
			rs = stmt.executeQuery(query);
			rs.last();
			System.out.println("rs.getRow() : " + rs.getRow());

			if (rs.getRow() == 0) {
				System.out.println("0 row selected .....");
				return false;
			} else {
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	// InoutDB에 같은 날에 등록한 데이터가 있는지 확인.
	public boolean Inout_test(String id) {
		try {// SELECT * FROM "INOUT" WHERE ID='123' AND TO_CHAR(SYSDATE, 'YYYY-MM-DD') =
				// INOUT_DATE
			connDB();
			String query = "SELECT * FROM INOUT WHERE ID='" + id + "' AND TO_CHAR(SYSDATE, 'YYYY-MM-DD') = INOUT_DATE";

			System.out.println("SQL : " + query);
			rs = stmt.executeQuery(query);
			rs.last();
			System.out.println("rs.getRow() : " + rs.getRow());

			if (rs.getRow() == 0) {
				System.out.println("0 row selected .....");
				return false;
			} else {
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	// 식단 기록 가져오는 메서
	public String get_foodrecode(String id, String date) {
		String foodrecode = "";
		try {
			connDB();

			String query = "SELECT FOODRECODE FROM INOUT WHERE ID ='" + id + "' AND INOUT_DATE = '" + date + "' ";

			System.out.println("SQL : " + query);

			rs = stmt.executeQuery(query);
			rs.last();// 커서를 제일 뒤로
			System.out.println("re.getRow() : " + rs.getRow());

			if (rs.getRow() == 0) {
				System.out.println("0 row selected .....");
			} else {
				System.out.println(rs.getRow() + " rows selected.....");
				rs.previous();// 커서를 제일 앞으로.
				while (rs.next()) {
					foodrecode = rs.getString("foodrecode");
				}
				System.out.println(foodrecode);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return foodrecode;
	}

	// NOTIBOAD DB에 같은 날에 등록한 데이터가 있는지 확인.
	public boolean NOTICE_BOARD_check(String id) {
		try {// SELECT * FROM "INOUT" WHERE ID='123' AND TO_CHAR(SYSDATE, 'YYYY-MM-DD') =
				// INOUT_DATE
			connDB();
			String query = "SELECT * FROM NOTICE_BOARD WHERE ID='" + id
					+ "' AND TO_CHAR(SYSDATE, 'YYYY-MM-DD') = NOTI_DATE";

			System.out.println("SQL : " + query);
			rs = stmt.executeQuery(query);
			rs.last();
			System.out.println("rs.getRow() : " + rs.getRow());

			if (rs.getRow() == 0) {
				System.out.println("0 row selected .....");
				return false;
			} else {
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	// rutin test에 같은 운동명이 같은 루틴에 있는지 확인
	public boolean plan_Rutin_test(String ECname, String Rutinnum, String id) {
		try {// SELECT * FROM RUTIN WHERE EXERCISE_NAME = '운동명' AND RUTIN_NUMBER ='1' AND id
				// = '123'
			connDB();
			String query = "SELECT * FROM RUTIN WHERE EXERCISE_NAME = '" + ECname + "' AND RUTIN_NUMBER ='" + Rutinnum
					+ "' AND id = '" + id + "'";

			System.out.println("SQL : " + query);
			rs = stmt.executeQuery(query);
			rs.last();
			System.out.println("rs.getRow() : " + rs.getRow());

			if (rs.getRow() == 0) {
				System.out.println("0 row selected .....");
				return false;
			} else {
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	public boolean customer_delete_test(String id, String date, String tr_id, String hour) {
		try {
			connDB();
			String query = "SELECT * FROM PT_RESERVATION pr WHERE id = '" + id + "' AND PT_DATE = '" + date
					+ "' AND TR_ID = '" + tr_id + "' AND PT_HOUR = " + hour + "";

			System.out.println("SQL : " + query);
			rs = stmt.executeQuery(query);
			rs.last();
			System.out.println("rs.getRow() : " + rs.getRow());

			if (rs.getRow() == 0) {
				System.out.println("0 row selected .....");
				return false;
			} else {
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	
	public String getRutinsize(String Rutinnum, String id) {

		String size = "";

		try {
			connDB();

			String query = "SELECT count(*) FROM RUTIN r WHERE RUTIN_NUMBER = " + Rutinnum + " AND  id='" + id + "'";
			System.out.println("SQL : " + query);
			rs = stmt.executeQuery(query);
			rs.last();// 커서를 제일 뒤로
			System.out.println("re.getRow() : " + rs.getRow());

			if (rs.getRow() == 0) {
				System.out.println("0 row selected .....");
			} else {
				System.out.println(rs.getRow() + " rows selected.....");
				rs.previous();// 커서를 제일 앞으로.
				while (rs.next()) {
					size = rs.getString("count(*)");
				}
				System.out.println(size);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return size;
	}

	public String get_TR_size(String qur) {

		String size = "";

		try {
			connDB();

			String query = qur;
			System.out.println("SQL : " + query);
			rs = stmt.executeQuery(query);
			rs.last();// 커서를 제일 뒤로
			System.out.println("re.getRow() : " + rs.getRow());

			if (rs.getRow() == 0) {
				System.out.println("0 row selected .....");
			} else {
				System.out.println(rs.getRow() + " rows selected.....");
				rs.previous();// 커서를 제일 앞으로.
				while (rs.next()) {
					size = rs.getString("count(*)");
				}
				System.out.println(size);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return size;
	}

	public ArrayList<RutinVo> Rutin_list(String Rutinnum, String id) {
		ArrayList<RutinVo> list = new ArrayList<RutinVo>();

		try {
			connDB();

			String query = "SELECT * FROM RUTIN WHERE RUTIN_NUMBER = " + Rutinnum + " AND id = '" + id + "'";
			rs = stmt.executeQuery(query);

			while (rs.next()) {
				String ECname = rs.getString("EXERCISE_NAME");
				String ECset = rs.getString("EXERCISE_SET");
				String ECweight = rs.getString("EXERCISE_WEIGHT");
				String ECnumber = rs.getString("EXERCISE_NUMBER");
				RutinVo data = new RutinVo(ECname, ECset, ECweight, ECnumber);
				list.add(data);
				System.out.println(ECname + " : " + ECset + " : " + ECweight + " : " + ECnumber);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;
	}

	public ArrayList<PlanVo> Plan_list(String id) {
		ArrayList<PlanVo> list = new ArrayList<PlanVo>();

		try {
			connDB();

			String query = "SELECT TO_CHAR(PALN_DATE, 'YYYY-MM-DD') , TO_CHAR(STIME, 'HH24:MI') , TO_CHAR(ETIME, 'HH24:MI') , RUTIN FROM PLAN WHERE ID = '"
					+ id + "' ORDER BY PALN_DATE DESC";
			rs = stmt.executeQuery(query);

			while (rs.next()) {
				String DATE = rs.getString(1);
				String STIME = rs.getString(2);
				String ETIME = rs.getString(3);
				String RUTIN = rs.getString(4);
				PlanVo data = new PlanVo(DATE, STIME, ETIME, RUTIN);
				list.add(data);
				System.out.println(DATE + " : " + STIME + " : " + ETIME + " : " + RUTIN);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;
	}

	public ArrayList<InoutVo> Inout_list(String id) {
		ArrayList<InoutVo> list = new ArrayList<InoutVo>();

		try {
			connDB();

			String query = "SELECT TO_CHAR(INOUT_DATE, 'YYYY-MM-DD'), INOUT_WEIGHT, EXERCISING , DRINKING FROM INOUT WHERE ID = '"
					+ id + "'";

			rs = stmt.executeQuery(query);

			while (rs.next()) {
				String DATE = rs.getString(1);
				String WEIGHT = rs.getString(2);
				String EXERCISING = rs.getString(3);
				String DRINKING = rs.getString(4);
				InoutVo data = new InoutVo(DATE, WEIGHT, EXERCISING, DRINKING);
				list.add(data);
				System.out.println(DATE + " : " + WEIGHT + " : " + EXERCISING + " : " + DRINKING);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;
	}

	public ArrayList<PTVo> PT_list(String id) {
		ArrayList<PTVo> list = new ArrayList<PTVo>();

		try {
			connDB();

			String query = "SELECT TO_CHAR(PT_DATE, 'YYYY-MM-DD'), PT_HOUR , TR_ID , FLAG  FROM PT_RESERVATION WHERE ID = '"
					+ id + "' ORDER BY FLAG , PT_DATE DESC  ";

			rs = stmt.executeQuery(query);

			while (rs.next()) {
				String DATE = rs.getString(1);
				String HOUR = rs.getString(2);
				String TR_id = rs.getString(3);
				String flag = rs.getString(4);
				PTVo data = new PTVo(DATE, HOUR, TR_id, flag);
				list.add(data);
				System.out.println(DATE + " : " + HOUR + " : " + TR_id + " : " + flag);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;
	}
	
	public ArrayList<PTVo> PT_list_tr(String id) {
		ArrayList<PTVo> list = new ArrayList<PTVo>();
		
		try {
			connDB();
			
			String query = "SELECT TO_CHAR(PT_DATE, 'YYYY-MM-DD'), PT_HOUR , ID , FLAG  FROM PT_RESERVATION WHERE TR_ID = '"
					+ id + "' ORDER BY FLAG , PT_DATE DESC";
			
			rs = stmt.executeQuery(query);
			
			while (rs.next()) {
				String DATE = rs.getString(1);
				String HOUR = rs.getString(2);
				String TR_id = rs.getString(3);
				String flag = rs.getString(4);
				PTVo data = new PTVo(DATE, HOUR, TR_id, flag);
				list.add(data);
				System.out.println(DATE + " : " + HOUR + " : " + TR_id + " : " + flag);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}

	public ArrayList<CustomerVo> Customer_list() {
		ArrayList<CustomerVo> list = new ArrayList<CustomerVo>();

		try {
			connDB();

			String query = "SELECT NAME , PT_NUMBER FROM CUSTOMER_INFO WHERE CUSTOMER_POSITION = 2";

			rs = stmt.executeQuery(query);

			while (rs.next()) {
				String name = rs.getString(1);
				String Ptcount = rs.getString(2);
				CustomerVo data = new CustomerVo(name, Ptcount);
				list.add(data);
				System.out.println(name + " : " + Ptcount);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;
	}

	public ArrayList<String> getNames(String quy) {
		ArrayList<String> list = new ArrayList<String>();

		try {
			connDB();

			String query = quy;

			rs = stmt.executeQuery(query);

			while (rs.next()) {
				String name = rs.getString(1);
				list.add(name);
				System.out.println(name);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;
	}

	public ArrayList<String> get_TRtimes(String name) {
		ArrayList<String> list = new ArrayList<String>();

		try {
			connDB();

			String query = "SELECT HOUR8, HOUR9, HOUR10, HOUR11 , HOUR12 , HOUR13 , HOUR14 , HOUR15 , HOUR16 , HOUR17 , HOUR18 , HOUR19  FROM TRAINER_INFO WHERE NAME = '"
					+ name + "'";

			rs = stmt.executeQuery(query);

			while (rs.next()) {
				String HOUR8 = rs.getString("HOUR8");
				list.add(HOUR8);
				String HOUR9 = rs.getString("HOUR9");
				list.add(HOUR9);
				String HOUR10 = rs.getString("HOUR10");
				list.add(HOUR10);
				String HOUR11 = rs.getString("HOUR11");
				list.add(HOUR11);
				String HOUR12 = rs.getString("HOUR12");
				list.add(HOUR12);
				String HOUR13 = rs.getString("HOUR13");
				list.add(HOUR13);
				String HOUR14 = rs.getString("HOUR14");
				list.add(HOUR14);
				String HOUR15 = rs.getString("HOUR15");
				list.add(HOUR15);
				String HOUR16 = rs.getString("HOUR16");
				list.add(HOUR16);
				String HOUR17 = rs.getString("HOUR17");
				list.add(HOUR17);
				String HOUR18 = rs.getString("HOUR18");
				list.add(HOUR18);
				String HOUR19 = rs.getString("HOUR19");
				list.add(HOUR19);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;
	}

	public ArrayList<NotiVo> Noti_list() {
		ArrayList<NotiVo> list = new ArrayList<NotiVo>();

		try {
			connDB();

			String query = "SELECT ID , TO_CHAR(NOTI_DATE, 'YYYY-MM-DD'), CONTENTS FROM NOTICE_BOARD";

			rs = stmt.executeQuery(query);

			while (rs.next()) {
				String ID = rs.getString(1);
				String DATE = rs.getString(2);
				String contents = rs.getString(3);
				NotiVo data = new NotiVo(ID, DATE, contents);
				list.add(data);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;
	}

	public void connDB() {

		try {
			Class.forName(driver);
			System.out.println("jdbc driver loading success.");
			con = DriverManager.getConnection(url, user, password);
			System.out.println("oracle connection success");
//			stmt = con.createStatement();
			stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
			System.out.println("syayement create success.");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}