open class Monster {

    open fun frighten(): Boolean {
        println("Aaagh")
        return true
    }
}

class Vampire : Monster() {

    override fun frighten(): Boolean {
        println("Bite")
        return false
    }
}

class Dragon : Monster() {
    override fun frighten(): Boolean {
        println("Fire")
        return true
    }
}
fun main(){

    val m = arrayOf(Vampire(), Dragon(), Monster())

    for (item in m) {
        item.frighten()
    }
}