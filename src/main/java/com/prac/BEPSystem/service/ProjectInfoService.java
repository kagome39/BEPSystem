package com.prac.BEPSystem.service;

import com.prac.BEPSystem.pojo.ProjectInfo;

import java.util.List;

public interface ProjectInfoService {

    /**
     * 查询所有
     * @return
     */
    List<ProjectInfo> selectAll();
}
