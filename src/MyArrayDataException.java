public class MyArrayDataException extends Exception{
    private int Row,Col;
    private  int ErrorType;

    public int getErrorType() {
        return ErrorType;
    }

    public int getRow() {
        return Row;
    }

    public int getCol() {
        return Col;
    }

    public MyArrayDataException(String message,int type,int col,int row){
        super(message);
        this.ErrorType = type;
        this.Col = col;
        this.Row = row;
    }

}

