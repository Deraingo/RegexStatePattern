package StateControllers.EmailState

import EmailDetector
import Interfaces.EmailState

class DomainState : EmailState {
    override fun handle(char: Char, context: EmailDetector) {
        when {
            char.isLetterOrDigit() -> {
                context.setState(ValidState())
            }
            char == '.' -> {
                context.setState(PeriodState())
            }
            else -> {
                context.setState(InvalidState())
            }
        }
    }
}