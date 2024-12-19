class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        List<Pair> people = new ArrayList<>();
        int N = names.length;
        for (int i = 0; i < N; i++) {
            people.add(new Pair(heights[i], names[i]));
        }
        people.sort((a, b) -> Integer.compare(b.height, a.height));
        for (int i = 0; i < N; i++) {
            names[i] = people.get(i).name;
        }

        return names;
    }
    class Pair {
        int height;
        String name;

        Pair(int h, String n) {
            height = h;
            name = n;
        }
    }
}
