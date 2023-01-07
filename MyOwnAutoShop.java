public class MyOwnAutoShop {

    public static void main(String[] args) {
        Sedan hai= new Sedan(10, "gray", 12500, 13);
        Ford hai1=new Ford(20, "yellow", 2532, 5, 6500);
        Ford hai2=new Ford(10, "purple", 350, 3, 6700);
        Car est=new Car(12, "red", 2600);

        System.out.println("Sedan Sales Price: "+hai.getSalePrice());
        System.out.println("Ford sales : "+hai1.getSalePrice());
        System.out.println("Ford 2 sales :"+hai2.getSalePrice());
        System.out.println("Car Sales Price are: "+est.getSalePrice());

    }
    
}
