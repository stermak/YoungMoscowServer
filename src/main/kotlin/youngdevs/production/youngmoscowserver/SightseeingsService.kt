package youngdevs.production.youngmoscowserver

import org.slf4j.LoggerFactory
import org.springframework.stereotype.Service
import java.io.File
import java.io.FileNotFoundException

@Service
class SightseeingsService(private val sightseeingsRepository: SightseeingsRepository) {

    private val logger = LoggerFactory.getLogger(SightseeingsService::class.java)

    suspend fun getSightseeings(): List<Sightseeing> {
        return sightseeingsRepository.findAll()
    }

    fun loadSightseeingsFromFile(filePath: String) {
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
                        val sightseeing = Sightseeing(id, name, description, address, image)
                        sightseeingsRepository.save(sightseeing)
                    }
                }
            }
            logger.info("Sightseeings loaded from file successfully")
        } catch (e: FileNotFoundException) {
            logger.error("File not found: $filePath", e)
        } catch (e: Exception) {
            logger.error("Error loading sightseeings from file: ${e.message}", e)
        }
    }
}

