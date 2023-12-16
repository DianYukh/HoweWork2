package org.example.Homework.homework34.MobileFactory;

public class Run {
    public static void main(String[] args) {
        MobileFactoryProducer MpbileFactoryProducer = new MobileFactoryProducer();
        AbstractFactory abstractFactory1 = MpbileFactoryProducer.getFactory(false);
        IMobile onePlus = abstractFactory1.getMobile("Oneplus");
        onePlus.brandName();
        IMobile sony = abstractFactory1.getMobile("Sony");
        sony.brandName();
        IMobile lava = abstractFactory1.getMobile("Lava");
        lava.brandName();
        AbstractFactory abstractFactory2 = MpbileFactoryProducer.getFactory(true);
        IMobile iphone = abstractFactory2.getMobile("iPhone");
        iphone.brandName();
    }
}
