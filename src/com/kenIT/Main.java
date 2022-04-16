package com.kenIT;

public class Main {
    private static ValidatePhoneNumber validatePhoneNumber = new ValidatePhoneNumber();
    public static String [] phoneNumber = {"123456789","0986031173","0932314141222"};
    public static String [] phoneNumber1 = {"12","83-0986031173","85-0932314141222"};
    public static void main(String[] args) {
        for (String phoneNumber:  phoneNumber)
              {
                  System.out.println("Phone number: " + phoneNumber + " is :" +validatePhoneNumber.validate(phoneNumber));
        }
        for (String phoneNumber : phoneNumber1
             ) {
            System.out.println("Phone number: " + phoneNumber + " is :" +validatePhoneNumber.validate(phoneNumber));
        }
    }
}
