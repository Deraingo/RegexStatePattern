package StateControllers.BinaryState

import BinaryNumberDetector
import Interfaces.BinaryState

class InvalidState : BinaryState {
    override fun handle(char: Char, context: BinaryNumberDetector) {
        // Remain in this state
    }
}