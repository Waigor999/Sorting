/**
 * Created by Gordon Ng on 29/4/2017.
 */
public class BubbleSort {
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
        for(int i=0;i<number-1;i++)
            for(int j=0;j<number-1;j++)
                if(arr[j]>arr[j+1])
                    swap(j,j+1);
    }

    public void swap(int x,int y){
        int save = arr[x];
        arr[x]=arr[y];
        arr[y]=save;
    }
}