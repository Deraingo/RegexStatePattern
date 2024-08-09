package StateControllers.EmailState

import Interfaces.EmailState
import EmailDetector
class UsernameState : EmailState {
    override fun handle(char: Char, context: EmailDetector) {
        if (char == '@') {
            context.setState(AtSymbolState())
        } else if (char.isWhitespace() || char == ' ') {
            context.setState(InvalidState())
        }
    }
}