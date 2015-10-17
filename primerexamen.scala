def Calificacion () {
var menor = 11.0
var calificacion = 0.0
for (i <- 1 to 40) {
  println ("Ingresa tu calificación")
  calificacion = readFloat()

  if (calificacion < menor) {
    menor = calificacion
  }
}
println ("La calificacion menor es: " +menor)
}


def Numeros () {
var numero = 0
var cantidadPositivos = 0
var cantidadNegativos = 0
var cantidadNeutros = 0
for (i <- 1 to 20) {
  println ("Ingresa un número.")
  numero = readInt ()
  if (numero > 0) {
    cantidadPositivos += 1
  } else if (numero < 0) {
      cantidadNegativos += 1
  } else {
      cantidadNeutros += 1
  }
}
println ("Ingresaste " +cantidadPositivos+ "números positivos.")
println ("Ingresaste " +cantidadNegativos+ "números negativos.")
println ("Ingresaste " +cantidadNeutros+ "números neutros.")
}


def Reloj () {
for (horas <- 0 to 23) {
  for (minutos <- 0 to 59) {
    for (segundos <- 0 to 59) {
      println (horas+ ":" +minutos+ ":" +segundos)
    }
  }
}
}


def Tienda (){
var kilos = 0.0
var totalCliente = 0.0
var totalTienda = 0.0

println ("¿Cuánto cuesta el kilo de naranja?")
val precioKilo = readFloat()

for (i <- 0 to 15) {
  println ("¿Cuántos kilos de naranja compraste?")
  kilos = readFloat()
  totalCliente = precioKilo * kilos
  if (kilos > 10) {
    totalCliente = totalCliente * 0.85
  }
  totalTienda += totalCliente
  println ("Vas a pagar: " +totalCliente)
}

println ("La tienda va a recibir: " +totalTienda)
}

println ("¿Cuál ejercicio desea ejecutar? ")
println ("1) Calificación. ")
println ("2) Números. ")
println ("3) Reloj. ")
println ("4) Tienda de naranjas. ")
val opcion = readInt ()


opcion match {

case 1 => Calificacion ()
case 2 => Numeros ()
case 3 => Reloj ()
case 4 => Tienda ()
case default => println ("Opción invalida")

}