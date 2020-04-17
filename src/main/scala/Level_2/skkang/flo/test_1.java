package Level_2.skkang.flo;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by skkang on 2020. 4. 14..
 */
public class test_1 {

    public static void main(String[] args) {
        System.out.println("--------------");

//        int[] nums1 = {1,2,3,0,0,0};
//        int len1 = 3;
//        int[] nums2 = {2,5,6};
//        int len2 = 3;
//        int[] nums1 = {1, 0, 3, 0, 0, 0};
//        int len1 = 3;
//        int[] nums2 = {2, 0, 3};
//        int len2 = 3;

        int[] nums1 = {1, 0, 3, 0};
        int len1 = 3;
        int[] nums2 = {2, 0, 3};
        int len2 = 3;

        solution(nums1, len1, nums2, len2);

    }

    public static int[] solution(int[] nums1, int len1, int[] nums2, int len2) {

        int[] result ;
        result = new int[len1 + len2];

        for (int i = 0 ; i < len1; i++) {
            result[i] = nums1[i];
        }

        for (int i = 0 ; i < len2; i++) {
            result[i+len1] = nums2[i];
        }

        Arrays.sort(result);

        for(int tmp: result) {
            System.out.println(tmp);
        }

        return result;

    }
}
