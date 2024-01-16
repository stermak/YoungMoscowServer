//package youngdevs.production.youngmoscowserver
//
//import org.junit.jupiter.api.Assertions.assertEquals
//import org.junit.jupiter.api.Assertions.assertNotNull
//import org.junit.jupiter.api.Test
//import org.junit.jupiter.api.extension.ExtendWith
//import org.mockito.InjectMocks
//import org.mockito.Mock
//import org.mockito.Mockito.`when`
//import org.mockito.junit.jupiter.MockitoExtension
//import org.springframework.beans.factory.annotation.Autowired
//import org.springframework.boot.test.context.SpringBootTest
//import org.springframework.context.ApplicationContext
//import org.springframework.http.HttpStatus
//
//@SpringBootTest
//class YoungMoscowServerApplicationTests {
//
//    @Mock
//    private lateinit var sightseeingsRepository: SightseeingsRepository
//
//    @InjectMocks
//    private lateinit var sightseeingsService: SightseeingsService
//
//    @Test
//    suspend fun getSightseeings_ReturnsList() {
//        val mockSightseeingList = listOf(Sightseeing(name = "Test Sightseeing"))
            //                `when`(sightseeingsRepository.findAll()).thenReturn(mockSightseeingList)
            //
            //                val result = sightseeingsService.getSightseeings()
                //
                //                    assertEquals(mockSightseeingList, result)
                //                }
//
//    @InjectMocks
//    private lateinit var imagesController: ImagesController
//
//    @Test
//    fun getImage_ReturnsImage() {
//        val imageName = "bolotnaya.jpg"
            //
            //        val response = imagesController.getImage(imageName)
                //
                //        assertNotNull(response)
                //        assertEquals(HttpStatus.OK, response.statusCode)
                //    }
//
//    @Autowired
//    private lateinit var context: ApplicationContext
//
//    @Test
//    fun contextLoads() {
//        assertNotNull(context)
            //    }
//}
