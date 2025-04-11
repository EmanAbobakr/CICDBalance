import Test.TransactionValidatorTest
import kotlin.system.exitProcess

fun main() {
    TransactionValidatorTest().runAllTests()
    println("✅ All tests passed.")
}

fun test(name: String, actualResult: Any, expectedResult: Any) {
    if (actualResult == expectedResult) {
        println("\u001b[32mSuccess - $name \u001b[0m")
    } else {
        println("\u001b[31mFailed - $name \u001b[0m")
        exitProcess(1)
    }
}