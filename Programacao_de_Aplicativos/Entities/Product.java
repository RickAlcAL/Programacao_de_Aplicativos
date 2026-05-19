package Programacao_de_Aplicativos.Entities;

public class Product {
    public String name;
    public double price;
    public int quantity;

    public double totalValueInStock() {
        return price*quantity;
    }

    public void addProducts(int q) {
        quantity+= q;
    }

    public void removeProducts(int q) {
        if (quantity>0 && q>0) {
            quantity -= q;
        }
    }

    public String showData() {
        return "Product data: "+name+", $"+price+", "+quantity+" units, Total: $"+totalValueInStock();
    }
}




