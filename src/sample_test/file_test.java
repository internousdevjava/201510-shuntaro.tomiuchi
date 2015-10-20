package sample_test;
import java.io.File;

class file_test{

    public static void main(String args[]){
        File cdirectory = new File("c:\\");

        String filelist[] = cdirectory.list();
        for (int i = 0 ; i < filelist.length ; i++){
            System.out.println(filelist[i]);
        }
    }
}