package task1_2.execute;


public class Perfect {


    private static int[] cutUnnecessary(int [] res){
        int length = res.length;

        while (res[length-1]==0){
            length--;
        }

        int[] result = new int[length];
        for (int i = 0; i <length ; i++) {
            result[i] = res[i];
        }

        return result;
    }


    private static boolean isPerfect(int num){
        int controlSum=0;
        for (int i = 1; i <num ; i++) {

            if (num%i==0){
                controlSum+=i;
            }

        }

        if (controlSum==num){
            return true;
        }

        else{
            return false;
        }

    }


    public  int[] findAllPerf(int b){
        int[] perfect = new int[b];
        int numberOfPerf = 0;
        for (int i = 1; i <b ; i++) {

            if (isPerfect(i)){

                perfect[numberOfPerf]=i;
                numberOfPerf++;
            }
        }

        return cutUnnecessary(perfect);
    }











}
