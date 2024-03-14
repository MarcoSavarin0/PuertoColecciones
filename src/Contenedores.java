public class Contenedores {
    protected Integer id;
    protected String pais;
    protected boolean esPeligroso;

    public Contenedores(Integer id, String pais, boolean esPeligroso) {
        this.id = id;
        this.pais = pais;
        this.esPeligroso = esPeligroso;
    }

    public Integer getId() {
        return id;
    }

    public String getPais() {
        return pais;
    }

    public boolean isEsPeligroso() {
        return esPeligroso;
    }
}
