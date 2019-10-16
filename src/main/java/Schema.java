import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Schema {
    private Map<String, String> schema;

    public Schema(String schemas) {
        schema = new HashMap<>();
        Arrays.asList(schemas.split(" "))
                .stream()
                .forEach(flag->{
                    String [] value = flag.split(":");
                    schema.put(value[0], value[1]);
                });
    }

    public Object getValue(String str, String value) {
        String type = schema.get(str);

        switch (type) {
            case "boolean":
                return true;
            case "integer":
                return Integer.parseInt(value);
            default:
                return value;
        }
    }
}
