import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        try {
            File myObj = new File("C:\\Users\\ADMIN\\IdeaProjects\\untitled\\src\\input.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                ArrayList<Integer> arrayList = new ArrayList<>();
                int n = Integer.parseInt(data);
                int count = 0;
                for (int i = 1; i < n; i++) {
                    if (perfecetNum(i)){
                        count++;
                        arrayList.add(i);
                    }
                }
                System.out.println(count + " ,[");
                for (int i = 0; i < arrayList.size(); i++) {
                    System.out.println(arrayList.get(i));
                }
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    public static boolean perfecetNum(int n){
        if (n <= 1)return false;
        int sum = 1;
        for (int i = 2; i*i <= n; i++){
            if (n % i == 0){
                sum += i;
                if (i != n/i){
                    sum += n/i;
                }
            }
        }
        return sum == n;
    }

}