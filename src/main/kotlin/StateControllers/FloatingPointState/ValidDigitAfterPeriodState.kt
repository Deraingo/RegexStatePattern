package StateControllers.FloatingPointState

import FloatingPointDetector
import Interfaces.FloatingPointState

class ValidDigitAfterPeriodState : FloatingPointState {
    override fun handle(char: Char, context: FloatingPointDetector) {
        if (!char.isDigit()) {
            context.setState(InvalidState())
        }
    }
}