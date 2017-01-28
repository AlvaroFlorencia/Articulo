
package miprimerproyecto;


public class MAINHW {
        public static void main(String[] args) {
        //Instancia de la clase Artículo
        Article telefono = new Article(120899,11500.00,5,"Iphone 6s 16Gb",53.00);
        //Compra de 50 teléfonos
        telefono.modificaexiscost(50, 9890.00);
        //Muestra la existencia en almacén
        System.out.println("La existencia en almacén del artículo es " + 
                            telefono.MuestraExistencia());
        //Se realiza una venta
        System.out.println("Se venden 15 teléfonos");
        telefono.venta(15);
        System.out.println("La nueva existencia después de la venta es "+
                            telefono.MuestraExistencia());
        //Se realiza actualización de precios
         telefono.modificaprecio(10000.00);
        System.out.println("Hay una promo, y el nuevo precio es $"+ telefono.MuestraPrecio() );
       
    } 
}

