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
}