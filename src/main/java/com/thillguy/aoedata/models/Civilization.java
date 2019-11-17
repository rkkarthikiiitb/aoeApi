package com.thillguy.aoedata.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Civilization {

    private Integer id;
    private String name;
    private String expansion;
    private String uniqueUnit;
    private String uniqueTech;
    private String teamBonus;

}
