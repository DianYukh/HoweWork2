package org.example.Homework.homework34.MobileFactory;

public class AppleMobileFactory extends AbstractFactory {
    @Override
    public IMobile getMobile(String mobileModel) {
        if (mobileModel.equalsIgnoreCase("iphone")) {
            return new Iphone();
        }
        return null;
    }
}
