package com.cosmos.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@Document(collection = "seqfororder")
public class IdSequence {
    @Id
    private String id;
    public long seq;

    public IdSequence(long seq) {
        super();
        this.seq = seq;
    }
}
