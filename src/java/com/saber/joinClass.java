/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.saber;

/**
 *
 * @author Saber
 */
public class joinClass {
    
    private int id;
    private int age;
    private String name;
    private int numberId;
    private int number;
    private String operator;
    private int numberUserId;

    public joinClass(int id, int number, String operator) {
        this.id = id;
        this.number = number;
        this.operator = operator;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberId() {
        return numberId;
    }

    public void setNumberId(int numberId) {
        this.numberId = numberId;
    }

    public int getNumberUserId() {
        return numberUserId;
    }

    public void setNumberUserId(int numberUserId) {
        this.numberUserId = numberUserId;
    }
    
    
    
}
