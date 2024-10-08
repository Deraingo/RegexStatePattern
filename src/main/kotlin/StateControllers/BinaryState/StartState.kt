package StateControllers.BinaryState

import BinaryNumberDetector
import Interfaces.BinaryState

class StartState : BinaryState {
    override fun handle(char: Char, context: BinaryNumberDetector) {
        when (char) {
            '1' -> context.setState(ValidState())
            '0' -> context.setState(InvalidState())
            else -> context.setState(InvalidState())
        }
    }
}