package np;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/calcmeter")
public class CalcmeterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setCharacterEncoding("UTF-8");
        String m = request.getParameter("m");
        String cm = request.getParameter("cm");
        String mm = request.getParameter("mm");

        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();

        if (!m.isEmpty()&& cm.isEmpty() && mm.isEmpty()) {
            double m1 = Double.valueOf(m);
            double mToCm = m1 * 100;
            double mToMM = m1 * 1000;
            writer.println("Podana wartość w przeliczeniu na:");
            writer.println("metry: " + m1);
            writer.println("ceentymetry: " + mToCm);
            writer.println("milimety " + mToMM);
        } else if (!cm.isEmpty() && m.isEmpty() && mm.isEmpty()) {
            double cm1 = Double.valueOf(cm);
            double cmToM = cm1 / 100;
            double cmToMM = cm1 * 10;
            writer.println("Podana wartość w przeliczeniu na:");
            writer.println("metry: " + cmToM);
            writer.println("ceentymetry: " + cm1);
            writer.println("milimety " + cmToMM);
        } else if (mm.isEmpty() && m.isEmpty() && cm.isEmpty()) {
            double mm1 = Double.valueOf(mm);
            double mmToM = mm1 / 1000;
            double mmToCm = mm1 / 10;
            writer.println("Podana wartość w przeliczeniu na:");
            writer.println("metry: " + mmToM);
            writer.println("ceentymetry: " + mmToCm);
            writer.println("milimety " + mm1);
        }else {
            writer.println("Podaj jedną wartość");
        }
    }
}



