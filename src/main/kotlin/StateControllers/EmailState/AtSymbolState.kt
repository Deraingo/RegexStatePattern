package StateControllers.EmailState

import EmailDetector
import Interfaces.EmailState

class AtSymbolState : EmailState {
    override fun handle(char: Char, context: EmailDetector) {
        if (char != '.') {
            context.setState(DomainState())
        } else {
            context.setState(InvalidState())
        }
    }
}