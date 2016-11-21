package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;;

public final class home1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=ISO-8859-1");
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
      out.write("    \n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"       \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("    <html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\n");
      out.write("        <title>Insert title here</title>\n");
      out.write("        <script language =\"javascript\">\n");
      out.write("           \n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <br>\n");
      out.write("        <table align=\"center\">\n");
      out.write("        </table>\n");
      out.write("        <br>\n");
      out.write("\n");
      out.write("        <table border='1' width='300' cellpadding='1' cellspacing='0'>\n");
      out.write("        <tr>\n");
      out.write("            <td colspan=6 align=\"center\"></td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <td>Id</td>\n");
      out.write("            <td>Name</td><td>Department</td>\n");
      out.write("            <td>Edit</td>\n");
      out.write("            <td>Delete</td>\n");
      out.write("        </tr>                       \n");
      out.write("        ");

            List Li = new ArrayList();
            Iterator  lr;
            if(request.getAttribute("userList")!=null && request.getAttribute("userList")!="")
            {
                List userList =  (ArrayList)request.getAttribute("userList");
                Iterator itr = userList.iterator();
                while(itr.hasNext())
                {
                    Li = (ArrayList)itr.next();
                    lr = Li.iterator();
                    Integer id = (Integer)lr.next();
        
      out.write("\n");
      out.write("        <tr>\n");
      out.write("        ");
  
                    while(lr.hasNext())
                    {
        
      out.write("\n");
      out.write("            <td>");
      out.print(lr.next());
      out.write("</td>\n");
      out.write("        ");

                    }
        
      out.write("\n");
      out.write("          \n");
      out.write("          \n");
      out.write("        </tr>\n");
      out.write("        ");

                }
            }
        
      out.write("\n");
      out.write("    }\n");
      out.write("        </table>\n");
      out.write("    </body>\n");
      out.write("</html>");
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
