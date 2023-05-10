public class ArraySample1 {
    public static void main(String[] args) {
        //create array
        int[]array = new int[10];//[0, 0, 0, 0, 0, 0, 0, 0, 0,0]
        System.out.println(array);
        // insert elements into the array
        array[2] = 20; //[0, 0, 20,0, 0, 0, 0, 0, 0 ]
        System.out.println(toString(array));
        //System.out.println(array);
    }

    private static String toString(int[]array){
        String arrayRepresentation="[ ";
        for (int index = 0; index <array.length ; index++) {
           if (index!=array.length-1)arrayRepresentation += array[index] + ",";
           else arrayRepresentation += array[index];
        }
        arrayRepresentation += "]";
        return arrayRepresentation;

    }
}
