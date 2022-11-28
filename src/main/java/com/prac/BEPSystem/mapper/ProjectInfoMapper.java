package com.prac.BEPSystem.mapper;

import com.prac.BEPSystem.pojo.ProjectInfo;
import org.apache.ibatis.annotations.Insert;
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

    /**
     * 添加
     * @param projectInfo
     */

    @Insert("insert into project_info values (#{projectId}, #{projectName}, #{projectClassification}, #{projectBudget}, #{projectDescription}, #{projectPublishAccount}})")
    void add(ProjectInfo projectInfo);
}
