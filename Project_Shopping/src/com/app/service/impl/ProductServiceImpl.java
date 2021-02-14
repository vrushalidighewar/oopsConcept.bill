package com.app.service.impl;

import java.util.Scanner;

import com.app.model.Product;
import com.app.service.ProductService;

public class ProductServiceImpl implements ProductService {
                 
	     private Product[] product=null;
	     private Product[] cart=null;
	     Scanner sc=new Scanner(System.in);
	@Override
	public void addProduct() {
		System.out.println("How many products do you want :");
		int i=sc.nextInt();
		product=new Product[i];
		
		for(int j=0;j<i;j++) {
			Product p=new Product();
            System.out.println("Enter product id ");
			p.setId(sc.nextInt());
			System.out.println("Enter product name ");
			p.setName(sc.next());
			System.out.println("Enter price ");
			p.setPrice(sc.nextFloat());
			product[j]=p;
			
		}

	}

	@Override
	public void displayProduct() {
      
		for(int j=0;j<product.length;j++) {
  		Product p=product[j];
        System.out.println(p.getId()+ " " +p.getName()+ " " +p.getPrice());
		}

	}

	@Override
	public void addToCart() {
		
		if(product!=null) {
			displayProduct();
		System.out.println("How many products you want to buy ");
		int a=sc.nextInt();
		cart=new Product[a];
		for(int k=0;k<a;k++) {
			 System.out.println("Enter id");
			 Product p=new Product();
			 p.setId(sc.nextInt());
			 
	    for(int j=0;j<product.length;j++) {
	    	
	    	if(p.getId()==product[j].getId())
	    	cart[k]=product[j];
	    }
		}
		}

	}

	@Override
	public void createBill() {
		int finalGrandTotal=0;
		for(int j=0;j<cart.length;j++) {
			System.out.println(cart[j].getId()+ " " +cart[j].getName()+ " " +cart[j].getPrice());
			
			finalGrandTotal+=cart[j].getPrice();
		}
      System.out.println("Your grand total is "+finalGrandTotal);
	}

}
