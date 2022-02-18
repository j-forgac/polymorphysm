fun main(){
    val operations = mapOf("add" to Add(), "substract" to Substract(), "multiply" to Multiply(), "divide" to Divide())
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

class Add: IOperation{
    override fun compute(a: Int, b: Int): Int {
        return a + b
    }
}

class Substract: IOperation{
    override fun compute(a: Int, b: Int): Int {
        return a - b
    }
}

class Multiply: IOperation{
    override fun compute(a: Int, b: Int): Int {
        return a * b
    }
}

class Divide: IOperation{
    override fun compute(a: Int, b: Int): Int {
        return a / b
    }
}
