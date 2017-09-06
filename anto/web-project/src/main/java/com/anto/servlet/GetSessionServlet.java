package com.anto.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author antoWorld
 * @description 描述
 * @create 2017/7/26 13:55
 */
@WebServlet(urlPatterns="/getSession")
public class GetSessionServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        if (session.isNew()) {
            session.setAttribute("name", "firstNo");
        }
        String sessionId = session.getId();
        PrintWriter out = resp.getWriter();
        if (session.isNew()) {
            out.println("Hello,HttpSession! <br>The first response - SeesionId=" + sessionId + " <br>");
        } else {
            out.println("Hello,HttpSession! <br>The second response - SeesionId=" + sessionId + " <br>");
            // 从Session获取属性值
            out.println("The second-response - name: " + session.getAttribute("name"));
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
