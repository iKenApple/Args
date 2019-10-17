import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Schema {
    private Map<String, String> map;
    public Schema(String format) {
        map = new HashMap<>();
        Arrays.asList(format.split("\\s+"))
                .stream()
                .forEach(flag->{
            String value [] = flag.split(":");
            map.put(value[0], value[1]);
        });
}

    public Object getValue(String str, String value) {
        String type = map.get(str);
        switch (type) {
            case "boolean":
                return Boolean.TRUE;
            case "integer":
                return Integer.parseInt(value);
            case "list":
                return value.split(",");
            default:
                return value;
        }
    }
}
