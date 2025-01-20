package org.abbas.controlFlow;

public class StarTasks {

    public void showTask1() {
        System.out.println("\nTask -> 1\n");
        for (int i = 0; i < 10; i++) {
            System.out.print(" * ");
        }
    }

    public void showTask2() {
        System.out.println("\nTask -> 2\n");
        for (int i = 0; i < 10; i++) {
            System.out.println(" * ");
        }
    }

    public void showTask3() {
        System.out.println("\nTask -> 3\n");
        for (int i = 0; i < 10; i++) {
            System.out.print("\n * ");
            for (int j = 0; j < 10; j++) {
                System.out.print(" * ");
            }
        }

        System.out.println(" ");
    }

    public void showTask4() {
        System.out.println("\nTask -> 4\n");

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j <= i; j++) {

                System.out.print("* ");
            }
            System.out.println();
        }
    }


    public void showTask5() {
        System.out.println("\nTask -> 5\n");
        int x = 10;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                if (j < x - i) {
                    System.out.print("* ");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();

        }

    }


    public void showTask6() {
        System.out.println("\nTask -> 6\n");
        int x = 10;

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                if (j >= x - i - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print(("  "));
                }
            }
            System.out.println();
        }


    }

    public void showTask7() {
        System.out.println("\nTask -> 7\n");
        int y = 10;
        for (int i = 0; i <= y; i++) {
            for (int j = 0; j < y; j++) {
                if (j < i) {
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }

            }
            System.out.println();

        }

    }

    public void showTask8() {
        System.out.println("\nTask -> 8\n");
        int x = 9;

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j <= i; j++) {

                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                if (j < x - i) {
                    System.out.print("* ");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }


    }

    public void showTask9() {
        System.out.println("\nTask -> 9\n");
        int n = 10;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j >= n - i - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        int y = 10;
        for (int i = 0; i <= y; i++) {
            for (int j = 0; j < y; j++) {
                if (j < i) {
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }

            }
            System.out.println();

        }

    }

}