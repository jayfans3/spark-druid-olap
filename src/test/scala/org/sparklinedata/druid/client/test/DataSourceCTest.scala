/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.sparklinedata.druid.client.test

import org.apache.spark.sql.SPLLogging
import org.scalatest.BeforeAndAfterAll


class DataSourceCTest extends BaseTest with BeforeAndAfterAll with SPLLogging{

  cTest("datasourceT1",
    "select * from orderLineItemPartSupplier where l_shipdate  >= '1994-01-01' " +
      " and l_shipdate <= '1997-01-01' "
    ,
    "select * from orderLineItemPartSupplierBase where l_shipdate  >= '1994-01-01' " +
      "and l_shipdate <= '1997-01-01' "
  )
}
