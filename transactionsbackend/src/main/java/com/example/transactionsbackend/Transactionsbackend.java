package com.example.transactionsbackend;

import java.util.*;


public class Transactionsbackend {
  private int id;
  private String type;
  private Date date;
  private int amount;
  private String desc;
  private int balance;

  public Transactionsbackend(int id,int i,int amount,String desc,String type,int balance){
    this.id=id;
    this.type=type;
    this.amount=amount;
    this.desc=desc;
    this.balance=balance;
  } 

  public int getId(){
    return id;
  }
  public void setId(int id){
    this.id=id;
  }
  public int getAmount(){
    return amount;
  }
  public void setAmount(int amount){
    this.amount=amount;
  }
  public int getBalance(){
    return balance;
  }
  public void setBalance(int balance){
    this.balance=balance;
  }

  public String getDesc(){
    return desc;
  }
  public void setDesc(String desc)
{
    this.desc=desc;
}  
public Date getDate(){
    return date;
}
public void setDate(Date date){
    this.date=date;
}
public String getType(){
    return type;
}
public void setType(String type){
    this.type=type;
}
  
}
