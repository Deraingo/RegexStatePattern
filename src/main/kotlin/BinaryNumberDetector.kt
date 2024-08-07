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
}