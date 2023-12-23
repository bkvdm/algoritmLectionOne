package tel.bvm.algoritmLectionOne;

import net.bytebuddy.asm.MemberSubstitution;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class StringListImplTest {

    private final StringList stringList = new StringListImpl();

//    public static Stream<Arguments> add() {
//        return Stream.of(Arguments.of(11, 11),
//                Arguments.of(21, 21),
//                Arguments.of(50, 50));
//    }

//@BeforeEach
//public void setUp() {
//    String[] storage = new String[]{
//            "0 - zero",
//            "1 - one",
//            "2 - two",
//            "3 - three",
//            "4 - four",
//            "5 - five",
//            "6 - six",
//            "7 - seven",
//            "8 - eight",
//            "9 - nine"};
//}

//    @ParameterizedTest
//    @MethodSource("add")
//    void addedVerify(String actual, String expected) {
//        assertEquals(expected, stringList.add(actual));
//    }


    @Test
    void testAdd() {
        String expected = "one";
        assertEquals(expected, stringList.add("one"));
    }

    @Test
    void set() {
    }

    @Test
    void remove() {
    }

    @Test
    void testRemove() {
    }

    @Test
    void contains() {
    }

    @Test
    void indexOf() {
    }

    @Test
    void lastIndexOf() {
    }

    @Test
    void get() {
    }

    @Test
    void testEquals() {
    }

    @Test
    void size() {
    }

    @Test
    void isEmpty() {
    }

    @Test
    void clear() {
    }

    @Test
    void toArray() {
    }
}