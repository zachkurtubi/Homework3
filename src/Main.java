class Main {
  public static void main(String[] args) {

    Grocery grocery1 = new Grocery(11, "Bread", 2.0, 1.5, 0);
    Grocery grocery2 = new Grocery(12, "Apple", 6.0, 0.75, 1);

    Clothing clothing1 = new Clothing(21, "Jeans", "Levis", 1.0, 35, 0);
    Clothing clothing2 = new Clothing(22, "Dress Shirt", "Izod", 2.0, 25, 10);

    grocery1.DisplayGrocery();
    grocery2.DisplayGrocery();
    clothing1.DisplayClothing();
    clothing2.DisplayClothing();

    double grandtotal = grocery1.GetFinalPrice() + grocery2.GetFinalPrice() + clothing1.GetFinalPrice() + clothing2.GetFinalPrice();

    System.out.println("The final total: $" + grandtotal);
  }
}