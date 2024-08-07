package StateControllers.IntegerState

import IntegerDetector
import Interfaces.IntegerState

class ValidDigitState : IntegerState {
    override fun handle(char: Char, context: IntegerDetector) {
        if (!char.isDigit()) {
            context.setState(InvalidState())
        }
    }
}