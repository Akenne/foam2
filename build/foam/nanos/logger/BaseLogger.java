/**
 * @license
 * Copyright 2017 The FOAM Authors. All Rights Reserved.
 * http://www.apache.org/licenses/LICENSE-2.0
 */

package foam.nanos.logger;

import foam.nanos.*;

public class BaseLogger extends NanoLogger {
	public static void main(String args[]){
	  BaseLogger baseExample = new BaseLogger();
	  System.out.println("BaseLogger: Logs to stdout and /nano.log");
	  System.out.println("~~~~~~~~~~~~~~~~~~~~~");
	  baseExample.info("this is an info message");
	  baseExample.warning("this is a warning message");
	  baseExample.error("this is an error message");
	  baseExample.debug("this is a debug message");
	  System.out.println("~~~~~~~~~~~~~~~~~~~~~");

	  NanoLogger fileExample = new NanoLogger();
	  FileLogger file = new FileLogger();
	  System.out.println("only fileLogger: Logs to just /nano.log");
	  file.start();
	  System.out.println("~~~~~~~~~~~~~~~~~~~~~");
	  fileExample.add(file);
	  fileExample.info("this is an info message");
	  fileExample.warning("this is a warning message");
	  fileExample.error("this is an error message");
	  fileExample.debug("this is a debug message");
	  fileExample.remove(file);

	  System.out.println("~~~~~~~~~~~~~~~~~~~~~");
	}

    public BaseLogger() {
    	FileLogger fl = new FileLogger();
    	StdoutLogger stdl = new StdoutLogger();
    	add(fl);
    	add(stdl);
    }

}