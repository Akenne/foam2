/**
 * @license
 * Copyright 2017 The FOAM Authors. All Rights Reserved.
 * http://www.apache.org/licenses/LICENSE-2.0
 */

package foam.nanos.logger;

import foam.nanos.logger.NanoLogger;
import foam.nanos.logger.FileLogger;
import foam.nanos.logger.StdoutLogger;
import java.util.ArrayList; 
import java.util.List; 
import java.util.logging.*;
import java.io.IOException;

public class CompositeLogger
{
  public static void main(String args[]){
    CompositeLogger comp = new CompositeLogger();
    StdoutLogger test1234 = new StdoutLogger();
    FileLogger test12345 = new FileLogger();
    test1234.start();
    test12345.start();
    comp.add(test1234).add(test12345);
    comp.log("yoooo");
    comp.info("yoooo");
    comp.warning("yoooo");
    comp.error("yoooo");
    comp.debug("yoooo");
    comp.remove(test1234);
    comp.remove(test12345);
  }
  
  private List<Logger> childLoggers = new ArrayList<Logger>();

  public CompositeLogger add(Logger logger) {
    this.childLoggers.add(logger);
    return this;
  }

  public void remove(Logger logger) {
    childLoggers.remove(logger);
  }

  public void log(Object... args) {
    for (Logger logger : childLoggers) {
      logger.info(args);
    };
  }

  public void info(Object... args) {
    for (Logger logger : childLoggers) {
      logger.info(args);
    };
  }

  public void warning(Object... args) {
    for (Logger logger : childLoggers) {
      logger.warning(args);
    };
  }

  public void error(Object... args) {
    for (Logger logger : childLoggers) {
      logger.error(args);
    };
  }

  public void debug(Object...  args) {
    for (Logger logger : childLoggers) {
      logger.debug(args);
    };
  }
}
