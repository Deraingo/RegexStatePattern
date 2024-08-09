package StateControllers.PasswordState

import Interfaces.PasswordState
import PasswordDetector

class SpecialState : PasswordState {
    override fun handle(char: Char, context: PasswordDetector) {
        if (char.isLetterOrDigit()) {
            context.setState(ValidState())
        } else {
            context.setState(InvalidEndState())
        }
    }
}