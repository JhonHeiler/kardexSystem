package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Modelo.ProductoDB;
import Modelo.Productos;
import Controlador.ServletAgregarCarrito;
import java.util.ArrayList;
import Modelo.Articulo;

public final class carrito_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write('\n');

    HttpSession sesion = request.getSession(true);
    ArrayList<Articulo> articulos = sesion.getAttribute("carrito") == null ? null : (ArrayList) sesion.getAttribute("carrito");

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <script src=\"JavaScript/carrito.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h3>\n");
      out.write("            <table border=\"1\" width=\"1000\" align=\"center\">\n");
      out.write("                <tr bgcolor=\"skyblue\">\n");
      out.write("                    <th><a href=\"index.jsp\">Catálogo</a></th>\n");
      out.write("                    <th><a href=\"registrarProducto.jsp\">Registrar Productos</a></th>\n");
      out.write("                    <th><a href=\"registrarVenta.jsp\">Registrar Ventas</a></th>\n");
      out.write("                    <th><a href=\"consultarVenta.jsp\">Consultar Ventas</a></th>\n");
      out.write("                    <th><a href=\"ServletLogueo?accion=cerrar\">Cerrar Sesión</a></th>\n");
      out.write("                    <th width=\"200\"></th>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("        </h3>\n");
      out.write("\n");
      out.write("        <h2 align=\"center\">Carro de compras</h2>\n");
      out.write("\n");
      out.write("        <table border=\"1\" width=\"1000\" align=\"center\">\n");
      out.write("            <thead>\n");
      out.write("                <tr align=\"center\">\n");
      out.write("                    <td>Item</td>\n");
      out.write("                    <td>Descripción</td>\n");
      out.write("                    <td>Precio</td>\n");
      out.write("                    <td>Cantidad</td>\n");
      out.write("                    <td>Total</td>\n");
      out.write("                </tr>\n");
      out.write("            </thead>\n");
      out.write("\n");
      out.write("            <tbody>\n");
      out.write("\n");
      out.write("                ");

                    ServletAgregarCarrito ac = new ServletAgregarCarrito();
                    for (Articulo a : articulos) {
                        Productos producto = ProductoDB.obtenerProducto(a.getCodigoProducto());


                
      out.write("\n");
      out.write("                <tr align=\"center\">\n");
      out.write("                    <td>\n");
      out.write("                        <a align=\"center\"><img src=\"imagenes/");
      out.print( producto.getImagen());
      out.write("\" width=\"100px\"></a>\n");
      out.write("\n");
      out.write("                    </td>\n");
      out.write("                    <td>\n");
      out.write("                        <a> ");
      out.print( producto.getNombre());
      out.write("</a><br>\n");
      out.write("                        <a> ");
      out.print( producto.getCodigoProducto());
      out.write("</a>\n");
      out.write("                    </td>\n");
      out.write("                    <td>\n");
      out.write("                        <a>");
      out.print( producto.getPrecio());
      out.write("</a>\n");
      out.write("                    </td>\n");
      out.write("                    <td>\n");
      out.write("                        <a>");
      out.print( a.getCantidad());
      out.write("</a>\n");
      out.write("                    </td>\n");
      out.write("                    <td>\n");
      out.write("                        <a>$");
      out.print( Math.round(producto.getPrecio() * a.getCantidad()));
      out.write("</a>\n");
      out.write("                    </td>\n");
      out.write("                    <td>\n");
      out.write("                        <a id=\"eliminarItem\" href=\"#\">Eliminar</a>\n");
      out.write("                    </td>\n");
      out.write("\n");
      out.write("                </tr>\n");
      out.write("\n");
      out.write("                ");
 }
      out.write("\n");
      out.write("            </tbody>\n");
      out.write("        </table>\n");
      out.write("        ");
      out.write("\n");
      out.write("        <a href=\"javascript:window.history.go(-2)\">Seguir Comprando</a>\n");
      out.write("\n");
      out.write("        <script src=\"js/carro.js\"></script> \n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
