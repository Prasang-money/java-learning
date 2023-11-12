public class Array {
    
    public static void main(String[] args) {
        // First way of declaring a array 
        //int arr[]={1,2,6,9};

        //second way of decalaring a array
        int arr[]= new int[4];
        arr[0]=1;
        arr[1]=2;
        arr[2]=6;
        arr[3]=9;



        for(int i=0;i<4;i++){
            System.out.println(arr[i]);
        }

        // 2d Array

        int matrix[][]=new int[3][4];

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                matrix[i][j]= (int)(Math.random()*10);
            }
        }

        for(int row[] : matrix){

            for( int n : row){
                System.out.print(n + " ");
            }

            System.out.println("");
        }

        //int nums[][]={ {1,2},{3,4}};

        // for(int row[] : nums){

        //    for( int n : row){
        //        System.out.print(n + " ");
        //    }

        //    System.out.println("");
        //}
    }
}
