/**
 * Created by GordonNg on 4/5/2017.
 */
public class Controller {
    public static void main(String[] args){
        HeapSort sort;
        sort = new HeapSort();
        sort.Setting(100);
        sort.Insert(12);
        sort.Insert(3);
        sort.Insert(55);
        sort.Insert(23);
        sort.Insert(6);
        sort.Insert(2);
        sort.Insert(5);
        sort.Insert(8);
        sort.Insert(54);
        sort.Insert(13);
        System.out.print("Original=");
        sort.display();
        sort.Sorting();
        System.out.print("After sorting=");
        sort.display();

    }
}