package com.techreturners.cats;

public abstract class GeneralCat implements Cat{
  private Boolean asleep = false;
  public int height;
  public String setting;
  public String catSound;

  public GeneralCat(String catSound, int height, String setting){
    this.height = height;
    this.setting = setting;
    this.catSound = catSound;
  }

  public String getSetting(){ return this.setting; }
  public int getAverageHeight(){ return this.height; }
  public String eat(){ return this.catSound; }
  public Boolean isAsleep(){ return this.asleep; }
  public void goToSleep(){ asleep = true; }
  public void wakeUp(){ asleep = false; }
}
