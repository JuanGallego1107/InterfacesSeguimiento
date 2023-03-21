package Ejemplo6_Sillas;

public class ClassicChair extends color{

    @Override
    public void color() {
        System.out.println("Azul");
    }

    @Override
    public void haslegs() {
        System.out.println("Si, tiene 4 patas.");
    }

    @Override
    public void sitOn() {
        System.out.println("Si, tiene un 2 cojines.");
    }

    @Override
    public void price() {
        System.out.println("Precio: "+120000+"$.");
    }
}

