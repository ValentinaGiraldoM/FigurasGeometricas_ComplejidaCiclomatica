public class pentagono extends figuras 
{
    private String nombre = "pentagono";
    private double perimetroP;
    private double areaP;
    private double apotemaP;
    private double ladoP;
     
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPerimetroP() {
        return perimetroP;
    }
    public void setPerimetroP(double perimetroP) {
        this.perimetroP = perimetroP;
    }

    public double getAreaP() {
        return areaP;
    }
    public void setAreaP(double areaP) {
        this.areaP = areaP;
    }

    public double getApotemaP() {
        return apotemaP;
    }
    public void setApotemaP(double apotemaP) {
        this.apotemaP = apotemaP;
    }

    public double getLadoP() {
        return ladoP;
    }
    public void setLadoP(double ladoP) {
        this.ladoP = ladoP;
    }

    public  pentagono () {}
    public pentagono(String nombre, double perimetroP, double areaP, double apotemaP, double ladoP) {
        this.nombre = nombre;
        this.perimetroP = perimetroP;
        this.areaP = areaP;
        this.apotemaP = apotemaP;
        this.ladoP = ladoP;
    }

    @Override
    public double cacularPerimetro() {
        System.out.println("PERIMETRO DEL PENTAGONO");
        perimetroP = 5 * getLadoP();
        
        System.out.println("El perimetro del "+getNombre()+" es: " + perimetroP);
        return perimetroP;
    }

    @Override
    public double cacularArea() {
        System.out.println("AREA DEL PENTAGONO");
        areaP = (getPerimetroP() * getApotemaP()) / 2;
        
        System.out.println("El area del "+getNombre()+" es: " + areaP);
        return areaP;
    }
}

