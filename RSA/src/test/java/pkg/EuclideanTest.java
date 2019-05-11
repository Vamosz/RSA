package pkg;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.*;

class EuclideanTest {

    @org.junit.jupiter.api.Test
    void Euclidean() {
        assertEquals(BigInteger.valueOf(1),Euclidean.Euclidean(BigInteger.valueOf(122976),BigInteger.valueOf(5)));
    }
}