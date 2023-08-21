package high_function

import java.nio.charset.Charset

var stringMake = fun(message: String, charset: Charset): String {
    return String(message.toByteArray(charset), charset)
}

fun <P1, P2, R> Function2<P1, P2, R>.partial(p2: P2): Function1<P1, R> {
    return fun(p1: P1): R {
        return this.invoke(p1, p2)
    }
}

fun main() {
    val utf8Make = stringMake.partial(Charsets.UTF_8)
    println(utf8Make("我是中国人"))
}