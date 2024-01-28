package youngdevs.production.youngmoscowserver

import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class YoungMoscowServerApplication(private val sightseeingsService: SightseeingsService , private val eventsService: EventsService) : CommandLineRunner {

    override fun run(vararg args: String?) {
        sightseeingsService.loadSightseeingsFromFile("data/sightseeings.txt")
        eventsService.loadEventsFromFile("data/events.txt")
    }
}

fun main(args: Array<String>) {
    runApplication<YoungMoscowServerApplication>(*args)
}