package youngdevs.production.youngmoscowserver

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*
import java.sql.DriverManager

class PostgresIntegrationTest {

    @Test
    fun `test connection to PostgreSQL database`() {
        val url = "jdbc:h2:mem:testdb"

        val connection = DriverManager.getConnection(url)
        assertNotNull(connection, "Connection should not be null")

        val statement = connection.createStatement()
        val resultSet = statement.executeQuery("SELECT 1")
        assertTrue(resultSet.next(), "Result set should have at least one row")
        assertEquals(1, resultSet.getInt(1), "The query result should be 1")

        resultSet.close()
        statement.close()
        connection.close()
    }
}

