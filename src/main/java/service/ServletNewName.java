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

@WebServlet(urlPatterns = "/servletNewName")
public class ServletNewName extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        JobDBHandler job = new JobDBHandler();
        job.newName(name);
        ServletContext servCont = getServletContext();
        RequestDispatcher reqDisp = servCont.getRequestDispatcher("/newName/newNameResult.jsp");
        reqDisp.forward(req, resp);

    }
}
