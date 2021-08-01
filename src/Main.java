public class Main {
    public static Movie[] getMovies() {
        return new Movie[]{
                new Movie("Начало", 2010, 16),
                new Movie("Шрек", 2001, 6),
                new Movie("В погоне за счастьем", 2006, 10)
        };
    }

    public static Theatre[] getTheatres() {
        return new Theatre[]{
                new Theatre("Анна Каренина", 2017, 16),
                new Theatre("Шекспир", 2016, 16),
                new Theatre("Паяцы", 2005, 18)
        };
    }

    public static void validEvent(Event event) {
        if (event.getTitle() == null || event.getReleaseYear() == 0 || event.getAge() == 0) {
                throw new RuntimeException();
        } else {
            System.out.println("Все события корректны");
        }
    }

    public static void main(String[] args) {
        for(Event event: getMovies()){
            validEvent(event);
        }
        for(Event event: getTheatres()){
            validEvent(event);
        }
    }
}