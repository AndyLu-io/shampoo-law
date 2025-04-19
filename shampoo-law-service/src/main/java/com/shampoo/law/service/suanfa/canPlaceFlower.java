package com.shampoo.law.service.suanfa;

/**
 * @author luxiaobo
 * @Description
 * @create 2025 -03 -13 -16:37
 */
public class canPlaceFlower {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int length = flowerbed.length;
        int exit = 0;
        for (int i : flowerbed) {
            if (i == 1) {
                exit++;
            }
        }
        int max = 0;
        if (length % 2 == 0) {
            max = length / 2;
        } else {
            max = length / 2 + 1;
        }
        if (exit + n > max) {
            return false;
        }
        boolean flag = false;
        int count = 0;
        if (length == 1) {
            if (flowerbed[0] == 0) {
                count = 1;
            } else {
                count = 0;
            }
        } else {
            for (int j = 0; j < length; j++) {

                if (flowerbed[j] == 0) {
                    if (j > 0 && j < length - 1) {
                        if (flowerbed[j - 1] == 0 && flowerbed[j + 1] == 0) {
                            ++count;
                            flowerbed[j] = 1;
                            continue;
                        }

                    }
                    if (j == 0 && flowerbed[j + 1] == 0) {
                        ++count;
                        flowerbed[j] = 1;
                        continue;
                    }
                    if (j == length - 1 && flowerbed[j - 1] == 0) {
                        ++count;
                        flowerbed[j] = 1;
                    }
                }

            }

        }
        return count >= n;
    }


    public static void main(String[] args) {
        int[] flowerbed = {1, 0, 0, 0, 1};
        canPlaceFlower canPlaceFlower = new canPlaceFlower();
        boolean b = canPlaceFlower.canPlaceFlowers(flowerbed, 1);
        System.out.println(b);
    }
}
