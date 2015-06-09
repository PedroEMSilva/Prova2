/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.ct.dainf.if62c.avaliacao;

/**
 *
 * @author a1590677
 */
public class PontoXY extends Ponto2D {
    
    public PontoXY(double x,double y,double z){
        super(x,y,0.0);
        
    }
    
    public PontoXY(){
      super();
        
    }
    public PontoXY(double x,double y){
        super(x,y,0.0);
        
    }
    @Override
    public String ToString(){
    
    return String.format(getNome()+"("+getX()+","+getY()+","+getZ()+")");
    
}
}
