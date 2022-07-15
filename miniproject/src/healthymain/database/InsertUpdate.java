package healthymain.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class InsertUpdate {
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String user = "c##green";
	String password = "green1234";

	private Connection con;
	private Statement stmt;
	private ResultSet rs;

	public boolean isCustomerSignUp(String ID, String PASSWORD, String NAME, int SEX, String BIRTHDAY, String EMAIL,
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

	public boolean isTrainerSignUp(String ID, String PASSWORD, String NAME, int SEX, int PHONE_NUMBER) {

		try {
			connDB();

			String sql = "INSERT INTO TRAINER_INFO VALUES ('" + ID + "', '" + PASSWORD + "', '" + NAME + "', " + SEX
					+ ", " + PHONE_NUMBER + ",'Y','Y','Y','Y','Y','Y','Y','Y','Y','Y','Y','Y',1)";
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

	// plan �μ�Ʈ �ϴ°�.
	public boolean isPlanInsert(String id) {
		try {
			connDB();
			// �ϴ��� ī��Ʈ�� �޴°ź���.
			String query = "SELECT count(*) FROM PLAN";
			System.out.println("SQL : " + query);
			rs = stmt.executeQuery(query);
			rs.next();
			System.out.println("rs.next ���");
			String count = String.valueOf(rs.getInt("count(*)") + 1);
			System.out.println("count ����");

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

	// stime ������Ʈ �ϴ°�.
	public boolean isPlanStimeModify(String id) {
		try {
			connDB();
			String query = "UPDATE PLAN SET STIME = SYSDATE WHERE id = '" + id
					+ "' AND TO_CHAR(SYSDATE, 'YYYY-MM-DD') = PALN_DATE";

			boolean b = stmt.execute(query);

			if (!b) {
				System.out.println("UPDATE success.\n");
				return true;
			} else {
				System.out.println("UPDATE fail.\n");
				return false;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

	}

	// Etime ������Ʈ �ϴ°�.
	public boolean isPlanEtimeModify(String id) {
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

	// Rutin ������Ʈ �ϴ°�.
	public boolean isPlanRutinNumberModify(String Rutinnum, String id) {
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

	// ��ƾDB�� � �����ϴ°�.
	public boolean isRutinInsert(String rutinnum, String ECname, String ECset, String ECweight, String ECnumber,
			String id) { // �μ�Ʈ �ϴ°�.
		try {
			connDB();
			// �ϴ��� ī��Ʈ�� �޴°ź���.
			String query = "SELECT count(*) FROM rutin";
			System.out.println("SQL : " + query);
			rs = stmt.executeQuery(query);
			rs.next();
			System.out.println("rs.next ���");
			String count = String.valueOf(rs.getInt("count(*)") + 1);
			System.out.println("count ����");

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

	// pt �����ϴµ� �ֳ����� ���°�.
	public boolean isPtReservationInsert(String id, String tr_id, String date, String hour) {
		try {
			connDB();
			String query = "SELECT count(*) FROM PT_RESERVATION WHERE TR_ID = '" + tr_id + "' AND PT_DATE = '" + date
					+ "' AND PT_HOUR = " + hour + " AND FLAG = '0'";
			System.out.println("SQL : " + query);
			rs = stmt.executeQuery(query);
			rs.next();
			System.out.println("rs.next ���");
			int count = rs.getInt("count(*)");
			System.out.println("count ����");

			if (count == 0) {
				System.out.println("count == 0, �ش� �ð��� ��ġ�� ��� ����. true");

				query = "SELECT count(*) FROM PT_RESERVATION";
				System.out.println("SQL : " + query);
				rs = stmt.executeQuery(query);
				rs.next();
				System.out.println("rs.next ���");
				String count2 = String.valueOf(rs.getInt("count(*)") + 1);
				System.out.println("count ����");
				query = "INSERT INTO PT_RESERVATION VALUES (" + count2 + ", '" + id + "' ,'" + tr_id + "', '" + date
						+ "', " + hour + ", 0)";
				System.out.println(query);
				boolean b = stmt.execute(query);

				if (!b) {
					System.out.println("Insert success.\n");
					modifyCustomerPtNumber(id, "-1");
					return true;
				} else {
					System.out.println("Insert fail.\n");
					return false;
				}
			} else {
				System.out.println("count != 0, �ش� �ð��� ��ġ�� ��� ����. false");
				return false;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	// PT ������� �ϴ°�
	public void deletePtReservation(String id, String date, String tr_id, String hour) {
		try {
			connDB();
			String query = "UPDATE PT_RESERVATION SET FLAG = 1 WHERE id = '" + id + "' AND PT_DATE = '" + date
					+ "' AND TR_ID = '" + tr_id + "' AND PT_HOUR = " + hour + "";
			System.out.println(query);
			boolean b = stmt.execute(query);
			System.out.println(b);
			if (!b) {
				System.out.println("flag ������Ʈ");
				modifyCustomerPtNumber(id, "+1");
			} else
				System.out.println("flag ������Ʈ ����");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void modifyCustomerPtNumber(String id, String INT) {
		try {
			connDB();

			String query = "UPDATE CUSTOMER_INFO SET PT_NUMBER = PT_NUMBER "+INT+" WHERE ID = '" + id + "'";

			boolean b = stmt.execute(query);

			if (!b) {
				System.out.println("Insert success.\n");
			} else {
				System.out.println("Insert fail.\n");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// ��ƾ���� �Ѿ�µ� �ֳ� ���� ���°�
	public boolean hasRutinDate(String rutinnum, String id) {
		try {
			connDB();
			String query = "SELECT count(*) FROM RUTIN WHERE RUTIN_NUMBER = " + rutinnum + " AND ID = '" + id + "'";
			System.out.println("SQL : " + query);
			rs = stmt.executeQuery(query);
			rs.next();
			System.out.println("rs.next ���");
			int count = rs.getInt("count(*)");
			System.out.println("count ����");

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

	public boolean deleteRutindate(String ECname, String Rutinnum, String id) {
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

	public boolean isInoutInsert(String id, String weight, String drinking, String exercising) {
		try {
			connDB();
			// �ϴ��� ī��Ʈ�� �޴°ź���.
			String query = "SELECT count(*) FROM INOUT";
			System.out.println("SQL : " + query);
			rs = stmt.executeQuery(query);
			rs.next();
			System.out.println("rs.next ���");
			String count = String.valueOf(rs.getInt("count(*)") + 1);
			System.out.println("count ����");
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

	public boolean isInOutWeightEDModify(String id, String weight, String drinking, String exercising) {
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
	
	// �Ĵܱ�� UPDATE
	public boolean isInOutFoodRecodeModify(String id, String recode) {
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

	public boolean isNotiBoardInsert(String contents, String id) {
		try {
			connDB();
			// �ϴ��� ī��Ʈ�� �޴°ź���.
			String query = "SELECT count(*) FROM NOTICE_BOARD";
			System.out.println("SQL : " + query);
			rs = stmt.executeQuery(query);
			rs.next();
			System.out.println("rs.next ���");
			String count = String.valueOf(rs.getInt("count(*)") + 1);
			System.out.println("count ����");
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

	// customer mypage ������������
	public boolean isCustomerInfoModify(String password, String email, String phone_number, String id) {
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

	public boolean isTrainerInfoModify(String password, String phone_number, String id) {
		try {
			connDB();
			String query = "UPDATE TRAINER_INFO SET PASSWORD = '" + password + "', PHONE_NUMBER = " + phone_number
					+ " WHERE ID = '" + id + "'";

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

	public boolean isCustomerPtNumberModify(String ptcount, String name) {
		try {
			connDB();
			String query = "UPDATE CUSTOMER_INFO SET PT_NUMBER = " + ptcount + " WHERE name = '" + name + "'";

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

	public boolean isTrainerInfoTimeset(String qur) {
		try {
			connDB();
			String query = qur;

			boolean b = stmt.execute(query);

			if (!b) {
				System.out.println("UPDATE success.\n");
				return true;
			} else {
				System.out.println("UPDATE fail.\n");
				return false;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

	}

	public boolean isCustomerDelete(String name) {
		try {
			connDB();
			String query = "UPDATE CUSTOMER_INFO SET CUSTOMER_POSITION = '3' WHERE NAME = '" + name + "'";

			boolean b = stmt.execute(query);

			if (!b) {
				System.out.println("UPDATE success.\n");
				return true;
			} else {
				System.out.println("UPDATE fail.\n");
				return false;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

	}

	public boolean isTrainerDelete(String name) {
		try {
			connDB();
			String query = "UPDATE TRAINER_INFO SET TRAINER_POSITION = '2' WHERE  NAME ='" + name + "'";

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

	public void connDB() {

		try {
			Class.forName(driver);
			System.out.println("jdbc driver loading success.");
			con = DriverManager.getConnection(url, user, password);
			System.out.println("oracle connection success");
			stmt = con.createStatement();// �μ�Ʈ�϶� ���
//			stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
//			System.out.println("syayement create success.");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}