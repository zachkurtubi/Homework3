public class Item {
  private int itemCode;
  private String Name;

  public Item(int itemCode, String Name) {
    this.itemCode = itemCode;
    this.Name = Name;
  }

  public int GetItemCode() {
    return itemCode;
  }

  public String GetName() {
    return Name;
  }

  public void DisplayItemCode() {
    System.out.println(itemCode);
    System.out.println(Name);
  }
}