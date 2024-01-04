package org.example.Homework.homework35.AbstractFactory;

public class Run {
    public static void main(String[] args) {
        PastaFactory carbonaraFactory = new CarbonaraFacrory();
        Pasta pastaCarbonara = carbonaraFactory.createPasta();

        System.out.println("Паста Карбонара");
        System.out.println("Тип пасти: " + pastaCarbonara.type());
        System.out.println("Соус: " + pastaCarbonara.sauce());
        System.out.println("Начинка: " + pastaCarbonara.filling());
        System.out.println("Доповнення: " + pastaCarbonara.addition());
        System.out.println("---------------------------- " );

        PastaFactory alfredoFactory = new AlfredoFactory();
        Pasta pastaAlfredo = alfredoFactory.createPasta();

        System.out.println("Паста Альфредо");
        System.out.println("Тип пасти: " + pastaAlfredo.type());
        System.out.println("Соус: " + pastaAlfredo.sauce());
        System.out.println("Начинка: " + pastaAlfredo.filling());
        System.out.println("Доповнення: " + pastaAlfredo.addition());
        System.out.println("---------------------------- " );

        PastaFactory bolonezeFactory = new BolonezeFactory();
        Pasta pastaBoloneze = bolonezeFactory.createPasta();

        System.out.println("Паста Болоньєзе");
        System.out.println("Тип пасти: " + pastaBoloneze.type());
        System.out.println("Соус: " + pastaBoloneze.sauce());
        System.out.println("Начинка: " + pastaBoloneze.filling());
        System.out.println("Доповнення: " + pastaBoloneze.addition());
    }
}
