package np;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/calcweigh")
public class CalweightServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setCharacterEncoding("UTF-8");
        String kg = request.getParameter("kg");
        String g = request.getParameter("g");
        String mg = request.getParameter("mg");

        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();

        if (!kg.isEmpty() && g.isEmpty() && mg.isEmpty()) {
            double kg1 = Double.valueOf(kg);
            double kgTog = kg1 * 1000;
            double kgToMg = kg1 * 1000_000;
            writer.println("Podana wartość w przeliczeniu na:");
            writer.println("kilogramy: " + kg1);
            writer.println("gramy: " + kgTog);
            writer.println("miligramy: " + (long) kgToMg);
        } else if (!g.isEmpty() && kg.isEmpty() && mg.isEmpty()) {
            double g1 = Double.valueOf(g);
            double gToKg = g1 / 1000;
            double gToMg = g1 / 1000;
            writer.println("Podana wartość w przeliczeniu na:");
            writer.println("kilogramy: " + gToKg);
            writer.println("gramy" + g1);
            writer.println("miligramy: " + gToMg);
        } else if (!mg.isEmpty() && kg.isEmpty() && g.isEmpty()) {
            double mg1 = Double.valueOf(mg);
            double mgToKg = mg1 / 1000_000;
            double mgToG = mg1 / 1000;
            writer.println("Podana wartość w przeliczeniu na:");
            writer.println("kilogramy: " + mgToKg);
            writer.println("gramy:" + mgToG);
            writer.println("miligramt: " + mg1);
        } else {
            writer.println("Podaj jedną wartość");
        }
    }
}
