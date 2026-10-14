public class Duck3 implements Comparable<Duck3> {
    String name;
    int weight;
    
    public Duck3(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String toString() {
        return name + " weighs " + weight;
    }
    @Override
    public int compareTo(Duck3 other) {
        if(this.weight < other.weight) {
            return -1;
        } else if (this.weight == other.weight) {
            return 0;
        } else {
            return 1;
        }
    }
}