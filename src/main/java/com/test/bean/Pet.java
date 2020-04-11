package com.test.bean;

import com.alibaba.druid.sql.visitor.functions.Char;
import jdk.nashorn.internal.objects.annotations.Constructor;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author helloLi
 * @version 1.0
 * @date 2020/4/8 18:47
 */

@Component
public class Pet {

    private String name;
    private String owner;
    private String species;
    private char sex;
    private Date birth;
    private Date death;
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public Date getDeath() {
        return death;
    }

    public void setDeath(Date death) {
        this.death = death;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", owner='" + owner + '\'' +
                ", species='" + species + '\'' +
                ", sex=" + sex +
                ", birth=" + birth +
                ", death=" + death +
                '}';
    }
}
