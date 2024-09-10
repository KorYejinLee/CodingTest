import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            // 첫 줄 에서 줄의 갯수 읽기
            int n = Integer.parseInt(br.readLine());
            Object[][] array = new Object[n][2];
            
            for(int i = 0; i < n; i++) {
                String[] line = br.readLine().split(" ");
                int age = Integer.parseInt(line[0]);
                String name = line[1];
                array[i][0] = age;
                array[i][1] = name;
            }
            
			Arrays.sort(array, (a, b) -> Integer.compare((int) a[0], (int) b[0]));
			
            // 결과 출력
            for (Object[] row : array) {
				System.out.println(row[0] + " " + row[1]);
			}
		}
    }
}