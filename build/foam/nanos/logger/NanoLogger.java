/**
 * @license
 * Copyright 2017 The FOAM Authors. All Rights Reserved.
 * http://www.apache.org/licenses/LICENSE-2.0
 */

package foam.nanos.logger;

import foam.core.*;
import java.util.ArrayList; 
import java.util.List; 
import java.util.logging.*;
import java.io.IOException;

public class NanoLogger
  extends    ContextAwareSupport
{
  protected List<Logger> delegates_ = new ArrayList<Logger>();

  public void add(Logger logger) {
    logger.start();
    delegates_.add(logger);
  }

  public void remove(Logger logger) {
    delegates_.remove(logger);
  }

  public void log(Object... args) {
    for ( Logger logger : delegates_ ) {
      logger.info(args);
    };
  }

  public void info(Object... args) {
    for ( Logger logger : delegates_ ) {
      logger.info(args);
    };
  }

  public void warning(Object... args) {
    for ( Logger logger : delegates_ ) {
      logger.warning(args);
    };
  }

  public void error(Object... args) {
    for ( Logger logger : delegates_ ) {
      logger.error(args);
    };
  }

  public void debug(Object...  args) {
    for ( Logger logger : delegates_ ) {
      logger.debug(args);
    };
  }
}