import Interfaces.FloatingPointState
import StateControllers.FloatingPointState.StartState
import StateControllers.FloatingPointState.ValidDigitState

class FloatingPointDetector {
    private var state: FloatingPointState = StartState()

    fun setState(state: FloatingPointState) {
        this.state = state
    }

    fun handle(char: Char): Boolean {
        state.handle(char, this)
        return state is ValidDigitState
    }
}