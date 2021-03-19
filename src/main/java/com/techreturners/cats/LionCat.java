package com.techreturners.cats;

public class LionCat extends GeneralCat{
  private Boolean asleep = false;
  public LionCat(){super ("Roar!!!!", 1100, "wild");}

  public String getSetting(){
    return setting;
  }
  public int getAverageHeight(){
    return height;
  }
  public String eat(){
    return catSound;
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
