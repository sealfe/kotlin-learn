package high_function

class FunctionParamTest {

    fun demo(any: Any){
        println(any)
    }


}

fun main() {
    intArrayOf(1, 2, 3).forEach(::println)
    arrayListOf("a", "b", "c").filter(String::isNotEmpty).forEach(::println)
    val functionParamTest = FunctionParamTest()
    intArrayOf(1, 2, 3).forEach(functionParamTest::demo)
}
