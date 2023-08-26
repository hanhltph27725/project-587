package com.example.demo.bai4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Bai4 {
//    Bài 4: Cho 1 mảng số nums nêu thuật toán trả lại mảng gồm các phần tử là tất cả các bộ ba giá trị
//nums[i],nums[j], nums[k] sao cho i != j, i != k, j != k và tổng and nums[i] + nums[j] + nums[k] = 0.
//Điều kiện
//• Số lượng phần từ từ 3 – 3000
//• Giá trị mỗi phần tử từ -105 đến 105
//Ví dụ 1:
//Input: nums = [-1,0,1,2,-1,-4]
//Output: [[-1,-1,2],[-1,0,1]]
//nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
//nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
//nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0
//Ví dụ 2:
//Input: nums = [0,1,1]
//Output: []
//(Vì không có cặp 3 phần tử nào đáp ứng tổng bằng 0)
//Ví dụ 3:
//Input: nums = [0,0,0]
//Output: [[0,0,0]]

    public static String result(List<Integer> list) {
        List<List<Integer>> newList = new ArrayList<>();
        list.sort(null);
        for (int i = 0; i < list.size() - 2; i++) {
            if (i > 0 && list.get(i).equals(list.get(i - 1))) {
                continue;
            }

            int target = -list.get(i);
            int left = i + 1;
            int right = list.size() - 1;

            while (left < right) {
                int sum = list.get(left) + list.get(right);
                if (sum == target) {
                    newList.add(Arrays.asList(list.get(i), list.get(left), list.get(right)));
                    while (left < right && list.get(left).equals(list.get(left + 1))) {
                        left++;
                    }
                    while (left < right && list.get(right).equals(list.get(right - 1))) {
                        right--;
                    }
                    left++;
                    right--;
                } else if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return newList + "";
    }


    public static void main(String[] args) {

        List<Integer> nums1 = new ArrayList<>(Arrays.asList(-1, 0, 1, 2, -1, -4));
        System.out.println("Ví dụ 1:");
        System.out.println(result(nums1));

        List<Integer> nums2 = new ArrayList<>(Arrays.asList(0, 1, 1));
        System.out.println("Ví dụ 2:");
        System.out.println(result(nums2));


        List<Integer> nums3 = new ArrayList<>(Arrays.asList(0, 0, 0));
        System.out.println("Ví dụ 3:");
        System.out.println(result(nums3));

    }

}
