import Interfaces.EmailState
import StateControllers.EmailState.PeriodState
import StateControllers.EmailState.StartState

class EmailDetector {
    private var state: EmailState = StartState()

    fun setState(state: EmailState) {
        this.state = state
    }

    fun handle(char: Char): Boolean {
        state.handle(char, this)
        return state is PeriodState
    }
}
