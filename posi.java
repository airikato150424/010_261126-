import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class posi{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String s = sc.next();

        int x = 0;
        int y = 0;

        Set<String> visited = new HashSet<>();
        visited.add(x + "," + y);

        for (int i = 0; i < n; i++) {
            char move = s.charAt(i);
            if (move == 'R') {
                x++;
            } else if (move == 'L') {
                x--;
            } else if (move == 'U') {
                y++;
            } else if (move == 'D') {
                y--;
            }

            String pos = x + "," + y;
            if (visited.contains(pos)) {
                System.out.println("Yes");
                sc.close();
                return;
            }
            visited.add(pos);
        }

        System.out.println("No");
    }
}