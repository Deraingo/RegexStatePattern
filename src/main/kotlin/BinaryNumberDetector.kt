import Interfaces.BinaryState
import StateControllers.BinaryState.StartState
import StateControllers.BinaryState.ValidState

class BinaryNumberDetector {
    private var state: BinaryState = StartState()

    fun setState(state: BinaryState) {
        this.state = state
    }

    fun handle(char: Char): Boolean {
        state.handle(char, this)
        return state is ValidState
    }

    fun run(input: String): Boolean {
        for (char in input) {
            if (!handle(char)) {
                return false
            }
        }
        return state is ValidState
    }
}