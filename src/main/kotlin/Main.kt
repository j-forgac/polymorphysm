fun main(){
    val operations = mapOf("add" to add(), "substract" to substract(), "multiply" to multiply(), "divide" to divide())
    val equation = mutableListOf<String>()
    println("number 1")
    equation.add(readLine()!!)
    println("operation")
    equation.add(readLine()!!)
    println("number 2")
    equation.add(readLine()!!)
    val result = operations[equation[1]]!!.compute(equation[0].toInt(),equation[2].toInt())
    println("the result is $result")
}

interface IOperation {
    fun compute(a: Int,b: Int): Int
}

class add: IOperation{
    override fun compute(a: Int, b: Int): Int {
        return a + b
    }
}

class substract: IOperation{
    override fun compute(a: Int, b: Int): Int {
        return a - b
    }
}

class multiply: IOperation{
    override fun compute(a: Int, b: Int): Int {
        return a * b
    }
}

class divide: IOperation{
    override fun compute(a: Int, b: Int): Int {
        return a / b
    }
}
