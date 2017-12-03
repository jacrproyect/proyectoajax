<%-- 
    Document   : GestionarEmpleado
    Created on : 02-dic-2017, 22:29:18
    Author     : HP
--%>

<%@page import="java.util.List"%>
<%@page import="entidades.DepartamentoMO" %>
<%@page import="modelo.DepartamentoDAO" %>

<% 
    List<DepartamentoMO> lista = new DepartamentoDAO().listardepartamento();
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <select id="departamento">
            <%
                for (DepartamentoMO DP: lista)
                {%>
                <option value="<%=DP.getIdDepartamento()%>"><%=DP.getNombreDepartamento()%>
                    
                </option>
                
                   <%  
                }
            %>
        </select>
    </body>
</html>
