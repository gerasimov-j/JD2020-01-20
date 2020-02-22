package by.it.dolgiy.jd01_12;

import java.util.*;

class TaskB2 {

    private static List<String> list1 = new ArrayList<>(Arrays.asList("A","B","C","D","E","F","G","I"));
    private static List<String> list2 = new LinkedList<>(Arrays.asList("A","B","C","D","E","F","G","I"));

    static String process(ArrayList<String> peoples){
        ArrayList<String> list1 = new ArrayList<>(peoples);
        System.out.println(list1);
        while (list1.size()!=1){
            Iterator<String> iterator = list1.iterator();
            while (iterator.hasNext()) {
                iterator.next();
                iterator.next();
                iterator.remove();
            }
            System.out.println(list1);
        }
        return list1.get(0);
    }

    static String process(LinkedList<String> peoples){
        LinkedList<String> list2 = new LinkedList<>(peoples);
        System.out.println(list2);
        while (list2.size()>1){
            peoples.addLast(peoples.removeLast());
            peoples.removeFirst();
            Iterator<String> iterator = list2.iterator();
            while (iterator.hasNext()) {
                iterator.next();
                iterator.next();
                iterator.remove();
            }
            System.out.println(list2);
        }
        return list2.get(0);
    }

    public static void main(String[] args) {
        process((ArrayList<String>) list1);
        System.out.println();
        process((LinkedList<String>) list2);
    }
}
