
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class deleteBook extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Delete Book | LMS</title>");
            out.println("<link rel=\"stylesheet\" type=\"text/css\" href=\"LMScss.css\">");
            out.println("</head>");
            out.println("<body>");
            out.println("<div class = table-wrapper>");


            try {
                int ISBN = Integer.parseInt(request.getParameter("ISBN"));
                
                String connStr = "jdbc:derby://localhost:1527/LMS";
                String DBname = "AbdulBasit";
                String DBpassword = "201710178";
                Connection conn = DriverManager.getConnection(connStr, DBname, DBpassword);              
               
                Statement st = conn.createStatement();
                ResultSet rs = st.executeQuery("select count(*) from books where ISBN =" + ISBN + "");
                while (rs.next()) {
                    if (rs.getInt(1) == 0) {
                        out.println("<h2>Wrong ISBN entered!</h2>");
                        out.println("<br>");
                        out.println("<h2>Go <a href=\"deleteBook.html\">back</a>!</h2>");
                    } else {
                        Statement stmt = conn.createStatement();
                        stmt.executeUpdate("delete from books where ISBN =" + ISBN + "");
                        out.println("<h2>Book successfully deleted!</h2>");
                        out.println("<br>");
                        out.println("<h2>Go back to <a href=\"adminHome.html\">Homepage</a></h2>");
                    }
                }
                

                conn.close();
            } catch (SQLException ex) {
                ex.printStackTrace(out);
            }
            out.println("</div>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
