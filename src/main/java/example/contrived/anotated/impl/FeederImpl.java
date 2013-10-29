package example.contrived.anotated.impl;

import example.contrived.anotated.api.Feeder;
import example.contrived.anotated.api.Updater;
import example.contrived.anotated.schema.UpdateRequest;
import example.contrived.anotated.schema.UpdateResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * User: bryant.larsen
 */
@Component
public class FeederImpl implements Feeder {

  private final Updater updater;

  @Autowired
  public FeederImpl(Updater updater) {
    System.out.println("In the constructor of FeederImpl");
    this.updater = updater;
  }

  @Override
  public List<UpdateResponse> doFeed(UpdateRequest request) {
    return updater.doFeed(request);
  }
}
