package com.techreturners.cats;

public class LionCat implements Cat{
  private Boolean asleep = false;
  //private
  public String getSetting(){
    return "domestic";
  }
  public Object getAverageHeight(){
    return 1100;
  }
  public String eat(){
    return "Roar!!!!";
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
