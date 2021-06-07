class Ej3 {
    val filtro = { array: Array<Int> ->
        array.filter {
            it % 2 != 0
        }.forEach(){
            println(it)
        }
    }
}