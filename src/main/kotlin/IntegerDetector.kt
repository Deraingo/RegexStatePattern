import Interfaces.IntegerState
import StateControllers.IntegerState.StartState
import StateControllers.IntegerState.ValidDigitState

class IntegerDetector {
    private var state: IntegerState = StartState()

    fun setState(state: IntegerState) {
        this.state = state
    }

    fun handle(input: Char): Boolean {
        state.handle(input, this)
        return state is ValidDigitState
    }

    fun run(input: String): Boolean {
        for (char in input) {
            if (!handle(char)) {
                return false
            }
        }
        return state is ValidDigitState
    }
}