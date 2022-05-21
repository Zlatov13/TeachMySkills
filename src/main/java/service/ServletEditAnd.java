package service;
import controller.JobDBHandler;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/servletEditAnd")
public class ServletEditAnd extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        JobDBHandler methodEdit = new JobDBHandler();
        long nowId = Long.parseLong(req.getParameter("id"));
        String newNameEdit = req.getParameter("name");
        methodEdit.edit(nowId, newNameEdit);
        ServletContext servCont = getServletContext();
        RequestDispatcher requestDispatcher = servCont.getRequestDispatcher("/edit/editAnd.jsp");
        requestDispatcher.forward(req, resp);
    }
}
