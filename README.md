# Ecommerce-Inventory-
Ecommerce-Inventory project is made using java programming language and with some suggestions from GitHub Copilot.
Technologies used: 
                 Java programming language
                 GitHub Copilot
                 Open AI
                 VS Code
It has a abstract class Product which has some variables such as name and stock.
This class has a constructor which has 2 arguments as  name and stock.
class Product has the following functions :

      String getName()
      
      int getStock()
      
      void updateStock()
      
      abstract void displayProductInfo()
      
 Another class InventoryManagementSystem has  List<Product> products
  Constructor InventoryManagementSystem()
  Contains the following functions:
  //used Copilot to improve code readiability
       void addProduct()// used to add products in product list
  
       void updateProductStock() // updates product quantity in the stock
  
       void removeProduct() // removes product from list
  
       int getAvailableStock() // displays the available stock quantity
  
Now class Phone extends Product class variables and functions and 
  overrides displayProductInfo() function
 
  
At last we have class Main.
  This class has the main method where all the methods are called and desired values are initilised in 
   method parameters.
To display the information displayProductInfo() is called.
      
      
//Sample output according to the given data in our code 

  
  //OUTPUT:
      Product added successfully.
      Product added successfully.
      Invalid quantity.
      Stock updated successfully.
      Invalid quantity.
      iPhone stock: 15
      Samsung Galaxy stock: 5
      Product removed successfully.
      Product: iPhone
      Brand: Apple
      Stock: 15
     
      
      
