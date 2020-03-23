import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

//Edit configuration -> Junit -> Test Kind -> Tag and give Tag Name
@Tag("regression")
class TagTest {

    @Test
    void groupedAssertions() {
                //then
        assertAll("Test Props Set",
                () -> assertEquals("Joe", "Joe"),
                () -> assertEquals("Buck", "Buck"));
    }

    @Test
    void groupedAssertionMsgs() {

        //then
        assertAll("Test Props Set",
                () -> assertEquals("Joe", "Joe", "First Name Failed"),
                () -> assertEquals("Buck", "Buck", "Last Name Failed"));
    }
}