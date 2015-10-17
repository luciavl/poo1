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