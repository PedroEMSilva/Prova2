package utfpr.ct.dainf.if62c.avaliacao;

import static java.lang.Math.sqrt;

/**
 * UTFPR - Universidade Tecnológica Federal do Paraná
 * DAINF - Departamento Acadêmico de Informática
 * IF62C - Fundamentos de Programação 2
 * 
 * Segunda avaliação parcial 2014/2.
 * @author 
 */
public class Ponto {
    private double x, y, z;

    /**
     * Retorna no nome não-qualificado da classe.
     * @return O nome não qualificado da classe.
     */
    public String getNome() {
        return getClass().getSimpleName();
    }
public Ponto (){
    x=0;
    y=0;
    z=0;
}
public Ponto (double x,double y,double z){
    this.x=x;
    this.y=y;
    this.z=z;
}
    public double getX() {
        return x;
    }
public double dist(Ponto p){
    double x1=getX();
    double x2=p.getX();
    double y1=getY();
    double y2=p.getY();
    double z1=getZ();
    double z2=p.getZ();
    return sqrt(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1))+((z2-z1)*(z2-z1)));
}
    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }
    @Override
    public boolean equals(Object o) 
{
    
    if (o == this) {
            return true;
        }
    Ponto c = (Ponto) o;
   
    if(getX()==c.getX()&&getY()==c.getY()&&getZ()==c.getZ()){
        return true;
    }else{
    return false;}
}




public String ToString(){
    
    return String.format(getNome()+"("+getX()+","+getY()+","+getZ()+")");
    
}
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.x) ^ (Double.doubleToLongBits(this.x) >>> 32));
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.y) ^ (Double.doubleToLongBits(this.y) >>> 32));
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.z) ^ (Double.doubleToLongBits(this.z) >>> 32));
        return hash;
    }

}
