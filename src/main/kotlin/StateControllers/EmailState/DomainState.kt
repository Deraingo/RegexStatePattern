package StateControllers.EmailState

import EmailDetector
import Interfaces.EmailState

class DomainState : EmailState {
    override fun handle(char: Char, context: EmailDetector) {
        if (char == '.') {
            context.setState(PeriodState())
        } else if (char.isWhitespace() || char == '@') {
            context.setState(InvalidState())
        }
    }
}