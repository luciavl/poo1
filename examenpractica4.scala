var kilos =0.0
var totalCliente =0.0
var totalTienda =0.0

println("¿Cuanto cuesta el kilo de naranja?")
val preciokilo = readFloat()

for (i <- to 15){
	println("¿Cuantos kilos de naranja compraste")
	kilos= readFloat()
	totalCliente = preciokilo * kilos
	if (kilos >10){
		totalCliente = totalCliente * 0.85

	}

	totalTienda + = totalCliente
	println("Vas a pagar :" + totalCliente)
}
println("La tienda va a recibir :" + totalTienda)
