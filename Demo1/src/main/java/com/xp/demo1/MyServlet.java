package com.xp.demo1; /**
 * <p>Project: JavaWeb - ${NAME}
 * <p>Powered by xiaopeng On 2023-02-16 08:30:43
 *
 * @author peng [3121843255@qq.com]
 * @version 1.0
 * @since 17
 */

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet( "/MyServlet")
public class MyServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取post,请求体，请求参数
        //1.获取字节输入流
        System.out.println("slkd");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
