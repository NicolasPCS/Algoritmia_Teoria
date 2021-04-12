public class EjemploAutoStatic {
    public static void main(String[] args) {
        Automovil auto = new Automovil("KIA", "TC");
        Automovil auto2 = new Automovil("Subaru", "Nose");
        Automovil auto3 = new Automovil();

        Automovil.setColorPatente("verde");
        System.out.println(Automovil.getColorPatente());
        System.out.println(auto.detalle());

        /*System.out.println(auto.getFabricante());
        System.out.println(auto.getModelo());
        System.out.println(auto.getColor());
        System.out.println(auto.getCilindrada());*/

    }
}
