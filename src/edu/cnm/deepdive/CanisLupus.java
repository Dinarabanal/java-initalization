package edu.cnm.deepdive;

public class CanisLupus  extends Canis {

  private static String someText = getSomeText ();

  private int WolfData = getValue();

  {
    System.out.println("Entering Canis initialization block");
  }
  
  public CanisLupus() {
    //Do superclass initalization first
    //Do other instance initialization before constructor

    System.out.println("Entering CanisLupus::new");

  }

  private int getValue() {
    System.out.println("Entering CanisLupus::getValue");
    return 1;

  }

  private static String getSomeText() {
    System.out.println("Entering CanisLupus::getSomeText");
    return "Hello";
  }
}
