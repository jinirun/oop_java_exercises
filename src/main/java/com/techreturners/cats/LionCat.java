package com.techreturners.cats;

public class LionCat implements Cat{
  private Boolean asleep = false;

  public String getSetting(){
    return "wild";
  }
  public int getAverageHeight(){
    return 1100;
  }
  public String eat(){
    return "Roar!!!!";
  }
  public Boolean isAsleep(){
    return asleep;
  }
  public void run(){
    System.out.println("Lion should run now");
  }
  public void goToSleep(){
    asleep = true;
  }
  public void wakeUp(){
    asleep = false;
  }
}
