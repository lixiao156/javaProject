package com.test.service;

import com.test.bean.Pet;
import com.test.dao.PetMapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author helloLi
 * @version 1.0
 * @date 2020/4/8 19:46
 */
@Component
public class PetService implements PetMapper{

    @Resource
    private PetMapper petMapper;

    public PetService() {
    }
    @Override
    public Pet selectPetById(int id){
      return petMapper.selectPetById(id);
    }

}
