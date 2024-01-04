package org.example.Homework.homework35.Builder;

public class Run {
    public static void main(String[] args) {


        PastaConstructor pasta = new PastaConstructor();

        System.out.println("Паста Карбонара");
        PastaBuilder builder = new CarbonaraBuilder();
        pasta.Construct(builder);
        builder.GetPasta().Show();

        System.out.println("---------------------");
        System.out.println("Паста Альфредо");
        PastaBuilder builder1 = new AlfredoBuilder();
        pasta.Construct(builder1);
        builder1.GetPasta().Show();

        System.out.println("---------------------");
        System.out.println("Паста Болоньєзе");
        PastaBuilder builder2 = new BolonezeBuilder();
        pasta.Construct(builder2);
        builder2.GetPasta().Show();


    }
}
