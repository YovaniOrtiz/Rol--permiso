package semana10.pregunta02;

public class Permiso {

    private int idpermiso;
    private String nombre;

    public Permiso() {

    }

    public Permiso(int idpermiso,String nombre) {
        this.idpermiso= idpermiso;
        this.nombre = nombre;
    }

    public int getIdpermiso() {
        return idpermiso;
    }

    public void setIdpermiso(int idpermiso) {
        this.idpermiso = idpermiso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
