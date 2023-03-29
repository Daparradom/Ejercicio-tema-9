public class Main {
    public static void main(String[] args) {

        Cliente cliente= new Cliente();
        cliente.setEdad(33);
        cliente.setNombre("Carlos");
        cliente.setTelefono("4324255243");
        cliente.setCredito(23442562);
        System.out.println("Edad:"+cliente.getEdad()+" años");
        System.out.println("Nombre:"+cliente.getNombre());
        System.out.println("Telefono:"+cliente.getTelefono());
        System.out.println("Credito disponible para el cliente: "+cliente.getCredito());

        Tranajador trabajador= new Tranajador();
        trabajador.setEdad(56);
        trabajador.setNombre("Eduardo");
        trabajador.setTelefono("4324255243");
        trabajador.setSalario(343534521);
        System.out.println("Edad:"+trabajador.getEdad()+" años");
        System.out.println("Nombre:"+trabajador.getNombre());
        System.out.println("Telefono:"+trabajador.getTelefono());
        System.out.println("Salario del trabajador: "+trabajador.getSalario());

    }
}

class Persona {
    private int edad;
    private String nombre;
    private String telefono;

    public void setEdad (int edad){
        this.edad=edad;
    }
    public void setNombre (String nombre){
        this.nombre=nombre;
    }
    public void setTelefono (String telefono){
        this.telefono=telefono;
    }
    public int getEdad(){
        return this.edad;
    }
    public String getNombre(){
        return this.nombre;
    }
    public String getTelefono(){
        return this.telefono;
    }
}
class Cliente extends Persona{
    private int credito;
    public void setCredito (int credito){
        this.credito=credito;
    }
    public int getCredito(){
        return this.credito;
    }
}

class  Tranajador extends Persona{
    private int salario;
    public void  setSalario(int salario){
        this.salario=salario;
    }
    public int getSalario(){
        return this.salario;
    }
}