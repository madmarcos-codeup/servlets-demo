package docrob.demo2;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "personServlet", urlPatterns = "/person")
public class PersonServlet extends HttpServlet {
    private Person person = null;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        String name = request.getParameter("name");
        String age = request.getParameter("age");
//        System.out.println(name + " " + age);
        if(age == null) {
            response.sendRedirect("https://google.com");
            return;
        }

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        if(person == null) {
            System.out.println("making bob!!");
            person = new Person("bob");
        }

        out.println("<h1>" + person + "</h1>");
    }

}