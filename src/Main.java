//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //creando contenedores
        Contenedores contenedorDeRusia = new Contenedores(001,"Rusia",true);
        Contenedores contenedorDeMexico = new Contenedores(002,"Mexico",false);
        Contenedores contenedorDePeru = new Contenedores(003,"Peru",true);
        //creando el puerto
        Puerto buenosAiresPuerto = new Puerto("Buenos Aires");
        //agregando contenedores al puerto
        buenosAiresPuerto.addContenedores(contenedorDeRusia);
        buenosAiresPuerto.addContenedores(contenedorDeMexico);
        buenosAiresPuerto.addContenedores(contenedorDePeru);
        //utiilizando los metodos del puerto
        System.out.println("******Ordenados por ID***********");
        buenosAiresPuerto.mostrarContedoresOrdenadosPorId();
        System.out.println("*****CONTENEDORES PELIGROSOS*********");
        System.out.println(buenosAiresPuerto.cantidadDeContenedoresPeligrosos());

    }
}