package Ejemplo6_Sillas;

public class ModernChair extends color{

    @Override
    public void color() {
        System.out.println("Blanco");
    }

    @Override
    public void haslegs() {
        System.out.println("No tiene patas.");
    }

    @Override
    public void sitOn() {
        System.out.println("No tiene cojines.");
    }

    @Override
    public void price() {
        System.out.println("Precio: "+130000+"$.");
    }
}
