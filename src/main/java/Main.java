import TwoWayList.List;

/**
 * Main class of program
 */

public class Main {
    public static void main(String args[]) {
        List<Integer> list = new List<>();
        List<Integer> list2 = new List<>();
        list2.removeFirst();
        list2.addElement(1);
        list2.removeFirst();
        list2.addElement(1);
        list2.addElement(1);
        list2.removeFirst();
        list.addElement(1);
        list.addElement(1);
        list.addElement(2);
        list.addElement(3);
        // printWholeList(list);


        list.get(100);

        list.removeElement(10);


        //printWholeList(list);
    }

    /*static void printWholeList(List list) {
        for (int i = 0; i < list.getSize(); i++) {
            System.out.println(list.get(i));
        }
    }*/
}
