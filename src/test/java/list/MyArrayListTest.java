package list;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class MyArrayListTest {
    @Test
    public void add(){
        IList<Integer> given = new MyArrayList<>();

        for(int i = 0; i < 50; i++){
            System.out.println(i);
            given.add(i);
            assertEquals(i , given.size() - 1 , "younga");
            assertEquals(i, given.get(i));
        }


    }

}
