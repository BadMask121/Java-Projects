/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author User
 */
@WebServlet(urlPatterns = {"/Home"})
public class Home extends HttpServlet {

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
            //out.println("<html>");
            out.println("<head>");
            out.println("<title>Ace open University</title>");            
out.println("<link rel='stylesheet' type='text/css' href='./school.css'/>");
            out.println("</head>");
            out.println("<body>");
           
            out.println("<nav>");
            out.println("<a href='./Home' id='s-h1-a'><h1 id='s-h1'> ACE OPEN UNIVERSITY</h1></a>");
           out.println("<ul>"
                   + "<li><a href='#'>Admisson</a></li>"
                   + "<li><a href='#'>Campus</a></li>"
                   + "<li><a href='#'>Student</a></li>"
                   + "<li><a href='#'>Staff</a></li>"
                   + "<li><a href='#'>School Schedule</a></li>"
                   + "</ul>");
            out.println("</nav>");
           
           out.println("<div id='main'>");          
           out.println("<div id='container'>"
                   + ""
                   + "</div>");
           out.println("</div>");
           //out.println("<script>alert('Welcome To Boston University')</script>");
            out.println("</body>");
            //out.println("</html>");
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
