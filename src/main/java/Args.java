public class Args {
    private Schema schema;
    private Command command;
    public Args(String schemas, String commands) {
        this.schema = new Schema(schemas);
        this.command = new Command(commands);
    }

    public Object getValue(String str) {
        return schema.getValue(str, command.getValue(str));
    }
}