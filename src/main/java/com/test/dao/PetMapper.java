package com.test.dao;

import com.test.bean.Pet;

import java.util.List;

/**
 * @author helloLi
 * @version 1.0
 * @date 2020/4/8 18:45
 */
public interface PetMapper {
    Pet selectPetById(int id);
    //List<Pet> getAll();
}
