fun main() {

    val calculator = Calculator()

    val num1 = 20
    val num2 = 10

    println("Number 1: $num1")
    println("Number 2: $num2")

    println("--------------------")

    println("Addition: ${calculator.add(num1, num2)}")

    println("Subtraction: ${calculator.subtract(num1, num2)}")

    println("Multiplication: ${calculator.multiply(num1, num2)}")

    println("Division: ${calculator.divide(num1, num2)}")
}