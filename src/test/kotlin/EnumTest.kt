/**
 * @Classname EnumTest
 * @Description
 * @Date 2023/8/7 23:22
 * @author by fengww
 */
enum class EnumDemo {
    ONE, TWO, THREE
}
class EnumTest {
}

fun main() {
    val enumDemo = EnumDemo.ONE
    println(enumDemo)
    println(enumDemo.name)
    println(enumDemo.ordinal)
    println(EnumDemo.valueOf("ONE"))
    println(EnumDemo.values())
}