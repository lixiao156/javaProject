package com.test.service;

import com.test.bean.Pet;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;
/**
 * @author helloLi
 * @version 1.0
 * @date 2020/4/8 21:10
 */

public class PetServiceTest {
    @Autowired
    private PetService petService;
    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

    @Test
    public void selectPetById() {
        Pet pet = petService.selectPetById(1);
        System.out.println("==="+ pet.getName());
         pet.toString();

    }
}