class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  
  void print(Object o){System.out.println(o);}
  void printt(Object o){System.out.print(o);}

  void init(){

    //3: create 3 new item objects
    CartItem item1 = new CartItem("Bag of apples",
                                 4.00, 2, false);
    
    CartItem item2 = new CartItem("Oatmeal",
                                 6.00, 1, true);
    
    CartItem item3 = new CartItem("Tide",
                                 10.00, 1, true);

    //4: display name & original price of items that are on sale
    print("Items on Sale:\n");
    if(item1.onSale){
      print("Name: "+ item1.itemName );
      print("Price: $"+ item1.itemPrice +"\n");
    }
    
    if(item2.onSale){
      print("Name: "+ item2.itemName );
      print("Price: $"+ item2.itemPrice +"\n");
    }
    
    if(item3.onSale){
      print("Name: "+ item3.itemName );
      print("Price: $"+ item3.itemPrice +"\n");
    }
	print("========");
    //5: subtotal (for all quantities of all items in cart, using discounted prices)
    double subtotal = item1.getPrice()*item1.quantity + 
                      item2.getPrice()*item2.quantity + 
                      item3.getPrice()*item3.quantity ;
    // display subtotal, tax and total
    double tax = subtotal * 8.875/100;
    
    double total = subtotal + tax;
    
    print("\nSubtotal: $" + subtotal);
    print("Tax: $" + tax);
    print("\nTotal: $" + total);
    
  }
}