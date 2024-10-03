public class Main {
    public static void main(String[] args) {
/*
     int[] arrayName;

        arrayName = new int[] { 1,2,3,4,5 };
        arrayName [0] = 3;

        int length = arrayName.length;

       for (int i = 0; i < arrayName.length; i++)
        System.out.println("Element at index " + i
                + " : " + arrayName[i]);

       int [] singleDimArray = {1,2,3,4,5};

       int [][] multiDimArray = {
               {1,2,3},
               {4,5,6},
               {7,8,9}
       }; //et forsøg på 3d array - gik ikke - forsøg på 2d - 2d gik fint!

*/
        class Student {

            public int rollNo;
            public String name;

            public Student(int i, String boris) {
            }

            void Student (int rollNo, String name) {
                {
                    this.rollNo = rollNo;
                    this.name = name;

                }

            }

            class GFG {

                public static void main(String[] args) {
                    Student[] arr;
                    arr = new Student[3];

                    arr[0] = new Student(1, "Musse");
                    arr[1] = new Student(2, "Carl");
                    arr[2] = new Student(3, "Boris");

                        System.out.print(arr[0]);


                    //for (int i = 0; i < arr.length; i++)
                      //  System.out.println("Element at " + i + " : "
                        //        + arr[i].rollNo + " "
                          //      + arr[i].name);

                }

            }
            //System.out.print(multiDimArray);
        }
    }
}