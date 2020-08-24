import org.codehaus.jackson.map.ObjectMapper;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by leon on 8/24/2020.
 */
@WebServlet("/sample")
public class SampleServlet  extends HttpServlet {
    private String adminEmail;

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        this.adminEmail = config.getInitParameter("adminEmail");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out =	response.getWriter();
        response.setContentType("text/html");
        out.print("<html><head>");
        out.print("<title> Config Demo</title>");
        out.print("<head/>");
        out.print("<body>");
        out.print("<h1 style='color: black'> "+ adminEmail + " !Hello Oracle and Java</h1>");
        out.print("</body>");
        out.print("</html>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse response)
            throws ServletException, IOException {
        // Convert request to Java object
        ObjectMapper mapper = new ObjectMapper();
        User sendUser = mapper.readValue(req.getInputStream(), User.class);

        // Business Logic
        User user = new User("");
        user.setId("0000");
        user.setName("Response from POST form " + sendUser.getName());

        // Create response message
        mapper.writeValue(response.getOutputStream(), user);

    }

}
