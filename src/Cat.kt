class Cat(var name: String, var age: Int, var weight: Int) {

    fun walk(amount: Int) {
        weight -= amount
    }

    fun eat(amount: Int): Boolean {
        return if (weight + amount <= 20) {
            weight += amount
            true
        } else {
            false
        }
    }

    override fun toString(): String {
        return "$name weighs $weight"
    }
}
