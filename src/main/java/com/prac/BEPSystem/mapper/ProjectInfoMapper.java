package com.prac.BEPSystem.mapper;

import com.prac.BEPSystem.pojo.ProjectInfo;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ProjectInfoMapper {
    /**
     * 查询所有项目信息
     * @return
     */
    @Select("select * from project_info")
    @ResultMap("projectInfoResultMap")
    List<ProjectInfo> selectAll();
}
