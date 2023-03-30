package youngdevs.production.youngmoscowserver

import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class YoungMoscowServerApplication(private val sightseeingsService: SightseeingsService) : CommandLineRunner {

    override fun run(vararg args: String?) {
        sightseeingsService.loadSightseeingsFromFile("data/sightseeings.txt")
    }
}

fun main(args: Array<String>) {
    runApplication<YoungMoscowServerApplication>(*args)
}
