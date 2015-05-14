package com.javarush.test.level15.lesson12.home05;

/* Перегрузка конструкторов
1. В классе Solution создайте по 3 конструктора для каждого модификатора доступа.
2. В отдельном файле унаследуйте класс SubSolution от класса Solution.
3. Внутри класса SubSolution создайте конструкторы командой Alt+Insert -> Constructors.
4. Исправьте модификаторы доступа конструкторов в SubSolution так, чтобы они соответствовали конструкторам класса Solution.
*/

public class Solution {
    public Solution(Object const1){}
    public Solution(Integer const2){}
    public Solution(String const3){}

    protected Solution(Number const4){}
    protected Solution(Character const2){}
    protected Solution(Double const3){}

    private Solution(boolean const1){}
    private Solution(Short const2){}
    private Solution(Float const3){}

    Solution(Byte const1){}
    Solution(Exception const2){}
    Solution(float const3){}

}

