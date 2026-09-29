package datos.practicos.ejercicio1;

public class arreglos {

    public static void main(String[] args) {

         /*
         * El ejercicio indica que:
         *
         * K = último dígito de la matrícula + 1
         *
         * Mi último dígito es 3.
         *
         * Por lo tanto:
         *
         * K = 3 + 1 = 4
         */
        int K = 4;


        System.out.println("======================================");
        System.out.println("AUDITORÍA DE ARREGLOS");
        System.out.println("K = " + K);
        System.out.println("======================================");


        // FASE 1 - ARREGLO UNIDIMENSIONAL

        System.out.println("\n--- FASE 1 ---");

        int[] lecturas = {
            10,
            -5,
            20,
            K * 2,
            -1,
            30,
            0,
            15
        };

        /*
         * Los arreglos en Java comienzan  desde 0.
         *
         * La propiedad .length devuelve la cantidad de
         * elementos que tiene el arreglo, pero no representa
         * el último índice.
         *
         * Por ejemplo, si el arreglo tiene 8 elementos,
         * los índices válidos son del 0 al 7.
         *
         * Por esta razón, para comenzar a recorrer el arreglo
         * desde el último elemento debemos utilizar:
         *
         * lecturas.length - 1
         *
         * Si utilizáramos lecturas.length directamente,
         * intentaríamos ponernos en una posición que no existe
         * y se produciría ArrayIndexOutOfBoundsException.
         */

        for (int i = lecturas.length - 1; i >= 0; i--) {

            if (lecturas[i] > 0) {

                System.out.println(
                    "Lectura positiva: " + lecturas[i]
               );
            }
        }
      

        // =====================================================
        // FASE 2 - MATRIZ IRREGULAR / JAGGED ARRAY
        // =====================================================

        System.out.println("\n--- FASE 2 ---");

        /*
         * Se crea una matriz de tres filas.
         *
         * Cada fila puede tener diferente cantidad
         * de elementos.
         */
        int[][] ventas = new int[3][];

        // La primera fila tendrá K elementos.
        ventas[0] = new int[K];

        // La segunda fila tendrá K + 1 elementos.
        ventas[1] = new int[K + 1];

        // La tercera fila tendrá 2 elementos.
        ventas[2] = new int[2];


        /*
         * La matriz es irregular porque sus filas tienen
         * diferentes tamaños:
         *
         * Fila 0 -> 4 elementos
         * Fila 1 -> 5 elementos
         * Fila 2 -> 2 elementos
         *
         * No podemos utilizar un número fijo para recorrer
         * todas las filas.
         *
         * Por eso utilizamos ventas[i].length, que obtiene
         * el tamaño real de cada fila.
         */

        for (int i = 0; i < ventas.length; i++) {

            for (int j = 0; j < ventas[i].length; j++) {

                ventas[i][j] = (i + 1) * (j + 1);
            }
        }


        // Mostrar los elementos de la matriz.

        System.out.println("Matriz de ventas:");

        for (int i = 0; i < ventas.length; i++) {

            for (int j = 0; j < ventas[i].length; j++) {

                System.out.print(ventas[i][j] + " ");
            }

            System.out.println();
        }


        // Calcular la suma total de los elementos.

        int sumaTotal = 0;

        for (int i = 0; i < ventas.length; i++) {

            for (int j = 0; j < ventas[i].length; j++) {

                sumaTotal += ventas[i][j];
            }
        }

        System.out.println(
            "Suma total de ventas: " + sumaTotal
        );


        /*
         * VENTAJA DEL JAGGED ARRAY:
         *
         * Un Jagged Array permite que cada fila tenga
         * diferente cantidad de elementos.
         *
         * Cuando los datos no son homogéneos, esto puede
         * aprovechar mejor la memoria porque no es necesario
         * reservar la misma cantidad de espacios para todas
         * las filas.
         */


        // =====================================================
        // FASE 3 - ARREGLO TRIDIMENSIONAL
        // =====================================================

        System.out.println("\n--- FASE 3 ---");

        /*
         * Se crea un arreglo tridimensional de:
         *
         * 2 x K x K
         *
         * Como K = 4:
         *
         * 2 x 4 x 4
         */
        int[][][] cubo = new int[2][K][K];


        // Inicialización del cubo.

        for (int i = 0; i < 2; i++) {

            for (int j = 0; j < K; j++) {

                for (int k = 0; k < K; k++) {

                    cubo[i][j][k] = i + j + k + 1;
                }
            }
        }


        /*
         * En el código original se utilizaba un ciclo while
         * con una variable i.
         *
         * El problema era que i nunca se incrementaba.
         *
         * Por ejemplo:
         *
         * int i = 0;
         * while (i < 2) {
         *
         * Si nunca hacemos i++, entonces i siempre vale 0
         * y la condición i < 2 siempre será verdadera.
         *
         * Esto provoca un bucle infinito.
         *
         * Para esta solución utilice for-each para recorrer
         * los tres niveles del arreglo tridimensional.
         */


        int contador = 0;


        // Primer nivel: planos del cubo.
        for (int[][] plano : cubo) {

            // Segundo nivel: filas de cada plano.
            for (int[] fila : plano) {

                // Tercer nivel: valores de cada fila.
                for (int valor : fila) {

                    // Verificamos si el valor es múltiplo de 3.
                    if (valor % 3 == 0) {

                        contador++;

                        System.out.println(
                            "Múltiplo de 3 encontrado: " + valor
                        );
                    }
                }
            }
        }


        System.out.println(
            "Cantidad de múltiplos de 3: " + contador
        );


        /*
         * LIMITACIÓN DEL FOR-EACH:
         *
         * El ciclo for-each es útil para recorrer y leer
         * los elementos de un arreglo.
         *
         * Sin embargo, no proporciona directamente los índices
         * de cada elemento.
         *
         * Si necesitamos modificar posiciones específicas de
         * un arreglo tridimensional, es más conveniente utilizar
         * ciclos for tradicionales con índices.
         */

       System.out.println("======================================");
    }
}


