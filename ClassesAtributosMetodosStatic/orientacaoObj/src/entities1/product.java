package entities1;

public class product {
    public String name;
    public int quantity;
    public double price;

    public double totalValueInStock(){
        return price * quantity;
    }
    public void addProducts(int quantity){
        this.quantity += quantity; // += serviu para adicionar +1 a quantity
    }
    public void removeProducts(int quantity){
        this.quantity -= quantity; // -= serviu para subtrair -1 de quantity
    }
    public String toString(){
        return name
         + " , "
         + String.format("%.2f " , price )// String.format() foi usado para colocar casas decimais!
         + " , "
         + quantity
         + " units , Total: $ "
         + String.format("%.2f" , totalValueInStock());
    }
    
    
}
