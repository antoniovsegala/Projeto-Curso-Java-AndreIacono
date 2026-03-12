import java.sql.SQLOutput;
import java.util.Arrays;

void main() {

    /*int array
    int[] valores = {10, 20, 15, 30, 40};
    Arrays.sort(valores);
    System.out.println(Arrays.toString(valores));
    System.out.println(valores.length);
*/

/*string array
    String[] cars = {"BMW", "Tesla", "Jeep", "Fiat"};
    cars[2] = "Ferrari";
    System.out.println(Arrays.toString(cars));
    System.out.println(cars[2]);
*/

//Array multidimensional
//    String[][] cars = {{"BMW", "Tesla"}, { "Jeep", "Fiat"}};
//    System.out.println(Arrays.deepToString(cars));


/*Constante
    final double taxaJuros = 11.92;
    System.out.println(taxaJuros);
*/

/*Operadores
    int a = 4;
    a++; //adiciona 1 no valor
    a--; //subtrai 1 do valor
    System.out.println(a);
*/

/* convertendo string em integers.
    String valorProduto = "10";
    int valorTotal = Integer.parseInt(valorProduto) + 2;
    System.out.println(valorProduto);
*/

/* Usando a classe math
    double value = Math.round(10.2);//arredonda para o mais próximo
    double value2 = Math.ceil(10.2);//arredonda para cima
    double value3 = Math.floor(10.9);//arredonda para baixo
    double value4 = Math.random();//puxa um numero aleatório(a baixo de 0 ex: 0.938279529837)
    double value5 = Math.random() * 100;//puxa um numero abaido de 100
    double value6 = Math.round(Math.random() * 100);//para arredondar para o mais proximo
    int value7 = (int)Math.round(Math.random() * 100);//para um numero sem o ponto

    System.out.println(value);
    System.out.println(value2);
    System.out.println(value3);
    System.out.println(value4);
    System.out.println(value5);
    System.out.println(value6);
    System.out.println(value7);
 */

/*
Exercício dia 2
fazer 4 impressões - nelas tem q conter array 1 : original
array 1 = em ordem
array 2 = original
array 2 em ordem
 */

    int[] my_array1 = {
            1789, 2035, 1899, 1456, 2013,
            1458, 2458, 1254, 1472, 2365,
            1456, 2165, 1457, 2456};
    String[] my_array2 = {
            "Java",
            "Python",
            "PHP",
            "C#",
            "C Programming",
            "C++"
    };

    System.out.println("Array 1 - original = " + Arrays.toString(my_array1));
    Arrays.sort(my_array1);
    System.out.println("Array 2 - em ordem = " + Arrays.toString(my_array1));

    System.out.println("Array 1 - original = " + Arrays.toString(my_array2));
    Arrays.sort(my_array2);
    System.out.println("Array 2 - em ordem = " + Arrays.toString(my_array2));
}
