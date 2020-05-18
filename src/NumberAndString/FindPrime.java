package NumberAndString;

/**
 * 寻找素数
 * @author  HYT
 *g
 */
public class FindPrime {
    final int max = 10000001;
    int[] prime = new int[max];
    int pNum = 0;
    boolean[] judge = new boolean[max];
//    public void init(){
//        for (int i = 0; i < max; i++)
//            judge[i] = false;
//    }

    public void findPrime(){
        for (int i = 2; i < max; i++){
            if (judge[i] == false){
                pNum++;
                for (int j = i + i; j < max; j += i){
                    judge[j] = true;
                }
            }
        }
    }
    public static void main(String[] args){
    FindPrime findPrime = new FindPrime();
    findPrime.findPrime();
    System.out.println(findPrime.pNum);
    }
}
