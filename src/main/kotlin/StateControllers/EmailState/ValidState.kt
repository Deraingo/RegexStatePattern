package StateControllers.EmailState

import EmailDetector
import Interfaces.EmailState

class ValidState : EmailState{
    override fun handle(char: Char, context: EmailDetector) {
        when{
            char.isLetterOrDigit() || char == '.' -> {
                context.setState(this)
            }
            char == '@' -> {
                context.setState(DomainState())
            }
            else -> {
                context.setState(InvalidState())
            }
        }
    }
}