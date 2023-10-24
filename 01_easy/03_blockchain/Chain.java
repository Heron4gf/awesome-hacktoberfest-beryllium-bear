import java.util.Set;
import java.util.HashSet;
import java.util.UUID;

public class Chain {

    private Set<Block> blocks = new HashSet<>();

    public void addBlock(Block block) {
        if (block == null)
            throw new IllegalArgumentException("Block is null");
        if (block.getPreviousBlockId() == null) {

            if (!blocks.isEmpty()) {
                for (Block b : blocks) {
                    UUID id = b.getId();
                    if (blocks.stream()
                            .noneMatch(b2 -> b2.getPreviousBlockId() != null && b2.getPreviousBlockId().equals(id))) {
                        block.setPreviousBlockId(id);
                        break;
                    }
                }
            }

        } else {
            boolean previousBlockExists = false;
            for (Block b : blocks) {
                if (b.getId().equals(block.getId())) {
                    throw new IllegalArgumentException("Block already exists");
                }
                if (b.getId().equals(block.getPreviousBlockId())) {
                    if (previousBlockExists) {
                        throw new IllegalArgumentException("Multiple previous blocks");
                    } else {
                        previousBlockExists = true;
                    }
                }
            }
            if (!previousBlockExists) {
                throw new IllegalArgumentException("Previous block does not exist");
            }
        }
        this.blocks.add(block);
    }

    public Set<Block> getBlocks() {
        return this.blocks;
    }

}