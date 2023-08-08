class Man(open var name: String, open var age: Int) : Person {

    override fun name(): String {
        return name
    }

    override fun age(): Int {
        return age
    }

    fun isAdult(): Boolean {
        return age > 18
    }


}