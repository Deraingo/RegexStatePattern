package Interfaces

import BinaryNumberDetector

interface BinaryState {
    fun handle(char: Char, context: BinaryNumberDetector)
}
