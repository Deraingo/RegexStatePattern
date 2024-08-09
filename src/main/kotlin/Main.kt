import Interfaces.Detector

fun main() {
    while (true) {
        println("Choose the type of value to validate:")
        println("1. Integer")
        println("2. Floating Point")
        println("3. Binary Number")
        println("4. Email Address")
        println("5. Password")
        println("6. Exit")
        print("Enter your choice: ")

        when (readlnOrNull()?.toIntOrNull()) {
            1 -> runDetector(IntegerDetector(), "integer")
            2 -> runDetector(FloatingPointDetector(), "floating point")
            3 -> runDetector(BinaryNumberDetector(), "binary number")
            4 -> runDetector(EmailDetector(), "email address")
            5 -> runDetector(PasswordDetector(), "password")
            6 -> {
                println("Exiting...")
                break
            }
            else -> println("Invalid choice. Please try again.")
        }
    }
}

fun runDetector(detector: Detector, valueType: String) {
    print("Enter a $valueType to validate: ")
    val input = readlnOrNull() ?: ""
    val isValid = detector.run(input)
    if (isValid) {
        println("The input is a valid $valueType.")
    } else {
        println("The input is NOT a valid $valueType.")
    }
}