/*Friends Pairing Problem
    Given n friends, each one can remain single or can be paired up with some other friend. Each friend can be paired only once. Find out the total number  of ways in which friends can remain single or can be paired up. 
*/

public class FriendsPairingProblem {
    public static int friendsPairing(int n) {
        if (n==1||n==2){
            return n;
        }

        int single = friendsPairing(n - 1);

        int pair = friendsPairing(n - 2);
        int pairWays = (n - 1) * pair;

        int totalWays = single + pairWays;
        return totalWays;

        // return friendsPairing(n - 1) + (n - 1) * friendsPairing(n - 2); //Short
    }

    public static void main(String[] args) {
        System.out.println(friendsPairing(3));
    }
}
