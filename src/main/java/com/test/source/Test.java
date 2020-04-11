package com.test.source;

import com.test.bean.Pet;
import com.test.dao.PetMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author helloLi
 * @version 1.0
 * @date 2020/4/8 19:01
 */
public class Test {
    public static void main(String[] args) {
        String resource = "mybatis.xml";
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream(resource);
        } catch (IOException e) {
            e.printStackTrace();
        }
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        try (SqlSession session = sqlSessionFactory.openSession()) {
          Pet  pet = (Pet) session.selectOne("com.test.dao.PetMapper.selectPetById", 2);
            System.out.println(pet);
        }


    }
    @org.junit.Test
    public void test1(){
        String resource = "mybatis.xml";
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream(resource);
        } catch (IOException e) {
            e.printStackTrace();
        }
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        try (SqlSession session = sqlSessionFactory.openSession()) {
            Pet pet2 = (Pet) session.getMapper(PetMapper.class);
            Pet  pet = (Pet) session.selectOne("com.test.dao.PetMapper.selectPetById", 2);
            System.out.println(pet);
            System.out.println("pet2"+pet2);
        }

    }
}
