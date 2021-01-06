package kyu7;

import org.assertj.core.api.SoftAssertions;
import org.junit.Test;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.IntStream;

public class Kata014Test {

    @Test
    public void fixedTests() {
        SoftAssertions softly = new SoftAssertions();
        int[][] params = new int[][]{
                {45, 11, 100, 5, 45, 0},
                {354, 1023230, 0, 0, 0, 354},
                {939, 3, 694, 1, 346, 0},
                {215, 41, 82100, 20, 215, 0},
                {113, 0, 52, 0, 26, 0}
        };
        IntStream.range(0, params.length).forEach(i -> {
            int[] caseParams = params[i];
            softly.assertThat(Kata014.burner(caseParams[0], caseParams[1], caseParams[2]))
                    .as(String.format("burner(%s, %s, %s)", caseParams[0], caseParams[1], caseParams[2]))
                    .containsExactly(caseParams[3], caseParams[4], caseParams[5]);
        });
        softly.assertAll();
    }
}