package inc.mimik;

import java.util.Arrays;

public class IntegerCountingSorter implements Sorter<Integer> {

  public final Integer MAX_LIMIT;
  public final Integer MIN_LIMIT;

  public IntegerCountingSorter( Integer maxLimit, Integer minLimit ) {
    MAX_LIMIT = maxLimit;
    MIN_LIMIT = minLimit;
  }

  private int getKey( Integer number ) {
    return number - MIN_LIMIT;
  }

  @Override
  public Integer[] sort( Integer[] array ) {
    Integer[] sorted = new Integer[ array.length ];
    final int k = MAX_LIMIT - MIN_LIMIT;
    int[] counts = new int[ k + 1 ];
    Arrays.fill( counts, 0 );

    for ( Integer number : array ) {
      final int j = getKey( number );
      counts[ j ]++;
    }

    for ( int i = 1; i < k + 1; ++i )
      counts[ i ] += counts[ i - 1 ];

    for ( int i = array.length - 1; i >= 0; --i ) {
      final int j = getKey( array[ i ] );
      counts[ j ]--;
      sorted[ counts[ j ] ] = array[ i ];
    }

    return sorted;
  }
}
