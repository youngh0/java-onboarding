package onboarding;

import java.util.Collections;
import java.util.List;

public class Problem5 {
    public static List<Integer> solution(int money) {
        List<Integer> answer = Collections.emptyList();
        return answer;
    }

    public static int calculateMoneyNum(int money, int balance) {
        return balance / money;
    }

    public static int calculateBalance(int money, int balance) {
        int moneyUseCount = calculateMoneyNum(money, balance);

        return balance - money * moneyUseCount;
    }
}
