package com.prac.BEPSystem.service.impl;

import com.prac.BEPSystem.mapper.ProjectInfoMapper;
import com.prac.BEPSystem.pojo.ProjectInfo;
import com.prac.BEPSystem.service.ProjectInfoService;
import com.prac.BEPSystem.util.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

public class ProjectInfoServiceImpl implements ProjectInfoService {

    //1. 创建SqlSessionFactory对象
    SqlSessionFactory factory = SqlSessionFactoryUtils.getSqlSessionFactory();
    @Override
    public List<ProjectInfo> selectAll() {
        //2. 获取SqlSession对象
        SqlSession sqlSession = factory.openSession();

        //3. 获取ProjectInfoMapper
        ProjectInfoMapper mapper = sqlSession.getMapper(ProjectInfoMapper.class);

        //4. 调用方法
        List<ProjectInfo> projectInfos = mapper.selectAll();

        //5. 释放资源
        sqlSession.close();

        return projectInfos;
    }

    @Override
    public void add(ProjectInfo projectInfo) {
        //2. 获取SqlSession对象
        SqlSession sqlSession = factory.openSession();

        //3. 获取ProjectInfoMapper
        ProjectInfoMapper mapper = sqlSession.getMapper(ProjectInfoMapper.class);

        //4. 调用方法
        mapper.add(projectInfo);
        sqlSession.commit();//提交事务
        //5. 释放资源
        sqlSession.close();
    }
}
