package Interfaces

import PasswordDetector

interface PasswordState {
    fun handle(char: Char, context: PasswordDetector)
}