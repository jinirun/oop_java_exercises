package com.techreturners.cats;

public class DomesticCat extends GeneralCat{
  private Boolean asleep = false;
  public DomesticCat() { super ("Purrrrrrr",23, "domestic" );}

  public String getSetting(){
    return setting;
  }
  public int getAverageHeight(){ return height;  }
  public String eat(){
    return catSound;
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
