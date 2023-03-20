package Ejemplo7Facturas.controller;

public class BillController {
    private Bill model;

    private BillView view;

    public BillController(Bill model, BillView view) {
        this.model = model;
        this.view = view;
    }

    public String getName() {
        return model.getName();
    }

    public void setName(String name) {
        model.setName(name);
    }

    public String getId() {
        return model.getId();
    }

    public void setId(String id) {
        model.setId(id);
    }

    public String getProduct() {
        return model.getProduct();
    }

    public void setProduct(String product) {
        model.setProduct(product);
    }

    public int getPrecio() {
        return model.getPrecio();
    }

    public void setPrecio(int precio) {
        model.setPrecio(precio);
    }

    public void updateView(){
        view.printFacturaDetails(model.getName(), model.getId(), model.getProduct(), model.getPrecio());
    }
}

