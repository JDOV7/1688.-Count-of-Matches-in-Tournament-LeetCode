package leetcode;

public class CountofMatchesinTournament1688 {

    public void CountofMatchesinTournament1688() {
        int n = 7;
        int iSumPlayed = 0;
        while (n != 1) {
            if (n % 2 == 0) {
                iSumPlayed += (n = (n / 2));
            } else {
                int iTemporal = n;
                n = ((n - 1) / 2) + 1;
                iSumPlayed += (iTemporal - 1) / 2;
            }
        }
        System.out.println(iSumPlayed);
    }
}
