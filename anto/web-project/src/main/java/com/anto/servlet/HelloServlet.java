package com.anto.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author antoWorld
 * @description 描述
 * @create 2017/7/26 9:46
 */
@WebServlet(urlPatterns="/cookie")
public class HelloServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie[] cookies = req.getCookies();
        if(cookies!=null){
            for(Cookie item:cookies){
                System.out.println(item.getName()+":"+item.getValue());
            }
        }else{
            Cookie cookie = new Cookie("cookieName","cookeValue");
            /**
             * cookie 默认为-1 即表示会话cookie，保存在内存中,当浏览器关闭后cookie将清除
             * cookie 为正整数时，即表示持久cookie，保存在文件中，当过期后将清除
             */
            cookie.setMaxAge(2000);
            resp.addCookie(cookie);

            Cookie cookie1 = new Cookie("cookieName1","cookeValue1");
            cookie1.setMaxAge(2000);
            resp.addCookie(cookie1);
        }
        PrintWriter printWriter = resp.getWriter();
        printWriter.println("<html><body><h1>Hello,Cookie!</h1></body></html>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
