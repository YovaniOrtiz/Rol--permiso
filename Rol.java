package semana10.pregunta02;

public class Rol {
    private int idrol;
    private String nombre;
    private PermisoRol permisoRol[];

    private int indice;

    public Rol() {
        this.permisoRol = new PermisoRol[100];
        this.indice = 0;
    }

    public Rol(int idrol,String nombre) {
        this.idrol = idrol;
        this.nombre = nombre;
    }

    public void agregarPermisoRol(PermisoRol permisoRol) {
        this.permisoRol[this.indice] = permisoRol;
        this.indice++;
    }

    public void listarPermisoRol() {
        for (int i=0; i<this.indice; i++) {
            System.out.println("Rol: "+this.permisoRol[i].getRol().getIdrol()+ " " +this.permisoRol[i].getRol().getNombre()+"  "+ "Permiso:"+this.permisoRol[i].getPermiso().getIdpermiso()+ " " +"Nombre:"+this.permisoRol[i].getPermiso().getNombre());
        }
    }
    //Buscar permisos o roles/
    public Permiso buscarpermiso(int idpermiso)
    {
        for (int i=0;i<indice;i++){
            if (permisoRol[i].getPermiso().getIdpermiso() == idpermiso)
            {
                System.out.println("Permiso encontrado");
                System.out.println("codigo :"+this.permisoRol[i].getPermiso().getIdpermiso()+ "  Nombre:  "+this.permisoRol[i].getPermiso().getNombre());
                System.out.println("Rol: "+"");
                System.out.println("Codigo: "+this.permisoRol[i].getRol().getIdrol()+" "+"Nombre:"+this.permisoRol[i].getRol().getNombre());
                return permisoRol[i].getPermiso();
            }else {
                System.out.println("No se encontro permiso" + "");
            }
            break;
        }
        return null;

    }
    //Buscar rol//
    public Rol buscarRol(int idrolbuscar)
    {
        for (int i=0;i<indice;i++){
            if (permisoRol[i].getRol().getIdrol() == idrolbuscar){
                System.out.println("Rol encontrado: "+"");
                System.out.println("Codigo: "+this.permisoRol[i].getRol().getIdrol()+" "+"Nombre:"+this.permisoRol[i].getRol().getNombre());
                System.out.println("Permisos:");
                System.out.println("codigo:"+this.permisoRol[i].getPermiso().getIdpermiso()+" "+"Nombre:"+this.permisoRol[i].getPermiso().getNombre());
                return permisoRol[i].getRol();
            }else {
                System.out.println("Rol no encontrado");
            }
            break;
        }
        return null;

    }
    public void editarPermisoRol(String permbuscado, PermisoRol nuevoPermisoRol) {


        for (int i = 0; i < indice; i++) {
            if (permisoRol[i].getPermiso().getNombre()== permbuscado) {
                permisoRol[i].getPermiso().setNombre(nuevoPermisoRol.getPermiso().getNombre());
                permisoRol[i].getRol().setNombre(nuevoPermisoRol.getRol().getNombre());

                System.out.println("Modificar");
                System.out.println("Rol " + permisoRol[i].getRol().getNombre() + " Permsiso " + permisoRol[i].getPermiso().getNombre());
            }
        }
    }

    public void eliminarPermiso(int ideliminar )
    {
        for (int i=0;i<indice;i++){
            if (permisoRol[i].getPermiso().getIdpermiso() == ideliminar){
                for (int j=i;j<indice - 1; j++){
                    permisoRol[j] = permisoRol[j+1];
                }
                permisoRol[indice -1] = null;
                indice -- ;
            }
            break;

    }

    }

   public void ordenamientonNombre()
    {
        for (int i=0;i<indice -1; i++) {
            for (int j = i+1;j<indice; j++) {
                if (permisoRol[i].getRol().getNombre().compareTo(permisoRol[j].getRol().getNombre()) > 0) {
                    PermisoRol aux = permisoRol[i];
                    permisoRol[i] = permisoRol[j];
                    permisoRol[j] = aux;
                }

            }
        }

        System.out.println("Roles ordenados alfaticamente" );
        for ( int i=0; i<indice; i++){
            System.out.println("Rol: "+permisoRol[i].getRol().getNombre() + " "+"Permiso: "+permisoRol[i].getPermiso().getNombre());
        }
    }
    public void ordenamientoPermsisos()
    {
        for(int i=0;i<indice-1;i++){
            for (int j =i+1;j<indice;j++){
                if (permisoRol[i].getPermiso().getNombre().compareTo(permisoRol[j].getPermiso().getNombre())>0){
                    PermisoRol aux = permisoRol[i];
                    permisoRol[i] = permisoRol[j];
                    permisoRol[j] = aux;
                }
            }
        }
        System.out.println("Permsios  ordenados alfaticamente" );
        for ( int i=0; i<indice; i++){
            System.out.println("permisos: "+permisoRol[i].getPermiso().getNombre() +" "+"Rol: "+permisoRol[i].getRol().getNombre());
        }

    }



    public int getIdrol() {
        return idrol;
    }

    public void setIdrol(int idrol) {
        this.idrol = idrol;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
