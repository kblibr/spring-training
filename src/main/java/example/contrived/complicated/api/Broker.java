package example.contrived.complicated.api;

/**
 * User: bryant.larsen
 */
public interface Broker {
  void doSearch();

  void doMatch();

  String standardize(String nameOrPlace);
}
