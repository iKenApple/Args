import java.util.Arrays;
import java.util.HashMap;
import java.util.ListIterator;
import java.util.Map;

public class Command {
    private Map<String, String> command;
    public Command(String commands) {
        command = new HashMap<>();
        ListIterator<String> commandIterator = Arrays.asList(commands.split(" ")).listIterator();
        while(commandIterator.hasNext()) {
            String value = commandIterator.next().substring(1);
            if (commandIterator.hasNext()) {
                String nextValue = commandIterator.next();
                if (isValue(nextValue)) {
                    command.put(value, nextValue);
                } else {
                    commandIterator.previous();
                    command.put(value, "true");
                }
            }
        }
    }

    private boolean isValue(String value) {
        if (value.charAt(0) == '-') {
            if (value.charAt(1) >= '0' && value.charAt(1) <= '9')
                return true;

            return false;
        }

        return true;
    }

    public String getValue(String str) {
        return command.get(str);
    }
}
