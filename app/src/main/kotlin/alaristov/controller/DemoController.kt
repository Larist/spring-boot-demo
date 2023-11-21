package alaristov.controller

import org.springframework.context.MessageSource
import org.springframework.context.i18n.LocaleContextHolder
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/demo")
class DemoController(
    private val messageSource: MessageSource
) {

    @GetMapping("/test")
    fun test(): String {
        return messageSource.getMessage("test", null, "test", LocaleContextHolder.getLocale())!!
    }
}