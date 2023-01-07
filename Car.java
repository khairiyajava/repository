public class Car{
    private int intSpeed;
    private String color;
    private double regularPrice;

    public Car(int intSpeed,String color,double regularPrice){
        this.intSpeed=intSpeed;
        this.color=color;
        this.regularPrice=regularPrice;
    }

    public int getSpeed(){
        return intSpeed;
    }

    public String getColor(){
        return color;
    }
    
    public double getRegularPrice(){
        return regularPrice;
    }

    public double getSalePrice(){
        return regularPrice;
    }

}