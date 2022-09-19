
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
               Modificar_Usuario();
            break;
            
            case 5:
                
            break;
            case 6:
                
            break;
            case 7:
               
            break;
            case 8:
               
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
    
    
    
    
    
}
