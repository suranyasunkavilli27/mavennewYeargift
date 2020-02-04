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
        allsweets.add(new candies("chocolate", 2,10,"brown"));
        allsweets.add(new candies("mango", 12,30,"yellow"));
        allsweets.add(new candies("apple", 22,50,"green"));
        allsweets.add(new candies("strawberry", 30,70,"pink"));
        allsweets.add(new candies("pineapple", 32,80,"yellow"));
        allsweets.add(new candies("cherry", 38,100,"red"));
        allsweets.add(new candies("banana", 40,140,"yellow"));
        ArrayList<Sweets> onlychocolates = new ArrayList<Sweets>();
        for(int i = 0; i < allsweets.size(); i++){
            if(allsweets.get(i) instanceof chocolates){
                onlychocolates.add(allsweets.get(i));
            }
        }
        ArrayList<Sweets> onlycandies = new ArrayList<Sweets>();
        for(int i = 0; i < allsweets.size(); i++){
            if(allsweets.get(i) instanceof candies){
                onlycandies.add(allsweets.get(i));
            }
        }
       // ArrayList<ArrayList<Integer>> candiescount = new ArrayList<ArrayList<Integer>>();
        int lessthan50 = 0;
        int lessthan100 = 0;
        int lessthan150 = 0;
        for(int i = 0; i < onlycandies.size(); i++) {
        	if(onlycandies.get(i).cost < 50) {
        		lessthan50++;
        	}
        	else if(onlycandies.get(i).cost < 100) {
        		lessthan100++;
        	}
        	else {
        		lessthan150++;
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
        System.out.println("candies in the predetermined range of 1- 50 Rs/- are: " + lessthan50);
        System.out.println("candies in the predetermined range of 50- 100 Rs/- are: " + lessthan100);
        System.out.println("candies in the predetermined range of 100- 150 Rs/- are: " + lessthan150);
    }
}
