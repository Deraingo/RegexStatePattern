package StateControllers.FloatingPointState

import FloatingPointDetector
import Interfaces.FloatingPointState

class StartState : FloatingPointState {
    override fun handle(char: Char, context: FloatingPointDetector) {
        when {
            char.isDigit() && char != '0' -> context.setState(ValidDigitState())
            char == '0' -> context.setState(PeriodState())
            char == '.' -> context.setState(PeriodState())
            else -> context.setState(InvalidState())
        }
    }
}