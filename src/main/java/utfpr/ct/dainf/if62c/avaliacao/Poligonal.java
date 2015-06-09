/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.ct.dainf.if62c.avaliacao;

/**
 *
 * @author a1590677
 * @param <T>
 */
public class Poligonal {
    private Ponto2D[] vertices; 
    private int n;
  
     
    public Poligonal(int n){
        vertices = new Ponto2D[n];
          this.n=n;
    }
   public int getN(){
       return n;
   }
  public Ponto2D get(int a){
      if(a<0||a>getN()){
          return null;
          
      }
      
      return vertices[a];
      
  }
    
    
}
