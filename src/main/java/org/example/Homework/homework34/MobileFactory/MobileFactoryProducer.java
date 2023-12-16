package org.example.Homework.homework34.MobileFactory;

public class MobileFactoryProducer {
    public static AbstractFactory getFactory(boolean isApple) {
        if (isApple) {
            return new AppleMobileFactory();
        } else {
            return new AndroidMobileFactory();
        }
    }
}
