package com.sokyrko;
/**
 * This is a common class for all iOS phone models. It describes behaviors and characteristics.
 */
public class IPhone extends Phone {

    String phoneName;
    double screenSize;
    double phoneSize;
    boolean sms;
    boolean call;

    IPhone(String phoneName, double screenSize, double phoneSize, boolean sms, boolean call) {
        super(phoneName, screenSize, phoneSize, sms, call);
        this.phoneName = phoneName;
        this.screenSize = screenSize;
        this.phoneSize = phoneSize;
        this.sms = sms;
        this.call = call;
    }


    @Override
    public String getPhoneName() {
        return phoneName;
    }

    @Override
    public double getScreenSize() {
        return screenSize;
    }

    @Override
    public double getPhoneSize() {
        return phoneSize;
    }

    @Override
    public void getSms() {
        if (sms) {
            System.out.println("Hello, I can send sms");
        } else {
            System.out.println("iOS can't send sms");
        }
    }

    @Override
    public void getCall() {
        if (call) {
            System.out.println("iOS is calling...");
        } else {
            System.out.println("iOS can't call");
        }
    }
}
