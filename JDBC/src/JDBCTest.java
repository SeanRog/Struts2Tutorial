import java.io.FileReader;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;
public class JDBCTest {

	public static void main(String[] args) {
		
		Properties props = new Properties();

		try {
			System.out.println("Loading Driver");
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Driver loaded");
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		// Load properties file
		try {
			props.load(new FileReader("resources/application.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("Connecting to DB");
		
		try (Connection conn = DriverManager.getConnection(props.getProperty("url"), props.getProperty("username"), props.getProperty("password"));
				Statement st = conn.createStatement();
				ResultSet rs = st.executeQuery("SELECT * FROM students")){ 
			System.out.println("Connected!");
			
			// display results from students table
//			while(rs.next()) {
//				System.out.println(rs.getInt("ID") + " --> " + rs.getString("NAME"));
//			}
			
			// create new table called employees
//			int rowsAffected = st.executeUpdate("CREATE TABLE employees(emp_id int, emp_name varchar2(30), emp_salary int)");
//			System.out.println("Number of rows affected: " + rowsAffected);
			
			// insert new records into employees table
//			System.out.println(st.executeUpdate("INSERT INTO employees values(101, 'employeeA', 1000)"));
//			System.out.println(st.executeUpdate("INSERT INTO employees values(102, 'employeeB', 5000)"));
//			System.out.println(st.executeUpdate("INSERT INTO employees values(103, 'employeeC', 7000)"));
//			System.out.println(st.executeUpdate("INSERT INTO employees(emp_id, emp_name) values(104, 'employeeD')"));
//			
			
			// update existing record in employees table
//			System.out.println(st.executeUpdate("UPDATE employees SET emp_salary = 5000 where emp_salary > 1000"));
			
			// delete records in employees table
//			System.out.println(st.executeUpdate("DELETE from employees where emp_id = 104"));
//			System.out.println(st.executeUpdate("DELETE from employees"));
			
			// insert via prepared statement
//			PreparedStatement ps = conn.prepareStatement("INSERT INTO employees values(?,?,?)");
//			ps.setInt(1, 101);
//			ps.setString(2, "employeeA");
//			ps.setInt(3, 1000);
//			System.out.println("Number of rows affected: " + ps.executeUpdate());
			
			// update via prepared statement
//			PreparedStatement ps = conn.prepareStatement("UPDATE employees SET emp_salary = ? where emp_id = ?");
//			ps.setInt(1, 20000);
//			ps.setInt(2, 102);
//			System.out.println("Number of rows affected: " + ps.executeUpdate());
			
			// delete via prepared statement
//			PreparedStatement ps = conn.prepareStatement("DELETE FROM employees where emp_salary >= ?");
//			ps.setInt(1, 1000);
//			System.out.println("Number of rows affected: " + ps.executeUpdate());
			
			// insert employee via callable statement
//			CallableStatement stmt = conn.prepareCall("{call insertEmployee(?,?,?)}");
//			stmt.setInt(1, 101);
//			stmt.setString(2, "employeeA");
//			stmt.setInt(3, 9000);
//			System.out.println("Number of rows affected: " + stmt.executeUpdate());
			
			// get employee by id via callable statement
//			CallableStatement stmt = conn.prepareCall("{call getEmployeeById(?,?,?)}");
//			stmt.setInt(1, 101);
//			stmt.registerOutParameter(2, Types.VARCHAR);
//			stmt.registerOutParameter(3, Types.INTEGER);
//			stmt.executeUpdate();
//			System.out.println("Name: " + stmt.getString(2) + " Salary: " + stmt.getInt(3));
			
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}

	}

}
