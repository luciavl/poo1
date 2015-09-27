def Calificacion() = {
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
	println("Calificacion" = + Final	
}


def Presupuesto() = {
	println("Presupuesto 1")
	val presupuesto1 = redaFloat()
	println("Presupuesto 2")
	val presupuesto2 = readFloat()
	println("Presuouesto 3")
	val presupuesto3 = readFloat()
	val total = presupuesto1 + presupuesto2 + presupuesto3
	println ("porcentajepresupuestal1")
	val porcentajepresupuestal1 = cantidad * 100/3
	println (porcentaje1)
	val porcentajepresupuestal2 = cantidad * 100/3
	println (porcentaje2)
	val porcentajepresupuestal3 = cantidad * 100/3
	println (porcentaje3)
	
}




def Cantidad() = {

	println ("cantidad 1")
	val cantidad1 =readFloat()
	println ("cantidad 2")
	val cantidad2 =readFloat()
	println ("cantidad 3")
	val cantidad3 =readFloat()
	val total = cantidad1 + cantidad2 +cantidad3
	println ("porcentaje1")
	val porcentaje1 = cantidad1 * 100/total
	println (porcentaje1)
	println ("porcentaje2")
	val porcentaje2 = cantidad2 * 100/total
	println (porcentaje2)
	println ("porcentaje3")
	val porcentaje3 = cantidad3 * 100/total
	println (porcentaje3)

}


println("¿Cual ejercicio desea ejecutar?")
println("1)Calificacion Final")
println("2)Presupuesto")
printnl("3)Porcentaje")
val opcion = readInt()

opcion match {
	case 1 => CalificacionFinal ()
	case 2 => Presupuesto ()
	case 3 => Porcentaje ()
	case default => println ("Opcion invalida")

}

