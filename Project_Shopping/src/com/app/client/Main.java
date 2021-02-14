package com.app.client;

import java.util.Scanner;

import com.app.service.ProductService;
import com.app.service.impl.ProductServiceImpl;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		ProductService ps=new ProductServiceImpl();
		String s=" ";
		do {
        System.out.println("1] add Product");
        System.out.println("2] display Product");
        System.out.println("3] add To Cart");
        System.out.println("4] create Bill");
        System.out.println("5] exit");
        
        System.out.println("Enter no. :");
        int a=sc.nextInt();
        
        switch(a) {
            case 1:
            	 ps.addProduct();
            break;
            case 2:
           	     ps.displayProduct();
            break;
            case 3:
          	     ps.addToCart();
            break;
            case 4:
          	     ps.createBill();
            break;
            default:
            	System.out.println("invalid selection");


        }System.out.println("Do you want to continue ...y/n");
         s=sc.next();
         
	}while(s.equals("y"));

}
}