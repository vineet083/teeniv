enum laptops{
    macbook(2000), xps(1500), surface(1300), chromebook(1200);
    private int price;

    private laptops(int price){
        this.price=price;
    }
    private laptops(){
        price = 500;
    }
    public int getPrice(){
        return price;
    }
    public void setPrice(int price){
        this.price =price;
        System.out.println("in laptop"+this.name());
    }
}

public class enumclass {
    public static void main(String[] args) {
        laptops l1 = laptops.macbook;

        for (laptops lw : laptops.values()){
            System.out.println(lw+ ":"+ lw.getPrice());
        }
    }
}
