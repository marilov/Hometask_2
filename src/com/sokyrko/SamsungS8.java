package com.sokyrko;

public class SamsungS8 extends AndroidPhone {

    SamsungS8(String phoneName, double screenSize, double phoneSize, boolean sms, boolean call) {
        super(phoneName, screenSize, phoneSize, sms, call);
    }

    @Override
    public String getPhoneName() {
        return super.getPhoneName();
    }

    @Override
    public double getScreenSize() {
        return super.getScreenSize();
    }

    @Override
    public double getPhoneSize() {
        return super.getPhoneSize();
    }

    @Override
    public void getSms() {
        super.getSms();
    }

    @Override
    public void getCall() {
        super.getCall();
    }
}
