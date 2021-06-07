import kotlin.random.Random

fun main(args: Array<String>) {
    for (num in Ej1(11).array){
        println(num)
    }
    val array = Ej2(10){ Random.nextInt(50, 250)}

    array.array.forEach { println(it) }

    val array2 = Ej3().filtro(Ej2(10, {Random.nextInt(50, 250)}).array)
}