package youngdevs.production.youngmoscowserver

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.kafka.core.KafkaTemplate
import org.springframework.stereotype.Service

@Service
class LogService(@Autowired private val kafkaTemplate: KafkaTemplate<String, String>) {

    fun sendLog(topic: String, message: String) {
        kafkaTemplate.send(topic, message)
    }
}
