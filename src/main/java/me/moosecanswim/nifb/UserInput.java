package me.moosecanswim.nifb;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class UserInput {

    @NotNull
    private String name;
    @NotNull
    @Min(10)
    @Max(10000)
    private Integer number;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }



}
