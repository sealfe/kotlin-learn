import kotlin.test.Test

/**
 * @Classname ObjectTest
 * @Description
 * @Date 2023/8/7 21:51
 * @author by fengww
 */

object TestOne {
    fun test() {
        println("test")
    }
}


class ObjectTest {

    @Test
    fun test() {
        TestOne.test()
    }



}