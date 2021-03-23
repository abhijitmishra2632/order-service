package com.cosmos.pojo;

import com.cosmos.model.Item;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UserCart {
	private Long mobileNumber;
	private Set<Item> items;

}
