package web;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import lecture.IlectureCatalogue;
import lecture.LectureImpl;
import lecture.Livre;
@WebServlet (name="cs",urlPatterns= {"/controleur"})
public class ControleurServlet extends HttpServlet {
private IlectureCatalogue lecture;
@Override
public void init() throws ServletException {
lecture=new LectureImpl();
}
@Override
protected void doPost(HttpServletRequest request,
HttpServletResponse response)
throws ServletException, IOException {
	String mc=request.getParameter("motCle");
	LivreModele mod = new LivreModele();
	mod.setMotCle(mc);
	List<Livre> livs = lecture.getLivresParMotCle(mc);
	mod.setLivres(livs);
	request.setAttribute("modele", mod);
	request.getRequestDispatcher("LivresView.jsp").forward(request,response);
	}
	}

