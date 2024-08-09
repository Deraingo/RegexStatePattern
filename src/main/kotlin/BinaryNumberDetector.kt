import Interfaces.BinaryState
import Interfaces.Detector
import StateControllers.BinaryState.StartState
import StateControllers.BinaryState.ValidState

class BinaryNumberDetector : Detector {
    private var state: BinaryState = StartState()

    fun setState(state: BinaryState) {
        this.state = state
    }

    fun handle(char: Char): Boolean {
        state.handle(char, this)
        return state is ValidState
    }

    override fun run(input: String): Boolean {
        var lastChar: Char? = null
        for (char in input) {
            lastChar = char
            if (!handle(char)) {
                return false
            }
        }
        return state is ValidState && lastChar == '1'
    }
}