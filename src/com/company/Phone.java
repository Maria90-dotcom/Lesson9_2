package com.company;
import java.util.Scanner;
public class Phone {
    int number;
    String model;
    int weight;

    public Phone(int number, String model, int weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
        Phone newPhone4 = new Phone();
    }
    public Phone(int number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {
    }
    String name = "Sergey";

    void receiveCall() {
        System.out.println("Звонит  " + name);
    }

    public void getNumber() {

        System.out.println(number);
    }
    public void sendMessage(int num1, int num2) {

        System.out.println("Сообщение будет отправлено пользоваелям: "+num1 + " " + num2);
    }

}
