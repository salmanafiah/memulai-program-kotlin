// TODO 1
class Cat(private val name: String) {
    var sleep: Boolean = false
    get(){
        println("Fungsi Getter terpanggil")
        return field
    }
    set(value){
        println("Fungsi Setter terpanggil")
        field = value
    }

    fun toSleep() {
        if (sleep == false){
            println(name + ", sleep!")
        }else{
            println(name + ", let's play!")
        }
        println()
    }
}

fun main() {

    // TODO 2
    val gippy = Cat("Gippy")

    println("Nama: ${gippy.sleep}" )
    gippy.toSleep()
    gippy.sleep = true
    gippy.toSleep()
}