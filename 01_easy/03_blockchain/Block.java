import java.util.UUID;
public class Block {
    private UUID id;
    private String data;
    private UUID previousBlockId;

    public Block(String data, UUID previousBlockId) {
        this.id = UUID.randomUUID();
        this.data = data;
        this.previousBlockId = previousBlockId;
    }

    public Block(String data) {
        this.id = UUID.randomUUID();
        this.data = data;
    }

    public UUID getId() {
        return this.id;
    }
    public String getData() {
        return this.data;
    }
    public UUID getPreviousBlockId() {
        return this.previousBlockId;
    }
    public void setData(String data) {
        this.data = data;
    }

    public void setPreviousBlockId(UUID previousBlockId) {
        this.previousBlockId = previousBlockId;
    }
}