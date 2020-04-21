package Level_2.skkang.flo;

import java.util.ArrayList;

/**
 * Created by skkang on 2020. 4. 20..
 */
public class test_2 {

    public static void main(String[] args) {

//        int N = 10;
//        int K = 3;
//        int W = 10;

//        int N = 10;
//        int K = 1;
//        int W = 10;

//        int N = 6;
//        int K = 1;
//        int W = 10;

        int N = 21;
        int K = 17;
        int W = 10;

        solution(N, K, W);

    }

    public static ArrayList<ArrayList<Integer>> stopArray = new ArrayList<>();
    public static ArrayList<Integer> stopCountList = new ArrayList<>();
    public static ArrayList<Integer> winCountList = new ArrayList<>();

    public static double solution(int N, int K, int W) {

        System.out.println("카드 수: " + W + ", 언제까지 뽑을까?(K<=합) : " + K + ", 승패?(N>=합):" + N + ", ");

        ArrayList<Double> percentList = new ArrayList<>();

        for (int i = 1 ; i <= W ; i++) {
            System.out.println();
            System.out.println(">>>>>>> i: " + i);
            // 전체 경우의 수
            int totalCount = comb(W,i);
            System.out.println("전체 경우의 수: " + comb(W,i));

            // 카드를 뽑은 경우의 수(K<=합 일때 STOP)
            comb(new int[i], 0, W, i, 0, K);
            System.out.println("stopArray.size(): " + stopArray.size());
            stopCountList.add(stopArray.size());

            if(stopArray.size() > 0) {
                // 뽑은 카드의 경우의 수 중 이겼을 때 수
                int win = win(stopArray, N, K);
                System.out.println("WIN count: " + win);
                winCountList.add(win);

                for( ArrayList<Integer> tmp : stopArray ){
                    for( int n : tmp ) {
                        System.out.print( n + " ");
                    }
                    System.out.print(", ");

                }
            }

            System.out.println();

            if (totalCount == stopArray.size()) {
                break;
            }


            stopArray.clear();
        }


        int winTotal = 0;
        int stopTotal = 0;

        System.out.println("=== winCountList ===");
        for (int w : winCountList) {
            System.out.print(w + ", ");
            winTotal = winTotal + w;
        }

        System.out.println();
        System.out.println("=== stopCountList ===");
        for (int s : stopCountList) {
            System.out.print(s + ", ");
            stopTotal = stopTotal + s;
        }

        double result = (double)winTotal/(double)stopTotal;

        System.out.println();
        System.out.println("result: " + Math.round(result*10000)/10000.0);
        return 0;
    }

    static int win(ArrayList<ArrayList<Integer>> stopArray, int N, int K) {
        int winCount = 0;
        for( ArrayList<Integer> tmp : stopArray ){
            int sum = 0;

            for( int n : tmp ) {
//                System.out.print( n + " ");
                sum += n;
            }

            if ( N >= sum ) {
                winCount++;
            }
//            System.out.println("sum = " + sum);
        }

        return winCount;
    }

    //조합의 각각의 경우
    static void comb(int[] arr, int index, int W, int r, int target, int K) {

        ArrayList<Integer> tmp = new ArrayList<>();

        int sum = 0;
        int stopSum = 0;

        if ( r == 0 ) {
            if (arr[0] >=1) {
                for(int i = 0 ; i < arr.length ; i++) {
//                    System.out.print(arr[i] + " ");
                    tmp.add(arr[i]);
                    sum += arr[i];
                }

                stopSum = sum - arr[arr.length-1];

                if ( K <= sum && stopSum < K) {
//                    System.out.print(">> sum: " + sum);
                    stopArray.add(tmp);
                }
//                System.out.println();
            }

        } else if(target == W + 1 ){
            return;
        } else {
            arr[index] = target;
            comb(arr, index+1, W, r-1, target+1, K);
            comb(arr, index, W, r, target+1, K);
        }
    }

    //조합의 갯수
    static int comb(int W, int r) {
        if ( r == 0 || W == r) {
            return 1;
        } else {
            return comb(W-1, r -1) + comb(W-1, r);
        }
    }


}
