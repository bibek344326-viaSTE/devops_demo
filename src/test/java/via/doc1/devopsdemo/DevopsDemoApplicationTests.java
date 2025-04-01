package via.doc1.devopsdemo;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
class DevopsDemoApplicationTests {

    @SuppressWarnings("unused")
    private MockMvc mockMvc;

    @Mock
    private DevopsDemoApplication devopsDemoApplication;

    @Test
    void testMain() {
        DevopsDemoApplication.main(new String[] {});
    }

    @Test
    void contextLoads() {
    }

    @Test
    String testIndex() {
        return devopsDemoApplication.index();
    }

}
