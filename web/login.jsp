
<%@page contentType ="text/html" pageEncoding="UTF-8"%>
<%@page import = "java.sql.*" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv = "Content-Type" content=" text/html; charset=UTF-8 " >
        <title > login Page </title>
    </head>
    <body bgcolor='pink'>
        <form name='f1'>
            <table>
                <tr>
                    <td colspan='12' align='centre' > 
                        LOGIN PAGE
                    </td>
                </tr>
                <tr>
                    <td>
                        ENTER THE USERNAME 
                    </td>
                    <td>
                        <input type="text" name="txtuid" value="" size="20" />
                    </td>
                </tr>
                <tr>
                    <td>
                        ENTER THE PASSWORD-
                    </td>
                    <td>
                        <input type="text" name="txtpwd" value="" size="20" />
                    <td>
                </tr>
                <tr>
                    <td>
                        <input type="submit" value="LOGIN" name="btnlogin" />

                        <input type="reset" value="CANCEL" name="cancel" />
                    </td>
                </tr>
            </table>
        </form>
    </body>
</html>
<%
    if (request.getParameter("btnlogin") != null) {
        try {
            String uid = request.getParameter("txtuid");
            String pwd = request.getParameter("txtpwd");
            String query = "select * from LOGIN_DETAILS where username='" + uid + "' and password ='" + pwd + "'";
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/AmritaVaidya", "av", "av");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            boolean status = rs.next();
            if (status) {
                response.sendRedirect("website.jsp");

            } else {
                response.sendRedirect("error.jsp");

            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
%>
