package org.example.Homework.lesson14.practice;

public class HumanMain {
    public static void main(String[] args) {

        Human human = new Human();
        human.setName("Artem");
        System.out.println(human.getName());
        human.setDateofbirth("23.01.1990");
        System.out.println(human.getDateofbirth());
        human.setPhonenumber("095 257 69 88");
        System.out.println(human.getPhonenumber());
        human.setHomeadress("Kvartal Centralnii 14/96");
        System.out.println(human.getHomeadress());
        human.setCity("Lysychansk");
        System.out.println(human.getCity());
        human.setCountry("Ukraine");
        System.out.println(human.getCountry());

    }
}