package Programacao_de_Aplicativos.Applications;


import Programacao_de_Aplicativos.Entities.Product;

import java.util.Scanner;

public class EnterProductData {
    static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Product p= new Product();

        System.out.println("Enter product data:");
        System.out.println("Name: ");
        p.name= sc.nextLine();
        System.out.println("Price: ");
        p.price= sc.nextDouble();
        System.out.println("Quantity in stock: ");
        p.quantity= sc.nextInt();

        char answer;
        do {
            System.out.println(
                    "========================="+
                            "\nSelect the option:"+
                            "\n1- Add products in stock"+
                            "\n2- Remove products in stock"+
                            "\n3- Show data"+
                            "\n4- Exit"+
                            "\n========================="
            );
            answer= sc.next().charAt(0);

            int quantity;
            if (answer=='1') {
                System.out.println("How many products you want to add: ");
                quantity= sc.nextInt();
                if (quantity>=0) {
                    p.addProducts(quantity);
                    System.out.println(quantity+" products added");
                }
                else
                    System.out.println("You can not add a negative number!");
            }
            else if (answer=='2') {
                System.out.println("How many products you want to remove: ");
                quantity= sc.nextInt();

                if (quantity<=p.quantity && quantity>0) {
                    p.removeProducts(quantity);
                    System.out.println(quantity+" products removed");
                }
                else if (quantity<0) {
                    System.out.println("You can not remove a negative number!");
                }
                else
                    System.out.println("You can not remove more than "+p.quantity+" products!");
            }
            else if (answer=='3') {
                System.out.println(p.showData());
            }
            else if (answer=='4') {
                System.out.println("Closing the program...");
            }
            else
                System.out.println("Type a valid answer!");

        } while (answer!= '4');

        sc.close();
    }
}
