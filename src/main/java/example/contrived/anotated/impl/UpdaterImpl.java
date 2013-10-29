package example.contrived.anotated.impl;

import example.contrived.anotated.api.Updater;
import example.contrived.anotated.schema.UpdateRequest;
import example.contrived.anotated.schema.UpdateResponse;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * User: bryant.larsen
 */
@Component
@Qualifier(value = "updater")
public class UpdaterImpl implements Updater {

  public UpdaterImpl() {
    System.out.println("In constructor of UpdaterImpl");
  }

  @Override
  public List<UpdateResponse> doFeed(UpdateRequest request) {
    System.out.println("In doFeed of Updater");
    List<UpdateResponse> response = new ArrayList<UpdateResponse>();
    return response;
  }
}
