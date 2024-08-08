import java.sql.*;
public class Testjdbc3{

public static void main(String[] ar){

try{

Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "1234");
System.out.println("mysql connected and database changed changed to test");
Statement st = con.createStatement();
ResultSet rs = st.executeQuery("select * from employee");
while(rs.next()){

System.out.print(rs.getString(1)+ ": ");
System.out.print(rs.getString(2)+ ": ");
System.out.println(rs.getString(3));
}
}catch(SQLException e){
System.out.println("try connection mysql or executing code " + e);
}

}
}

