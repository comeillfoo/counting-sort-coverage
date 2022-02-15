package inc.mimik;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntegerCountingSorterTest {

  @Test
  public void compareTraces() {
    final String expectedTrace = "xqpehmcbfohicgmwjtcrcnlakqbcdefghijklmnopqrstuvwxqvknaalonrcfrwcetxjmwymqgicdilhkosfhbbccmphjegptquxz";
    final int[] input = { 23, 16, 15, 4, 7, 12, 2, 1, 5, 14, 7, 8, 2, 6, 12, 22, 9, 19, 2, 17, 2, 13, 11, 0, 10, 16 };
    final int maxA = Arrays.stream( input ).max().getAsInt();
    final int minA = Arrays.stream( input ).min().getAsInt();

    IntegerCountingSorter sorter = new IntegerCountingSorter( maxA, minA );
    IntegerBreadCrumbs bc = new IntegerBreadCrumbs();

    Integer[] sorted = sorter.sort( IntStream.of( input ).boxed().toArray( Integer[]::new ), bc );

    final String actualTrace = bc.getTrace();

    assertEquals( actualTrace, expectedTrace );
  }
}
