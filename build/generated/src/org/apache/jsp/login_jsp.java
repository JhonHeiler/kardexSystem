package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Modelo.UsuarioDB;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>JSP Page</title>\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/index.css\">\r\n");
      out.write("    </head>\r\n");
      out.write("    <body id=\"bobo\">\r\n");
      out.write("        <h2 id=\"h1iniciar\">Iniciar Sesión</h2>\r\n");
      out.write("\r\n");
      out.write("        <form action=\"login.jsp\" method=\"post\">\r\n");
      out.write("            <table id=\"login\">\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td> Usuario:</td>\r\n");
      out.write("                    <td><input id=\"il\" type=\"text\" name=\"txtUsuario\"></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td> Contraseña: </td>\r\n");
      out.write("                    <td><input id=\"il\" type=\"password\" name=\"txtContra\"></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td align=\"center\" colspan=\"2\"><button id=\"anadir\" type=\"submit\" name=\"btnIngresar\" value=\"Ingresar\">Ingresar</button></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("            </table>\r\n");
      out.write("\r\n");
      out.write("        </form>\r\n");
      out.write("\r\n");
      out.write("        ");

            UsuarioDB udb = new UsuarioDB();
            if (request.getParameter("btnIngresar") != null) {
                String nombre = request.getParameter("txtUsuario");
                String contra = request.getParameter("txtContra");
                HttpSession sesion = request.getSession();
                switch (udb.obtenerUsuario(nombre, contra)) {
                    case 1:
                        sesion.setAttribute("user", nombre);
                        sesion.setAttribute("nivel", "1");
                        response.sendRedirect("index.jsp");
                        break;

                    case 2:

                        sesion.setAttribute("user", nombre);
                        sesion.setAttribute("nivel", "1");
                        response.sendRedirect("indexUser.jsp");
                        break;

                    default:
                        out.write("Usuario no existe, o contraseña inválida");
                        break;

                }
            }

            if (request.getParameter("cerrar") != null) {
                session.invalidate();
            }
        
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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
