package docrob.demo2;

import javax.servlet.ServletException;
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
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        // grab and validate params from user
        String name = request.getParameter("name");
        String age = request.getParameter("age");

        if(name == null || age == null) {
            System.out.println("Name and age cannot be null!");
            request.setAttribute("errorMessage", "Name and age cannot be null!");
            request.getRequestDispatcher("/error.jsp").forward(request, response);
            return;
        }

//        System.out.println(name + " " + age);
//        if(age == null) {
//            response.sendRedirect("https://google.com");
//            return;
//        }

//        response.setContentType("text/html");
//        PrintWriter out = response.getWriter();

//        if(person == null) {
//            System.out.println("making bob!!");
//            person = new Person("bob");
//        }
//        out.println("<h1>" + person + "</h1>");

        // make a person using those params
        try {
            person = new Person(name, Integer.parseInt(age));
        } catch(Exception e) {
            String errorMsg = "Error trying to make a person with name " + name + " and age " + age + "!";
            System.out.println(errorMsg);
            request.setAttribute("errorMessage", errorMsg);
            request.getRequestDispatcher("/error.jsp").forward(request, response);
            return;
        }
        // add the person to the request as an attribute
        request.setAttribute("person", person);

        // launch the person jsp to make the html
        request.getRequestDispatcher("/person.jsp").forward(request, response);
    }

}