import java.util.Arrays;
import java.util.HashMap;
import java.util.ListIterator;
import java.util.Map;

public class Command {
    private Map<String, String> map;
    public Command(String commands) {
        map = new HashMap<>();
        ListIterator<String> iterator = Arrays.asList(commands.split("\\s+")).listIterator();
        while (iterator.hasNext()) {
            String key = iterator.next().substring(1);

            if (iterator.hasNext()) {
                String value = iterator.next();
                if (isValue(value))
                    map.put(key, value);
                else {
                    iterator.previous();
                    map.put(key, null);
                }
            }

        }
    }

    private boolean isValue (String value) {
        if (value.charAt(0) == '-')
            if (value.charAt(1) >= '0' && value.charAt(1) <= '9')
                return true;
            else
                return false;
        return true;
    }

    public String getValue(String str) {
        return map.get(str);
    }
}
