println("Teclea el Numero del ejercicio que quieras realizar")
println("1)Calificacion")
println("2)Presupuesto ")
println("3)Porcentaje ")



def Calificacion () {
println("Primera Calificacion")
	val calificacion1 = readFloat()

println("Segunda Calificacion")
	val calificacion2 = readFloat()

println("Tercera Calificacion")
	val calificacion3 = readFloat()

println("Examen Final")
	val calificacionExamenFinal = readFloat()

println("Trabajo Final")
	val trabajofinal = readFloat()

	val promedio=(calificacion1 + calificacion2 + calificacion3)/3
	val Final = promedio* .55 + calificacionExamenFinal *3 + trabajofinal*1.5


println("Calificacion" + Final)


}

def Presupuesto() {

	println ("¿Cual es el presupuesto total?")
	val PresupuestoTotalAnual=readFloat()

	val PresupuestoGinecologia=(PresupuestoTotalAnual*.40)
println  ("el presupuesto de ginecologia es " + PresupuestoGinecologia)
	
	val PresupuestoTraumatologia=(PresupuestoTotalAnual*.30)
println  ("el presupuesto de traumatologia es " + PresupuestoTraumatologia)
	
	val PresupuestoPediatria=(PresupuestoTotalAnual*.30)
println  ("el presupuesto de pediatria es " + PresupuestoPediatria)

}


def Porcentaje() {

	println ("¿Cual es la cantidad 1?")
	val cantidad1=readFloat()
println ("cantidad 2")
	val cantidad2=readFloat()
println ("cantidad 3")
	val cantidad3=readFloat()
 
 	val total= cantidad1 + cantidad2 + cantidad3
 	val porcentaje1= cantidad1*100/total
 println("porcentaje1 " + porcentaje1)
 	val porcentaje2= cantidad2*100/total
 println("porcentaje2 " + porcentaje2)
 	val porcentaje3=cantidad3*100/total 
 println ("porcentaje3 " + porcentaje3)
}

val opcion=readInt()
opcion match {

case 1=> Calificacion
case 2=> Presupuesto
case 3=> Porcentaje
case default => println ("Opcion Invalida!")

}