import Interfaces.Detector
import Interfaces.FloatingPointState
import StateControllers.FloatingPointState.InvalidState
import StateControllers.FloatingPointState.StartState
import StateControllers.FloatingPointState.ValidDigitAfterPeriodState
import StateControllers.FloatingPointState.ValidDigitState

class FloatingPointDetector : Detector {
    private var state: FloatingPointState = StartState()

    fun setState(state: FloatingPointState) {
        this.state = state
    }

    fun handle(char: Char): Boolean {
        state.handle(char, this)
        return state is ValidDigitState
    }

    override fun run(input: String): Boolean {
        for (char in input) {
            state.handle(char, this)
            if (state is InvalidState) return false
        }
        return state is ValidDigitState || state is ValidDigitAfterPeriodState
    }
}