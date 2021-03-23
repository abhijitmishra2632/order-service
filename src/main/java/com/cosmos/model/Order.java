package com.cosmos.model;

import com.cosmos.pojo.UserCart;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "order")
public class Order {
    @Id
    private long orderId;
    private Long mobileNumber;
    private Set<Item> itemSet;
    private LocalDate orderTime;
    private boolean status;
    private UserCart userCart;
}
