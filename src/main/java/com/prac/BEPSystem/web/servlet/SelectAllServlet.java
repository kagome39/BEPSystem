package com.prac.BEPSystem.web.servlet;

import com.alibaba.fastjson.JSON;
import com.prac.BEPSystem.pojo.ProjectInfo;
import com.prac.BEPSystem.service.ProjectInfoService;
import com.prac.BEPSystem.service.impl.ProjectInfoServiceImpl;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.List;

@WebServlet("/selectAllServlet")
public class SelectAllServlet extends HttpServlet {

    private ProjectInfoService projectInfoService = new ProjectInfoServiceImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1. 调用service查询
        List<ProjectInfo> projectInfos = projectInfoService.selectAll();

        //2. 转为JSON
        String jsonString = JSON.toJSONString(projectInfos);

        //3. 写数据
        response.setContentType("text/json;charset=utf-8");;
        response.getWriter().write(jsonString);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
