
package Ramirez.j.h.j;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


public class ServletExamen extends HttpServlet {
    private Object HibernateUtilidades;

    
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        Evaluacion eva = new Evaluacion();
        eva.setNombre("Ana");
        eva.setCalificaion(7);
         
        SessionFactory factory =HibernateUtilidades.getSessionFactory(); 
         Session sesion = factory.openSession(); 
         Transaction tranza = sesion.beginTransaction(); 
          
        sesion.save(new Evaluacion("Ana", 7)); 
         tranza.commit(); 
         sesion.close(); 
         out.println("Listo"); 
        } 

        
    }



