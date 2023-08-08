
open class A {
    open fun foo() = "A"
}

interface B {
    fun foo() = "B"
}
interface C {
    fun foo() = "C"
}


class MultiSuper :A(), B, C {
    override fun foo(): String {
        if (super<A>.foo() == super<B>.foo() && super<B>.foo() == super<C>.foo()) {
            return super<A>.foo()
        } else {
            return "Ambiguous"
    }

}





}