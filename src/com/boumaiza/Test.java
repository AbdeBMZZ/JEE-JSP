package com.boumaiza;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.boumaiza.beans.Coyote;

@WebServlet("/Test")
public class Test extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Test() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
		String message = "Transmission de variables : OK ! ";
			
		Coyote premierBean = new Coyote();
		premierBean.setNom( "Coyote" );
		premierBean.setPrenom( "Wile E." );
			
		request.setAttribute( "test", message );
		request.setAttribute( "coyote", premierBean );
			
		this.getServletContext().getRequestDispatcher( "/abdellah-boumaiza-test.jsp" ).forward( request, response );
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
