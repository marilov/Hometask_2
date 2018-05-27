package com.sokyrko;

public class Main {

    public static void main(String[] args) {
        IPhoneX iPhoneX = new IPhoneX("iPhone X", 5.6, 7.6, false, true);
        System.out.println(iPhoneX.getPhoneName());
        System.out.println(iPhoneX.getScreenSize());
        System.out.println(iPhoneX.getPhoneSize());
        iPhoneX.getSms();
        iPhoneX.getCall();

        SamsungS8 samsungS8 = new SamsungS8("Samsung S8", 7.9, 3.9, true, false);
        System.out.println(samsungS8.getPhoneName());
        System.out.println(samsungS8.getScreenSize());
        System.out.println(samsungS8.getPhoneSize());
        samsungS8.getSms();
        samsungS8.getCall();
    }
}