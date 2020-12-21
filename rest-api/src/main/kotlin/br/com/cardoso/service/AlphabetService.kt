package br.com.cardoso.service

import br.com.cardoso.model.Alphabet
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import javax.inject.Singleton

@Singleton
open class AlphabetService {
    private val logger: Logger = LoggerFactory.getLogger(AlphabetService::class.java)

    fun getAlphabet(): Alphabet {
        logger.info("Requisição para obter o Alphabet REST")
        return Alphabet("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k",
                "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w",
                "x", "y", "z")
    }
}