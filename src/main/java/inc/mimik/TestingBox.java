package inc.mimik;

import java.util.Arrays;
import java.util.stream.IntStream;

public class TestingBox {

  public static void main( String[] args ) {

    int[] a = { 23, 21, 17, 13, 20, 23, 13, 8, 19, 0, 14, 1, -1, 9, 6, 17, 17, 6, 16, 9, 22, 21, 26, 26, 24, 25, 11, 0, 7, 12 };
    int[] b = Arrays.stream( a ).parallel().map( ( e ) -> ( e - 8 ) ).toArray();
    final int maxB = Arrays.stream( b ).max().getAsInt();
    final int minB = Arrays.stream( b ).min().getAsInt();

    IntegerCountingSorter sorter = new IntegerCountingSorter( maxB, minB );

    Integer[] c = sorter.sort( IntStream.of( b ).boxed().toArray( Integer[]::new ) );

    for ( int ci : c )
      System.out.println( ci );
  }
}
