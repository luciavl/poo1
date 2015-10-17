println("¿Se quiere jubilar? Nombre: ")
  val nombre= readLine()
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