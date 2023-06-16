package semana10.pregunta02;

public class Main {
    public static void main(String args[])
    {
        //Rol usuario = Rol();
        //Permiso permiso = Permiso();

        Rol rol = new Rol();

        rol.agregarPermisoRol(new PermisoRol(new Rol(1," ausuario"), new Permiso(1,"Agregar")));
        rol.agregarPermisoRol(new PermisoRol(new Rol(2," bUsuario"), new Permiso(2,"Editar")));
        rol.agregarPermisoRol(new PermisoRol(new Rol(3," cUsuario"), new Permiso(3,"Eliminar")));
        rol.agregarPermisoRol(new PermisoRol(new Rol(4," Administrador"),new Permiso(4,"Buscar")));
        rol.listarPermisoRol();

        //Buscar permiso//
        rol.buscarpermiso(1);
        rol.buscarRol(1);


        System.out.println("Editar Permiso");
        rol.editarPermisoRol("Agregar",new PermisoRol(new Rol(1,"usuario"),new Permiso(2,"redactar")));

        //Eliminar//

        rol.eliminarPermiso(1);
        rol.listarPermisoRol();

        //Ordenar por nombre o codigo//
        rol.ordenamientonNombre();



        //ordenar por permisos//
        rol.ordenamientoPermsisos();








    }
}
