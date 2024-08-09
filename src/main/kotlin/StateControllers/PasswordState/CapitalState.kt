package StateControllers.PasswordState

import Interfaces.PasswordState
import PasswordDetector

class CapitalState : PasswordState {
    override fun handle(char: Char, context: PasswordDetector) {
        when {
            char in "!@#$%&*" -> context.setState(SpecialState())
            else -> context.setState(InvalidState())
        }
    }
}