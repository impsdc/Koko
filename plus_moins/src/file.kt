import java.io.File

fun main() {
    println("tape un mot")
    var mot:String = readLine()!!
    readFileLineByLineUsingForEachLine(filename = "data.txt", mot = mot )
}
fun readFileLineByLineUsingForEachLine(filename: String, mot:String){
    File(filename).forEachLine{
        var lol = it
        if(mot in lol){
            println("il est dedant")
        }else{
            println("il est pas dedans")
        }
}

}

