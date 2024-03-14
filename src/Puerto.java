import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Puerto {
    private String Nombre;
    private List<Contenedores> listContenedores = new ArrayList<>();

    public Puerto(String nombre) {
        Nombre = nombre;
    }

    void addContenedores(Contenedores contenedores){
        listContenedores.add(contenedores);
    }
    void mostrarContedoresOrdenadosPorId(){
        Comparator<Contenedores> comparadorPorId = Comparator.comparing(Contenedores::getId);

        listContenedores.sort(comparadorPorId);
        for (Contenedores contenedor : listContenedores) {
            System.out.println("ID: " + contenedor.getId() + ", Pais: " + contenedor.getPais());
        }
    }
    Integer cantidadDeContenedoresPeligrosos(){
        int sumaDeContedores = 0;
        for (Contenedores contenedor : listContenedores){
            if (contenedor.isEsPeligroso()){
                sumaDeContedores += 1;
            }
        }
        return sumaDeContedores;
    }
}
