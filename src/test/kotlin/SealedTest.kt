/**
 * @Classname SealedTest
 * @Description
 * @Date 2023/8/7 23:25
 * @author by fengww
 */
sealed class SealedDemo {
    class One : SealedDemo()
    class Two : SealedDemo()
    class Three : SealedDemo()
}

class SealedDemo2 : SealedDemo() {

}
class SealedTest {

}

fun main() {
    val sealedDemo = SealedDemo.One()
    val sealedDemo2 = SealedDemo2()
}