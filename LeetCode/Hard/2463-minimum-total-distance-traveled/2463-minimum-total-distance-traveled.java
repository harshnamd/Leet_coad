class Solution {
    public long minimumTotalDistance(List<Integer> robot, int[][] factory) {
        int m = robot.size(), n = factory.length;
        long[][] Distance = new long[m + 1][n + 1];
        Arrays.sort(factory, (f1, f2) -> f1[0] - f2[0]);
        Collections.sort(robot);
        for (int i = 1; i <= m; i++) {
            Distance[i][0] = 200_000_0000;
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                Distance[i + 1][j + 1] = Distance[i + 1][j];
                long distanceSum = 0;
                for (int k = i; k >= 0 && k > i - factory[j][1]; k--) {
                    distanceSum += Math.abs(factory[j][0] - robot.get(k));
                    Distance[i + 1][j + 1] = Math.min(Distance[i + 1][j + 1], Distance[k][j] + distanceSum);
                }
            }
        }
        return Distance[m][n];
    }
}