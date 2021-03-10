package com.techreturners.cats;

import com.sun.org.apache.xpath.internal.operations.Bool;

interface Cat {
  public abstract String eat();
  public abstract Boolean isAsleep();
  public abstract void run();
  public void goToSleep();
  public void wakeUp();
  public String getSetting();
  public Object getAverageHeight();

}


