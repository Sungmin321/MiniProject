package project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Insert {
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String user = "c##green";
	String password = "green1234";

	private Connection con;
	private Statement stmt;
	private ResultSet rs;

	public Insert() {
	}

//	public Insert(String ID, String PASSWORD, String NAME, int SEX, String BIRTHDAY, String EMAIL, int PHONE_NUMBER) {
//		try {
//			Class.forName(driver);
//			System.out.println("jdbc driver loading success.");
//			con = DriverManager.getConnection(url, user, password);
//			System.out.println("oracle connection success.\n");
//			stmt = con.createStatement();
//
//			String sql = "INSERT INTO CUSTOMER_INFO VALUES ('" + ID + "', '" + PASSWORD + "', '" + NAME + "', '" + SEX
//					+ "', '" + BIRTHDAY + "', '" + EMAIL + "', '" + PHONE_NUMBER + "',3,2)";
//			boolean b = stmt.execute(sql);
//			if (!b) {
//				System.out.println("Insert success.\n");
//			} else {
//				System.out.println("Insert fail.\n");
//			}
//
//		} catch (ClassNotFoundException e) {
//			System.out.println(e);
//		} catch (SQLException e) {
//			System.out.println(e);
//		}
//
//	}

	public static void main(String[] args) {
	}

	public boolean signup(String ID, String PASSWORD, String NAME, int SEX, String BIRTHDAY, String EMAIL,
			int PHONE_NUMBER) {

		try {
			connDB();

			String sql = "INSERT INTO CUSTOMER_INFO VALUES ('" + ID + "', '" + PASSWORD + "', '" + NAME + "', " + SEX
					+ ", '" + BIRTHDAY + "', '" + EMAIL + "', '" + PHONE_NUMBER + "',3,2)";
			System.out.println(sql);
			boolean b = stmt.execute(sql);
			if (!b) {
				System.out.println("Insert success.\n");
				return true;
			} else {
				System.out.println("Insert fail.\n");
				return false;
			}

		} catch (SQLException e) {
			System.out.println(e);
			return false;
		}
	}

	public boolean tr_signup(String ID, String PASSWORD, String NAME, int SEX, int PHONE_NUMBER) {

		try {
			connDB();

			String sql = "INSERT INTO TRAINER_INFO VALUES ('" + ID + "', '" + PASSWORD + "', '" + NAME + "', " + SEX
					+ ", '" + PHONE_NUMBER + "',1,1,1,1,1,1,1,1,1,1,1,1)";
			System.out.println(sql);
			boolean b = stmt.execute(sql);
			if (!b) {
				System.out.println("Insert success.\n");
				return true;
			} else {
				System.out.println("Insert fail.\n");
				return false;
			}

		} catch (SQLException e) {
			System.out.println(e);
			return false;
		}
	}

	// plan 인서트 하는거.
	public boolean plan_recode_insert(String id) {
		try {
			connDB();
			// 일단은 카운트를 받는거부터.
			String query = "SELECT count(*) FROM PLAN";
			System.out.println("SQL : " + query);
			rs = stmt.executeQuery(query);
			rs.next();
			System.out.println("rs.next 통과");
			String count = String.valueOf(rs.getInt("count(*)") + 1);
			System.out.println("count 저장");

			query = "INSERT INTO PLAN VALUES (" + count + ", TO_CHAR(SYSDATE, 'YYYY-MM-DD'), SYSDATE, '','" + id
					+ "','')";

			boolean b = stmt.execute(query);

			if (!b) {
				System.out.println("Insert success.\n");
				return true;
			} else {
				System.out.println("Insert fail.\n");
				return false;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

	}

	// stime 업데이트 하는거.
	public boolean plan_recode_Stime_update(String id) {
		try {
			connDB();
			String query = "UPDATE PLAN SET STIME = SYSDATE WHERE id = '" + id
					+ "' AND TO_CHAR(SYSDATE, 'YYYY-MM-DD') = PALN_DATE";

			boolean b = stmt.execute(query);

			if (!b) {
				System.out.println("Insert success.\n");
				return true;
			} else {
				System.out.println("Insert fail.\n");
				return false;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

	}

	// Etime 업데이트 하는거.
	public boolean plan_recode_Etime_update(String id) {
		try {
			connDB();
			String query = "UPDATE PLAN SET ETIME = SYSDATE WHERE id = '" + id
					+ "' AND TO_CHAR(SYSDATE, 'YYYY-MM-DD') = PALN_DATE";

			boolean b = stmt.execute(query);

			if (!b) {
				System.out.println("Insert success.\n");
				return true;
			} else {
				System.out.println("Insert fail.\n");
				return false;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

	}

	// Rutin 업데이트 하는거.
	public boolean plan_recode_Rutin_update(String Rutinnum, String id) {
		try {
			connDB();
			String query = "UPDATE PLAN SET RUTIN = " + Rutinnum + " WHERE id = '" + id
					+ "' AND TO_CHAR(SYSDATE, 'YYYY-MM-DD') = PALN_DATE";

			boolean b = stmt.execute(query);

			if (!b) {
				System.out.println("Insert success.\n");
				return true;
			} else {
				System.out.println("Insert fail.\n");
				return false;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

	}

	// 루틴DB에 운동 저장하는거.
	public boolean plan_Rutin_insert(String rutinnum, String ECname, String ECset, String ECweight, String ECnumber,
			String id) { // 인서트 하는거.
		try {
			connDB();
			// 일단은 카운트를 받는거부터.
			String query = "SELECT count(*) FROM rutin";
			System.out.println("SQL : " + query);
			rs = stmt.executeQuery(query);
			rs.next();
			System.out.println("rs.next 통과");
			String count = String.valueOf(rs.getInt("count(*)") + 1);
			System.out.println("count 저장");

			query = "INSERT INTO RUTIN VALUES (" + count + ", " + rutinnum + ", '" + ECname + "'," + ECset + ","
					+ ECweight + "," + ECnumber + ",'" + id + "')";

			boolean b = stmt.execute(query);

			if (!b) {
				System.out.println("Insert success.\n");
				return true;
			} else {
				System.out.println("Insert fail.\n");
				return false;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

	}

	// 루틴으로 넘어가는데 있나 없나 보는거
	public boolean plan_Rutin_check(String rutinnum, String id) {
		try {
			connDB();
			// SELECT count(*) FROM RUTIN WHERE RUTIN_NUMBER = 1 AND ID = '123'
			// 일단은 카운트를 받는거부터.
			String query = "SELECT count(*) FROM RUTIN WHERE RUTIN_NUMBER = " + rutinnum + " AND ID = '" + id + "'";
			System.out.println("SQL : " + query);
			rs = stmt.executeQuery(query);
			rs.next();
			System.out.println("rs.next 통과");
			int count = rs.getInt("count(*)");
			System.out.println("count 저장");

//			boolean b = stmt.execute(query);

			if (count == 0) {
				System.out.println("count == 0, false");
				return false;
			} else {
				System.out.println("count != 0, true");
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

	}

	// 루틴삭제하는거 (루틴넘버를 지우는식)
	public boolean plan_Rutin_Delete(String ECname, String Rutinnum, String id) {
		try {
			connDB();
			String query = "UPDATE RUTIN SET RUTIN_NUMBER = 0 WHERE EXERCISE_NAME ='" + ECname + "' AND RUTIN_NUMBER = "
					+ Rutinnum + " AND id='" + id + "'";
			System.out.println("SQL : " + query);

			boolean b = stmt.execute(query);

			if (!b) {
				System.out.println("delete(update) success.\n");
				return true;
			} else {
				System.out.println("delete(update) fail.\n");
				return false;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

	}

	public boolean Inout_insert(String id, String weight, String drinking, String exercising) {
		try {
			connDB();
			// 일단은 카운트를 받는거부터.
			String query = "SELECT count(*) FROM INOUT";
			System.out.println("SQL : " + query);
			rs = stmt.executeQuery(query);
			rs.next();
			System.out.println("rs.next 통과");
			String count = String.valueOf(rs.getInt("count(*)") + 1);
			System.out.println("count 저장");
			query = "INSERT INTO INOUT VALUES (" + count + ", TO_CHAR(SYSDATE, 'YYYY-MM-DD'), '" + id + "', " + weight
					+ ", " + drinking + ", " + exercising + ", '' )";

			boolean b = stmt.execute(query);

			if (!b) {
				System.out.println("Insert success.\n");
				return true;
			} else {
				System.out.println("Insert fail.\n");
				return false;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

	}

	public boolean Inout_update(String id, String weight, String drinking, String exercising) {
		try {
//UPDATE INOUT SET INOUT_WEIGHT = 90, EXERCISING = 1 , DRINKING = 1 WHERE id = '123' AND TO_CHAR(SYSDATE, 'YYYY-MM-DD') = INOUT_DATE
			connDB();
			String query = "UPDATE INOUT SET INOUT_WEIGHT = " + weight + ", EXERCISING = " + exercising
					+ " , DRINKING = " + drinking + " WHERE id = '" + id
					+ "' AND TO_CHAR(SYSDATE, 'YYYY-MM-DD') = INOUT_DATE";

			boolean b = stmt.execute(query);

			if (!b) {
				System.out.println("update success.\n");
				return true;
			} else {
				System.out.println("update fail.\n");
				return false;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

	}

	// 식단기록 UPDATE
	public boolean Inout_FoodRecode_update(String id, String recode) {
		try {
			connDB();
			String query = "UPDATE INOUT SET FOODRECODE = '" + recode + "' WHERE id = '" + id
					+ "' AND TO_CHAR(SYSDATE, 'YYYY-MM-DD') = INOUT_DATE";

			boolean b = stmt.execute(query);

			if (!b) {
				System.out.println("update success.\n");
				return true;
			} else {
				System.out.println("update fail.\n");
				return false;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean NOTI_BOARD_insert(String contents, String id) {
		try {
			connDB();
			// 일단은 카운트를 받는거부터.
			String query = "SELECT count(*) FROM NOTICE_BOARD";
			System.out.println("SQL : " + query);
			rs = stmt.executeQuery(query);
			rs.next();
			System.out.println("rs.next 통과");
			String count = String.valueOf(rs.getInt("count(*)") + 1);
			System.out.println("count 저장");
			query = "INSERT INTO NOTICE_BOARD VALUES (" + count + ", TO_CHAR(SYSDATE, 'YYYY-MM-DD'), '" + contents
					+ "', '" + id + "', 1)";

			boolean b = stmt.execute(query);

			if (!b) {
				System.out.println("Insert success.\n");
				return true;
			} else {
				System.out.println("Insert fail.\n");
				return false;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

	}

	// customer mypage 개인정보수정
	public boolean customer_update(String password, String email, String phone_number, String id) {
		try {
			connDB();
			String query = "UPDATE CUSTOMER_INFO SET PASSWORD = '" + password + "', EMAIL = '" + email
					+ "',  PHONE_NUMBER = " + phone_number + " WHERE id = '" + id + "'";

			boolean b = stmt.execute(query);

			if (!b) {
				System.out.println("update success.\n");
				return true;
			} else {
				System.out.println("update fail.\n");
				return false;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

	}

	public boolean Trainer_update(String password, String phone_number, String id) {
		try {
			connDB();
			String query = "UPDATE TRAINER_INFO SET PASSWORD = '" + password + "', PHONE_NUMBER = " + phone_number + " WHERE ID = '" + id + "'";
			
			boolean b = stmt.execute(query);
			
			if (!b) {
				System.out.println("update success.\n");
				return true;
			} else {
				System.out.println("update fail.\n");
				return false;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		
	}

	public void connDB() {

		try {
			Class.forName(driver);
			System.out.println("jdbc driver loading success.");
			con = DriverManager.getConnection(url, user, password);
			System.out.println("oracle connection success");
			stmt = con.createStatement();// 인서트일때 사용
//			stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
//			System.out.println("syayement create success.");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}