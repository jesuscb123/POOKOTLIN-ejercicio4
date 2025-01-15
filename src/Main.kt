
class Coche(modelo: String, matricula: String, caballos: Int, var color: String, val marca: String){
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

    var npuertas: Int = 4
        set(value){
            require(value in 3..5) {"El número de puertas debe estar entre 3 y 5"}
            field = value
        }

    init{
        require(marca.isNotEmpty() && marca != null) {"La marca no puede estar vacía"}
        require(modelo.isNotEmpty() && modelo != null) {"El modelo no puede estar vacío"}
        require(caballos != null) {"El número de caballos no puede ser nulo"}
        require(npuertas != null) {"El número de puertas no puede ser nulo "}
        require(color != null) {"El color no puede ser nulo"}
        require(matricula.length == 7 ) {"La matricula debe tener 7 caracteres"}
    }




    override fun toString(): String {
        return "Modelo: $modelo, marca: $marca, color: $color, caballos: $caballos, matricula: $matricula"
    }
}



fun main(){
    val coche1 = Coche(modelo = "audi", matricula = "4567JCB", caballos = 80, color = "rojo","bmw" )
    println(coche1)

}