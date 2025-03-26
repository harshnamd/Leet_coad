class Solution {
    public int maxContainers(int n, int w, int maxWeight) {
        int totalCells = n * n;
        int maxPossibleContainers = maxWeight / w;
        return Math.min(totalCells, maxPossibleContainers);
    }
}
