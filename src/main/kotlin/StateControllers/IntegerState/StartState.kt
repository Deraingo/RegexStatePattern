package StateControllers.IntegerState

import IntegerDetector
import Interfaces.IntegerState

class StartState : IntegerState {
    override fun handle(char: Char, context: IntegerDetector) {
        if (char.isDigit() && char != '0') {
            context.setState(ValidDigitState())
        } else {
            context.setState(InvalidState())
        }
    }
}