public class ExampleIII {
    String Ipunto;
    String Fpunto;
    int distacia; //Metros
    int distancia_corta;


    public ExampleIII(String Ipunto, String Fpunto, int distacia, int distancia_corta) throws Exception {
        this.Ipunto = Ipunto;
        this.Fpunto = Fpunto;
        if(distacia > distancia_corta)
            throw new Exception("La distancia entre "+Ipunto+" y "+ Fpunto+" es más alta de lo esperado");
        this.distacia = distacia;

    }

    public void print(){
        System.out.println("Punto inicial "+Ipunto+" a "+ distacia +" metros de distancia de "+Fpunto+", \n siendo la distancia más corta "+ distancia_corta);
    }

    public static void main(String[] args) {

        try {
            ExampleIII direccion = new ExampleIII("Pretil","Escuela de CE",1000,900);
            direccion.print();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}
