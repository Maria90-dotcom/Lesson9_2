package com.company;

public class Main {

    public static void main(String[] args) {
	Phone newPhone1 = new Phone(6167871, "Nokia", 200);
	Phone newPhone2 = new Phone(6293467, "Samsung", 700);
	Phone newPhone3 = new Phone(6987522, "Xiaomi", 550);
        System.out.println(newPhone1.number+" "+newPhone1.model+" "+newPhone1.weight);
        newPhone1.receiveCall();
        newPhone1.getNumber();
        System.out.println(newPhone2.number+" "+newPhone2.model+" "+newPhone2.weight);
        newPhone2.receiveCall();
        newPhone2.getNumber();
        System.out.println(newPhone3.number+" "+newPhone3.model+" "+newPhone3.weight);
        newPhone3.receiveCall();
        newPhone3.getNumber();
        Phone newPhone4 = new Phone(6293875,"Huawei");
        System.out.println(newPhone4.number+"  "+newPhone4.model);
newPhone1.sendMessage(6543822, 6293875);
    }
}
