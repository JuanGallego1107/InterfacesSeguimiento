package Ejemplo6_Sillas;

public class FuturistChair extends color{

    @Override
    public void color() {
        System.out.println("Verde Neon");
    }

    @Override
    public void haslegs() {
        System.out.println("Si, tiene 3 patas.");
    }

    @Override
    public void sitOn() {
        System.out.println("Si, tiene 1 cojin. ");
    }

    @Override
    public void price() {
        System.out.println("Precio: "+125000+"$.");
    }
}
