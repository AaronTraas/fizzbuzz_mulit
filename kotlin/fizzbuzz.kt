
fun fizzbuzzer(num: Int, replacements: Map<Int, String>) : String =
    replacements.filter { 
        (multiple, _) -> num % multiple == 0 
    }.values.toList().joinToString("").ifEmpty{ 
        "$num" 
    }

fun fizzbuzzRange(start: Int, end: Int, replacements: Map<Int, String>) : String =
    (start..end).map { num -> 
        fizzbuzzer(num, replacements)
    }.joinToString("\n")

fun main() {
    println(fizzbuzzRange(1, 100, mapOf(
        3 to "Fizz",
        5 to "Buzz"
    )))
}
