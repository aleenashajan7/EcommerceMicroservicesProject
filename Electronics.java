public class Electronics extends Product {

    private String brand;

    public Electronics(int id,String name,double price,String imagePath,String brand){
        super(id,name,price,imagePath);
        this.brand=brand;
    }

    public String getBrand(){
        return brand;
    }
}