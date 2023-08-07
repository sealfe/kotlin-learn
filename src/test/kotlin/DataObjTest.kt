import org.junit.jupiter.api.Test

/**
 * @Classname DataObjTest
 * @Description
 * @Date 2023/8/7 23:09
 * @author by fengww
 */
data class DataDemo(val name: String, val age: Int)
class DataObjTest {

    @Test
    fun test() {
        val dataDemo = DataDemo("test", 1)
        println(dataDemo)
    }

    @Test
    fun test2() {
        val dataDemo = DataDemo("test", 1)
        var(name, age) = dataDemo
        println(name)
        println(age)
    }




}