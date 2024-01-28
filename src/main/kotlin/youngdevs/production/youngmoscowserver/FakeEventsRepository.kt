import org.springframework.data.domain.Example
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.domain.Sort
import org.springframework.data.repository.query.FluentQuery
import youngdevs.production.youngmoscowserver.Event
import youngdevs.production.youngmoscowserver.EventsRepository
import java.util.*
import java.util.function.Function

class FakeEventsRepository(private val events: List<Event>) : EventsRepository {
    override fun <S : Event?> save(entity: S & Any): S & Any {
        TODO("Not yet implemented")
    }

    override fun <S : Event?> saveAll(entities: MutableIterable<S>): MutableList<S> {
        TODO("Not yet implemented")
    }

    override fun existsById(id: Long): Boolean {
        TODO("Not yet implemented")
    }

    override fun findById(id: Long): Optional<Event> {
        TODO("Not yet implemented")
    }

    override fun <S : Event?> findAll(example: Example<S>): MutableList<S> {
        TODO("Not yet implemented")
    }

    override fun <S : Event?> findAll(example: Example<S>, sort: Sort): MutableList<S> {
        TODO("Not yet implemented")
    }

    override fun findAll(): List<Event> {
        return events
    }

    override fun findAll(sort: Sort): MutableList<Event> {
        TODO("Not yet implemented")
    }

    override fun findAll(pageable: Pageable): Page<Event> {
        TODO("Not yet implemented")
    }

    override fun <S : Event?> findAll(example: Example<S>, pageable: Pageable): Page<S> {
        TODO("Not yet implemented")
    }

    override fun findAllById(ids: MutableIterable<Long>): MutableList<Event> {
        TODO("Not yet implemented")
    }

    override fun count(): Long {
        TODO("Not yet implemented")
    }

    override fun <S : Event?> count(example: Example<S>): Long {
        TODO("Not yet implemented")
    }

    override fun delete(entity: Event) {
        TODO("Not yet implemented")
    }

    override fun deleteAllById(ids: MutableIterable<Long>) {
        TODO("Not yet implemented")
    }

    override fun deleteAll(entities: MutableIterable<Event>) {
        TODO("Not yet implemented")
    }

    override fun deleteAll() {
        TODO("Not yet implemented")
    }

    override fun <S : Event?> findOne(example: Example<S>): Optional<S> {
        TODO("Not yet implemented")
    }

    override fun <S : Event?> exists(example: Example<S>): Boolean {
        TODO("Not yet implemented")
    }

    override fun <S : Event?, R : Any?> findBy(
        example: Example<S>,
        queryFunction: Function<FluentQuery.FetchableFluentQuery<S>, R>
    ): R & Any {
        TODO("Not yet implemented")
    }

    override fun flush() {
        TODO("Not yet implemented")
    }

    override fun <S : Event?> saveAndFlush(entity: S & Any): S & Any {
        TODO("Not yet implemented")
    }

    override fun <S : Event?> saveAllAndFlush(entities: MutableIterable<S>): MutableList<S> {
        TODO("Not yet implemented")
    }

    override fun deleteAllInBatch(entities: MutableIterable<Event>) {
        TODO("Not yet implemented")
    }

    override fun deleteAllInBatch() {
        TODO("Not yet implemented")
    }

    override fun deleteAllByIdInBatch(ids: MutableIterable<Long>) {
        TODO("Not yet implemented")
    }

    override fun getReferenceById(id: Long): Event {
        TODO("Not yet implemented")
    }

    override fun getById(id: Long): Event {
        TODO("Not yet implemented")
    }

    override fun getOne(id: Long): Event {
        TODO("Not yet implemented")
    }

    override fun deleteById(id: Long) {
        TODO("Not yet implemented")
    }
}
