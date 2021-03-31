package ro.fasttrackit.curs7homework;

public class Product {
    private int quanity;
    private double price;
    private String name;
    private String category="TOOLS";

    public Product(){

    }

    public void setQuanity(int newQuantity){
        this.quanity=newQuantity;
    }
    public int getQuanity(){
        return quanity;
    }
    public void setPrice(double newPrice){
        this.price = newPrice;
    }

    public double getPrice() {
        return price;
    }
    public void setCategory(String category){
        this.category = category;
    }
    public String getCategory(){
        return category;
    }
    public boolean isCategory(String newCategory){
       boolean checkCategory= getCategory().equalsIgnoreCase(newCategory);
       return checkCategory;
    }

    public void setName(String newName){
        this.name = newName;
    }

    public String getName() {
        return name;
    }
    public boolean hasStock(){
    boolean stock=false;
    if ((getQuanity()>0)){
        stock =true;
    }
    return stock;
    }
}
