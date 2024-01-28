package youngdevs.production.youngmoscowserver

import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@CrossOrigin(origins = arrayOf("https://ermak-devops.ru"))
@RestController
@RequestMapping("/api/sightseeings")
class SightseeingsController(private val sightseeingsService: SightseeingsService) {

    @GetMapping
    suspend fun getSightseeings(): List<Sightseeing> {
        return try {
            sightseeingsService.getSightseeings()
        } catch (e: Exception) {
            // Обработка ошибки
            emptyList()
        }
    }
}