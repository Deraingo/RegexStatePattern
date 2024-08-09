package StateControllers.FloatingPointState

import FloatingPointDetector
import Interfaces.FloatingPointState

class LeadingZeroState : FloatingPointState {
    override fun handle(char: Char, context: FloatingPointDetector) {
        when {
            char == '.' -> context.setState(PeriodState())
            else -> context.setState(InvalidState())
        }
    }
}