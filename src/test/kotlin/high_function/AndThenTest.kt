package high_function


var plus = fun(i: Int): Int {
    return i + 10
}

var multiply = fun(i: Int): Int {
    return i * 2
}


infix fun <P1, P2, R> Function1<P1, P2>.andThen(function: Function1<P2, R>): Function1<P1, R> {
    return fun(p1: P1): R {
        return function.invoke(this.invoke(p1))
    }
}

infix fun <P1, P2, R> Function1<P2, R>.compose(function: Function1<P1, P2>): Function1<P1, R> {
    return fun(p1: P1): R {
        return this.invoke(function.invoke(p1))
    }
}


fun main(args: Array<String>) {
    val andThen = plus andThen multiply
    val compose = plus compose multiply
    println(andThen(1))
    println(compose(1))
}


