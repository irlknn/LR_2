/**
 * Клас продукт
 */
public class Product{
    private String id;
    private String name;
    private String producer;
    private double price;
    private double storagePeriod;
    private int quantity;

    public Product(String id, String name, String producer, double price, double storagePeriod, int quantity){
        this.id = id;
        this.name = name;
        this.producer = producer;
        this.price = price;
        this.storagePeriod = storagePeriod;
        this.quantity = quantity;
    }

    public void setId(String id){this.id = id;}
    public String getId(){return id;}

    public void setName(String name){this.name = name;}
    public String getName(){return name;}

    public void setProducer(String producer){this.producer = producer;}
    public String getProducer(){return producer;}

    public void setPrice(double price){this.price = price;}
    public double getPrice(){return price;}

    public void setStoragePeriod(double storagePeriod){this.storagePeriod = storagePeriod;}
    public double getStoragePeriod(){return storagePeriod;}

    public void setQuantity(int quantity){this.quantity = quantity;}
    public int getQuantity(){return quantity;}

    public String toString(){
        return id + ". " +
                name + ", " + producer + ", " +
                price + "грн, термін зберігання - " +
                storagePeriod + ", кількість - " + quantity;
    }
}
