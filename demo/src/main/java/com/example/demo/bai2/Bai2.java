package com.example.demo.bai2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Bai2 {
//    Bài 2 (Bắt buộc): Cho 1 mảng số tự nhiên ngẫu nhiên không rỗng, trong đó các số xuất hiện nhiều lần trừ
//1 số duy nhật xuất hiện 1 lần. Viết thuật toán để hiển thị số duy nhất trong mảng cho trước.
//Ví dụ:
//Ví dụ 1:
//Input: nums = [5,5,8]
//Output: 8
//Ví dụ 2:
//Input: nums = [4,3,6,3,6]
//Output: 4
//Ví dụ 3:
//Input: nums = [8]
//Output: 8
    public static String findUniqueNumber(List<Integer> list) {

        for (int i = 0; i < list.size(); i++) {
            boolean checkUnique = true;

            for (int j = 0; j < list.size(); j++) {
                if (i != j && list.get(j) ==  list.get(i)) {
                    checkUnique = false;
                    break;
                }
            }

            if (checkUnique) {
                return  list.get(i) + "";
            }
        }

        return "Khong tim thay";
    }

    public static void main(String[] args) {

        List<Integer> nums1 = new ArrayList<>(Arrays.asList(5, 5, 8));
        System.out.println("Ví dụ 1:");
        System.out.println(findUniqueNumber(nums1));

        List<Integer> nums2 = new ArrayList<>(Arrays.asList(4, 3, 6, 3, 6));
        System.out.println("Ví dụ 2:");
        System.out.println(findUniqueNumber(nums2));

        List<Integer> nums3 = new ArrayList<>(Arrays.asList(8));
        System.out.println("Ví dụ 3:");
        System.out.println(findUniqueNumber(nums3));
    }
}
