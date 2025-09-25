
public class Persona{
    private String name;
    private String lastname;

    public Persona(){
        System.err.println("Init");
    }

     public Persona(String name){
        this.name = name;
    }


    public void setName(String name){
            this.name = name;
    }

    public void setLastname(String lastname){
            this.lastname = lastname;
    }

    @Override
    public String toString(){
        return "Hola " + this.name + " " + this.lastname;
    }
    
    public static void main(String[] args){
        Persona p = new Persona();
        p.setName("John");
        p.setLastname("Doe");
        System.out.println(p);
    }
}
