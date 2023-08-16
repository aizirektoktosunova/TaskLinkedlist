import java.util.*;

public class Main {


    public static void main(String[] args) {
            Random random = new Random();
        int[] mas = new int[10];
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < mas.length; i++) {
            mas[i] = random.nextInt(2);
            arrayList.add(random.nextInt(2));
            linkedList.add(random.nextInt(2));
        }
        System.out.println(Arrays.toString(mas)+" do mas");
        System.out.println(arrayList+" do arraylist");
        System.out.println(linkedList+" do linkedlist");
        System.out.println("---------------------------------------");
        sort(mas);
        sort(arrayList);
        sort(linkedList);
        System.out.println(Arrays.toString(mas)+" mas");
        System.out.println(arrayList+" arraylist");
        System.out.println(linkedList+" linkedlist");
    }
    public static void sort(ArrayList<Integer> arrayList) {
        Collections.sort(arrayList);
    }
    public static void sort(LinkedList<Integer> linkedList) {
        Collections.sort(linkedList);
    }
    public static void sort(int[] mas) {
        Arrays.sort(mas);
    }


}
