package StateControllers.FloatingPointState

import FloatingPointDetector
import Interfaces.FloatingPointState

class InvalidState : FloatingPointState {
    override fun handle(char: Char, context: FloatingPointDetector) {
    }
}