
package usuarioclass;
import java.util.*;
/**
 *
 * @author Estudiantes
 */
public class Tienda {
    Scanner sc = new Scanner (System.in);
    int op=0;
    
    ArrayList <Usuario> usuario = new ArrayList();
    ArrayList <VideoJuego> videojuego = new ArrayList();
    
    public Tienda(){
        
    }
    
    public void Opciones(){
        do{
        System.out.println("\n[MENU]");
        System.out.println("1. Crear Usuario"
                + "\n2. Listar Usuarios"
                + "\n3. Eliminar Usuarios"
                + "\n4. Modificar Usuarios"
                + "\n5. Crear Videojuego"
                + "\n6. Eliminar videojuego"
                + "\n7. Modificar videojuego"
                + "\n8. Listar videojuego"
                + "\n9. Realizar Prestamo"
                + "\n10. Realizar Devolución"
                + "\n11. Listar Prestamo"
                + "\n12. Salir"
                + "\nIngrese la opción:  ");
        op=sc.nextInt();
        
        switch (op){
            case 1:
                crearUsuario();
            break;
            
            case 2:
                listarUsuarios();
            break;
            
            case 3:
               
            break;
            
            case 4:
               
            break;
            
            case 5:
                crearVideojuego();
            break;
            case 6:
               eliminar_videojuego();
            break;
            case 7:
               
            break;
            case 8:
                listarVideojuego();
            break;
            case 9:
                
            break;
            case 10:
                
            break;
            case 11:
                
            break;
            case 12:
                System.out.println("\nHasta Pronto");
            break;
            
            default:
                System.out.println("Opcion Invalida");
        }
        }while(op != 12);
    }
    
    public void crearUsuario() {
        
        Usuario usu = new Usuario();
        
            sc.skip("\n");
            System.out.println("\nIngrese nombre: ");
            usu.setNombre(sc.nextLine());
            System.out.println("Ingrese Cedula");
            usu.setCedula(sc.nextInt());
            System.out.println("Ingrese Correo");
            usu.setCorreo(sc.next());
            sc.skip("\n");
            System.out.println("Ingrese Dirreción");
            usu.setDireccion(sc.nextLine());
            System.out.println("Ingrese Telefono");
            usu.setTelefono(sc.nextInt());
        
            System.out.println("\n--Usuario Ingresado--\n");
        
        usuario.add(usu);
        
    }
    
    public void listarUsuarios() {
        Iterator it = usuario.iterator();
        
        while(it.hasNext()){
            Usuario usu = (Usuario)it.next();
            System.out.println("\nNombre: "+usu.getNombre());
            System.out.println("Cedula: "+usu.getCedula());
            System.out.println("Correo: "+usu.getCorreo());
            System.out.println("Dirección: "+usu.getDireccion());
            System.out.println("Telefono: "+usu.getTelefono());
            System.out.println("-----------------------");
        }
    }
    
    
    public void Modificar_Usuario(){
        
        System.out.print("\nIngrese la cedula del usuario a modificar: ");
        int ced = sc.nextInt();
        
        Usuario usu = BuscarUsuario(ced);
        
        if(usu != null){
            
            sc.skip("\n");
            System.out.println("\nIngrese nombre: ");
            usu.setNombre(sc.nextLine());
            System.out.println("Ingrese Cedula");
            usu.setCedula(sc.nextInt());
            System.out.println("Ingrese Correo");
            usu.setCorreo(sc.next());
            sc.skip("\n");
            System.out.println("Ingrese Dirreción");
            usu.setDireccion(sc.nextLine());
            System.out.println("Ingrese Telefono");
            usu.setTelefono(sc.nextInt());
        
            System.out.println("\n--Usuario Modificado--\n");
            
            
        }else{
            System.out.println("\nEl usuario no existe");
        }
        
    }
    
    
    public Usuario BuscarUsuario(int ced ){
        
        Iterator it = usuario.iterator();
        Usuario usu = new  Usuario();
        
        boolean sw = false;
        while(it.hasNext() && !sw){
            usu = (Usuario)it.next();
            if(usu.getCedula() == ced){
                sw=true;
            }
        }
      
     if(sw){
         return usu;
     }else{
         return null;
     }
        
    }
    
    public VideoJuego BuscarVideojuego(String IDE ){
        
        Iterator it = videojuego.iterator();
        VideoJuego vide = new VideoJuego();
        
        boolean sw = false;
        while(it.hasNext() && !sw){
            vide = (VideoJuego)it.next();
            if(vide.getIDE().equals(IDE)){
                sw=true;
            }
        }
      
     if(sw){
         return vide;
     }else{
         return null;
     }
  }
    // case 5
    public void crearVideojuego() {
        int codigo;
        String Codigo_Ejemplar;
        VideoJuego vide = new VideoJuego();
        
        System.out.println("\nIngrese nombre: ");
        vide.setNombre(sc.next());
        System.out.println("Ingrese Codigo");
        codigo = sc.nextInt();
        vide.setCodigo(codigo);
        System.out.println("Ingrese Codigo_Ejemplar");
        Codigo_Ejemplar = sc.next();
        vide.setCodigo_Ejemplar(Codigo_Ejemplar);
        vide.setIDE(codigo + Codigo_Ejemplar);
        
        System.out.println("\n--VideoJuego creado--\n");
        
        videojuego.add(vide);
        
    }
    
    // case 6 EliminarVideoJuego
    public void eliminar_videojuego(){
        
        
        
        System.out.print("\nIngrese la ide del videojuego : ");
        String cod = sc.next();
        
        VideoJuego vide = BuscarVideojuego(cod);
      

        
        if(vide != null){
            
            System.out.println(vide.getNombre());
            
            System.out.println("Esta seguro en eliminar este videojuego si(1) no(2)");
            System.out.print("opcion: ");
            int opc = sc.nextInt();

            if(opc==1){
                videojuego.remove(vide);
                System.out.println("Se ha eliminado el videojuego");
            }
                
               
            else if(opc==2){
                System.out.println("La operacion se ha cancelado.");
       
              
            } 
              
            
             
        }else{
            System.out.println("El videojuego no existe");
        }
        
        
    }

    
    // case n8. Listar videojuego
     public void listarVideojuego() {
        Iterator it = videojuego.iterator();
        
        while(it.hasNext()){
            VideoJuego vide = (VideoJuego)it.next();
            System.out.println("\nNombre: "+vide.getNombre());
            System.out.println("Codigo: "+vide.getCodigo());
            System.out.println("CodigoEjemplar: "+vide.getCodigo_Ejemplar());
            System.out.println("ID: "+vide.getIDE());
            System.out.println("-----------------------");
        }
    }
    
    
    
}
