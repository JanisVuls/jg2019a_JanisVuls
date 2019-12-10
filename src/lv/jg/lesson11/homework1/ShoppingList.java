package lv.jg.lesson11.homework1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class ShoppingList {
	
	public static void main(String[] args)  {
		ShoppingList tests = new ShoppingList();
        tests.printProductList(basicList());
        tests.removeFromList(basicList());
        tests.addToList(basicList());
        tests.removeFromList(basicList());
        tests.productsWithInRange(basicList());
        tests.productsByCategory(basicList());
        tests.extractToFile(basicList());
        tests.readFromFile();
	}
	
	public void extractToFile(List<Product> listOfProducts) {
		String fileName  = "extractedBasicList.txt";
        try {
			PrintWriter outputStream = new PrintWriter(fileName);
			for(Product product : listOfProducts) {
			outputStream.println(product);
			}
			outputStream.close();
			System.out.println("Extract Done");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public void readFromFile() {
        try {
        	System.out.println("Read from file:");
        	FileReader fr = new FileReader("readList.txt");
			BufferedReader br = new BufferedReader(fr);
			String str;
			while ((str = br.readLine()) !=null) {
				System.out.println(str);
			}
			br.close();
			
		} catch (IOException e) {
			System.out.println("File not found");
		}
	}
	
	public void printProductList(List<Product> listOfProducts) {
        for(Product product : listOfProducts) {
            System.out.println(product);
            }
        System.out.println("=================Print===================");
          }
	
	public void addToList(List<Product> listOfProducts) {
			listOfProducts.add(new Product("Chicken", 3, Category.MEAT));
			listOfProducts.stream().forEach(System.out::println);
			System.out.println("++++++++++++++++++Add++++++++++++++++++++");
            }
	
	public void removeFromList(List<Product> listOfProducts) {
			listOfProducts.removeIf(n -> (n.getName() == "Bread"));
			listOfProducts.removeIf(n -> (n.getName() == "Chicken"));
			listOfProducts.stream().forEach(System.out::println);
			System.out.println("-----------------------Remove--------------------------");
            }

	public void productsWithInRange(List<Product> listOfProducts) {
		for(Product product : listOfProducts) {
			if (product.getPrice() >= 1 && product.getPrice() <=2) {
				System.out.println(product);
			}
		}
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$InRange$$$$$$$$$$$$$$$$$$$$$$$$$");
	}
	
	public void productsByCategory(List<Product> listOfProducts) {
		for(Product product : listOfProducts) {
			if (product.getCategory() == Category.FISH) {
				System.out.println(product);
			}
		}
		System.out.println("******************Category*********************");
	}

	public static List<Product> basicList() {
        List<Product> list = new ArrayList<>();
        list.add(new Product("Milk", 1, Category.DAIRY));
        list.add(new Product("Bread", 2, Category.PASTRY));
        list.add(new Product("FishSticks", 2.5, Category.FISH));
        return list;
    }
}
