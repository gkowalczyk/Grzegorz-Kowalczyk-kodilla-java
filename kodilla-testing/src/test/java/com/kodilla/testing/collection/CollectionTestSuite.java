package com.kodilla.testing.collection;
import org.junit.jupiter.api.*;
import java.util.ArrayList;
import java.util.List;

class CollectionTestSuite {
     @BeforeEach
     public void before() {
         System.out.println("Test case: begin");
     }
     @AfterEach
     public void after() {
         System.out.println("Test case : end");
     }
    @DisplayName(
            "Cheking if the class behaves correctly when the list contains even and odd numbers ")

    @Test

    public void testOddNumbersExterminatorNormalList() {

        //given
        ArrayList<Integer> normalList = new ArrayList<>();
        normalList.add(1);
        normalList.add(2);
        normalList.add(3);
        normalList.add(4);
        normalList.add(5);
        normalList.add(6);

        ArrayList<Integer> expectedList = new ArrayList<>();
        expectedList.add(2);
        expectedList.add(4);
        expectedList.add(6);

        //when
        List<Integer> resultList = OddNumbersExterminator.exterminate(normalList);
        System.out.println("Testing testOddNumbersExterminator " + resultList);
        //Then
        Assertions.assertEquals(expectedList, resultList);
    }
    @DisplayName(
            "Cheking if the class behaves correctly when the list contains emptylist ")
    @Test

    public void testOddNumbersExterminatorEmptyList() {

           //given
            ArrayList<Integer> emptyList = new ArrayList<>();

           //when
            List<Integer> resultList1 = OddNumbersExterminator.exterminate(emptyList);
            System.out.println("Testing class with Empty List ");

           //Then
            Assertions.assertEquals(emptyList, resultList1);
    }
}
