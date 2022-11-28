package com.prac.BEPSystem.web.servlet;

import com.alibaba.fastjson.JSON;
import com.prac.BEPSystem.pojo.ProjectInfo;
import com.prac.BEPSystem.service.ProjectInfoService;
import com.prac.BEPSystem.service.impl.ProjectInfoServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.BufferedReader;
import java.io.IOException;

@WebServlet("/addServlet")
public class AddServlet extends HttpServlet {

    private ProjectInfoService projectInfoService = new ProjectInfoServiceImpl();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1. 接收项目数据
        BufferedReader bufferedReader = request.getReader();
        String params = bufferedReader.readLine();//json字符串
        // 转为ProjectInfo对象
        ProjectInfo projectInfo = JSON.parseObject(params, ProjectInfo.class);
        //2. 调用service添加
        projectInfoService.add(projectInfo);
        //3. 响应成功标识
        response.getWriter().write("success");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
