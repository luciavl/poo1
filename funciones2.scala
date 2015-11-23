println ("Que opcion desea realizar?")
println ("1) Salario ")
println ("2) Empresa ")

def Salario () {
	println("Salario")

	println ("Horas trabajadas por el obrero")
	val HorasTrabajadas=readFloat

if  (HorasTrabajadas<=40){
	val salario=HorasTrabajadas* 160
  println("se le pagara al empleado $160 por hora, el salario total es: " + salario)
}
else {
	val HorasExtra=HorasTrabajadas- 40 
	 val SalarioTotal=HorasExtra *200 + 6400

	println ("Se le pagara $160 las primeras 40 horas y cada hora extra $200, la cantidad que se le pagara es:  " + SalarioTotal)
 }
}


def Empresa () {
	println("Empresa")

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
}

val opcion=readInt()
opcion match {

case 1=> Salario
case 2=> Empresa
case default => println ("Opcion Invalida")

}