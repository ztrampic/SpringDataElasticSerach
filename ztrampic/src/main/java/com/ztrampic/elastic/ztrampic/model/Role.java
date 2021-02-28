package com.ztrampic.elastic.ztrampic.model;

import lombok.*;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Role {
    @Field(type = FieldType.Text)
    private String roleName;
}
