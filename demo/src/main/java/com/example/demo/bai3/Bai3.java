package com.example.demo.bai3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Bai3 {
//    Bài 3: Cho một mảng số tự nhiên nêu thuật toán để lấy được tổng giá trị lớn nhất từ các giá trị tại các
//phần tử không liền nhau trong mảng cho trước.
//Ví dụ 1:
//Input: nums = [1,2,3,1]
//Output: 4
//(nums[0] = 1, nums[2] = 3. Tổng nums[0] + nums[2] = 1+ 3 = 4. 4 Là tổng lớn nhất có thể lấy được)
//
//Ví dụ 2:
//Input: nums = [2,7,9,3,1]
//Output: 12
//(nums[0] = 2, nums[2] = 9, nums[4]=1. Tổng nums[0] + nums[2] + nums[4]= 2 + 9 + 1 = 12. 12 Là tổng lớn
//nhất có thể lấy được)

    public static int sum(List<Integer> list) {
        List<Integer> template = new ArrayList<>();
        template.add(list.get(0));
        template.add(Math.max(list.get(0), list.get(1)));

        for (int i = 2; i < list.size(); i++) {
            template.add(Math.max(template.get(i-2) + list.get(i), template.get(i-1)));
        }

        return template.get(list.size()-1);
    }

    public static void main(String[] args) {

        List<Integer> nums1 = new ArrayList<>(Arrays.asList(1, 2, 3, 1));
        System.out.println("Ví dụ 1:");
        System.out.println(sum(nums1));

        List<Integer> nums2 = new ArrayList<>(Arrays.asList(2, 7, 9, 3, 1));
        System.out.println("Ví dụ 2:");
        System.out.println(sum(nums2));
    }
}
