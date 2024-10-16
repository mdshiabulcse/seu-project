package collectionbuildintype;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CollectionsMainClass {
     public static void main(String[] args) {

        /*
        * Collection framework program
        * 1.Declare array list
        * 2.Data insert
        * 3.Data update
        * 4.Data short
        * 5.Data remove
        * 6.Data view
        * */
         //Array list declare
         //two approach
         //1st approach
         //array:int[] intArray= new int[5];
         //ArrayList<DataType> objectName=new ArrayList<>();
         //int ,float,double,string,char....
         ArrayList<Integer>intList=new ArrayList<>();
         ArrayList<String>stringList=new ArrayList<>();
         ArrayList<Double>doubleList=new ArrayList<>();

         //2nd approach
         //interface <DataType>objectName =new class<>();
         //Shape s= new Circle();

         List<Integer> ints =new ArrayList<>();

         //Data Insert
         intList.add(5);
         intList.add(-15);
         intList.add(8);
         intList.add(-2);
         intList.add(7);


         //print data
         printInformation(intList);

         //update data
        intList.add(1,3);
        intList.remove(2);

        //
         System.out.println("Updated print list");
         printInformation(intList);

         //data sort
         intList.sort(new Comparator<Integer>() {
             @Override
             public int compare(Integer firstNumber, Integer secondNumber) {
                 return firstNumber<secondNumber?-1:1;
             }
         });

         //
         System.out.println("Sort print list");
         printInformation(intList);

         //remove data
         intList.add(-2);
         intList.add(-3);
         intList.add(5);
         printInformation(intList);
         intList.remove(5);

         System.out.println("Removed print list");
         printInformation(intList);

    }

    public static void printInformation(ArrayList<Integer> integers){
         for(Integer data:integers){
             System.out.println(data);
         }
//         for(int index=0;index<integers.size();index++){
//             System.out.println(integers.get(index));
//         }
         System.out.println();
    }
}
