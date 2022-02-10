package inc.mimik;

import java.util.Comparator;

public interface Sorter<T> {
  void sort( Comparable<T>[] array );

  void sort( T[] array, Comparator<T> comparator );
}
