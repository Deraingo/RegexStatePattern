package StateControllers.PasswordState

import Interfaces.PasswordState
import PasswordDetector

class StartState : PasswordState {
    override fun handle(char: Char, context: PasswordDetector) {
        when {
            char.isUpperCase() -> context.setState(CapitalState())
            else -> context.setState(InvalidState())
        }
    }
}