
package array;


import java.util.*; 
public class Array {
    public static int search(int A[],int size,int count,int key){
      for(int i=0;i<A.length;i++){    
            if(A[i] == key){    
                return i;  }   }
                 return -1;    }
    public static void delete(int[] Ar,int count,int length,int key) {   
        int i;
       if (Ar == null) {System.out.print("Array is empty"); return;}
       else { i = search(Ar,length,count,key);}
       if (i == -1){ System.out.println("Not found");return;}
       else
       {   int j=i;
           for(;i<length-1;j++){
           Ar[j]=Ar[j+1];
           i++;
       } 
           Ar[length-1]=0;
           count--;}
       print(Ar,length);
    }
    public static void sort(int arr[], int count,int size,int key) {
        if (count == size) {System.out.println("Array is full");}
        else {arr[size-1]=key; count ++;}
        for (int i= 0; i < arr.length; i++)   { 
        for (int j = i + 1; j < arr.length; j++)  {  
        int temp ;  
        if (arr[i] < arr[j]) {   
        temp = arr[i];  
        arr[i] = arr[j];  
        arr[j] = temp;  }  }   }
        print(arr, size); }

     public static void print(int array[],int size){
        for(int i=0;i<array.length;i++)    
        { System.out.print(array[i] + " ");  }  
        System.out.print("\n");}
     
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int x,l=0,count = 0,key;
        int list[] = null;
        do {
        System.out.println(" 1. Insert the elements of the array \n 2. Search for an element and return its index \n 3. Delete an element from the array \n 4. Sort the array and insert a new element after sorting \n 5. Exit");
        System.out.print("Enter your choice: ");
        x= sc.nextInt(); 
        switch (x){
            case 1: System.out.println("Enter length of array ");
                  l= sc.nextInt();
                    list = new int[l];
            System.out.println("How many number of used element in an array? ");
            count= sc.nextInt();
            System.out.println("Enter all the elements:");
            for(int i = 0; i < l; i++){
            list[i] = sc.nextInt();}
            print(list,l);
                break;
            case 2:
                System.out.println("What you want to search for? ");
                key=sc.nextInt();
             int t= search(list, l, count, key);
             if (t==-1)
                System.out.println("Does not exist");
             else
                 System.out.println(t);
                break;
            case 3:
                System.out.println("What you want to delete from the array? ");
                key=sc.nextInt();
                delete(list,count,l,key);
                
                break;
            case 4:
                System.out.println("Enter a new element");
                key=sc.nextInt();
                sort(list,count,l,key);
                break;
            case 5:break;    
            default:  System.out.println("Entrance is not in range, Try again");  }}
        while(x!=5);
       
} }
        


    

