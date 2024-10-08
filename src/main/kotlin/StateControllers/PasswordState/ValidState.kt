package StateControllers.PasswordState

import Interfaces.PasswordState
import PasswordDetector

class ValidState : PasswordState {
    override fun handle(char: Char, context: PasswordDetector) {
        if (char in "!@#$%&*") {
            context.setState(InvalidEndState())
        }
    }
}