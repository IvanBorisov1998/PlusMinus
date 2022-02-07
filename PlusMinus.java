import java.util.ArrayList;
import java.util.List;

public class PlusMinus {
public static void main(String[]args) {
	List<Integer> arr = new ArrayList<Integer>();
	arr.add(0,1);
	arr.add(1,1);
	arr.add(2,0);
	arr.add(3,-1);
	arr.add(4,-1);
	plusMinus(arr);
}
public static void plusMinus(List<Integer> arr) {
    double positive=0;
    double negative=0;
    double zero = 0;
for(int i = 0 ; i<arr.size();i++){
    if(arr.get(i)==0){
        zero++;
    }
    if(arr.get(i)<0){
        negative++;
    }
    if(arr.get(i)>0){
        positive++;
    }
   
}
 System.out.println(String.format("%.6f", positive/arr.size()));
    System.out.println(String.format("%.6f", negative/arr.size()));
    System.out.println(String.format("%.6f", zero/arr.size()));

}

}

