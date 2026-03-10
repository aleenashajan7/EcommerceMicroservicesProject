public class Product {

    protected int id;
    protected String name;
    protected double price;
    protected String imagePath;

    public Product(int id,String name,double price,String imagePath){
        this.id=id;
        this.name=name;
        this.price=price;
        this.imagePath=imagePath;
    }

    public int getId(){return id;}
    public String getName(){return name;}
    public double getPrice(){return price;}
    public String getImagePath(){return imagePath;}

    public void setPrice(double price){
        this.price=price;
    }

    public String toString(){
        return id+" "+name+" $"+price;
    }
}