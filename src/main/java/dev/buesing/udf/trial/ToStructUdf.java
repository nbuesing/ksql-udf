package dev.buesing.udf.trial;

import io.confluent.ksql.function.udf.Udf;
import io.confluent.ksql.function.udf.UdfDescription;
import io.confluent.ksql.function.udf.UdfParameter;

@UdfDescription(name = "tostruct", description = ".")
public class ToStructUdf {

    @Udf(description = "XXXX")
    public String fromString(@UdfParameter(value = "source", description = "the value to reverse") final String value) {
        return value;
//        final Schema schema = SchemaBuilder.struct()
//                .optional()
//                .field("A", Schema.OPTIONAL_STRING_SCHEMA)
//                .build();
//        return new Struct(schema).put("A", value);
    }
//  @UdfSchemaProvider
//  public SqlType provideSchema(final List<SqlType> params) {
//    return SqlDecimal.of(30, 10);
//  }
}
