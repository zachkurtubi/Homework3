public class Clothing extends Item implements Discount, Tax {
  private String brand;
  private double price;
  private double units;
  private double discount;

  private double finalprice;

  public Clothing(int itemCode, String Name, String brand, double price, double units, double discount) {
    super(itemCode, Name);
    this.brand = brand;
    this.price = price;
    this.units = units;
    this.discount = discount;
  }

  public double GetFinalPrice() {
    return finalprice;
  }

  public double ComputeDiscount() {
    return price * (discount/100);
  }

  public double ComputeTax(double subtotal) {
    return subtotal * (8.5/100);
  }

  public double ComputeTotalPrice(double subtotal, double salestax) {
    this.finalprice = subtotal + salestax;
    return subtotal + salestax;
  }

  public void DisplayClothing() {
    System.out.println("Item Code: " + GetItemCode());
    System.out.println("Name: " + GetName());
    System.out.println("Brand: " + brand);
    System.out.println("Unit Price: " + price);
    System.out.println("Units: " + units);
    System.out.println("Discount: " + discount + "%");
    System.out.println("Savings per Unit: $" + Double.toString(ComputeDiscount()));
    double subtotal = (price*units)-(ComputeDiscount()*units);
    System.out.println("Subtotal: $" + Double.toString(subtotal));

    double salestax = ComputeTax(subtotal);
    System.out.println("Salestax: $" + Double.toString(salestax));

    double totalprice = ComputeTotalPrice(subtotal, salestax);
    System.out.println("Total: $" + Double.toString(totalprice));
  }
}