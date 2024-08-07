package StateControllers.FloatingPointState

import FloatingPointDetector
import Interfaces.FloatingPointState

class ValidDigitState : FloatingPointState {
    override fun handle(char: Char, context: FloatingPointDetector) {
        if (char == '.') {
            context.setState(PeriodState())
        } else if (!char.isDigit()) {
            context.setState(InvalidState())
        }
    }
}