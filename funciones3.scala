println ("Que opcion desea realizar?")
println ("1) Tienda ")
println ("2) Jubilacion ")



def Tienda () {
    println("Tienda")
	
  println("Total de compra: ");
	val total=readFloat()
  println(total)

println("Cual es el color de la bolita? (blanco, verde, amarillo, azul o rojo)");
	val color=readLine();
println(color);

if(color=="blanco"){
   println("Va a pagar: " + total)
}
if(color=="verde"){
   val descuento=total - ((total/100)*10)
   println("Va a pagar: " + descuento)
}
if(color=="amarillo"){
   val descuento=total - ((total/100)*25)
   println("Va a pagar: " + descuento)
}
if(color=="azul"){
   val descuento=total - ((total/100)*50)
   println("Va a pagar: " + descuento)
}
if(color=="rojo"){
   val descuento=0
   println("Va a pagar: " + descuento)
}
else{
   println("GRACIAS")
	}
}


def Jubilacion () {
  println("Jubilacion")

println("Se quiere jubilar Nombre: ")}
  val nombre=readLine()

println("Hola " + nombre + " Necesitamos saber su edad: ")
  val edad=readFloat()

if (edad<60){
 println("Antigüedad en la empresa: ")
 val anti=readFloat()
 if(anti>=25){
    println(nombre + " sus datos proporcionados son los siguientes: ")
    println("Edad: " + edad + " Antigüedad: " + anti)
    println("A usted le corresponde la jubilacion por: Antigüedad Joven. ")
  } else {
    println("No cumple con la edad o antigüedad requerida para la jubilacion.")
    val ftiempo=25-anti
    val fedad=60-edad
    println("Requeriria " + fedad + " años o " + ftiempo + " de antigüedad. ")
  }
} else {
 println("Ahora ingrese su antigüedad: ")
 val anti=readFloat()
 if(anti>=25){
  println(nombre + " sus datos proporcionados son los siguientes: ")
  println("Edad: " + edad + " Antigüedad: " + anti)
  println("A usted le corresponde la jubilacion por: Antigüedad Adulta. ")
 } else {
  println(nombre + " sus datos proporcionados son los siguientes: ")
  println("Edad: " + edad + " Antigüedad: " + anti)
  println("A usted le corresponde la jubilacion por: Edad. ")
 }
}

val opcion=readInt()
opcion match {

case 1=> Tienda
case 2=> Jubilacion
case default => println ("Opcion Invalida")

}