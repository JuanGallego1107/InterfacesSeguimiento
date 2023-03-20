package Ejemplo7Facturas.controller;

public class BillView {
    public void printFacturaDetails(String Name,String id, String product,int precio){
        System.out.println("Bill Details: ");
        System.out.println("Client Name: " + Name);
        System.out.println("Client ID: " + id);
        System.out.println("Product name: " + product);
        System.out.println("Product price: "+ precio);
    }
}
