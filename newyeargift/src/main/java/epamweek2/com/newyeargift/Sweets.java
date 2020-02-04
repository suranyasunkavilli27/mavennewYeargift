package epamweek2.com.newyeargift;

import java.util.*;
public class Sweets{
    String name;
    int weight;
    int cost;
    String color;
    Sweets(String name, int weight, int cost, String color){
        this.name = name ;
        this.weight = weight;
        this.cost = cost;
        this.color = color;
    }
    
}
class  sortbyweight  implements Comparator<Sweets> {
    public  int compare(Sweets a, Sweets b){
        return a.weight  - b.weight;
    }
} class  sortbycost  implements Comparator<Sweets>{
    public int compare(Sweets a, Sweets b){
        return a.cost  - b.cost;
    }
}