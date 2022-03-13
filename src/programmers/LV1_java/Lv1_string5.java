package programmers.LV1_java;
import java.util.Scanner;

// https://programmers.co.kr/learn/courses/30/lessons/12969
// title : 직사각형 별찍기 
// time : 1m
// Create by haerin on 2022/02/28

public class Lv1_string5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String stars = "";
        for(int x=0; x<a; x++)
                stars += "*";
        
        for(int y=0; y<b; y++){
            System.out.println(stars);
        }
    }
}
