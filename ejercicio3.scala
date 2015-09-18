println("Su pago total: ");
val total=readFloat()
println(total);
println("Color de la bolita? (blanco, verde, amarillo, azul o rojo)");
val color=readLine()
println(color);
if(color=="blanco"){
   println("Usted va a pagar: " + total)
}
if(color=="verde"){
   val descuento=total - ((total/100)*10);
   println("Usted va a pagar: " + descuento)
}
if(color=="amarillo"){
   val descuento=total - ((total/100)*25);
   println("Usted va a pagar: " + descuento)
}
if(color=="azul"){
   val descuento=total - ((total/100)*50);
   println("Usted va a pagar: " + descuento)
}
if(color=="rojo"){
   val descuento=0;
   println("Usted va a pagar: " + descuento)
}





println("¿Cual es tu edad?")
val edad=readInt()
println(edad)
println("Antigüedad de tu empleo?")
val antiguedad=readInt()
println(antiguedad)
if(edad>=60 && antiguedad<25){
  println(Jubilacion por: Edad")
}
if(edad<60 && antiguedad>=25){
  println("Jubilacion por: Antigúedad Joven")
}
if(edad>=60 && antiguedad>=25){
  println("Jubilacion por: Antigúedad Adulta")

}
