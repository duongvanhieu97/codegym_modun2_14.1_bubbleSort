public class BubbleSort {
    static int[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};

    public static void bubbleSort(int[] list) {
//        Lặp phần tử đầu trong mảng đến cuối mảng
        for (int i = 0; i < list.length - 1; i++) {
//            Lặp từ cuối mảng đến j > i
            for (int j = list.length - 1; j > i; j--)
//                Xét điều kiện số đó nhỏ hơn thì gán nó vào temp và đưa phần tử đó xuống sau
                if (list[j] < list[j - 1]) {
                    int temp = list[j];
                    list[j] = list[j - 1];
                    list[j - 1] = temp;
                }
        }
    }

    public static void main(String[] args) {
        bubbleSort(list);
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
    }
}
