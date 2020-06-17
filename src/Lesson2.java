public class Lesson2 {
    static final int WrongArrayDim = 1;
    static final int WrongColDim = 2;
    static final int WrongData = 3;
    public static void main(String[] args){
        String[][] test1 = {{"1","1","1","1"},{"2","2","2","2"},{"1","1","1","1"},{"2","2","2","2"}};
        String[][] test2 = {{"1","1","1","1"},{"2","2","2","2"},{"1","1","1","1"}};
        String[][] test3 = {{"1","1","1","1"},{"2","2"},{"1","1","1","1"},{"2","2","2","2"}};
        String[][] test4 = {{"1","1","1","1"},{"2","2","2","2"},{"1","nnn","1","1"},{"2","2","2","2"}};
        int sum = 0;

        try {
            sum = ConvertStringArray(test1);
            System.out.printf("Summa %s\n", sum);
        }
        catch (MyArraySizeException e1){
            int t = e1.getErrorType();
            switch (t){
                case WrongArrayDim:
                    System.out.println(e1.getMessage());
                    break;
                case WrongColDim:
                    System.out.println(e1.getMessage());
                    break;
            }
        }
        catch (MyArrayDataException e2){
            System.out.println(e2.getMessage() + ": Row " + e2.getRow() + ", Col " + e2.getCol());
        }

        sum = 0;
        try {
            sum = ConvertStringArray(test2);
            System.out.printf("Summa %s\n", sum);
        }
        catch (MyArraySizeException e1){
            int t = e1.getErrorType();
            switch (t){
                case WrongArrayDim:
                    System.out.println(e1.getMessage());
                    break;
                case WrongColDim:
                    System.out.println(e1.getMessage());
                    break;
            }
        }
        catch (MyArrayDataException e2){
            System.out.println(e2.getMessage() + ": Row " + e2.getRow() + ", Col " + e2.getCol());
        }

        try {
            sum = ConvertStringArray(test3);
            System.out.printf("Summa %s\n", sum);
        }
        catch (MyArraySizeException e1){
            int t = e1.getErrorType();
            switch (t){
                case WrongArrayDim:
                    System.out.println(e1.getMessage());
                    break;
                case WrongColDim:
                    System.out.println(e1.getMessage());
                    break;
            }
        }
        catch (MyArrayDataException e2){
            System.out.println(e2.getMessage() + ": Row " + e2.getRow() + ", Col " + e2.getCol());
        }

        try {
            sum = ConvertStringArray(test4);
            System.out.printf("Summa %s\n", sum);
        }
        catch (MyArraySizeException e1){
            int t = e1.getErrorType();
            switch (t){
                case WrongArrayDim:
                    System.out.println(e1.getMessage());
                    break;
                case WrongColDim:
                    System.out.println(e1.getMessage());
                    break;
            }
        }
        catch (MyArrayDataException e2){
            System.out.println(e2.getMessage() + ": Row " + e2.getRow() + ", Col " + e2.getCol());
        }

    }

    public static int ConvertStringArray(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        int l = arr.length;
        int result = 0;
        int x;
        if(l != 4){
            throw new MyArraySizeException("Array dimension is not equal 4",WrongArrayDim,-1,-1);
        }
        for (int i = 0; i < arr.length; i++){
            if(arr[i].length != 4){
                throw new MyArraySizeException("Column " + i +  " length is not equal 4",WrongColDim,i,-1);
            }
        }
        for (int i = 0;i < arr.length;i++){
            for(int j = 0;j < arr[i].length;j++){
                try {
                    x = Integer.parseInt(arr[i][j]);
                    result += x;
                }
                catch (NumberFormatException e){
                    throw new MyArrayDataException("Wrong format " + e.getMessage(),WrongData,i,j);
                }
            }
        }
        return result;
    }
}
