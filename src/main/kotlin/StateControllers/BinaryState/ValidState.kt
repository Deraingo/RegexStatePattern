package StateControllers.BinaryState

import BinaryNumberDetector
import Interfaces.BinaryState

class ValidState : BinaryState {
    override fun handle(char: Char, context: BinaryNumberDetector) {
        if (char != '0' && char != '1') {
            context.setState(InvalidState())
        }
    }
}