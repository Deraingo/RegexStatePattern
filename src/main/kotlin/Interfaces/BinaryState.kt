package Interfaces

import IntegerDetector

interface BinaryState {
    fun handle(char: Char, context: IntegerDetector)
}
