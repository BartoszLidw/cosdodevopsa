import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
//problem1
        System.out.println("Problem 1:");
        System.out.println(problem1.problem001(new int []{1,7,8,15}, 16));
        System.out.println(problem1.problem001(new int []{10,15,3,7}, 17));
        System.out.println(problem1.problem001(new int []{1,7,8,15}, 26));
//problem282
        System.out.println("Problem 282:");
        System.out.println(problem282.solution(new int []{1,7,8,15}));
        System.out.println(problem282.solution(new int []{1,4,3,5}));
        System.out.println(problem282.solution(new int []{20,12,8,16}));
//problem156
        System.out.println("Problem 156:");
        System.out.println(problem156.solution(6));
        System.out.println(problem156.solution(27));
        System.out.println(problem156.solution(12));
//problem 248
        System.out.println("Problem 248:");
        System.out.println(problem248.solution(12, 7));
        System.out.println(problem248.solution(19, 20));
        System.out.println(problem248.solution(3, 9));
//problem 144
        System.out.println("Problem 144:");
        System.out.println(problem144.solution(new int []{1,7,8,15,17,6,8}, 3));
        System.out.println(problem144.solution(new int []{1,7,8,15,17,6,8}, 1));
        System.out.println(problem144.solution(new int []{1,7,8,15,17,6,8}, 6));
//problem 122
        System.out.println("Problem 122:");
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        problem122.solution(numbers, 2);
        problem122.solution(numbers, 3);
        problem122.solution(numbers, 5);
//problem 7
        System.out.println("Problem 7:");
        System.out.println( problem7.solution("1203"));
        System.out.println( problem7.solution("121132221"));
        System.out.println( problem7.solution("81"));
//problem 4
        System.out.println("Problem 4:");
        System.out.println(problem4.solution(new int []{1,7,8,15}));
        System.out.println(problem4.solution(new int []{-1,1,-2,3}));
        System.out.println(problem4.solution(new int []{1,1,3,4}));
//problem 214
        System.out.println("Problem 214:");
        System.out.println(problem214.solution(6));
        System.out.println(problem214.solution(255));
        System.out.println(problem214.solution(167));
//problem 49
        System.out.println("Problem 49:");
        System.out.println(problem49.solution(new int []{1,7,8,15}));
        System.out.println(problem49.solution(new int []{-1,-1,-2,-3}));
        System.out.println(problem49.solution(new int []{1,-1,-3,6}));
    }

}