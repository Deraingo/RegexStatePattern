package StateControllers.BinaryState

import BinaryNumberDetector
import Interfaces.BinaryState

class StartState : BinaryState {
    override fun handle(char: Char, context: BinaryNumberDetector) {
        if (char == '1') {
            context.setState(ValidState())
        } else {
            context.setState(InvalidState())
        }
    }
}