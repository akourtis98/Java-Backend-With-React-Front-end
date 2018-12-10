package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
// import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Test", urlPatterns = { "/test" })
public class Test extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getSession().setAttribute("title", "About Carrefour");
        request.getSession().setAttribute("description", "About description");
        request.getRequestDispatcher("test.jsp").forward(request, response);
    }
}