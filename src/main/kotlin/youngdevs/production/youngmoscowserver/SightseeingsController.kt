package youngdevs.production.youngmoscowserver

import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/sightseeings")
class SightseeingsController(private val sightseeingsService: SightseeingsService) {

    private val logger = LoggerFactory.getLogger(SightseeingsController::class.java)

    @GetMapping
    suspend fun getSightseeings(): List<Sightseeing> {
        return try {
            sightseeingsService.getSightseeings().also {
                logger.info("Retrieved ${it.size} sightseeings")
            }
        } catch (e: Exception) {
            logger.error("Error retrieving sightseeings: ${e.message}", e)
            emptyList()
        }
    }
}
