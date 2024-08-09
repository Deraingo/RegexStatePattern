package StateControllers.BinaryState

import BinaryNumberDetector
import Interfaces.BinaryState

class ValidState : BinaryState {
    override fun handle(char: Char, context: BinaryNumberDetector) {
        when (char) {
            '0', '1' -> context.setState(this)
            else -> context.setState(InvalidState())
        }
    }
}