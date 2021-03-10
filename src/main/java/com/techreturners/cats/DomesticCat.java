package com.techreturners.cats;

public class DomesticCat implements Cat{
  private Boolean asleep = false;
  //private
  public String getSetting(){
    return "domestic";
  }
  public Object getAverageHeight(){
    return 23;
  }
  public String eat(){
    return "Purrrrrrr";
  }
  public Boolean isAsleep(){
    return true;
  }
  public void run(){
    System.out.println("Cat should be awake now");
  }
  public void goToSleep(){
    asleep = true;
  }
  public void wakeUp(){
    asleep = false;
  }
}
