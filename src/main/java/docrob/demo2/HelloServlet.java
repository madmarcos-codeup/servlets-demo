package docrob.demo2;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "helloServlet", value = "/jimbob")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!!!!!!!!!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
//        System.out.println("oh crap!");

        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("<ul>" +
        "<li>Apple</li>" +
        "<li>Banana</li>" +
        "<li>Pear</li>" +
        "</ul>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}