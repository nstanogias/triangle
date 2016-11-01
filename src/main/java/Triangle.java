/**
 * Created by nickstanogias on 01/11/16.
 */
public class Triangle {

    public static TriangleType triangleType(int aSide, int bSide, int cSide) {
        if(!isValidTriangle(aSide, bSide, cSide)) return TriangleType.INVALID;
        if(aSide == bSide && bSide == cSide) return TriangleType.EQUILATERAL;
        if(aSide == bSide || bSide == cSide || cSide == aSide) return TriangleType.ISOSCELES;

        return TriangleType.SCALENE;
    }


    public static boolean isValidTriangle(int sideOne, int sideTwo, int sideThree) {
        if (sideOne > sideTwo + sideThree ||
                sideTwo > sideThree + sideOne ||
                sideThree > sideOne + sideTwo) {
            return false;
        }
        else if (sideOne <= 0 || sideTwo <= 0 || sideThree <= 0) {
            return false;
        }
        else {
            return true;
        }
    }
}
