package high_function
//多个参数的函数 变成单个的
class Curried {
}


fun <P1,P2,P3,R> Function3<P1,P2,P3,R>.curried() = fun(p1:P1) = fun(p2:P2) = fun(p3:P3) = this(p1,p2,p3)

var allPrint = fun(i: Int, i1: Int, b: Boolean) {
    println("i = $i, s = $i1, b = $b")
}
fun main(){
    allPrint.curried()(1)(2)(true)
}