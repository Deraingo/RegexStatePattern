package StateControllers.EmailState

import Interfaces.EmailState
import EmailDetector
class StartState : EmailState {
    override fun handle(char: Char, context: EmailDetector) {
        if (char != '@') {
            context.setState(UsernameState())
        } else {
            context.setState(InvalidState())
        }
    }
}