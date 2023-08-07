import org.junit.jupiter.api.Test

/**
 * @Classname ExtendTest
 * @Description
 * @Date 2023/8/7 22:18
 * @author by fengww
 */
class ExtendTest {




    @Test
    fun test() {
        "test".add("test2")
        println("test" * 2)
    }



    fun String.add(two: String) {
        println(this + two)
    }

    operator fun String.times(two: Int): String {
        return this.repeat(two)
    }

}