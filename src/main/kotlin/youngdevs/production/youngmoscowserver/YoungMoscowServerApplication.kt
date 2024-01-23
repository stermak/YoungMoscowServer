package youngdevs.production.youngmoscowserver

import org.slf4j.LoggerFactory
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class YoungMoscowServerApplication(private val sightseeingsService: SightseeingsService, private val eventsService: EventsService) : CommandLineRunner {

    private val logger = LoggerFactory.getLogger(YoungMoscowServerApplication::class.java)

    override fun run(vararg args: String?) {
        try {
            sightseeingsService.loadSightseeingsFromFile("data/sightseeings.txt")
            logger.info("Sightseeings loaded successfully")
            eventsService.loadEventsFromFile("data/events.txt")
            logger.info("Events loaded successfully")
        } catch (e: Exception) {
            logger.error("Error loading data: ${e.message}", e)
        }
    }
}

fun main(args: Array<String>) {
    runApplication<YoungMoscowServerApplication>(*args)
}

//fun main(args: Array<String>) {
//    runApplication<YoungMoscowServerApplication>(*args)
        //}
//fun main(args: Array<String>) {
//    runApplication<YoungMoscowServerApplication>(*args)
//}
//fun main(args: Array<String>) {
//    runApplication<YoungMoscowServerApplication>(*args)
//}
//fun main(args: Array<String>) {
//    runApplication<YoungMoscowServerApplication>(*args)
//}
//fun main(args: Array<String>) {
//    runApplication<YoungMoscowServerApplication>(*args)
//}