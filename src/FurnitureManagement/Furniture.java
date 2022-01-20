
package FurnitureManagement;

import java.io.Serializable;

public class Furniture implements Serializable {

    //instance variables
    private String name;
    private String id;
    private int quantity;
    
    //default constructor
    public Furniture(){
        this.name = "unknown";
        this.id = "unknown";
        this.quantity = 0;
    }
    
    //constructor with parameter lists
    public Furniture(String name, String id, int quantity){
        this.name = name;
        this.id = id;
        this.quantity = quantity;
    }
    
    //get method
    public String getName(){
        return name;
    }
    
    public String getID(){
        return id;
    }
    
    public int getQuantity(){
        return quantity;
    }
    
    //set method
    public void setName(String name){
        this.name = name;
    }
    
    public void setID(String id){
        this.id = id;
    }
    
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
    
    //toString() method
    public String toString(){
        return String.format("%-20s %-20s %-20s %-20s %-20s %-20s\n %-20s %-20s %-20s %-20s %-20s %-20s", "Name", "ID", "Quantity", name, id, quantity);
    }
    
}

