package StateControllers.PasswordState

import Interfaces.PasswordState
import PasswordDetector

class InvalidEndState : PasswordState {
    override fun handle(char: Char, context: PasswordDetector) {
    }
}