package youngdevs.production.youngmoscowserver

import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/events")
class EventsController(private val eventsService: EventsService) {

    private val logger = LoggerFactory.getLogger(SightseeingsController::class.java)

    @GetMapping
    suspend fun getEvents(): List<Event> {
        return try {
            eventsService.getEvents().also {
                logger.info("Retrieved ${it.size} events")
            }
        } catch (e: Exception) {
            logger.error("Error retrieving events: ${e.message}", e)
            emptyList()
        }
    }
}