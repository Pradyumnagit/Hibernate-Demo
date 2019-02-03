/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import Beans.Test;
import Dao.Acess;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Pradyumna
 */
public class RegisterServlet extends HttpServlet {

    

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String upass=request.getParameter("upass");
        String umail=request.getParameter("umail");
        PrintWriter out=response.getWriter();
        
        Test beans=new Test();
        beans.setUmail(umail);
        beans.setUpass(upass);
        out.println(upass+" "+umail+"     "+Acess.save(beans));
        
        
       
    }

    

}
