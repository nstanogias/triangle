import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by nickstanogias on 01/11/16.
 */
public class TriangleTypeTest {

    @Test
    public void shouldReturnInvalidWhenCriteriaNotMet(){
        assertEquals(TriangleType.INVALID, Triangle.triangleType(-1, 5, 5));
        assertEquals(TriangleType.INVALID, Triangle.triangleType(0, 5, 5));
        assertEquals(TriangleType.INVALID, Triangle.triangleType(1, 5, 7));
    }

    @Test
    public void shouldReturnScalene() {
        assertEquals(TriangleType.SCALENE, Triangle.triangleType(3, 4, 5));
    }

    @Test
    public void shouldReturnIsosceles() {
        assertEquals(TriangleType.ISOSCELES, Triangle.triangleType(5, 5, 10));
    }

    @Test
    public void shouldReturnEquilateral() {
        assertEquals(TriangleType.EQUILATERAL, Triangle.triangleType(5, 5, 5));
    }
}
