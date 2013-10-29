package example.contrived.anotated.api;

import example.contrived.anotated.schema.UpdateRequest;
import example.contrived.anotated.schema.UpdateResponse;

import java.util.List;

/**
 * User: bryant.larsen
 */
public interface Updater {

  List<UpdateResponse> doFeed(UpdateRequest request);
}
