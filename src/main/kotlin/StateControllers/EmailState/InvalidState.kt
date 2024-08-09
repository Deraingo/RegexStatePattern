package StateControllers.EmailState

import EmailDetector
import Interfaces.EmailState

class InvalidState : EmailState {
    override fun handle(char: Char, context: EmailDetector) {

    }
}