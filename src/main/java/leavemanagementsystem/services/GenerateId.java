package leavemanagementsystem.services;

import lombok.Getter;

@Getter
public class GenerateId {
    private static int id;
    public GenerateId(){
        id++;
    }
    public int getId(){return id;}
}
