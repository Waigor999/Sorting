/**
 * Created by GordonNg on 4/5/2017.
 */
public class HeapSort {
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
        HeapTree(0,number);
        System.out.print("Heap Tree=");
        display();
        Heapsort(number-1);
    }

    public void Heapsort(int last){
        int temp[] = new int[number];
        while (last>=0) {
            swap(0, last);
            temp[last] = arr[last];
            arr[last--] = 0;
            HeapTree(0,last);
        }
        for(int i =0;i<number;i++)
            arr[i]=temp[i];
    }

    public void HeapTree(int frist,int last){
        while(frist<last) {
            int parent = (frist-1)/2;
            int left = 2*frist+1;
            int right = 2*frist+2;
            if (arr[left] > arr[right] && arr[left] > arr[frist]) {
                swap(frist, left);
                HeapTree(parent, frist);
                frist++;
            } else if (arr[right] > arr[frist]) {
                swap(frist, right);
                HeapTree(parent, frist);
                frist++;
            }
            else
                frist++;
        }
    }

    public void swap(int x,int y){
        int save = arr[x];
        arr[x]=arr[y];
        arr[y]=save;
    }
}
