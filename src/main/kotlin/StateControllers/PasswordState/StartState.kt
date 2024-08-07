package StateControllers.PasswordState

import Interfaces.PasswordState
import PasswordDetector

class StartState : PasswordState {
    override fun handle(char: Char, context: PasswordDetector) {
        context.setState(ValidState()) // Replace with appropriate logic
    }
}