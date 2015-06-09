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
public class PontoYZ extends Ponto2D {
    
    public PontoYZ(double x,double y,double z){
        super(0.0,y,z);
        
    }
    
    public PontoYZ(){
      super();
        
    }
    public PontoYZ(double y,double z){
        super(0.0,y,z);
        
    }
    @Override
    public String ToString(){
    
    return String.format(getNome()+"("+getX()+","+getY()+","+getZ()+")");
    
}
}

