package com.cosmos.model;

import com.cosmos.pojo.ProductGist;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class Item {
	private int productId;
	private int quantityOfProduct;
	private ProductGist product;
}
