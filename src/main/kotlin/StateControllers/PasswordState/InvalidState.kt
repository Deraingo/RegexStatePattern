package StateControllers.PasswordState

import Interfaces.PasswordState
import PasswordDetector

class InvalidState : PasswordState {
    override fun handle(char: Char, context: PasswordDetector) {

    }
}