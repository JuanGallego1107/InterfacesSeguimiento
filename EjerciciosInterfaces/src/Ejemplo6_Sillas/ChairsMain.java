package Ejemplo6_Sillas;

public class ChairsMain {
    public static void main(String[] args) {
        ClassicChair classicChair = new ClassicChair();
        System.out.println(classicChair.getClass().getSimpleName());
        classicChair.haslegs();
        classicChair.sitOn();
        classicChair.color();
        classicChair.price();

        System.out.println("=========================");

        ModernChair modernChair = new ModernChair();
        System.out.println(modernChair.getClass().getSimpleName());
        modernChair.haslegs();
        modernChair.sitOn();
        modernChair.color();
        modernChair.price();
    }
}
