
class Coche(modelo: String, matricula: String, caballos: Int, var color: String, val marca: String, nPuertas: Int){
    val modelo: String = modelo
        get() = field.replaceFirstChar { field[0].uppercase() }


    var matricula: String = matricula
        set(value){
            require(value.length == 7) {"La matrícula debe tener 7 caracteres."}
            field = value
        }

    var caballos: Int = caballos
        set(value){
            require(value in 70..700) {"El número de caballos debe estar entre 70 y 700 caballos."}
            field = value
        }

    var npuertas = nPuertas
        set(value){
            require(value in 3..5) {"El número de puertas debe estar entre 3 y 5"}
            field = value
        }

    init{
        require(marca.isNotEmpty() && marca != null) {"La marca no puede estar vacía"}
        require(modelo.isNotEmpty() && modelo != null) {"El modelo no puede estar vacío"}
        require(caballos != null) {"El número de caballos no puede ser nulo"}
        require(caballos in 70..700) {"El número de caballos debe estar entre 70 y 700 caballos."}
        require(npuertas != null) {"El número de puertas no puede ser nulo "}
        require(npuertas in 3..5) {"El número de puertas debe estar entre 3 y 5"}
        require(color != null) {"El color no puede ser nulo"}
        require(matricula.length == 7 ) {"La matricula debe tener 7 caracteres"}
    }




    override fun toString(): String {
        return "Modelo: $modelo, marca: $marca, color: $color, caballos: $caballos, matricula: $matricula"
    }
}



fun main(){
    val coche1 = Coche(modelo = "audia4", matricula = "4567JCB", caballos = 80, color = "rojo","Audi", nPuertas = 3 )
    println(coche1)
    val coche2 = Coche(modelo = "M5", matricula = "4567JKL", caballos = 70, color = "verde", marca = "bmw", nPuertas = 4)
    println(coche2)
    val coche3 = Coche(modelo = "M5", matricula = "4567JKL", caballos = 80, color = "verde", marca = "bmw", nPuertas = 3)
    println(coche3)
    coche1.caballos = 700
    coche1.npuertas = 4
    coche1.color = "amarillo"
    coche2.npuertas = 3

    println(coche1)
    println(coche2)
    println(coche3)




    coche1.npuertas = 10
    coche2.caballos = 850
    coche1.matricula = ""
    //Va a saltar un error debido a que hay requirimientos en los setters para que al modificar, si se pasa del rango, lace un error.
}