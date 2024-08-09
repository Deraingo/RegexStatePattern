package StateControllers.BinaryState

import Interfaces.BinaryState
import BinaryNumberDetector

class ZeroState : BinaryState {
    override fun handle(char: Char, context: BinaryNumberDetector) {
        when (char) {
            '1' -> context.setState(OneState())
            '0' -> context.setState(ZeroState())
            else -> context.setState(InvalidState())
        }
    }
}