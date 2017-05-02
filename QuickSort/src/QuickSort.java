/**
 * Created by Gordon Ng on 2/5/2017.
 */
public class QuickSort {
    private int number;
    private int arr[];

    public void Setting(int Max){
        number=0;
        arr =new int[Max];
    }

    public void Insert(int x){
        arr[number]=x;
        number++;
    }

    public void display(){
        for(int i=0;i<number;i++)
            System.out.print(arr[i]+" ");
        System.out.print("\n");
    }

    public void Sorting(){
        QuickSorting(0,number-1);
    }

    public void QuickSorting(int first,int last){
        if(first>=last)
            return;
        int left,right,pivot;
        pivot = arr[last];
        left = first;
        right= last-1;

        while(left<right) {
            if(arr[left] >= pivot && arr[right] < pivot) {
                swap(left, right);
                left++;
            }
            else if (arr[left] > pivot && arr[right] > pivot)
                right--;

            else if(arr[left] < pivot && arr[right] < pivot)
                left++;
            else
                left++;

        }
        if(arr[left]>arr[last]) {
            swap(left, last);
        }
        left++;
       // display();                //step by step

          QuickSorting(first, left-1);
          QuickSorting(right+1, last);

    }

    public void swap(int x,int y){
        int save = arr[x];
        arr[x] = arr[y];
        arr[y] = save;
    }



}
