package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest {

    public static void main(String[] args) {

        // create stream

        List<String> names = Arrays.asList("Tom", "John", "Mike", "Paul");

        Stream<String> streamNames = names.stream();
        Stream<Integer> streamInt = Arrays.asList(new Integer[]{1, 2}).stream();
        DoubleStream doubleStream = DoubleStream.of(3, 3, 2, 1, 2, 4);
        IntStream intStream = IntStream.range(1, 100);

        //przetwarzanie danych
        //filter - filtrowanie
        //map - zmiana elementu na cos innego
        //limit - zwraca nam okreslionu ilosc elementow
        //peek - pozwala przeprowadzic operacje na kazdym elemencie
        // sorted()
        //different()


        //forEach - wykonanie akcji dla kazdego z elementow
        //count - zwroci ilosc elementow w stream
        //allMath - check czy elementy spelniaja jakis warunki
        //collect - zwraca new type na podstawie stream

        List<String> modifiedNames = streamNames.filter(el -> el.startsWith("T")) // przetwarzanie danych
                .map(el -> el.toUpperCase())
                //.forEach(el -> System.out.println(el)); //end of stream
                .collect(Collectors.toList());

        /*System.out.println(modifiedNames.get(0));
        System.out.println(modifiedNames.size());*/

        long count = intStream.filter(el -> el > 20)
                .map(el -> el * 2)
                //.limit(10)
                .count();

        /*System.out.println(count);*/

        /*Stream<String> str = Stream.empty();
        System.out.println(str.count());*/

        /*Stream.Builder<Integer> numBilder = Stream.builder();
        numBilder.add(1).add(2).add(3);
        Stream<Integer> numStream = numBilder.build();
        System.out.println(numStream.count());*/

       /* Stream<Integer> numStream1 = Stream.of(1,2,3,45);
        Stream<Integer> numStream2 = Stream.of(1,2,3,45,5,80);
        Stream<Integer> combinedStream = Stream.concat(numStream1,numStream2);


        System.out.println(combinedStream.count());

        Integer[] arr = {1,2,3,4,5};
        Stream<Integer> numStream = Arrays.stream(arr);
        System.out.println(numStream.count());*/

        Stream<Integer> filterTest = Stream.of(46, 65, 1, 98, 63);
        List<Integer> even = filterTest.filter(g -> g % 2 == 0).collect(Collectors.toList());
        //System.out.println(even);

        Stream<Integer> mapTest = Stream.of(46, 65, 1, 98, 63);
        List<Integer> d = mapTest.map(n -> n + 2)
                .collect(Collectors.toList());
        //System.out.println(d);

        Stream<Integer> distinctTest = Stream.of(43, 65, 1, 98, 63, 63, 1);
        List<Integer> numList = distinctTest.distinct()
                .collect(Collectors.toList());
        //System.out.println(numList);

        Stream<Integer> testPeak = Stream.of(43, 65, 1, 98, 63);
        List<Integer> nList = testPeak.map(n -> n * 10)
              //  .peek(n -> System.out.println("Mapped: " + n))
                .collect(Collectors.toList());
        //System.out.println(nList);

        /*Stream<Integer> sortedTest = Stream.of(43, 65, 1, 98, 63);
        sortedTest.sorted()
                .forEach(n -> System.out.println(n));*/

       /* Stream<Integer> forEachTest = Stream.of(43,65,1,98,63);
        forEachTest.forEach(n-> System.out.println(n));*/

        /*Stream<Integer> countTest = Stream.of(43,65,1,98,63);
        System.out.println(countTest.count());*/

        /*Stream<Integer> collectTest = Stream.of(43,65,1,98,63);
        List<Integer> odd = collectTest.filter(n-> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(odd);*/

       /* Stream<Integer> minTest = Stream.of(43,65,1,98,63);
        int smallest = minTest.min((m,n)-> Integer.compare(m,n)).get();
        System.out.println("Smaller element: " + smallest);

        Stream<Integer> maxTest = Stream.of(43,65,1,98,63);
        int largest = maxTest.max((m,n)-> Integer.compare(m,n)).get();
        System.out.println("Largest element: " + largest);*/

        Stream<Integer> findAnyFindFirstTest = Stream.of(43,65,1,98,63);
        Optional<Integer> opt = findAnyFindFirstTest.findFirst();
        System.out.println(opt);
        findAnyFindFirstTest = Stream.empty();
        opt = findAnyFindFirstTest.findAny();
        System.out.println(opt);

        Stream<Integer> allMatchAnyMathNoneMatchTest = Stream.of(43,65,1,98,63);

    }
}
