package com.saber;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Saber
 */

@Entity
@Table(name="numbers")
public class Numbers implements Serializable {
    
    @Id
    @GeneratedValue
    private int numberId;
    
    @Column(name = "number")
    private int number;
    
    @Column(name="operator")
    private String operator;
    
    @Column(name="numberUserId")
    private int numberUserId;

    public int getNumberUserId() {
        return numberUserId;
    }

    // @ManyToOne
    // @JoinTable(name="users")
    //private Users user;
    
    
    public void setNumberUserId(int numberUserId) {
        this.numberUserId = numberUserId;
    }

 
    
    public Numbers(){
        
    }
    
    public Numbers(int number){
        this.number = number;
    }

    public int getId() {
        return numberId;
    }

    public void setId(int id) {
        this.numberId = numberId;
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
    
    
}
