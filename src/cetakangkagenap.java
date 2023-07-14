public class cetakangkagenap {
    private int [] S = new int[]{1,5,6,7,12,3,24,9,18};
    public void cetakangkagenap(int index){
        if (S[index] % 2 == 0) {
            System.out.println(S[index]);
        }
        index ++;
        cetakangkagenap(index);
    }

    public void main(String[] args) {
        cetakangkagenap(0);
    }
}
