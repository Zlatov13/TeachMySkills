import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/servlet")
public class Servlet extends HttpServlet {
    private static final String PATH = "/factorial.jsp";
    private static final String PATH_TWO = "/fibonacci.jsp";
    String number;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        number = req.getParameter("number");
        int nubmerEnd = Integer.parseInt(number);
        MethodHandler methodHandler = new MethodHandler();
        if (methodHandler.chet(nubmerEnd) == true) {
            methodHandler.factorial(nubmerEnd);
            String factorial = String.valueOf(methodHandler.resultFactorial);
            req.setAttribute("number", nubmerEnd);
            req.setAttribute("factorial", factorial);
            ServletContext servCont = getServletContext();
            RequestDispatcher requestDispatcher = servCont.getRequestDispatcher(PATH);
            requestDispatcher.forward(req, resp);
        } else {
           methodHandler.fibonacci(nubmerEnd);
           req.setAttribute("numberFibonacci", methodHandler.fibon);

            ServletContext servCont = getServletContext();
            RequestDispatcher requestDispatcher = servCont.getRequestDispatcher(PATH_TWO);
            requestDispatcher.forward(req, resp);
           }
            }

        }


