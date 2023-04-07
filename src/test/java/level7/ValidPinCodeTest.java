package level7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ValidPinCodeTest {
    @Test
    void ValidPin1177() {
        Boolean validcode = ValidPinCode.validatePin("1177");
        assertEquals(true ,validcode);

    }
    @Test
    void NotValidCode22555(){
        Boolean notValid = ValidPinCode.validatePin("22555");
        assertEquals(false, notValid);
    }
}
