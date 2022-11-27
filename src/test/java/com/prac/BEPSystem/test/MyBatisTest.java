package com.prac.BEPSystem.test;

import com.prac.BEPSystem.mapper.ProjectInfoMapper;
import com.prac.BEPSystem.pojo.ProjectInfo;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.testng.annotations.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MyBatisTest {
    @Test
    public void testSelectAll() throws IOException {
        //1.获取SqlSessionFactory
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory= new SqlSessionFactoryBuilder().build(inputStream);

        //2. 获取SqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();

        //3. 获取Mapper接口的代理对象
        ProjectInfoMapper projectInfoMapper = sqlSession.getMapper(ProjectInfoMapper.class);

        //4. 执行方法
        List<ProjectInfo> projectInfos = projectInfoMapper.selectAll();
        System.out.println(projectInfos);

        //5. 释放资源
        sqlSession.close();
    }
}
