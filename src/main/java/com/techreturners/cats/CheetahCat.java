package com.techreturners.cats;

public class CheetahCat implements Cat{
  private Boolean asleep = false;

  public String getSetting(){
    return "wild";
  }
  public int getAverageHeight(){
    return 1200;
  }
  public String eat(){
    return "Zzzzzzz";
  }
  public Boolean isAsleep(){
    return asleep;
  }
  public void run(){
    System.out.println("Cheetah should run now");
  }
  public void goToSleep(){
    asleep = true;
  }
  public void wakeUp(){
    asleep = false;
  }
}
