import Interfaces.Detector
import Interfaces.EmailState
import StateControllers.EmailState.InvalidState
import StateControllers.EmailState.PeriodState
import StateControllers.EmailState.StartState
import StateControllers.EmailState.ValidState

class EmailDetector : Detector {
    private var state: EmailState = StartState()

    fun setState(state: EmailState) {
        this.state = state
    }

    fun handle(char: Char): Boolean {
        state.handle(char, this)
        return state !is InvalidState
    }

    override fun run(input: String): Boolean {
        for (char in input) {
            if (!handle(char)) {
                return false
            }
        }
        return state is ValidState
    }
}
