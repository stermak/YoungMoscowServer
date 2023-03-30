package youngdevs.production.youngmoscowserver

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface SightseeingsRepository : JpaRepository<Sightseeing, Long>