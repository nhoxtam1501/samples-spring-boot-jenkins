package dev.ducku.samplesspringjenkins;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SamplesSpringJenkinsApplicationTests {

    @Test
    void contextLoads() {
        System.out.println("Test case executing....");
    }

//    @Test
//    @DisplayName("thisTestCaseShouldBeFailed")
//    void test1() {
//        Assertions.assertThat(false).isEqualTo(true);
//    }

}
