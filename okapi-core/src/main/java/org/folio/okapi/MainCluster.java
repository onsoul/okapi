package org.folio.okapi;

import io.vertx.core.logging.Logger;
import static java.lang.System.*;
import org.folio.okapi.common.OkapiLogger;

public class MainCluster {
  private MainCluster() {
    throw new IllegalAccessError("MainCluster");
  }

  public static void main(String[] args) {
    MainDeploy d = new MainDeploy();
    d.init(args, res -> {
      if (res.failed()) {
        Logger logger = OkapiLogger.get();
        logger.error(res.cause());
        exit(1);
      }
    });
  }

}
