class Nota{  
 prductoAPagar= new Array[ProductoAPagar](50)  
  var productosComprados=0  
  
   def agregar(  
   producto: Producto,  
   cantidad: Int  
   ){  
     productos(productosComprados)=producto  
     cantidades(productosComprados)=cantidad  
     productosComprados += 1  
   }  
   
   def total(): Double ={  
     var total=0.0  
       for(i <- 0 to (productosComprados - 1)){  
         subtotal()  
       }  
     return total  
   }  
 }  
   
 class ProductoAPagar{  
   val productos= new Array[Producto](50)  
   val cantidades=new Array[Int](50)  
  
   def subtotal(nota: Nota): Double={  
     total += productos(i).precio * cantidades(i)  
   }  
 }  