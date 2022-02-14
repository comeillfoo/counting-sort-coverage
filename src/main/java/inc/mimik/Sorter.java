package inc.mimik;

import java.util.Comparator;

public interface Sorter<T extends Comparable<T>> {
  T[] sort( T[] array );
}
