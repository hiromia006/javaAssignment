package assignment1;

public class DaTaTypeTest<T> {
    private T data;
    public DaTaTypeTest(T data){
        this.data=data;
    }

    public T getData() {
        return data;
    }
}
