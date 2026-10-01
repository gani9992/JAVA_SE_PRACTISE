
import java.sql.*;
 class RetrieveUsingPreparedStatement{
public void main(String args[])throws IOException,SQLException{
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ajdb","root","");
String query="select * from gani11";
PreparedStatement st=con.prepareStatement(query);
ResultSet rs=st.executeQuery();
while(rs.next()){
System.out.println(rs.getInt(1)+"  ");
}

}
}