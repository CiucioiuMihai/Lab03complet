public class ElementeDuplicate {
    public static void main(String[] args) {
        int sir1[] = {1, 2, 3, 4, 5};
        int sir2[] = {3, 4, 5, 6, 7};

        System.out.println("Elementele duplicate din sirurile date:");
        for (int i = 0; i < sir1.length; i++) {
            for (int j = 0; j < sir2.length; j++) {
                if (sir1[i] == sir2[j])
                {
                    System.out.println(sir1[i]);
                    break;
                }
            }
        }
    }
}
