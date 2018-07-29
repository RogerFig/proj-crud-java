package servlets;

import java.io.IOException;  
import java.io.PrintWriter;  
  
import javax.servlet.ServletException;  
import javax.servlet.annotation.WebServlet;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;

import dao.EmpDao;
import model.Emp;

@WebServlet("/SaveServlet")  
public class SaveServlet extends HttpServlet {  
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)   
         throws ServletException, IOException {  
        response.setContentType("text/html");  
        PrintWriter out=response.getWriter();  
          
        String nome=request.getParameter("nome");  
        String password=request.getParameter("password");  
        String email=request.getParameter("email");  
        String pais=request.getParameter("pais");  
          
        Emp e=new Emp();  
        e.setNome(nome);  
        e.setPassword(password);  
        e.setEmail(email);  
        e.setPais(pais);  
          
        int status=EmpDao.save(e);  
        if(status>0){  
            out.print("<p>Registro salvo com sucesso!</p>");  
            request.getRequestDispatcher("index.html").include(request, response);  
        }else{  
            out.println("Desculpe! Não foi possível salvar o registro");  
        }  
          
        out.close();  
    }  
  
}  