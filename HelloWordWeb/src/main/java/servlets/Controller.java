package servlets;

import beans.UserBean;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Iurii_Kryshtop on 8/11/2016.
 */

public class Controller extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String name = req.getParameter("name");
        String surname = req.getParameter("surname");

        UserBean userBean = new UserBean();
        userBean.setName(name);
        userBean.setSurname(surname);
        req.getSession().setAttribute("user", userBean);
        req.getRequestDispatcher("page.jsp").forward(req, resp);
    }
}
