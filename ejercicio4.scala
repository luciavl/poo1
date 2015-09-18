var total=0;
var Apto=true;
for(i<-1 to 10){
   println("Tiempo que tarda en el dia " + i + ":   ");
   val tiempo=readInt();
   println(tiempo);
   if(tiempo>16){
       Apto=false;
   }
   total=total + tiempo;
}
println("Total de los 10 dias es : " + total);
val promedio=total/10;
rintln("tu promedio es: " + promedio);

if(promedio<=15 && Apto==true){
   println("si eres apto");
}
else{

println("no eres apto")
}

else{
   println("elige otra especialidad");
}



var total1=0
var total2=0
var total3=0
println("Que animal quieres estudiar(elefante, jirafa o chimpance)")
val animal=readLine()
println(animal)
if(animal=="elefante"){
  for(i<-1 to 20){
    println("Cual es su edad del animal " + i + "? ")
    val edad=readInt()
    println(edad)
    if(edad>=0 && edad<=1){
      total1=total1+1
    }
    if(edad>1 && edad<3){
      total2=total2+1
    }
    if(edad>=3){
      total3=total3+1
    }
  }
   val porcentaje1=(total1*100)/20
  println("El porcentaje de animales de de 0 a 1 año: " + porcentaje1 + "%")
  val porcentaje2=(total2*100)/20
  println("El porcentaje de animales de mas de 1 y menor a 3 es: " + porcentaje2 + "%")
  val porcentaje3=(total3*100)/20
  println("El porcentaje de animales de 3 o mas: " + porcentaje3 + "%")
}

if(animal=="jirafa"){
  for(i<-1 to 15){
    println("Edad del animal " + i + "? ")
    val edad=readInt()
    println(edad)
    if(edad>=0 && edad<=1){
      total1=total1+1
    }    if(edad>1 && edad<3){
      total2=total2+1
    }
    if(edad>=3){

      total3=total3+1
    }

  }
  val porcentaje1=(total1*100)/15
  println("El porcentaje de animales de 0 a 1 año: " + porcentaje1 + "%")
  val porcentaje2=(total2*100)/15
  println("El porcentaje de animales de mas de 1 y menor a 3 es: " + porcentaje2 + "%")
  val porcentaje3=(total3*100)/15
  println("El porcentaje de animales de 3 o mas: " + porcentaje3 + "%")
}

if(animal=="chimpance"){
  for(i<-1 to 40){
    println("Cual es su edad del animal " + i + "? ")
    val edad=readInt()
    println(edad)
    if(edad>=0 && edad<=1){
      total1=total1+1
    }
    if(edad>1 && edad<3){
      total2=total2+1
    }
    if(edad>=3){
      total3=total3+1
    }
  }
  val porcentaje1=(total1*100)/40
  println("El porcentaje de animales de 0 a 1 año: " + porcentaje1 + "%")
  val porcentaje2=(total2*100)/40
  println("El porcentaje de animales de mas de 1 y menor a 3 es: " + porcentaje2 + "%")
  val porcentaje3=(total3*100)/40
  println("El porcentaje de animales de 3 o mas: " + porcentaje3 + "%")
}
