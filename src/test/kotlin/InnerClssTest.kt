import kotlin.test.Test

/**
 * @Classname InnerClssTest
 * @Description
 * @Date 2023/8/7 23:16
 * @author by fengww
 */
class InnerClssTest {

    class InnerDemo{

    }

    inner class InnerDemo2{

    }




}

fun main() {
    val innerClssTest = InnerClssTest()
    val innerDemo = InnerClssTest.InnerDemo()
    val innerDemo2 = innerClssTest.InnerDemo2()
}