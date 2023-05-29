package exercise7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class ConnectDB {
	public static void main(String[] args) {
		
		Connection connection = null;
		Scanner scanner = new Scanner(System.in);
		
		try {
			
			Class.forName("org.postgresql.Driver");
			connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/dbExercises", "postgres", "1234");
			
			Statement statement = connection.createStatement();
			System.out.println("Enter your code: ");
			String codePick = scanner.next();
			ResultSet rs = statement.executeQuery("select code, orderdate, region, rep, item, units, unitcost, total" + "from nbs" + " where code = ?");
			
			while(rs.next()) {
				String code = rs.getString("code");
				String date = rs.getString("orderdate");
				String region = rs.getString("region");
				String rep = rs.getString("rep");
				String item = rs.getString("item");
				int units = rs.getInt("units");
				double unitcost = rs.getDouble("unitcost");
				double total = rs.getDouble("total");
				
				System.out.println(code);
				System.out.println(unitcost);
				
			}
			
		} catch(Exception e) {
			System.out.println(e);
		}
	}
}
