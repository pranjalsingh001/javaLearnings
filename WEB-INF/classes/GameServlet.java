import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class GameServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {

        int guesserNum = Integer.parseInt(request.getParameter("guesserNum"));
        int p1 = Integer.parseInt(request.getParameter("p1"));
        int p2 = Integer.parseInt(request.getParameter("p2"));
        int p3 = Integer.parseInt(request.getParameter("p3"));

        // Use Umpire to run the game
        Umpire umpire = new Umpire();
        umpire.startGame(guesserNum, p1, p2, p3);
        String result = umpire.compare();

        // Output result
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h2>" + result + "</h2>");
        out.println("</body></html>");
    }
}
