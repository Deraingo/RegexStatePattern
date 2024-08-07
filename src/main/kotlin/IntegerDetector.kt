import Interfaces.IntegerState
import StateControllers.IntegerState.StartState
import StateControllers.IntegerState.ValidDigitState

class IntegerDetector {
    private var state: IntegerState = StartState()

    fun setState(state: IntegerState) {
        this.state = state
    }

    fun handle(char: Char): Boolean {
        state.handle(char, this)
        return state is ValidDigitState
    }
}