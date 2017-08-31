import java.util.Scanner;
class Check {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int i;
        int[] c = new int[t];
        int[] b = new int[t];
        float[] p = new float[t];
        int[] w = new int[t];

        if (t < 0 || t > 10) {
            System.exit(1);
        }

        for (i = 0; i < t; i++) {
            c[i] = sc.nextInt();
            b[i] = sc.nextInt();
            p[i] = sc.nextInt();

            if (((c[i] > 1000) || c[i] < 1) || ((b[i] > 1000) || (b[i] < 0)) || ((p[i] < 0) || (p[i] > 100))) {
                System.exit(1);
            }
        }

        for (i = 0; i < t; i++) {
            w[i] = (int) Math.ceil(c[i] * (p[i] / 100));
        }

        for (i = 0; i < t; i++) {
            if((w[i] + b[i]) < c[i]) 
            {
              w[i] = w[i] + c[i] - (w[i] + b[i]);
            }
            else if(w[i] == b[i])
            {
              w[i] = w[i] + 1;
            }
        }

        for (i = 0; i < t; i++) {
            System.out.println(w[i]);
            
        }
        
    }
}
