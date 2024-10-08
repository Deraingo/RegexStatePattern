package StateControllers.EmailState

import Interfaces.EmailState
import EmailDetector
class PeriodState : EmailState {
    override fun handle(char: Char, context: EmailDetector) {
        when {
            char.isLetterOrDigit() -> {
                context.setState(ValidState())
            }
            char == '.' -> {
                context.setState(InvalidState())
            }
            else -> {
                context.setState(InvalidState())
            }
        }
    }
}