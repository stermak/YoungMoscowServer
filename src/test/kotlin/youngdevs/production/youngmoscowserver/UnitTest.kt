package youngdevs.production.youngmoscowserver

import FakeEventsRepository
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class EventsServiceTest {

    @Test
    fun testCountEventsWithLongDescription() {
        val events = listOf(
            Event(1, "Event1", "Short", "Address1", "Image1"),
            Event(2, "Event2", "Long Description", "Address2", "Image2"),
            Event(3, "Event3", "Another Long Description", "Address3", "Image3")
        )
        val eventsRepository = FakeEventsRepository(events)
        val service = EventsService(eventsRepository)

        val count = service.countEventsWithLongDescription(10)

        assertEquals(2, count)
    }
}
