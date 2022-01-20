
package FurnitureManagement;

import java.util.ArrayList;

public class FurnitureStock {
    
    private ArrayList<Furniture> stock;
    
    public FurnitureStock(){
        stock = new ArrayList<Furniture>();
    }
    
    //add method
    public String add(Furniture newFurniture){
        String output = "";
        boolean found = false;
        for (int i = 0; i < stock.size() && found == false; i++) {
            Furniture f = stock.get(i);
            if (f.getName().equalsIgnoreCase(newFurniture.getName())) {
                found = true;
            }
        }
        if (found == true) {
            output = "Furniture " + newFurniture.getName() + " already existed. Please enter another furniture again.";
        } else {
            stock.add(newFurniture);
            output = "The person has successfully added.";
        }
        return output;
    }
    
    //remove method
    public String remove(String name) {
        String output = "";
        boolean found = false;
        int n = 0;

        for (int i = 0; i < stock.size() && !found; i++) {
            Furniture f = stock.get(i);
            if (f.getName().equalsIgnoreCase(name)) {
                found = true;
                n = i;
            }//end if
        }//end for
        if (found) {
            Furniture f = stock.remove(n);
            output = "The furniture " + f.getName() + " has been removed succeessfully.";
        } else {
            output = "The furniture does not exist. ";
        }
        return output;
    }
    
    //search method
    public String search(String name) {
        String output = "";
        boolean found = false;

        for(int i = 0; i < stock.size() && !found; i++) {
            Furniture f = stock.get(i);

            if (f.getName().equalsIgnoreCase(name)) {
                found = true;
            }
        }

        if (found) {
            output = "The furniture " + name + " is found in the record.";
        } else {
            output = "The furniture " + name + " does not exists.";
        }
        return output;
    }
    
    //update method
    public String update(String name, String id, int quantity) {
        String output = "";
        boolean found = false;

        for (int i = 0; i < stock.size() && !found; i++) {
            Furniture f = stock.get(i);

            if (f.getName().equalsIgnoreCase(name)) {
                f.setID(id);
                f.setQuantity(quantity);
                found = true;
            }
        }

        if (found) {
            output = "Successfully updated  the furniture " + name + " in the record.";
        } else {
            output = "Record of this furniture is not found. Unable to update.";
        }
        return output;
    }
    
    //toString() method
    public String toString(){
        String output = "";
        for (Furniture f:stock) {
            output += f + "\n";
        }
        return output;
    }
    
}