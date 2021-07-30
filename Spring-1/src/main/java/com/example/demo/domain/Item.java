package com.example.demo.domain;

import 
public class Item {
	private Long id;
	
	@NotBlank(message="商品名を記入してください。")
	private String name;
}
