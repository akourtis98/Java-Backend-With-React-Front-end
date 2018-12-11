package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
// import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//printwriter
import java.io.PrintWriter;
// json
import org.json.simple.JSONObject;

@WebServlet(name = "Test", urlPatterns = { "/test" })
public class Test extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("hi");

        response.setContentType("application/json");

        PrintWriter out = response.getWriter();

        JSONObject obj = new JSONObject();

        obj.put("did", "it");

        out.print(obj);
        out.flush();
    }
}