package youngdevs.production.youngmoscowserver

import jakarta.persistence.*

@Entity
data class Event(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,
    val name: String = "",
    @Column(length = 1000)
    val description: String = "",
    val address: String = "",
    val image: String = ""
)