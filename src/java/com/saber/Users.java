package com.saber;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class Users implements Serializable {
    
    @Id
    @GeneratedValue
    private int id;
    
    @Column(name="name")
    private String name;
    
    @Column(name="age")
    private int age;
    
   // @OneToMany(mappedBy ="users")
    //private Set<Numbers> number;

    
    public Users(){
        
    }

    public Users(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    } 
}
