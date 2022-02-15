package inc.mimik;

import java.util.Comparator;

public interface Sorter<T extends Comparable<T>> {
  T[] sort( T[] array );

  T[] sort( T[] array, BreadCrumbs<T> bc );
}
