package com.techreturners.cats;

public class DomesticCat implements Cat{
  private Boolean asleep = false;

  public String getSetting(){
    return "domestic";
  }
  public int getAverageHeight(){
    return 23;
  }
  public String eat(){
    return "Purrrrrrr";
  }
  public Boolean isAsleep(){
    return asleep;
  }
  public void run(){
    System.out.println("Cat should run now");
  }
  public void goToSleep(){
    asleep = true;
  }
  public void wakeUp(){
    asleep = false;
  }
}
