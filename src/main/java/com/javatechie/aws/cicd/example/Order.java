package com.javatechie.aws.cicd.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Order {

   
	public Order(int Id, String Name, int Quantity, int Price) {
		// TODO Auto-generated constructor stub
		
		id = Id;
		name = Name;
		quantity = Quantity;
		price = Price;
	}
	public int id;
	public String name;
	public int quantity;
	public long price;
}