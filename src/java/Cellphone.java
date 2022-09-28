
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "cellphone", eager = true)
@SessionScoped
public class Cellphone implements Serializable{

    private String companyname, model, color;
    private int quantity;
    private int price;


    private static final ArrayList<Cellphone> Cellphones = new ArrayList<Cellphone> (Arrays.asList(
    new Cellphone("Xiaomi", "RedmiNote 1", "Gold", 100,100000),
    new Cellphone("Xiaomi", "RedmiNote 2", "Gold", 200,120000),
    new Cellphone("Xiaomi", "RedmiNote 3", "Gold", 300,140000),
    new Cellphone("Xiaomi", "RedmiNote 4", "Gold", 400,160000),
    new Cellphone("Xiaomi", "RedmiNote 5", "Gold", 500,180000),
    new Cellphone("Xiaomi", "RedmiNote 6", "Gold", 100,200000),
    new Cellphone("Xiaomi", "RedmiNote 7", "Gold", 100,220000),
    new Cellphone("Xiaomi", "RedmiNote 8", "Gold", 100,240000),
    new Cellphone("Xiaomi", "RedmiNote 9", "Gold", 100,260000),
    new Cellphone("Xiaomi", "RedmiNote 10", "Gold", 100,280000),
    new Cellphone("Xiaomi", "RedmiNote 11", "Gold", 100,300000),
    new Cellphone("Xiaomi", "RedmiNote 12", "Gold", 100,320000)
    ));
    
    
    /**
     * Creates a new instance of Cellphone
     */
    public ArrayList<Cellphone>  getCellphones() {
      return Cellphones;
     }

    public Cellphone(String companyname, String model, String color, int quantity, int price) 
    {
       this.companyname = companyname;
       this.model=model;
       this.color=color;
       this.quantity=quantity;
       this.price=price;
    }


    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


   public Cellphone(){

}
}