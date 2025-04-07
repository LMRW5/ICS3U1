public class Quadratic {
    private double a;
    private double b;
    private double c;
    public Quadratic(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getA(){
        return this.a;
    }
    public double getB(){
        return this.b;
    }
    public double getC(){
        return this.c;
    }
    public double getDiscriminat(){
        return this.b*this.b-4*this.a*this.c;
    }
    public double[] getRoots(){
        double[] roots = new double[2];
        roots[0] = (-this.b + getDiscriminat())/(2*this.a);
        roots[1] = (-this.b - getDiscriminat())/(2*this.a);
        return roots;

    }
    public void getStandardForm(){
        System.out.printf("%dx^2 + %dx + %d\n", this.a, this.b,this.c);
    }
    public double[] getVertex(){
        double [] vertex = new double[2];
        double [] roots = getRoots();
        vertex[0] = (roots[0]+roots[1])/2;
        vertex[1] = (this.a*vertex[0]*vertex[0] + this.b*vertex[0] + this.c);
        return vertex;
    }
    public void setA(double a){
        this.a = a;
    }
    public void setB(double b){
        this.b = b;
    }
    public void setC(double c){
        this.c = c;
    }
    public boolean isMaximum(){
        return ((a<0)?true:false);
    }

}
