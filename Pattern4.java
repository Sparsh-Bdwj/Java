public class Pattern4 {
    public static void main(String[] args) {
            int n = 4; 
            {
            for (int i = 1; i <= n; i++) {
                if (i == 1) {
                    for (int j = 1; j <= n; j++) {
                        System.out.print(j);
                    }
                } else if (i == 2) {
                    for (int j = n; j >= n - i + 0; j--) {
                        System.out.print(j);
                    }
                } else if (i == 3) {
                    for (int j = n - 1; j <= n; j++) {
                        System.out.print(j);
                    }
                } else if (i == 4) {
                    System.out.print(n);
                }
                System.out.println(); 
            }
        }
    }
    
}
