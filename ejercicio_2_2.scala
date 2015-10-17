println ("El costo por pieza $50,000")
println ("Cantidad de piezas a comprar")
	var NumeroPiezas=readInt()
	var PrecioTotal=NumeroPiezas*50000
println ("Monto total a pagar es " + PrecioTotal)
if (PrecioTotal>500000){
	var Inversion= PrecioTotal*.55 
	var BancoPrestamo= PrecioTotal*.30
	var Credito=PrecioTotal*.15
	var Intereses=Credito*.20
	println ("Capacidad de inversion de la empresa : " + Inversion)
    println ("Se le solocitara un prestamo al banco de: " + BancoPrestamo)
    println ("Credito que se le dara al fabricante: "  + Credito)
    println ("Concepto de intereses: "  + Intereses)
}
else {
	var Inversion= PrecioTotal*.70 
	var Credito=PrecioTotal*.30
	var Intereses=Credito*.20
	println ("Capacidad de inversion de la empresa: " + Inversion)
    println ("Credito que se le dara al fabricante: "  + Credito)
    println ("Concepto de intereses: " + Intereses)

}