
package miprimerproyecto;


public class Article {
  
    public int sku;
    protected int existencia;
   protected double costo;
    public String descripcion;
     protected double precio;
    
   
   public Article ()
   {
    sku=1234;
    costo=0;
    existencia=0;
    precio=35;
    descripcion= "Xbox one";
   }
     public Article (int sku,double precio, int existencia, String descripcion, double costo) {
        this.sku=sku;
        this.existencia=existencia;
        this.costo=costo;
        this.descripcion=descripcion;
        
        
        
    }
      public double MuestraCosto(){
        return costo;
        
        
    }
      public double MuestraExistencia()
      {
          return existencia;
      }
        public void modificaexiscost (int existencia,double costo)
        {
          this.existencia=existencia;
          this.costo=costo;
        }
        public  boolean venta(int vender)
        {
           if(vender> existencia) 
           {
                System.out.println("Lo sentimos la cantidad que usted desea vender es insuficiente ");
               return false;
           }
           else
           {
               this.existencia-=vender;
               return true;
              
           }
        }
        public double MuestraPrecio()
      {
          return precio;
      }
        public void modificaprecio (double precio)
        {
            
          this.precio=precio;
        }
        
    }

