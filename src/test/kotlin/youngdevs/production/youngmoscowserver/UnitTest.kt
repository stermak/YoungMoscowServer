package youngdevs.production.youngmoscowserver

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.mockito.Mockito.mock

class UnitTest {
}

class TestFileReader(private val lines: List<String>) : FileReaderInterface {
    override fun readLines(filePath: String): List<String> {
        return lines
    }
}

class EventsServiceTest {

    @Test
    fun testLoadEventsFromFile() {
        val testLines = listOf("1|Event1|Description1|Address1|Image1", "2|Event2|Description2|Address2|Image2")
        val testFileReader = TestFileReader(testLines)
        val service = EventsService(mock(EventsRepository::class.java), testFileReader)

        val loadedCount = service.loadEventsFromFile("testPath")

        assertEquals(2, loadedCount)
    }
}

