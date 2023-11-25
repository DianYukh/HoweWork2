package org.example.Homework.homework25.dictionary.view;




import org.example.Homework.homework25.dictionary.model.Dictionary;
import org.example.Homework.homework25.dictionary.service.Metods;

import java.util.Scanner;

public class Menu {

    private int choice;


    public Menu() {
    }

    public Menu(int choice) {
        this.choice = choice;
    }

    public int getChoice() {
        return choice;
    }

    public void setChoice(int choice) {
        if (choice > 0 && choice < 9) {
            this.choice = choice;
        } else {
            System.out.println("Error input");
        }
    }

    public void menu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Виберіть операцію");
        Metods metods = new Metods();
        while (true) {
            System.out.println("1 Надати початкове введення даних для словника.");
            System.out.println("2 Відобразити слово та його переклади.");
            System.out.println("3 Додати переклад слова.");
            System.out.println("4 Змінити переклад слова.");
            System.out.println("5 Видалити переклад слова.");
            System.out.println("6 Додати слово.");
            System.out.println("7 Змінити слово.");
            System.out.println("8 Видалити слово.");
            System.out.println("9 Відобразити топ-10 найпопулярніших слів.");
            System.out.println("10 Відобразити топ-10 найнепопулярніших слів.");
            System.out.println("11 Відобразити весь словник.");
            System.out.println("0 Вихід.");





            int choice = scanner.nextInt();
            scanner.nextLine();
            boolean isSelect = true;
            switch (choice) {
                case 1 ->{
                    System.out.println("Введіть слово на англійській мові");
                    String word = scanner.nextLine();
                    System.out.println("Введіть переклад цього слова");
                    String translation = scanner.nextLine();
                    metods.addWord(word, translation);
                }
                case 2 ->{
                    System.out.println("Введіть слово для перекладу");
                    String word = scanner.nextLine();
                    metods.showWord(word);
                }
                case 3 ->{
                    System.out.println("Введіть слово на англійській мові, переклад якого треба додати");
                    String word = scanner.nextLine();
                    System.out.println("Введіть переклад цього слова");
                    String addTranslation = scanner.nextLine();
                    metods.addTranslation(word, addTranslation);
                }
                case 4 ->{
                    System.out.println("Введіть слово на англійській мові, переклад якого треба змінити");
                    String word = scanner.nextLine();
                    System.out.println("Введіть старий переклад цього слова");
                    String oldTranslation = scanner.nextLine();
                    System.out.println("Введіть новий переклад цього слова");
                    String newTranslation = scanner.nextLine();
                    metods.changeTranslation(word, oldTranslation, newTranslation);
                }
                case 5 ->{
                    System.out.println("Введіть слово на англійській мові, переклад якого треба видалити");
                    String word = scanner.nextLine();
                    System.out.println("Введіть переклад цього слова");
                    String deleteTranslation = scanner.nextLine();
                    metods.deleteTranslation(word, deleteTranslation);
                }
                case 6 ->{
                    System.out.println("Введіть слово на англыйськый мовы яке потрібно додати");
                    String word = scanner.nextLine();
                    metods.addNewWord(word);
                }
                case 7 ->{
                    System.out.println("Введіть слово на англійській мові, яке потрібно змінити");
                    String word = scanner.nextLine();
                    System.out.println("Введіть нове слово");
                    String newWord = scanner.nextLine();
                    metods.changeWord(word, newWord);
                }
                case 8 ->{
                    System.out.println("Введіть слово яке потрібно видалити");
                    String word = scanner.nextLine();
                    metods.deleteWord(word);
                }
                case 9 ->{
                    System.out.println("Топ-10 найпопулярніших слів:");
                }
                case 10 ->{
                    System.out.println("Топ-10 найнепопулярніших слів:");
                }
                case 11 ->{
                    System.out.println("Весь словник");
                    metods.showDictionary();}
                case 0 -> {
                    System.out.println("До побачення");
                    isSelect = false;;
                }
                default ->  System.out.println("Помилка введення операції. Повторіть спробу. Оберіть цифри зі списку.");

            }
        }
    }

}


