import Interfaces.Detector
import Interfaces.PasswordState
import StateControllers.PasswordState.StartState
import StateControllers.PasswordState.ValidState

class PasswordDetector : Detector {
    private var state: PasswordState = StartState()

    fun setState(state: PasswordState) {
        this.state = state
    }

    fun handle(char: Char): Boolean {
        state.handle(char, this)
        return state is ValidState
    }

    override fun run(password: String): Boolean {
        if (password.isEmpty()) return false

        val hasCapital = password.any { it.isUpperCase() }
        val hasSpecial = password.any { it in "!@#$%^&*()-_+=<>?/,.|;:" }
        val endsWithSpecial = password.lastOrNull()!! in "!@#$%^&*()-_+=<>?/,.|;:"

        return hasCapital && hasSpecial && !endsWithSpecial
    }
}