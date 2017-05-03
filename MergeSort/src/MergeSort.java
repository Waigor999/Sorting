/**
 * Created by GordonNg on 3/5/2017.
 */
public class MergeSort {
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
        Mergesort(0,number-1);
    }

    public void Mergesort(int frist,int last){
        if(last-frist==0)
            return;
        int mid =(last+frist)/2;
        Mergesort(frist,mid);
        Mergesort(mid+1,last);
        Merge(frist,last,mid);

    }

    public void Merge(int frist,int last,int mid){
        int temp[] = new int[number];
        for(int i=frist;i<=last;i++)
            temp[i]=arr[i];
        int j = frist;
        int frist_m = frist;
        int mid_m = mid+1;
        while(j<=last){
            if(frist_m>mid)
                arr[j++]=temp[mid_m++];
            else if (mid_m>last)
                arr[j++]=temp[frist_m++];
            else if(temp[frist_m]>temp[mid_m])
                arr[j++]=temp[mid_m++];
            else
                arr[j++]=temp[frist_m++];
        }
       // display();         //step by step

    }

    public void swap(int x,int y){
        int save = arr[x];
        arr[x]=arr[y];
        arr[y]=save;
    }

}
