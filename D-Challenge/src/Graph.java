import java.util.HashSet;
import java.util.Set;

public class Graph {

    public Set<Node> nodes = new HashSet<>();

    public void addNode(Node nodeA) {
        nodes.add(nodeA);
    }

    @Override
    public String toString() {
        return super.toString();
    }
    // getters and setters
}