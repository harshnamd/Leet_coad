class Solution {
    public List<Integer> findDisappearedNumbers(int[] seats) {
        List<Integer> Seats = new ArrayList<>();
        for(int ticket : seats){
            seats[Math.abs(ticket)-1] = -Math.abs(seats[Math.abs(ticket)-1]);
        }
        for(int i = 0; i < seats.length; i++){
            if(seats[i] > 0) {
                Seats.add(i + 1);
            }
        }
        return Seats;
    }
}