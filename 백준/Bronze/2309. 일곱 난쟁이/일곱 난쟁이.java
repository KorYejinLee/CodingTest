import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    static int[] dwarfes = new int[9];
    static int sum = 0;
    static int faith1 = 0;
    static int faith2 = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int i = 0; i < dwarfes.length; ++i) {
            dwarfes[i] = Integer.parseInt(br.readLine());
            sum += dwarfes[i];
        }
        
        for(int i = 0; i < dwarfes.length; ++i) {
            for(int j = i+1; j < dwarfes.length; ++j) {
                if(sum - dwarfes[i] - dwarfes[j] == 100) {
                    faith1 = dwarfes[i];
                    faith2 = dwarfes[j];
                    break;
                }
            }
        }
        
        Arrays.sort(dwarfes);
        
        for(int i = 0; i < dwarfes.length; ++i) {
            if(dwarfes[i] == faith1 || dwarfes[i] == faith2) {
                continue;
            }
            System.out.println(dwarfes[i]);
        }
    }
}