public class hashset {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();

        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Cherry");
        hashSet.add("Date");
        hashSet.add("Elderberry");

        System.out.println("HashSet elements: " + hashSet);

        hashSet.remove("Cherry");
        System.out.println("After removing 'Cherry': " + hashSet);
        System.out.println("Contains 'Banana': " + hashSet.contains("Banana"));

        for (String fruit : hashSet) {
            System.out.print(fruit + " ");
        }
    }
    
}
