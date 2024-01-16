package youngdevs.production.youngmoscowserver

import org.slf4j.LoggerFactory
import org.springframework.stereotype.Service
import java.io.File
import java.io.FileNotFoundException

@Service
class EventsService(private val eventsRepository: EventsRepository) {

    private val logger = LoggerFactory.getLogger(SightseeingsService::class.java)

    suspend fun getEvents(): List<Event> {
        return eventsRepository.findAll()
    }

    fun loadEventsFromFile(filePath: String) {
        try {
            val file = File(filePath)
            val lines = file.readLines()
            for (line in lines) {
                val parts = line.split('|')
                if (parts.size == 5) {
                    val id = parts[0].toLongOrNull()
                    val name = parts[1]
                    val description = parts[2]
                    val address = parts[3]
                    val image = parts[4]

                    if (id != null) {
                        val event = Event(id, name, description, address, image)
                        eventsRepository.save(event)
                    }
                }
            }
            logger.info("Events loaded from file successfully")
        } catch (e: FileNotFoundException) {
            logger.error("File not found: $filePath", e)
        } catch (e: Exception) {
            logger.error("Error loading events from file: ${e.message}", e)
        }
    }
}
