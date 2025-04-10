package Test

import kotlin.system.exitProcess

fun main() {
    if (TransactionValidatorTest().runAllTests()) {
        println("✅ All tests passed.")
    } else {
        println("❌ Some tests failed.")
        exitProcess(1)
    }

}

fun test(name: String, actualResult: Any, expectedResult: Any) : Boolean{
    if (actualResult == expectedResult) {
        println("\u001b[32mSuccess - $name \u001b[0m")
        return true
    } else {
        println("\u001b[31mFailed - $name \u001b[0m")
        return false
    }
}