package com.prac.BEPSystem.web.servlet;

import com.prac.BEPSystem.service.ProjectInfoService;
import com.prac.BEPSystem.service.impl.ProjectInfoServiceImpl;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/selectAllServlet")
public class SelectAllServlet extends HttpServlet {

    private ProjectInfoService projectInfoService = new ProjectInfoServiceImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
