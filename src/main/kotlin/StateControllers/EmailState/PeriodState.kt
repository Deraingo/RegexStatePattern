package StateControllers.EmailState

import Interfaces.EmailState
import EmailDetector
class PeriodState : EmailState {
    override fun handle(char: Char, context: EmailDetector) {
        // Period state logic
    }
}