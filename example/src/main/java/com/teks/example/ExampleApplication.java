package com.teks.example;

import com.teks.example.entities.product;
import com.teks.example.service.productService;
import com.teks.example.service.productServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class ExampleApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(ExampleApplication.class, args);

		productService service = context.getBean(productServiceImpl.class);

		product products = new product();

//INSERT OPERATION
//		products.setName("Iphone");
//		products.setPrice(70000);
//		products.setStock(50);
//		products.setCategory("Devices");

//		products.setName("TV");
//		products.setPrice(80000);
//		products.setStock(100);
//		products.setCategory("Electronics");

//		products.setName("watch");
//		products.setPrice(5000);
//		products.setStock(1000);
//		products.setCategory("Electronics");
//
//		products.setName("stove");
//		products.setPrice(10000);
//		products.setStock(59);
//		products.setCategory("Kistchen Items");
//
//
//		boolean status = service.saveProduct(products);
//
//		if(status){
//			System.out.println("success");
//		}
//		else{
//			System.out.println("no worries... try again ");
//		}

//		SELECT OPERATION FOR ALL

//        List<product> productList = service.getProducts();
//
//		for(product p : productList){
//			System.out.println("ID: "+p.getId()
//			+"\nName: " +p.getName()
//					+"\nStock: " +p.getStock()
//					+"\nCategory: " +p.getCategory()
//					+"\nprice: " +p.getPrice());
//			System.out.println("---------------------------------------------------------------------");
//		}
//
//		SELECT OPERATION FOR AN ID

//		product p = service.getProductById(10);
//
//		if(p != null){
//						System.out.println("ID: "+p.getId()
//			+"\nName: " +p.getName()
//					+"\nStock: " +p.getStock()
//					+"\nCategory: " +p.getCategory()
//					+"\nprice: " +p.getPrice());
//		}
//		else{
//			System.out.println("product not found");
//		}

//		UPDATE BY ID

//		boolean status = service.updateDetails(2,"SamsungTv",200000,150,"Electronic items");
//
//
//		if(status){
//			System.out.println("updation success");
//		}
//		else{
//			System.out.println("upadation failed");
//		}

//		DELETE PRODUCT BY ID
		boolean status = service.DeleteById(2);
		if(status){
			System.out.println("deletion success");
		}
		else{
			System.out.println("deletion failed");
		}

	}

}
