package com.techreturners.cats;

public class CheetahCat extends GeneralCat{

  public CheetahCat() {super ("Zzzzzzz",1200,"wild");}
  private Boolean asleep = false;

  public String getSetting(){
    return setting;
  }
  public int getAverageHeight(){ return height; }
  public String eat(){
    return catSound;
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
