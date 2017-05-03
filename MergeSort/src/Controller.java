/**
 * Created by GordonNg on 3/5/2017.
 */
public class Controller {
    public static void main(String[] args){
        MergeSort sort;
        sort = new MergeSort();
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
        sort.display();
        sort.Sorting();
        sort.display();

    }
}