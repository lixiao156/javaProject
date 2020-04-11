package com.test.service;

import com.test.bean.Pet;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import static org.junit.Assert.*;

/**
 * @author helloLi
 * @version 1.0
 * @date 2020/4/8 21:31
 */

public class PetServiceTest {

    static PetService petService;
    @Test
    public void selectPetById() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        petService =  applicationContext.getBean(PetService.class);
        Pet pet = petService.selectPetById(1);
        System.out.println(pet.getName());
        System.out.println(pet);
    }
}
