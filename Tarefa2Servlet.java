/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Tarefaweb2;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.Date;


/**
 *
 * @author LGBadures
 */
@WebServlet(name = "GreetingServlet", urlPatterns = {"/greeting.html"})
public class Tarefa2Servlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            Date currentDate = new Date();
            int hour = currentDate.getHours();
            
            String greetingMessage;
            
            if(hour >= 6 && hour < 12){
                greetingMessage = "<h1>Bom Dia!</h1>";
            }else if(hour >= 12 && hour < 19){
                greetingMessage = "<h1>Boa tarde!</h1>";
            }else if(hour >= 19 && hour < 23){
               greetingMessage = "<h1>Boa Noite!</h1>"; 
            }
            else{
                greetingMessage = "<h1>Vá Dormir!</h1>";
            }
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Tarefa2Servlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<center><h1>" + greetingMessage + "</h1></center>");
            out.println("<center><h4><a href='index.html'>Voltar</a></h4></center>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}
// <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method. processRequest
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    // </editor-fold>