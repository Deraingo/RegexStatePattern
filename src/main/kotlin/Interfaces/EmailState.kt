package Interfaces

import EmailDetector

interface EmailState {
    fun handle(char: Char, context: EmailDetector)
}