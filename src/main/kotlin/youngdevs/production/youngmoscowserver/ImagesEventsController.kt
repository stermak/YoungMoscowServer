package youngdevs.production.youngmoscowserver

import org.springframework.core.io.InputStreamResource
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.io.File
import java.io.FileInputStream

@RestController
@RequestMapping("/api/imagesEvents")
class ImagesEventsController {

    private val imagesDirectory = File("events")

    @GetMapping("/{imageName}")
    fun getImage(@PathVariable imageName: String): ResponseEntity<InputStreamResource> {
        val imagePath = imagesDirectory.toPath().resolve(imageName.trim()) // Убедитесь, что нет пробелов перед именем файла
        val imageFile = imagePath.toFile()
        val inputStream = FileInputStream(imageFile)

        return ResponseEntity.ok()
            .contentType(MediaType.parseMediaType("image/jpeg"))
            .body(InputStreamResource(inputStream))
    }
}
