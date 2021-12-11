package edu.seu.builder.improve.builderPatternRoles;

import lombok.Data;
import lombok.ToString;

// 产品，对应builder Pattern中的product角色
@Data
@ToString
public class House {
    private String basic;
    private String wall;
    private String roof;
}
