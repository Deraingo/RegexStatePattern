package StateControllers.IntegerState

import IntegerDetector
import Interfaces.IntegerState

class InvalidState : IntegerState {
    override fun handle(char: Char, context: IntegerDetector) {
    }
}