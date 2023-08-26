package com.example.demo.bai1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Bai1 {
//    Bài 1 (Bắt buộc): Cho 1 mảng không rỗng , với các phần tử là các số tự nhiên ngẫu nhiên. Viết thuật toán
//loại bỏ các số trùng trong mảng sao cho mảng kết quả thu được sau khi loại bỏ các số trùng thỏa mãn
//các điều kiện sau:
//1. Bao gồm các số tự nhiên không trùng và săp xếp theo thứ tự tăng dần từ vị trí phần từ đầu tiên
//của mảng.
//2. Đảm bảo số lượng phần tả ở mảng mới bằng số lượng phần tử của mảng ban đầu và các ký tự
//loại bỏ do trùng sẽ thay thế bằng các ký tự “*”
//Ví dụ:
//Input: nums = [1,1,2]
//Output: nums = [1,2,_]
//Input: nums = [0,0,1,1,1,2,2,3,3,4,5]
//Output: nums = [0,1,2,3,4,5,*,*,*,*]

    public static String filterDuplicateNumber(List<Object> obj, String symbol) {
        obj.sort(null);
        Object item = null;
        int count = 0;

        for (int i = 0; i < obj.size(); i++) {
            Object object = obj.get(i);

            if (!object.equals(item)) {
                obj.set(count++, object);
                item = object;
            }
        }

        for (int i = count; i < obj.size(); i++) {
            obj.set(i, symbol);
        }
        
        return obj + "";
    }

    public static void main(String[] args) {

        List<Object> nums1 = new ArrayList<>(Arrays.asList(1, 1, 2));
        System.out.println("Ví dụ 1:");
        System.out.println(filterDuplicateNumber(nums1, "_"));

        List<Object> nums2 = new ArrayList<>(Arrays.asList(0, 0, 1, 1, 1, 2, 2, 3, 3, 4, 5));
        System.out.println("Ví dụ 2:");
        System.out.println(filterDuplicateNumber(nums2, "*"));

    }
}
