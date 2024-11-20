package az.abbtech.homework_4.task_1;

public class Product {

    public static String companyName;
    public int productID;
    public String productName;
    public static int incproductID = 1000;

    //Static Block
    static {
        companyName = "MyCompany";
    }

    //Non-Static Block
    {
        productID = incproductID++;
    }

    public Product (String productName){
        this.productName = productName;
        System.out.println("Company Name: " + companyName + " Product ID: " + productID + " Product Name: " + productName);
    }
}
