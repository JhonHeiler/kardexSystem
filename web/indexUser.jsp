
<%@page import="Modelo.Productos"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import = "java.util.ArrayList, Modelo.*"  %>
<!DOCTYPE html>
<html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Catalogo</title>
        <link rel="stylesheet" type="text/css" href="css/index.css">
    </head>
    <body>
        <%
            HttpSession sesion = request.getSession();
            String usuario;
            String nivel;

            if (sesion.getAttribute("user") != null && sesion.getAttribute("nivel") != null) {
                usuario = sesion.getAttribute("user").toString();
                nivel = sesion.getAttribute("nivel").toString();
            } else {
                out.print("<script>location.replace('login.jsp');</script>");
            }
        %>
        <img src="imagenes/banner2.PNG" width="100%">
        <h3>
            <table id="menu" border="1"  align="center">
                <tr>
                    <th><a href="indexUser.jsp">Catálogo</a></th>
                    <th><a href="carrito.jsp">Carro de compras</a></th>
                    <th><a href="login.jsp?cerrar=true">Cerrar Sesión</a></th>
                    <th width="200"><%= sesion.getAttribute("user").toString()%></th>
                </tr>
            </table>
        </h3>

        <h1 align="center">Catalogo de Productos</h1>

        <table id="productos" border="0" align="center">

            <%--Metodo que permite traer los productos, los trae en un Array y los guarda en un Array--%>

            <%
                ArrayList<Productos> lista = ProductoDB.obtenerProductos();
                int salto = 0;
                for (int i = 0; i < lista.size(); i++) {
                    Productos p = lista.get(i);
            %>
            <th><img src="imagenes/<%=p.getImagen()%>" width="150px"><br>
                <%=p.getNombre()%><br>
                $<%=p.getPrecio()%><br>
                <button type="submit"  id="anadir" onclick="window.location='anadirCarrito.jsp?id=<%= p.getCodigoProducto()%>'" >Añadir</button>
            </th>
            <%--Con esta variable llamada salto hacemos que cada 3 productos salte de linea--%>

            <%
                salto++;
                if (salto == 4) {
            %>
            <tr>
                <%
                            salto = 0;
                        }
                    }
                %>
        </table>
    </body>
</html>
