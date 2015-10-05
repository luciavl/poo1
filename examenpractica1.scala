var numero =0
var cantidadPositivos =0
var cantidadNegativos =0
var cantidadNeutros =0
for (i <- 1 to 20){
	println("Ingrese un numero")
	numero = readFloat()
	if (numero > 0){
		cantidadPositivos + =1
	}   else if (numero < 0 ){
	    cantidadNegativos + =1
	}   else {
		 cantidadNeutros + =1
	}	 
}
println("Ingresaste" + cantidadPositivos + "numeros positivos")
println("Ingresaste" + cantidadNegativos + "numeros negativos")
println("Ingresaste" + cantidadNeutros + "numeros neutros")
