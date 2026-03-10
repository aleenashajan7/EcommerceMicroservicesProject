public class Clothing extends Product {

    private String size;

    public Clothing(int id,String name,double price,String imagePath,String size){
        super(id,name,price,imagePath);
        this.size=size;
    }

    public String getSize(){
        return size;
    }
}