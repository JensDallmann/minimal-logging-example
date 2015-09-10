package de.jd.legacyComponent;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Legacy component which produces much output for different log levels
 */
public class WildLogging {
  private static final Logger LOGGER = LoggerFactory.getLogger(WildLogging.class);

  public WildLogging() {
    for(int i = 0; i < 100; i++) {
      LOGGER.info("info wild logger");
    }
    LOGGER.warn("warn wild logger");
    LOGGER.error("error wild logger");
  }
}
