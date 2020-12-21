package br.com.cardoso.controller

import br.com.cardoso.model.Alphabet
import br.com.cardoso.service.AlphabetService
import io.micronaut.http.HttpResponse
import io.micronaut.http.MutableHttpResponse
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

@Controller
class AlphabetController(private val alphabetService: AlphabetService) {

    @Get("/alphabet")
    fun getAlphabet(): MutableHttpResponse<Alphabet> = HttpResponse.ok(alphabetService.getAlphabet())
}