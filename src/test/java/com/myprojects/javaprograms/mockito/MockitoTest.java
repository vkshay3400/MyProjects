package com.myprojects.javaprograms.mockito;

import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import static org.mockito.Mockito.when;

public class MockitoTest {
    @Mock
    MyDataBase dataBaseMock;

    @Rule
    public MockitoRule mockitoRule = MockitoJUnit.rule();

    @Test
    public void testQuery() {
        ClassToTest t = new ClassToTest(dataBaseMock);
        when(dataBaseMock.query("* from t")).thenReturn(true);
        boolean check = t.query("* from t");
    }
}