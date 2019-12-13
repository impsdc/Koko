import java.io.Console

fun main(args: Array<String>) {

    var first: String = first()
    var firstNb:Int = first.toInt()

    var fla:Int = 9
    var depart: Int = firstNb.toInt()
    println("entre la lettre 'q' pour abandoner")
    var nbTry :Int = 3
    do{
        if(nbTry == 0) {
            break
        }
        else{
            println("Tu as $nbTry essais")
        }

        var paul = top()
        if (paul == "") {
            println("Ecrit un nombre battard")
        }
        else if(paul == "q"){
            break
        }
        fla = paul.toInt()

        if( fla > depart){
            println("c'est moins")
            when(fla){
                in depart .. depart + 2 -> {
                    println("Mais t'es bouillant")
                }
                in depart .. depart + 5 -> {
                    println("Mais t'es chaud")
                }
                else -> println("Et t'es froid... mskn un peu")
            }
            nbTry--
        }
        else if( fla < depart){
            println("c'est plus")
            when(fla){
                in depart - 2 .. depart  -> {
                    println("Mais t'es glacé")
                }
                in depart - 5 .. depart -> {
                    println("Mais t'es froid")
                }
                else -> println("Et t'es froid")
            }
            nbTry--
        }

    }
    while ( fla != depart )

    when(nbTry){
        0 -> {
            println("tu as perdu")
        }
        in 0..3 -> {
            println("mskn t'as abandoné")
        }
        else -> println("tu as gagné")
    }
}

fun first():String {
    val console : Console? = System.console()
    println("saisissez le premier nombre :")
    var trux = console!!.readPassword("")
    if (trux.isEmpty()) {
        println("ecrit un nombre pd")
    }
    return String(trux)
}
fun top():String {
    println("ecrit le nombre a comparé")
    return readLine()!!
}

