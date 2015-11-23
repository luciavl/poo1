def CentrodeVerificacion () = {
var maximo = -1
var minimo = 101
var puntosContaminantes = 0
var suma = 0

for (i <- 1 to 25){
    println("Ingresa los puntos contaminantes")
    puntosContaminantes = readInt()
   
   if (puntosContaminantes < minimo){
      minimo = puntosContaminantes
   }
   
   if (puntosContaminantes > maximo){
   maximo = puntosContaminantes
   }
   
   suma += puntosContaminantes
}

println("El promedio es " + (suma / 25))
println("El mas contaminante" + maximo)
println("El menos contaminante" + minimo)

def Reforestacion () {
var pino = 0.0
var oyamel = 0.0
var cedro = 0.0
var numeropino = 0.0
var numerooyamel = 0.0
var numerocedro = 0.0

println ("Reforestacion del Bosque")

println ("Ingresa la superficie del Bosque")
val SuperficieBosque = readFloat()

if (SuperficieBosque > 1000000){
println ("El bosque sera sembrado de la siguiente manera: ")
 println ("70% de Pino")
 println ("20% de Oyameles")
 println ("10% de Cedro")

 pino = (SuperficieBosque*70/100)
 println ("La superficie en metros que sera sembrada de Pinos es: " + pino )
 oyamel = (SuperficieBosque*20/100)
 println ("La superficie en metros que sera sembrada de Oyameles es: " + oyamel )
 cedro = (SuperficieBosque*10/100)
 println ("La superficie en metros que sera sembrada de Cedros es: " + cedro )

 numeropino = pino *8 / 10
 println ("Numero de Pinos que se necesitan para sembrar el bosque son : " + numeropino)
 numerooyamel = oyamel * 15 / 15
 println ("Numero de Oyameles que se necesitan para sembrar el bosque son: " + numerooyamel )
 numerocedro = cedro * 10 / 18
 println ("Numero de Cedros que se necesitan para sembrar el bosque son: " + numerocedro)
}

if (SuperficieBosque <= 1000000) {

 println ("El bosque sera sembrado de la siguiente manera: ")
 println ("50% de Pino")
 println ("30% de Oyameles")
 println ("20% de Cedro")

 pino = (SuperficieBosque*50/100)
 println ("La superficie en metros que sera sembrada de Pinos es: " + pino )
 oyamel = (SuperficieBosque*30/100)
 println ("La superficie en metros que sera sembrada de Oyameles es: " + oyamel )
 cedro = (SuperficieBosque*20/100)
 println ("La superficie en metros que sera sembrada de Cedros es: " + cedro )

 numeropino = pino*8/10
 println ("Numero de Pinos que se necesitan para sembrar el bosque son : " + numeropino)
 numerooyamel = oyamel*15/15
 println ("Numero de Oyameles que se necesitan para sembrar el bosque son: " + numerooyamel )
 numerocedro = cedro*10/18
 println ("Numero de Cedros que se necesitan para sembrar el bosque son: " + numerocedro)
}

println ("¿Cuál ejercicio desea ejecutar? ")
println ("1) Centro de verificación. ")
println ("2) Reforestación del bosque. ")
val opcion = readInt ()

opcion match {

case 1 => CentrodeVerificacion ()
case 2 => Reforestacion ()
case default => println ("Opción incorrecta")
}