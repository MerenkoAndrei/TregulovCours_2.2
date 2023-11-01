package enums;

public class Enum1 {
    public static void main(String[] args) {
       Today today = new Today(WeekDays.SUNDAY) ;
        today.daysInfo();
        WeekDays w = WeekDays.FRIDAY;

    }
}

enum WeekDays {
    MONDAY("bad"),
    TUESDAY("bad"),
    WEDNESDAY("bad"),
    THURSDAY("so-so"),
    FRIDAY("so-so"),
    SATURDAY("great"),
    SUNDAY("good");
    private String mood;

    WeekDays(String mood) {
        this.mood = mood;
    }
    public String getMood(){
        return mood;
    }
}

class Today {
    WeekDays weekDays;

    public Today(WeekDays weekDays) {
        this.weekDays = weekDays;
    }

    void daysInfo() {
        switch (weekDays) {
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
                System.out.println("idi na rabotu!");
                break;
            case  SATURDAY:
            case SUNDAY:
                System.out.println("Spi spokoino pensia");
                break;
        }
        System.out.println("Настроение в этот день: " + weekDays.getMood());
    }
}