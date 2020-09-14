/*
 * Copyright 2020 Confluent Inc.
 *
 * Licensed under the Confluent Community License (the "License"; you may not use
 * this file except in compliance with the License. You may obtain a copy of the
 * License at
 *
 * http://www.confluent.io/confluent-community-license
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OF ANY KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations under the License.
 */

package dev.buesing.udf;

import io.confluent.ksql.function.udf.Udf;
import io.confluent.ksql.function.udf.UdfDescription;
import io.confluent.ksql.function.udf.UdfParameter;

import java.util.List;

@SuppressWarnings("MethodMayBeStatic") // UDF methods can not be static.
@UdfDescription(
    name = "ARRAY_SUM_DOUBLE",
    description = "Returns the length on an array",
    author = "Neil Buesing"
)
public class ArraySumDouble {

  @Udf
  public <T> Double calcArrayLength(
      @UdfParameter(value = "array", description = "The array") final List<Double> array) {

    if (array == null) {
      return null;
    }

    return array.stream().mapToDouble(Double::doubleValue).sum();
  }
}
