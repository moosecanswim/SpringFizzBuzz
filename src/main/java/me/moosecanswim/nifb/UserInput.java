package me.moosecanswim.nifb;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;

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

    public ArrayList<String> fizzBuzzActual(int upper){
       ArrayList<String> storage = new ArrayList<String>();
        int i = 1;
        String output=null;
        do{
            boolean printNumber = true;
            output="";
            if(i%3==0){
                output+="Fizz";
                printNumber = false;
            }
            if(i%5==0){
                output+="Buzz";
                printNumber = false;
            }

            if(printNumber == true){
                output = String.valueOf(i);
            }
            storage.add(output);


            i++;
        }while(i < upper+1);
        return storage;
    }



}
