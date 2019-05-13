package pkg;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.*;

class ExtEuclideanTest {
    private ExtEuclidean euc;
    @BeforeEach
    void init() {
        euc = new ExtEuclidean();
    }
    @Test
    void EXTEuclidean() {


        euc.EXTEuclidean(BigInteger.valueOf(38808),BigInteger.valueOf(5));
        assertEquals(BigInteger.valueOf(8) ,euc.yn);
    }
}