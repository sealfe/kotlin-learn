import kotlin.reflect.KProperty

/**
 * @Classname ProxyTest
 * @Description
 * @Date 2023/8/7 22:54
 * @author by fengww
 */

class ProxyDemo {
    operator fun getValue(thisRef: Any?, property: KProperty<*>): String {
        return "$thisRef, 这里委托了 ${property.name} 属性"
    }

    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {
        println("$thisRef 的 ${property.name} 属性赋值为 $value")
    }
}


class ProxyTest {

    var b by ProxyDemo()

}

fun main() {
    val proxyTest = ProxyTest()
    println(proxyTest.b)
    proxyTest.b = "test"
}