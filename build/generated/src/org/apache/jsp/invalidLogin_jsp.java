package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class invalidLogin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=windows-1256");
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
      out.write("   <!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"    \n");
      out.write("      \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("\n");
      out.write("   <html>\n");
      out.write("\n");
      out.write("      <head>\n");
      out.write("         <meta http-equiv=\"Content-Type\" \n");
      out.write("            content=\"text/html; charset=windows-1256\">\n");
      out.write("         <link rel=\"stylesheet\" type=\"text/css\" href=\"LMScss.css\">\n");
      out.write("         <title>Invalid Login</title>\n");
      out.write("      </head>\n");
      out.write("\t\n");
      out.write("      <body>\n");
      out.write("         <center>\n");
      out.write("            Sorry, you are not a registered user! Please <a href=\"register.html\">register</a> first.\n");
      out.write("         </center>\n");
      out.write("          <center>\n");
      out.write("            Or, try to <a href=\"userLogin.html\">Login</a> with a different Username and Password.\n");
      out.write("         </center>\n");
      out.write("      </body>\n");
      out.write("\t\n");
      out.write("   </html>");
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
