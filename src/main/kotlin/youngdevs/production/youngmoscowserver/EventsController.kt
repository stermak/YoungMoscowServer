package youngdevs.production.youngmoscowserver

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/events")
class EventsController(private val eventsService: EventsService) {

    @GetMapping
    suspend fun getEvents(): List<Event> {
        return try {
            eventsService.getEvents()
        } catch (e: Exception) {
            // Обработка ошибки
            emptyList()
        }
    }
}