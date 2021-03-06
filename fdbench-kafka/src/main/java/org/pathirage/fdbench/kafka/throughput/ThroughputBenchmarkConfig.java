/**
 * Copyright 2016 Milinda Pathirage
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.pathirage.fdbench.kafka.throughput;

import com.typesafe.config.Config;
import org.pathirage.fdbench.kafka.KafkaBenchmarkConfig;

public class ThroughputBenchmarkConfig extends KafkaBenchmarkConfig {
  private static final String REUSE_MESSAGE = "kafka.throughput.bench.reuse.message";
  private static final String CONSUMER_TIMEOUT = "kafka.throughput.bench.consumer.timeout";

  public ThroughputBenchmarkConfig(Config rawConfig) {
    super(rawConfig);
  }

  public boolean isReuseMessage() {
    return getBool(REUSE_MESSAGE, false);
  }

  public int getConsumerTimeoutInSeconds() {
    return getInt(CONSUMER_TIMEOUT, 60);
  }
}
