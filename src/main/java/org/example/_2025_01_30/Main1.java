package org.example._2025_01_30;

import org.example._2025_01_30.exceptions.InvalidLengthException;
import org.example._2025_01_30.exceptions.NoNumbersException;

public class Main1 {
    public static void main(String[] args) {
        try  {
            Password password = new Password("654321");
        } catch (InvalidLengthException lengthException) {
            System.out.println("не правильная длина, попробуй ещё раз");
        } catch (NoNumbersException noNumbersException) {
            System.out.println("пароль должен содержать цифры");
        } catch (RuntimeException exception) {
            System.out.println("Что то пошло не так");
        }
    }
}
