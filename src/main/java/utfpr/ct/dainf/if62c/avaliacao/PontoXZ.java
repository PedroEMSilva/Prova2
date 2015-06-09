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
public class PontoXZ extends Ponto2D {
    
    public PontoXZ(double x,double y,double z){
        super(x,0.0,z);
        
    }
    
    public PontoXZ(){
      super();
        
    }
    public PontoXZ(double x,double z){
        super(x,0.0,z);
        
    }
    @Override
    public String ToString(){
    
    return String.format(getNome()+"("+getX()+","+getY()+","+getZ()+")");
    
}
}
