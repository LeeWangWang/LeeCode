package 找实习.米哈游;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> powers = new ArrayList<>();
        int power = 1;
        while (power <= n) {
            powers.add(power);
            power *= 3;
        }
        powers.add(power);
        Collections.reverse(powers);
        List<Integer> expression = new ArrayList<>();
        int i = 0;
        while (n > 0) {
            if (n >= powers.get(i)) {
                n -= powers.get(i);
                expression.add(powers.get(i));
            }
            i++;
        }
        Collections.sort(expression, Collections.reverseOrder());
        StringBuilder sb = new StringBuilder();
        for (int j = 0; j < expression.size(); j++) {
            int p = expression.get(j);
            if (j > 0) {
                sb.append(p >= 0 ? "+" : "-");
            }
            sb.append(p);
        }
        System.out.println(sb);
    }
}

