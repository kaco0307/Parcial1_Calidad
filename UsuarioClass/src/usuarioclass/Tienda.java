
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
        
        System.out.println("\nIngrese nombre: ");
        usu.setNombre(sc.next());
        System.out.println("Ingrese Cedula");
        usu.setCedula(sc.nextInt());
        System.out.println("Ingrese Correo");
        usu.setCorreo(sc.next());
        System.out.println("Ingrese Dirreción");
        usu.setDireccion(sc.next());
        System.out.println("Ingrese Telefono");
        usu.setTelefono(sc.nextInt());
        
        System.out.println("\n--Usuario creado--\n");
        
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
    
    
    public boolean BuscarUsuario(int ced ){
        
        Iterator it = usuario.iterator();
        Usuario usu;
        
        boolean sw = false;
        while(it.hasNext() && sw){
            usu = (Usuario)it.next();
            if(usu.getCedula() == ced){
                sw=true;
            }
        }
      
     return sw;
        
    }
    
    public boolean BuscarVideojuego(String IDE ){
        
        Iterator it = videojuego.iterator();
        VideoJuego vide;
        
        boolean sw = false;
        while(it.hasNext() && sw){
            vide = (VideoJuego)it.next();
            if(vide.getIDE().equals(IDE)){
                sw=true;
            }
        }
      
     return sw;
        
    }
    // case 5
    public void crearVideojuego() {
        
        VideoJuego vide = new VideoJuego();
        
        System.out.println("\nIngrese nombre: ");
        vide.setNombre(sc.next());
        System.out.println("Ingrese Codigo");
        vide.setCodigo(sc.nextInt());
        System.out.println("Ingrese Codigo_Ejemplar");
        vide.setCodigo_Ejemplar(sc.next());
        System.out.println("Ingrese IDE");
        vide.setIDE(sc.next());
        
        System.out.println("\n--VideoJuego creado--\n");
        
        videojuego.add(vide);
        
    }
    
    // case 6 EliminarVideoJuego
    

    
    // case n8. Listar videojuego
     public void listarVideojuego() {
        Iterator it = videojuego.iterator();
        
        while(it.hasNext()){
            VideoJuego vide = (VideoJuego)it.next();
            System.out.println("\nNombre: "+vide.getNombre());
            System.out.println("Cedula: "+vide.getCodigo());
            System.out.println("Correo: "+vide.getCodigo_Ejemplar());
            System.out.println("Dirección: "+vide.getIDE());
            System.out.println("-----------------------");
        }
    }
    
    
    
}
