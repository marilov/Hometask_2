package com.sokyrko;

/**
 * This is a parent class which contains common methods for different phone models and types.
 */
public abstract class Phone {

    double screenSize;
    double phoneSize;
    boolean sms;
    boolean call;
    String phoneName;

    Phone(String phoneName, double screenSize, double phoneSize, boolean sms, boolean call){
        this.phoneName = phoneName;
        this.screenSize = screenSize;
        this.phoneSize = phoneSize;
        this.sms = sms;
        this.call = call;

    }

    /**
     * This method describes phone model name.
     * @return
     */
    public abstract String getPhoneName();

    /**
     * This method describes phone screen size.
      * @return
     */
    public abstract double getScreenSize();

    /**
     * This method describes phone model size.
     * @return
     */
    public abstract double getPhoneSize();

    /**
     * This method describes if the phone model can send sms.
     */
    public abstract void getSms();

    /**
     * This method describes if the phone model can make calls.
      */
    public abstract void getCall();

}
