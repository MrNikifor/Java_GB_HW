package GB_HW.Java_API.Seminar5;
//Расстановка 8 ферзей на шахматной доске так, чтобы они не били друг друга,
// является классической задачей из области комбинаторики и решается с использованием рекурсивного алгоритма.
// Вот пример решения этой задачи на языке Java:

public class EightQueens {
    private static final int BOARD_SIZE = 8;

    public static void main(String[] args) {
        int[][] board = new int[BOARD_SIZE][BOARD_SIZE];

        if (solveQueens(board, 0)) {
            printBoard(board);
        } else {
            System.out.println("Решение не найдено");
        }
    }

    private static boolean solveQueens(int[][] board, int col) {
        // Базовый случай: если все ферзи расставлены, возвращаем true
        if (col >= BOARD_SIZE) {
            return true;
        }

        // Рекурсивно расставляем ферзя в каждой строке текущего столбца
        for (int row = 0; row < BOARD_SIZE; row++) {
            if (isSafe(board, row, col)) {
                // Расставляем ферзя
                board[row][col] = 1;

                // Рекурсивно вызываем solveQueens для следующего столбца
                if (solveQueens(board, col + 1)) {
                    return true;
                }

                // Если текущая расстановка не приводит к решению, отменяем ее
                board[row][col] = 0;
            }
        }

        // Если ни одна расстановка не приводит к решению, возвращаем false
        return false;
    }

    private static boolean isSafe(int[][] board, int row, int col) {
        // Проверяем вертикаль и горизонталь на наличие других ферзей
        for (int i = 0; i < BOARD_SIZE; i++) {
            if (board[row][i] == 1 || board[i][col] == 1) {
                return false;
            }
        }

        // Проверяем диагонали на наличие других ферзей
        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                if ((i + j == row + col || i - j == row - col) && board[i][j] == 1) {
                    return false;
                }
            }
        }

        return true;
    }

    private static void printBoard(int[][] board) {
        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
//    В данном примере создается класс EightQueens, который содержит методы solveQueens(), isSafe() и printBoard() для решения задачи расстановки 8 ферзей на шахматной доске.
//
//        Метод solveQueens() рекурсивно расставляет ферзей в каждом столбце доски. Он начинает с первого столбца (col = 0) и для каждой строки в данном столбце проверяет, может ли ферзь быть размещен безопасно с учетом уже расставленных ферзей на предыдущих столбцах. Если это возможно, ферзь помещается на доску, и метод вызывается рекурсивно для следующего столбца. Если для текущего столбца не удается найти безопасное место для ферзя, происходит откат и проверяются другие варианты расстановки.
//        Метод isSafe() проверяет, является ли данная позиция безопасной для размещения ферзя. Он проверяет вертикали, горизонтали и диагонали на наличие других ферзей.
//        Метод printBoard() выводит на экран текущую расстановку ферзей на доске.
//        После выполнения программы, будет выведена одна из возможных расстановок ферзей на шахматной доске, где цифра 1 обозначает наличие ферзя, а 0 - пустую клетку.