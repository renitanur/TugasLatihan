public class InsertionSort {
    private int[]data;
    public void setData(int[] data){
        this.data = data;
    }
    public void InsertionShort(){
        int size = this.data.length;

        for (int step = 1; step < size; step++){
            int key = this.data[step];
            int J = step - 1;

            //compare key with each element on the left of it until an element smaller than
            //it is found
            //for descending order, change key<array[j] to
            while (J >= 0 && key <this.data[J]){
                this.data[J + 1] = this.data[J];
                --J;
            }
                    //place key at after the element just smaller than it.
            this.data[J + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] age = {12,7,2,1,0,67,78,95};
        //1. 7,12,2,1,....
        //2. 7,2,12,1,....
        //2,7,12,1....
        //2,7,1,12....
        //2,1,7,12....
        //1,2,7,12....
        //TODO; lengkapi main program ini agar bisa berjalan sebagaimana mestinya
    }
}
