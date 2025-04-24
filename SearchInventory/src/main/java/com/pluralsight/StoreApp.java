package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class StoreApp {

    public static void main(String[] args) {
        ArrayList<Product> inventory = getInventory();
        Scanner scanner = new Scanner(System.in);
        System.out.println("We carry the following inventory: ");
        for (int i = 0; i < inventory.size(); i++) {
            Product p = inventory.get(i);
            System.out.printf("id: %d %s - Price: $%.2f \n",
                    p.getId(), p.getName(), p.getPrice());
        }
    }

    public static ArrayList<Product> getInventory() {
        ArrayList<Product> inventory = new ArrayList<Product>();
        try {
            FileReader fileReader = new FileReader("src/main/resources/inventory.csv");
            BufferedReader bufReader = new BufferedReader(fileReader);
            bufReader.readLine();
            String input;

            while((input = bufReader.readLine()) != null) {
                String[] productParts = input.split("\\|");
                Product newProduct = new Product(Integer.parseInt(productParts[0]), productParts[1], Float.parseFloat(productParts[2]));
                inventory.add(newProduct);
            }

        } catch (Exception e) {
            System.out.println("Error you messed up!");
        }

       return inventory;
    }
}

