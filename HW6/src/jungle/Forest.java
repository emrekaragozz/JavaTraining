package jungle;

class Forest {
    public long treeCount;

    public Forest() { // no-argument constructor is inserted
        this.treeCount=5;
    }
    public Forest(long treeCount) {
        this.treeCount = treeCount+2;
    }
}