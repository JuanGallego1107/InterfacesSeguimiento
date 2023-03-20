package Ejemplo7Facturas.controller;

public class BillMain {
    public static void main(String[] args) {
        Bill model = retriveBillFromDatabase();

        BillView view = new BillView();

        BillController controller = new BillController(model,view);

        controller.updateView();

        controller.setName("Juan");
        controller.setId("57463832");
        controller.setProduct("Leche");
        controller.setPrecio(1500);
        System.out.println("\n Bill details after the update: ");

        controller.updateView();

    }
    private static Bill retriveBillFromDatabase(){
        Bill bill = new Bill();
        bill.setName("Arle");
        bill.setId("1314345646");
        bill.setProduct("Queso");
        bill.setPrecio(1200);
        return bill;
    }
}
