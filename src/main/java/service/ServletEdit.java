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

@WebServlet(urlPatterns = "/servletEdit")
public class ServletEdit extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) {
        try {
            JobDBHandler methodJob = new JobDBHandler();
            String id = req.getParameter("id");
            long idLong = Long.parseLong(id);
            methodJob.search(idLong);
            if(methodJob.person.getName()!=null){
            req.setAttribute("id", methodJob.person.getId());
            req.setAttribute("Name", methodJob.person.getName());
            ServletContext servletContext = getServletContext();
            RequestDispatcher requestDispatcher = servletContext.getRequestDispatcher("/edit/editPersonOk.jsp");
            requestDispatcher.forward(req, resp);
        }
            else {
                ServletContext servletContext = getServletContext();
                RequestDispatcher requestDispatcher = servletContext.getRequestDispatcher("/notEntity/notEntity.jsp");
                requestDispatcher.forward(req, resp);
            }} catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }}

    }


