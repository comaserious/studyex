import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import javax.security.auth.login.AccountException;
import java.io.IOException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

@WebServlet("/savingServlet")
public class Saving extends HttpServlet {

    private static int count =0;
    private final Map<Integer,MenuDTO> map = new HashMap<>();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        HttpSession session = req.getSession();
        Enumeration names = session.getAttributeNames();
        while(names.hasMoreElements()){
            System.out.println(names.nextElement());
        }


        resp.sendRedirect("/jsp/again.jsp");



    }
}
