
<%@page contentType ="text/html" pageEncoding="UTF-8"%>
<%@page import = "java.sql.*" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv = "Content-Type" content=" text/html; charset=UTF-8 " >
        <title > Role-Selection Page </title>
    </head>
    <body bgcolor='pink'>
        <form name='f1'>
            <table>
                <tr>
                    <td colspan='12' align='centre' > 
                        ROLE- SELECTION PAGE
                    </td>
                </tr>
                <tr>
                    <td>
                        FOR PATIENT
                    </td>
                    <td>
                      <input type="submit" value="LOGIN" name="btnLogin1" />
                    </td>
                </tr>
                <tr>
                    <td>
                       FOR DOCTOR
                    </td>
                    <td>
                       <input type="submit" value="LOGIN" name="btnLogin2" />
                    <td>
                </tr>
               
            </table>
        </form>
    </body>
</html>
<%
    if (request.getParameter("btnLogin1") != null) {
        try {
           
           
                response.sendRedirect("patient.jsp");

           
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
    if (request.getParameter("btnLogin2") != null) {
        try {
           
           
                response.sendRedirect("doctor.jsp");

           
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
%>
