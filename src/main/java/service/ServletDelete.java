package service;
import servise.JobDBHandler;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/servletDelete")
public class ServletDelete extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        JobDBHandler method = new JobDBHandler();
        long id = Long.parseLong(req.getParameter("id"));
        method.delete(id);
        ServletContext servCont = getServletContext();
        RequestDispatcher reqDisp = servCont.getRequestDispatcher("/delete/deleteAnd.jsp");
        reqDisp.forward(req, resp);

    }
}
