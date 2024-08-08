import Interfaces.PasswordState
import StateControllers.PasswordState.StartState
import StateControllers.PasswordState.ValidState

class PasswordDetector {
    private var state: PasswordState = StartState()

    fun setState(state: PasswordState) {
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