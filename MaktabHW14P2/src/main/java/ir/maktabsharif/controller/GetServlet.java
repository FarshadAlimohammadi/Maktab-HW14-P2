package ir.maktabsharif.controller;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class GetServlet extends HttpServlet {
    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        try {
            PrintWriter out = resp.getWriter();
            out.println("<html>");
            out.println("<head>");
            out.println("</head>");
            out.println("<body>");
            out.println("<pre>");
            out.println("Now that you're an <b>HTML5 ninja</b>, it's time for you to show us what you can do. Have a look at the html files we created throughout the course as\n" +
                    "reference. Now go and try making your own website with just HTML5! Once you are done, share your website with the slack community and\n" +
                    "fellow students of this course! I will also be checking the #html channel with any new submissions. You can send your files as a message or wait\n" +
                    "until later on in the course where I show you how to put online for free.\n" +
                    "<b>\n" +
                    "I will be picking my favourite ones and showcasing them in a future video in the course.\n" +
                    "</b>\n" +
                    "Good luck!");

            out.println("</pre>");
            out.println("</body>");
            out.println("</html>");
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void destroy() {
        super.destroy();

    }
}
