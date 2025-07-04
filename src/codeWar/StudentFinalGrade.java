package codeWar;

public class StudentFinalGrade {
    public static int finalGrade(int exam, int projects){
        if (exam > 90 || projects > 10) {
            return 100;
        } else if (exam > 75 && projects >= 5) {
            return 90;
        } else if (exam > 50 && projects >= 2) {
            return 75;
        } else {
            return 0;
        }

//        return (exam > 90 || projects > 10) ? 100
//                : (exam > 75 && projects >= 5) ? 90
//                : (exam > 50 && projects >= 2) ? 75
//                : 0;
    }

    public static void main(String[] args) {
        System.out.println(finalGrade(99, 1));
        System.out.println(finalGrade(76, 5));
        System.out.println(finalGrade(76, 4));
        System.out.println(finalGrade(52, 1));
    }
}
