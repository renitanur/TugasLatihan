public class GlossEntry {
    private String id;

    public GlossEntry(String id) {
        this.id = id;
    }

    public String getId(){
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public class main{
        public static void main(String[] args) {
            String JSON = "{\"GlossEntry\": (\"id\")}";

            JSON json = new JSON();
            GlossEntry glossEntry = json.fromJson(json,GlossEntry.class);

            String id = glossEntry.getId();
            System.out.println("Id" +id);
        }
    }
}
