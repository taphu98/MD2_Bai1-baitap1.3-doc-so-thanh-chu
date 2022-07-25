import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to translate to string :");
        int number = scanner.nextInt();
        int thousand = number / 1000;
        int hundreds = number % 1000 / 100;
        int dozens = number % 100 / 10;
        int ones = number % 10;
        if (number == 0) {
            System.out.println("Zero");
        }
        if (thousand > 9 || thousand < 0) {
            System.out.println("out of ability");}
        else {
            switch (thousand) {
                case 1:
                    System.out.print("One ");
                    break;
                case 2:
                    System.out.print("Two ");
                    break;
                case 3:
                    System.out.print("Three ");
                    break;
                case 4:
                    System.out.print("Four ");
                    break;
                case 5:
                    System.out.print("Five ");
                    break;
                case 6:
                    System.out.print("Six ");
                    break;
                case 7:
                    System.out.print("Seven ");
                    break;
                case 8:
                    System.out.print("Eight ");
                    break;
                case 9:
                    System.out.print("Nine ");
                    break;
            }
            if (thousand != 0) {
                System.out.print("thousand ");}
//            if (hundreds > 9 || hundreds < 0) {
//                System.out.println("out of ability");}
//            else {
            switch (hundreds) {
                case 1:
                System.out.print(" One hundreds");
                break;
                case 2:
                    System.out.print(" Two hundreds");
                    break;
                case 3:
                    System.out.print(" Three hundreds");
                    break;
                case 4:
                    System.out.print(" Four hundreds");
                    break;
                case 5:
                    System.out.print(" Five hundreds");
                    break;
                case 6:
                    System.out.print(" Six hundreds");
                    break;
                case 7:
                    System.out.print(" Seven hundreds");
                    break;
                case 8:
                    System.out.print(" Eight hundreds");
                    break;
                case 9:
                    System.out.print(" Nine hundreds");
                    break;
            }}
            if (hundreds != 0) {
                System.out.print(" and");}

            switch (dozens) {
                case 1:
                    switch (ones) {
                            case 0:
                                System.out.print(" Ten");
                                break;
                            case 1:
                                System.out.print(" Eleven");
                                break;
                            case 2:
                                System.out.print(" Twelve");
                                break;
                            case 3:
                                System.out.print(" Thirteen");
                                break;
                            case 4:
                                System.out.print(" Fourteen");
                                break;
                            case 5:
                                System.out.print(" Fifteen");
                                break;
                            case 6:
                                System.out.print(" Sixteen");
                                break;
                            case 7:
                                System.out.print(" Seventeen");
                                break;
                            case 8:
                                System.out.print(" Eighteen");
                                break;
                            case 9:
                                System.out.print(" Nineteen");
                                break;
                        }
                        break;
                        case 2:
                            System.out.print(" Twenty");
                            break;
                        case 3:
                            System.out.print(" Thirty");
                            break;
                        case 4:
                            System.out.print(" Forty");
                            break;
                        case 5:
                            System.out.print(" Fifty");
                            break;
                        case 6:
                            System.out.print(" Sixty");
                            break;
                        case 7:
                            System.out.print(" Seventy");
                            break;
                        case 8:
                            System.out.print(" Eighty");
                            break;
                        case 9:
                            System.out.print(" Ninety");
                            break;
                    }
            if (dozens != 1) {
                switch (ones) {
                    case 1:
                        System.out.print(" One");
                        break;
                    case 2:
                        System.out.print(" Two ");
                        break;
                    case 3:
                        System.out.print(" Three ");
                        break;
                    case 4:
                        System.out.print(" Four ");
                        break;
                    case 5:
                        System.out.print(" Five ");
                        break;
                    case 6:
                        System.out.print(" Six ");
                        break;
                    case 7:
                        System.out.print(" Seven ");
                        break;
                    case 8:
                        System.out.print(" Eight ");
                        break;
                    case 9:
                        System.out.print(" Nine ");
                        break;
                }
            }
        }
    }
