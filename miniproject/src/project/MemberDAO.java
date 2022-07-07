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
			rs.last(); // 目辑甫 力老 第肺
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
			rs.last();// 目辑甫 力老 第肺
			System.out.println("re.getRow() : " + rs.getRow());

			if (rs.getRow() == 0) {
				System.out.println("0 row selected .....");
			} else {
				System.out.println(rs.getRow() + " rows selected.....");
				rs.previous();// 目辑甫 力老 菊栏肺.
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
			rs.last();// 目辑甫 力老 第肺
			System.out.println("re.getRow() : " + rs.getRow());

			if (rs.getRow() == 0) {
				System.out.println("0 row selected .....");
			} else {
				System.out.println(rs.getRow() + " rows selected.....");
				rs.previous();// 目辑甫 力老 菊栏肺.
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

	public String getPT_number(String id) {
		String ptn = "";
		try {
			connDB();

			String query = "SELECT PT_NUMBER FROM CUSTOMER_INFO WHERE id = '" + id + "'";

			System.out.println("SQL : " + query);

			rs = stmt.executeQuery(query);
			rs.last();// 目辑甫 力老 第肺
			System.out.println("re.getRow() : " + rs.getRow());

			if (rs.getRow() == 0) {
				System.out.println("0 row selected .....");
			} else {
				System.out.println(rs.getRow() + " rows selected.....");
				rs.previous();// 目辑甫 力老 菊栏肺.
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

	public boolean Inout_test(String id) {
		try {//SELECT * FROM "INOUT" WHERE ID='123' AND TO_CHAR(SYSDATE, 'YYYY-MM-DD') = INOUT_DATE 
			connDB();
			String query = "SELECT * FROM \"INOUT\" WHERE ID='" + id + "' AND TO_CHAR(SYSDATE, 'YYYY-MM-DD') = INOUT_DATE";
			
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

	public boolean plan_Rutin_test(String ECname, String Rutinnum, String id) {
		try {// SELECT * FROM RUTIN WHERE EXERCISE_NAME = '款悼疙' AND RUTIN_NUMBER ='1' AND id
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

	public String getRutinsize(String Rutinnum, String id) {

		String size = "";

		try {
			connDB();

			String query = "SELECT count(*) FROM RUTIN r WHERE RUTIN_NUMBER = " + Rutinnum + " AND  id='" + id + "'";
			System.out.println("SQL : " + query);
			rs = stmt.executeQuery(query);
			rs.last();// 目辑甫 力老 第肺
			System.out.println("re.getRow() : " + rs.getRow());

			if (rs.getRow() == 0) {
				System.out.println("0 row selected .....");
			} else {
				System.out.println(rs.getRow() + " rows selected.....");
				rs.previous();// 目辑甫 力老 菊栏肺.
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
					+ id + "'";
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
			
			String query = "SELECT TO_CHAR(INOUT_DATE, 'YYYY-MM-DD'), INOUT_WEIGHT, EXERCISING , DRINKING FROM INOUT WHERE ID = '"+id+"'";
			
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