class SortArray {
    public static void main(String[] args) {
        //მასივის ინიცირება რამდენიმე მთელი რიცხვით
        int[] arr = {18, -3, 5, -7, 6, 89, 13, 0, -89};

        //  ციკლები მასივის მრავალჯერ გამეორებისთვის
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                // თუ მიმდინარე ელემენტი მეტია შემდეგ ელემენტზე, შეიცვლება
                if (arr[j] > arr[j + 1]) {
                    // დროებითი ცვლადი მიმდინარე ელემენტის ჩანაცვლებისას შესანარჩუნებლად
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        // დაიბეჭდება დალაგებული მასივი
        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

