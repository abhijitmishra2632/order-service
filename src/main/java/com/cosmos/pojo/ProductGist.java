package com.cosmos.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductGist {
	private int productId;
	private String productName;
	private String productCategory;
	private String productType;
	private String productBrand;
	private String productStore;
	private int productAmount;
	private int productMRP;
	private int productSellingPrice;
}
