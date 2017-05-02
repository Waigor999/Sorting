/**
 * Created by Gordon Ng on 29/4/2017.
 */
public class SelectSort {
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
        int min,i,j;
        for(i=0;i<number-1;i++) {
            min=i;
            for (j = i; j < number; j++)
                if (arr[j] < arr[min])
                    min=j;
            swap(i,min);
        }
    }

    public void swap(int x,int y){
        int save = arr[x];
        arr[x]=arr[y];
        arr[y]=save;
    }

}
