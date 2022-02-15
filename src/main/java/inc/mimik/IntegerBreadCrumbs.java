package inc.mimik;

public class IntegerBreadCrumbs implements BreadCrumbs<Integer> {

  public String getTrace( ) {
    return trace;
  }

  private String trace = "";

  private static char hashInt( Integer hash ) {
    return (char) ( 'a' + hash );
  }

  @Override
  public void appendCrumb( Integer hash ) {
    trace += hashInt( hash );
  }
}
