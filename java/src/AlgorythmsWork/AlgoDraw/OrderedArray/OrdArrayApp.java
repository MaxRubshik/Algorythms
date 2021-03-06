package src.AlgorythmsWork.AlgoDraw.OrderedArray;

public class OrdArrayApp {
    public static void main(String[] args) {
        int maxSize = 100;
        OrdArray arr = new OrdArray(maxSize);
        OrdArray arr2 = new OrdArray(maxSize);
        OrdArray arr3 = new OrdArray(20);
        OrdArray arr4 = new OrdArray(20);
        OrdArray arr5 = new OrdArray(10);
        OrdArray arr7 = new OrdArray(20);

        arr5.insert(777);
        arr5.insert(11);
        arr5.insert(88);
        arr5.insert(333);


        arr.insertTwo(111);
        arr.insertTwo(888);
        arr.insertTwo(999);
        arr.insertTwo(555);
//        arr.insert(99);
//        arr.insert(44);
//        arr.insert(55);
//        arr.insert(22);

        System.out.print("After book way: ");
        arr.display();
        System.out.println();
        System.out.println(arr.findTwo(999));
        System.out.println();

        System.out.println("Now my arr2");
        arr2.simpleInsert(10);
        arr2.simpleInsert(10);
        arr2.simpleInsert(7);
        arr2.simpleInsert(5);
        arr2.simpleInsert(5);
        arr2.simpleInsert(5);
        arr2.simpleInsert(5);
        System.out.print("After my unsorted test: ");
        arr2.display();
        System.out.println();
        int searchKey = 55;


        if (arr.find(searchKey) != arr.size())
            System.out.println("We founded: " + searchKey);
        else System.out.println("Can't find this: " + searchKey);

        arr.display();
        arr.delete(00);
        arr.delete(22);
        arr.delete(11);
        arr.insert(16);
        arr.display();
        System.out.println(arr.find(77));
        System.out.println();

        //-------------------------------------------------
        //Exercise 5: Adding two arrays with random values.

        System.out.println("Exercise 5");

        int min = 100;
        int max = 200;

        for (int i = 0; i < 10; i++) {
            int random = 80 + (int) (Math.random() * 15);
            arr3.insert(random);
        }
        System.out.println("This is arr3 :");
        arr3.display();

        for (int i = 0; i < 5; i++) {
            int random = min + (int) ((Math.random() * max));
            arr4.insert(random);
        }

        System.out.println();
        System.out.println();
        System.out.println("This is arr4 :");
        arr4.display();

        System.out.println("This is arr5 :");
        arr5.display();
        System.out.println();

        System.out.println("This is merged arr from arr 4 and arr 5: ");
        OrdArray arr6 = OrdArray.merge(arr4, arr5);
        arr6.display();

        System.out.println("This noDupsGit test. ");
        arr2.display();
        arr2.noDupsMy();
        arr2.display();

    }
}
