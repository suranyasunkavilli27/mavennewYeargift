package epamweek2.com.newyeargift;

/**
 * Hello world!
 *
 */
import java.util.*;
public class App 
{
    public static void main( String[] args )
    {
    	ArrayList<Sweets> allsweets = new ArrayList<Sweets>();
        allsweets.add(new chocolates("cadbury", 10, 100, "dark"));
        allsweets.add(new chocolates("snickers", 13, 120, "dark"));
        allsweets.add(new chocolates("kitkat", 12, 120, "brown"));
        allsweets.add(new jelly("king", 2, 15, "yellow"));
        allsweets.add(new jelly("apple", 2, 15, "green"));
        allsweets.add(new wraffers("strawberry", 2, 20, "pink"));
        allsweets.add(new chocolates("5 star", 5, 20, "brown"));
        allsweets.add(new jelly("mango", 22, 22, "yellow"));
        allsweets.add(new wraffers("perk", 2, 20, "orange"));
        ArrayList<Sweets> onlychocolates = new ArrayList<Sweets>();
        for(int i = 0; i < allsweets.size(); i++){
            if(allsweets.get(i) instanceof chocolates){
                onlychocolates.add(allsweets.get(i));
            }
        }
       
        int jellycount = 0;
        for(int i = 0; i < allsweets.size(); i++){
            if(allsweets.get(i) instanceof jelly){
                jellycount++;
            }
        }
        System.out.println("Jelly Count is: "  + jellycount);
        Collections.sort(onlychocolates,  new sortbyweight());
        int totalweight = 0;
        for(int i = 0; i < allsweets.size(); i++){
            totalweight += allsweets.get(i).weight;
        }
        System.out.println("Total Sweets weight is: " + totalweight + "gms");
        System.out.println("Chocolates weight in sorted order:");
        for(int i = 0; i < onlychocolates.size(); i++){
            System.out.println(onlychocolates.get(i).name + "- " +onlychocolates.get(i).weight + "gms");
        }
    }
}
