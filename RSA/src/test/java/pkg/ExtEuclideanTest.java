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

        //euc.EXTEuclidean(BigInteger.valueOf(213160605290537443321700355577),437856621682617240993741139793);
        //assertEquals(BigInteger.ONE ,euc.X);
    }
}