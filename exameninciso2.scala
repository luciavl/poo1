var menor = 11
var calificacion = 0.0
for (i <= 1 to 40){
	println("ingresa tu calificaion")
	calificaion = readFloat()

	if (calificacion < menor){
		menor = calificacion

	}
}
println("la calificaion menor es"+ menor)