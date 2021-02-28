package com.ztrampic.elastic.ztrampic.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.util.Set;

@Document(indexName = "user")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {
    @Id
    private Long id;
    private String name;
    private String lastName;
    private String userName;
    @Field(type = FieldType.Keyword)
    private String[] tags;
    @Field(type = FieldType.Nested, includeInParent = true)
    private Set<Role> roles;
}
