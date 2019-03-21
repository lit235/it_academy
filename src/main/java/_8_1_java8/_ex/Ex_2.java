package _8_1_java8._ex;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Реализуйте:
 * Функцию сложения чисел, то есть int addUp (Stream<Integer> numbers).
 * Функцию, которая получает исполнителя и возвращает список строк, содержащих имена и место происхождения.
 * Функцию, которая получает альбомы и возвращает список альбомов, содержащих не более трех произведений.
 * class Singer {
 * String name;
 * String homeTown;
 * }
 * <p>
 * class Album {
 * List<Song> songs;
 * }
 * <p>
 * class Song {
 * Singer singer;
 * String title;
 * }
 */
public class Ex_2 {
    public static void main(String[] args) {
        //1  System.out.println(addUp(IntStream.range(1,10).boxed()));
        Singer Saha = new Singer("Vasy", "Gatava");
        Singer Paha = new Singer("Pasha", "Kamennka");

        List<String> s = Stream.of(Saha, Paha)
                .flatMap(singer -> Stream.of(singer.homeTown, singer.name))
                .collect(Collectors.toList());
        System.out.println(s);

        Album album1 = new Album(Arrays.asList(new Song(Saha,"trec1"),
                new Song(Saha,"trec4"),
                new Song(Saha,"trec3"),
                new Song(Paha,"trec1")));
        Album album2 = new Album(Arrays.asList(new Song(Saha,"trec1"),
                new Song(Paha,"trec6"),
                new Song(Paha,"trec7")));
        Album album3 = new Album(Arrays.asList(new Song(Saha,"trec1"), new Song(Paha,"trec7")));

        List<Album> albumsList = Stream.of(album1,album2,album3)
                .filter(album -> album.songs.size()<3)
                .collect(Collectors.toList());

        System.out.println(albumsList);
    }

    private static int addUp(Stream<Integer> numbers) {
        return numbers.reduce(0, Integer::sum);
    }


    static class Singer {
        String name;
        String homeTown;

        public Singer(String name, String homeTown) {
            this.name = name;
            this.homeTown = homeTown;
        }
    }

    static class Album {
        List<Song> songs;

        public Album(List<Song> songs) {
            this.songs = songs;
        }
    }

    static class Song {
        Singer singer;
        String title;

        public Song(Singer singer, String title) {
            this.singer = singer;
            this.title = title;
        }
    }
}
