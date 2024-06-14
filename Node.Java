import java.util.*;

public class Node {
    
    private final String name;
    private Integer distance = Integer.MAX_VALUE;
    private List<Node> shortestPath = new LinkedList<>();
    
    Map<Node, Integer> adjacentNodes = new HashMap<>();

    public final int x;
    public final int y;

    public void addDestination(Node destination, int distance) {
        adjacentNodes.put(destination, distance);
    }

    public Node(String name, int x, int y) {
        this.name = name;
        this.x = x;
        this.y = y;
    }

    public String getName() {
        return name;
    }

    public List<Node> getShortestPath() {
        return shortestPath;
    }

    public void setShortestPath(List<Node> shortestPath) {
        this.shortestPath = shortestPath;
    }

    public Integer getDistance() {
        return distance;
    }

    public void setDistance(Integer distance) {
        this.distance = distance;
    }

    public Map<Node, Integer> getAdjacentNodes() {
        return adjacentNodes;
    }
    
    public String printString() {
        List<String> toPrint = new ArrayList<>();
        toPrint.add(name + " : " + distance);
        
        List<String> edgeString = new ArrayList<>();
        for (Map.Entry<Node, Integer> entry : adjacentNodes.entrySet()) {
            edgeString.add(entry.getKey().getName() + " : " + entry.getValue());
        }
        if (!edgeString.isEmpty()) {
            toPrint.add(String.join(", ", edgeString));
        }
        List<String> pathString = new ArrayList<>();
        for (Node node : shortestPath) {
            pathString.add(node.getName());
        }
        if (!pathString.isEmpty()) {
            toPrint.add(String.join(", ", pathString));
        }
        return String.join(" | ", toPrint);
    }
}